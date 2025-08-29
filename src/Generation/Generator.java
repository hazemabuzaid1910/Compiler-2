package Generation;

import AST.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;

import org.apache.commons.io.FileUtils;

public class Generator {
    StringBuilder sbHtml = new StringBuilder();
    StringBuilder sbScript = new StringBuilder();
    StringBuilder sbHtmlScript = new StringBuilder();
    StringBuilder form = new StringBuilder();
    StringBuilder routersubmit = new StringBuilder();


    Map<String, String> selectorMap = new LinkedHashMap<>();
    private List<String> productFields = new ArrayList<>();
    private List<String> function = new ArrayList<>();

    List<String> child=new ArrayList<>();

    public void generate(Program program,String path) {
        File source = new File("Result\\style.css");
        File dest = new File("Result\\generate.css");
        try {
            FileUtils.copyFile(source, dest);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try (FileWriter fw = new FileWriter("Result\\"+path)) {
            generateToFile("<!DOCTYPE html>\n", fw);
            generateToFile("<html>\n", fw);
            generateToFile("  <head>\n", fw);
            generateToFile("    <title>Angular App</title>\n", fw);
            generateToFile("    <link rel=\"stylesheet\" href=\"generate.css\"/>\n", fw);
            generateToFile("  </head>\n", fw);
            generateToFile("  <body>\n", fw);

            generateStatement(program, 2); // البداية من depth = 2 لأن body داخل html

            fw.append(sbHtml);
            generateToFile("  </body>\n", fw);

            generateToFile("  <script>\n", fw);
            for (Map.Entry<String, String> entry : selectorMap.entrySet()) {
                String className = entry.getKey();
                String varName = entry.getValue();
                fw.append(" const ").append(varName).append("Select = document.querySelector(\".")
                        .append(className).append("\");\n");
            }
            fw.append(sbScript);
            fw.append(sbHtmlScript);
            generateToFile("  </script>\n", fw);
            generateToFile("</html>\n", fw);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateStatement(Program program, int depth) {
        if (program.getStatementList() != null) {

            for (AST.Statement statement : program.getStatementList()) {
                if (statement instanceof ComponentDeclaration componentDeclaration) {
                    generateComponent(componentDeclaration, depth);
                }
                if (statement instanceof ClassDeclaration classDeclaration) {
                    generateClass(classDeclaration);
                }
            }
        }
    }

    private void generateClass(ClassDeclaration classDeclaration) {
        generateClassBody(classDeclaration.getClassBody());
    }

    private void generateClassBody(ClassBody classBody) {
        generateClassMember(classBody.getClassMembers());
    }

    private void generateClassMember(List<ClassMember> classMembers) {
        for (ClassMember classMember:classMembers){
            if (classMember instanceof MethodDeclaration methodDeclaration){
                generateMethode(methodDeclaration);
            }
            if(classMember instanceof  PropertyDeclaration propertyDeclaration){
                generatePropertyDeclaration(propertyDeclaration);
            }
        }
    }

    private void generatePropertyDeclaration(PropertyDeclaration propertyDeclaration) {
        if(propertyDeclaration.getIdentifier()!=null){
            sbScript.append("\n");
            sbScript.append(propertyDeclaration.getIdentifier()).append("=");
        }
        if(propertyDeclaration.getExpression()!=null){
            generateExpression(propertyDeclaration.getExpression());
        }
    }

    private void generateMethode(MethodDeclaration methodDeclaration) {
        sbScript.append("\n").append("function  ").append(methodDeclaration.getIdentifier()).append("(");
        if(methodDeclaration.getParameterList()!=null){
            sbScript.append(methodDeclaration.getParameterList().getParameters().get(0).getIdentifier());
        }
        if (form.length()>0){
            sbScript.append("event");
        }
        sbScript.append(")").append("{")
        ;
        if (methodDeclaration.getBlock()!=null){
            if (form.length() > 0) {

                generateNewProductObject();
                sbScript.append("\nevent.preventDefault();");
                sbScript.append(form);
                form.setLength(0);
            }

            generateBlock(methodDeclaration.getBlock());
            for (int i=0;i<function.size();i++){
                sbScript.append("\n").append(function.get(i)).append("()");}
        }
        if (routersubmit!=null){
            sbScript.append(routersubmit);
        }
        sbScript.append("\n}");
    }

    private void generateBlock(Block block) {
        if (block.getStatements()!=null){
            generateStatements(block.getStatements());
        }

    }

    private void generateStatements(List<Statements> statements) {
        for (Statements statements1:statements){
            if (statements1 instanceof Assignment assignment){
                generateAssign(assignment);
            }
            if (statements1 instanceof PushArray pushArray){
                generatePushArray(pushArray);
            }
            if (statements1 instanceof SetLocalStorage setLocalStorage){
                generateSetLocalStorage(setLocalStorage);
            }
        }
    }

    private void generateSetLocalStorage(SetLocalStorage setLocalStorage) {
        if (setLocalStorage.getData()!=null){
            sbScript.append("\n").append("localStorage.setItem(").append(setLocalStorage.getData()).append(",").append("JSON.stringify(");
        }
        if (setLocalStorage.getDataName()!=null){
            sbScript.append(setLocalStorage.getDataName()).append("));");
        }
    }

    private void generatePushArray(PushArray pushArray) {
        if (pushArray.getObjectName()!=null){
            sbScript.append("\n").append(pushArray.getObjectName()).append(".push").append("(");
        }
        if (pushArray.getExpression()!=null){
            generateExpression(pushArray.getExpression());
        }
        sbScript.append(")");
    }

    private void generateAssign(Assignment assignment) {
        sbScript.append("\n");
        if (assignment.getLeft()!=null){
            generateExpression(assignment.getLeft());
            sbScript.append(" = ");
        }
        if (assignment.getRight()!=null){
            generateExpression(assignment.getRight());
        }
    }

    private void generateExpression(Expression expression) {
        if (expression instanceof MemberExpression memberExpression){
            generateMemberExpression(memberExpression);
        }

        if (expression instanceof ArrayExpression arrayExpression){
            generateArrayExpression(arrayExpression);
        }
        if(expression instanceof ParseLocalStorage parseLocalStorage){
            generateParserLocalStorage(parseLocalStorage);
        }
        if (expression instanceof GetLocalStorage getLocalStorage){
            generateGetLocalStorage(getLocalStorage);
        }
        if (expression instanceof BinaryExpression binaryExpression){
            generateBinaryExpression(binaryExpression);
        }
    }

    private void generateBinaryExpression(BinaryExpression binaryExpression) {
        if (binaryExpression.getLeft()!=null){
            generateExpression(binaryExpression.getLeft());

        }
        if (binaryExpression.getOperator()!=null){
            sbScript.append(binaryExpression.getOperator());
        }
        if (binaryExpression.getRight()!=null){
            generateExpression(binaryExpression.getRight());
        }
    }

    private void generateParserLocalStorage(ParseLocalStorage parseLocalStorage) {
        if (parseLocalStorage.getExpression()!=null){
            sbScript.append("JSON.parse(");
            generateExpression(parseLocalStorage.getExpression());
            sbScript.append(")");
        }
    }

    private void generateGetLocalStorage(GetLocalStorage getLocalStorage) {
        if (getLocalStorage.getGetItem()!=null){

            sbScript.append("localStorage.getItem(").append(getLocalStorage.getGetItem()).append(")");
        }
    }

    private void generateArrayExpression(ArrayExpression arrayExpression) {
        if (arrayExpression.getElements() != null) {
            List<Expression> elements = arrayExpression.getElements();
            for (int i = 0; i < elements.size(); i++) {
                generateExpression(elements.get(i));
                if (i < elements.size() - 1) {
                    sbScript.append(",");
                }
            }
        }
    }


    private void generateMemberExpression(MemberExpression memberExpression) {
        if ( memberExpression.getPrimary()!=null){
            generatePrimary(memberExpression.getPrimary());
        }
        if (memberExpression.getAccesses()!=null){
            generateAccess(memberExpression.getAccesses());
        }
    }

    private void generateAccess(List<MemberAccess> accesses) {
        for (MemberAccess memberAccess:accesses){
            if(memberAccess.getIdentifier()!=null){
                sbScript.append(memberAccess.getIdentifier());
            }
            if (memberAccess.getIndexExpression()!=null){
                generateExpression(memberAccess.getIndexExpression());
            }
        }
    }

    private void generatePrimary(Primary primary) {
        generatePrimary(primary, false);
    }

    private void generatePrimary(Primary primary, boolean isLast) {
        if (primary instanceof IdentifierExpression identifier) {
            if (identifier.getKeyword() != null) {
                sbScript.append(identifier.getKeyword()).append(" ");
            }
            sbScript.append(identifier.getName());
        }
        if (primary instanceof ArrayExpression arrayExpression) {
            sbScript.append("[");
            generateExpression(arrayExpression);
            sbScript.append("]");
        }
        if (primary instanceof ObjectExpression objectExpression) {
            sbScript.append("{");
            generateObjectExpression(objectExpression);
            sbScript.append("}");

            sbScript.append("\n");
        }
        if (primary instanceof StringLiteral stringLiteral) {
            sbScript.append(stringLiteral.getValue());
        }
        if (primary instanceof NumberLiteral numberLiteral) {
            sbScript.append("[").append(numberLiteral.getValue()).append("]");
        }
    }



    private void generateObjectExpression(ObjectExpression objectExpression) {
        if (objectExpression.getProperties()!=null){
            generatePropertyAssignment(objectExpression.getProperties());
        }
    }

    private void generatePropertyAssignment(List<PropertyAssignment> properties) {
        for (int i = 0; i < properties.size(); i++) {
            PropertyAssignment propertyAssignment = properties.get(i);

            if (propertyAssignment.getKey() != null) {
                sbScript.append(propertyAssignment.getKey()).append(":").append("\n");
            }
            if (propertyAssignment.getValue() != null) {
                MemberExpression memberExpression = (MemberExpression) propertyAssignment.getValue();
                generateMemberExpression(memberExpression);
            }

            if (i < properties.size() - 1) {
                sbScript.append(",");
            }
        }
    }

    private void generateComponent(ComponentDeclaration componentDeclaration, int depth) {
        if (componentDeclaration.getComponentMetadata() != null) {
            generateComponentMetadata(componentDeclaration.getComponentMetadata(), depth);
        }
    }

    private void generateComponentMetadata(ComponentMetadata metadata, int depth) {
        for (ComponentProperty property : metadata.getComponentProperty()) {
            if (property instanceof TemplateProperty templateProperty) {
                generateTemplateProperty(templateProperty, depth);
            }
        }
    }

    private void generateTemplateProperty(TemplateProperty templateProperty, int depth) {
        if (templateProperty.getHtmlNode() != null) {
            generateHtmlNode(templateProperty.getHtmlNode(), depth);
        }
    }

    private void generateHtmlNode(HtmlNode htmlNode, int depth) {
        if (htmlNode.getHtmlElements() != null) {
            generateHtmlElements(htmlNode.getHtmlElements(), depth);
        }
    }

    private void generateHtmlElements(HtmlElements htmlElements, int depth) {
        for (HtmlElement element : htmlElements.getHtmlElements()) {
            generateHtmlElement(element, depth);
        }
    }

    private void generateHtmlElement(HtmlElement element, int depth) {
        if (element instanceof HtmlPairTag htmlPairTag) {
            generateHtmlPairTag(htmlPairTag, depth);
        } else if (element instanceof HtmlSingleTag htmlSingleTag) {
            generateHtmlSingleTag(htmlSingleTag, depth);
        }
    }

    private void generateHtmlSingleTag(HtmlSingleTag tag, int depth) {
        StringBuilder closeTag = new StringBuilder("<" + tag.getHtmlTagName().getTagName());
        if (tag.getHtmlAttributes() != null) {
            for (HtmlAttribute attr : tag.getHtmlAttributes()) {
                closeTag.append(generateHtmlAttribute(attr,tag));
            }
        }
        closeTag.append("/>");
        appendIndentedLine(closeTag.toString(), depth);
    }

    private void generateHtmlPairTag(HtmlPairTag tag, int depth) {
        StringBuilder openTag = new StringBuilder("<" + tag.getHtmlTagName().getTagName());

        if (tag.getHtmlAttribute() != null) {
            for (HtmlAttribute attr : tag.getHtmlAttribute()) {
                openTag.append(generateHtmlAttribute(attr,tag));
            }
        }
        openTag.append(">");

        appendIndentedLine(openTag.toString(), depth);

        for (HtmlContent content : tag.getHtmlContent()) {
            generateHtmlContent(content, depth + 1,tag);
        }

        appendIndentedLine("</" + tag.getHtmlTagName().getTagName() + ">", depth);
    }
    String className="";

    private Object generateHtmlAttribute(HtmlAttribute attr, HtmlElement htmlElement) {

        if (attr instanceof StandardAttribute standardAttr) {
            List<String> ids = standardAttr.getIdentifier();

            if (standardAttr.getClasss()!=null){
                generateQuerySelector(htmlElement,standardAttr);
                className=standardAttr.getHtmlAttributeValue().getStringLiteral();
                return " " + standardAttr.getClasss() + "=" + standardAttr.getHtmlAttributeValue().getStringLiteral() ;
            }
            for (String identifier : standardAttr.getIdentifier()) {
                if (identifier.equals("routerLink")) {
                    String routeValue = standardAttr.getHtmlAttributeValue().getStringLiteral();

                    // إذا كان عنصر <button> ونوعه submit → خزّن في routerForm
                    if (htmlElement instanceof HtmlPairTag htmlPairTag
                            && htmlPairTag.getHtmlTagName().getTagName().equalsIgnoreCase("button")) {

                        boolean isSubmit = false;
                        for (HtmlAttribute attribute : htmlPairTag.getHtmlAttribute()) {
                            if (attribute instanceof StandardAttribute stdAttr) {
                                for (String id : stdAttr.getIdentifier()) {
                                    if (id.equalsIgnoreCase("type")
                                            && "submit".equalsIgnoreCase(stdAttr.getHtmlAttributeValue().getStringLiteral().replace("\"",""))) {
                                        isSubmit = true;
                                        break;
                                    }
                                }
                            }
                        }

                        if (isSubmit) {
                            className = className.replace("\"", "").replace("-", "_");
                            routersubmit.append("\n")
                                    .append(" window.location.href = ")
                                    .append(routeValue);
                            return "";
                        }
                    }


                    className = className.replace("\"", "").replace("-", "_");
                    sbHtmlScript.append("\n")
                            .append(className).append("Select.addEventListener(\"click\", () => window.location.href = ")
                            .append(routeValue)
                            .append(")");
                    return "";
                }

                return " " + identifier + "=" + standardAttr.getHtmlAttributeValue().getStringLiteral();
            }
        }
        if (attr instanceof DirectiveAttribute directiveAttribute) {
            if (htmlElement instanceof HtmlPairTag htmlPairTag) {
                generateDirectiveAttribute(directiveAttribute, htmlPairTag);
            }
        }
        if (attr instanceof EventAttribute eventAttribute) {
            if (htmlElement instanceof HtmlPairTag htmlPairTag) {
                return generateEventAttribute(eventAttribute, htmlPairTag);
            }
        }
        if (attr instanceof TwoWayAttr twoWayAttr) {
            if (htmlElement instanceof HtmlSingleTag htmlSingleTag) {

                generateTwoWayAttr(twoWayAttr, htmlSingleTag);
            }

        }


        return "";
    }

    private void generateTwoWayAttr(TwoWayAttr twoWayAttr, HtmlSingleTag htmlSingleTag) {
        if (twoWayAttr.getAttributeName().equals("ngModel")) {
            String modelValue = twoWayAttr.getHtmlAttributeValue().getStringLiteral()
                    .replace("\"", "")
                    .replace("'", "");

            String[] parts = modelValue.split("\\.");
            String varName = parts[parts.length - 1];

            form.append("\nconst ").append(varName)
                    .append(" = event.target.")
                    .append(varName)
                    .append(".value.trim();");

            if (!productFields.contains(varName)) {
                productFields.add(varName);
            }
        }
    }

    private void generateNewProductObject() {
        form.append("\nnewProduct = { ")
                .append(String.join(", ", productFields))
                .append(" };");
    }


    private String generateEventAttribute(EventAttribute eventAttribute, HtmlPairTag htmlPairTag) {
        if (eventAttribute.getIdentifier().equals("ngSubmit")) {
            String value = eventAttribute.getHtmlAttributeValue().getStringLiteral();

            if (value.startsWith("\"") && value.endsWith("\"")) {
                value = value.substring(1, value.length() - 3);
            }

            value = "\"" + value + "(event)\"";

            return " onsubmit=" + value;
        }

        return "";
    }


    private void generateQuerySelector(HtmlElement htmlElement, StandardAttribute standardAttribute) {
        String className = standardAttribute.getHtmlAttributeValue().getStringLiteral();
        className = split(className);

        if (!selectorMap.containsKey(className)) {
            String selectorName = className.replaceAll("-", "_");
            selectorMap.put(className, selectorName);
        }
    }


    private void generateDirectiveAttribute(DirectiveAttribute directiveAttribute, HtmlPairTag htmlPairTag) {
        if (directiveAttribute.getIdentifier().equals("ngFor")) {

            String fullText = String.valueOf(directiveAttribute.getHtmlAttributeValue().getStringLiteral());
            fullText=split(fullText);
            String[] parts = fullText.split("\\s+");
            String varName=" ";
            String arrayName = " ";
            if (parts.length >= 4 && parts[0].equals("let") && parts[2].equals("of")) {
                varName = parts[1];
                arrayName = parts[3];
                System.out.println(varName + arrayName);
            }
            generateForEach(varName,arrayName,htmlPairTag);
        }
        if (directiveAttribute.getIdentifier().equals("ngIf")) {
            String condition = split(directiveAttribute.getHtmlAttributeValue().getStringLiteral());
            String className = "";
            String varDivName = "";
            String selectorVar = "";

            for (HtmlAttribute attr : htmlPairTag.getHtmlAttribute()) {
                if (attr instanceof StandardAttribute stdAttr && stdAttr.getClasss() != null) {
                    className = split(stdAttr.getHtmlAttributeValue().getStringLiteral());
                    break;
                }
            }


            for (Map.Entry<String, String> entry : selectorMap.entrySet()) {
                if (entry.getKey().equals(className)) {
                    selectorVar = entry.getValue() + "Select";
                    varDivName = entry.getValue() + "Div";
                    break;
                }
            }
            sbHtmlScript.append("function render(){");
            sbHtmlScript.append("if (").append(condition).append(") {\n");
            sbHtmlScript.append(selectorVar).append(".innerHTML=\"\"\n");
            sbHtmlScript.append("  ").append(selectorVar).append(".classList.add(\"").append(className).append("\");\n");
            sbHtmlScript.append("}");
            child.clear();
            generateHtmlContentScript(htmlPairTag.getHtmlContent(), child);
            for (String element : child) {
                sbHtmlScript.append("  ").append(selectorVar).append(".appendChild(").append(element).append(");\n");
            }

            sbHtmlScript.append("}\n");
            function.add("render");
        }
    }
    private void generateForEach(String item, String collection, HtmlPairTag htmlPairTag) {

        sbHtmlScript.append("\n").append(collection).append(".forEach((").append(item).append(")=>{\n");
        String classNam="";
        String varName="";
        String varDivName="";
        String className = null;
        String previousValue="";
        String previousKey="";
        for (HtmlAttribute attr : htmlPairTag.getHtmlAttribute()) {
            if (attr instanceof StandardAttribute stdAttr && stdAttr.getClasss() != null) {
                className = split(stdAttr.getHtmlAttributeValue().getStringLiteral());
            }
        }

        for (Map.Entry<String, String> entry : selectorMap.entrySet()) {
            classNam = entry.getKey();
            varName = entry.getValue();
            if (Objects.equals(classNam, className)){
                varDivName=varName+"Div";
                break;
            }
            previousKey = classNam;
            previousValue = varName;

        }


        sbHtmlScript.append("  const ").append(varDivName)
                .append(" = document.createElement(\"div\");\n");
        sbHtmlScript.append("  ").append(varDivName).append(".classList.add(\"").append(className).append("\");\n");

        if (htmlPairTag.getHtmlContent() != null) {
            generateHtmlContentScript(htmlPairTag.getHtmlContent(), child);
        }

        for (String element : child) {
            sbHtmlScript.append("  ").append(varDivName).append(".appendChild(").append(element).append(");\n");
        }
        for (HtmlAttribute attr : htmlPairTag.getHtmlAttribute()) {

            if (attr instanceof EventAttribute eventAttribute){
                String value=split(eventAttribute.getHtmlAttributeValue().getStringLiteral());
                sbHtmlScript.append(varDivName).append(".addEventListener(\"click\", () => {\n").append(value).append("\n});\n");

            }
        }
        sbHtmlScript.append("  ").append(previousValue+"Select").append(".appendChild(").append(varDivName).append(");\n");
        sbHtmlScript.append("});\n");



    }


    private void generateHtmlContentScript(List<HtmlContent> htmlContent,List<String> child) {

        for (HtmlContent content:htmlContent){
            if (content instanceof WrapHtml wrapHtml){
                HtmlElement htmlElement=wrapHtml.getHtmlElement();
                if (htmlElement instanceof HtmlPairTag htmlPairTag) {
                    String tagname = htmlPairTag.getHtmlTagName().getTagName();
                    sbHtmlScript.append("const\t")
                            .append(tagname)
                            .append("=document.createElement(\"" + tagname)
                            .append("\")").append("\n")
                    ;
                    child.add(tagname);
                    for (HtmlContent htmlContent1 : htmlPairTag.getHtmlContent()) {
                        if(htmlContent1 instanceof MostacheExp mostacheExp){
                            String product=mostacheExp.getExpressionHtml().getPrimaryExpressionHtmls().get(0).getIdentifier();
                            String attr=mostacheExp.getExpressionHtml().getPrimaryExpressionHtmls().get(1).getIdentifier();

                            sbHtmlScript.append(tagname).append(".").append("textContent=").append(product).append(".").append(attr).append("\n");
                        }
                    }
                }
                if (htmlElement instanceof HtmlSingleTag htmlSingleTag) {
                    String tagname = htmlSingleTag.getHtmlTagName().getTagName();
                    sbHtmlScript.append("const\t")
                            .append(tagname)
                            .append("=document.createElement(\"" + tagname)
                            .append("\");").append("\n");
                    child.add(tagname);
                    for (HtmlAttribute htmlAttribute:htmlSingleTag.getHtmlAttributes()){
                        if (htmlAttribute instanceof BoundAttribute boundAttribute){
                            String value=   split(boundAttribute.getHtmlAttributeValue().getStringLiteral());
                            sbHtmlScript.append(tagname).append(".")
                                    .append(split(boundAttribute.getAttributeName().getIdentifier().toString()))
                                    .append("=")
                                    .append(value)
                                    .append("\n");
                        }
                        if (htmlAttribute instanceof StandardAttribute standardAttribute){
                            String value= standardAttribute.getHtmlAttributeValue().getStringLiteral();


                            if (standardAttribute.getIdentifier()!=null&&standardAttribute.getClasss()==null){
                                sbHtmlScript.append(tagname).append(".")
                                        .append(split(standardAttribute.getIdentifier().toString()))
                                        .append("=")
                                        .append(value).append("\n");
                            }
                            if (standardAttribute.getClasss()!=null){
                                sbHtmlScript.append(tagname).append(".")
                                        .append(standardAttribute.getClasss())
                                        .append("=")
                                        .append(value).append("\n");
                            }
                        }
                    }

                }
            }
        }


    }

    private void generateHtmlContent(HtmlContent content, int depth, HtmlPairTag tag) {
        if (content instanceof WrapHtml wrapHtml) {
            generateHtmlElement(wrapHtml.getHtmlElement(), depth);
        }
        if (content instanceof Text text){
            sbHtml.append(" ").append(text.getText());
        }
    }


    private void generateToFile(String s, FileWriter fw) throws IOException {
        fw.append(s);
    }

    private void appendIndentedLine(String line, int depth) {
        sbHtml.append("  ".repeat(depth)).append(line).append("\n");
    }
    private String split(String fullText) {
        fullText = fullText.substring(1, fullText.length() - 1);

        return fullText;
    }


}
