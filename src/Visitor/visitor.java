package Visitor;
import AST.*;
import Sympol_Table.object.E4_obj;
import antler.TypeScriptParser;
import antler.TypeScriptParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import MainApp.Main;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class visitor extends TypeScriptParserBaseVisitor {
    @Override
    public Program visitProgram(TypeScriptParser.ProgramContext ctx) {
        Program program=new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i)!=null)
            {

                program.getStatementList().add(visitStatement(ctx.statement(i)));
            }
        }
        return program;
    }

    @Override
    public Statement visitStatement(TypeScriptParser.StatementContext ctx) {
        if (ctx.importStatement() != null && !ctx.importStatement().isEmpty()) {
            return visitImportStatement(ctx.importStatement(0));
        }
        if (ctx.componentDeclaration() != null && !ctx.componentDeclaration().isEmpty()) {
            return visitComponentDeclaration(ctx.componentDeclaration());
        }
        if (ctx.classDeclaration() != null && !ctx.classDeclaration().isEmpty()) {
            return visitClassDeclaration(ctx.classDeclaration());
        }
        return null;
    }
    @Override
    public ImportStatement visitImportStatement(TypeScriptParser.ImportStatementContext ctx) {
        ImportStatement stmt = new ImportStatement();
        if (ctx.Import() != null) {
            stmt.setImport(ctx.Import().getText());
        }
        if (ctx.importFromBlock() != null) {
            ImportFromBlock block = (ImportFromBlock) visitImportFromBlock(ctx.importFromBlock());
            stmt.setImportFromBlock(block);
        }
        return stmt;
    }
    @Override
    public ImportFromBlock visitImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx) {
        ImportFromBlock block = new ImportFromBlock();
        if(ctx.importFrom()!=null){
            block.setImportFrom(visitImportFrom(ctx.importFrom()));
        }
        if(ctx.importAlias()!=null){
            block.setImportAlias(visitImportAlias(ctx.importAlias()));
        }
        for(int i=0 ; i<ctx.importModule().size() ; i++){
        if(ctx.importModule(i)!=null) {
            block.getImportModule().add(visitImportModule(ctx.importModule(i)));

        }
        }
        if(ctx.StringLiteral()!=null){
            block.setStringLiteral(ctx.StringLiteral().getText());
        }
        return block;
    }
    @Override
    public ImportModule visitImportModule(TypeScriptParser.ImportModuleContext ctx) {
        ImportModule importModule=new ImportModule();
        if(ctx.CommonModule()!=null){
            importModule.setCommonModule(ctx.CommonModule().getText());
        }
        if(ctx.Component()!=null){
            importModule.setComponent(ctx.Component().getText());
        }
        if(ctx.Identifier()!=null){
            importModule.setIdentifier(ctx.Identifier().getText());
        }
        return importModule;
    }
    @Override
    public ImportFrom visitImportFrom(TypeScriptParser.ImportFromContext ctx) {
        ImportFrom importFrom=new ImportFrom();
        if(ctx.From()!=null){
            importFrom.setFrom(ctx.From().getText());
        }
        if(ctx.StringLiteral()!=null){
            importFrom.setStringLiteral(ctx.StringLiteral().getText());
        }
        return importFrom;
    }
    @Override
    public ImportAlias visitImportAlias(TypeScriptParser.ImportAliasContext ctx) {
        ImportAlias importAlias=new ImportAlias();
        if(ctx.importModule()!=null){
            importAlias.setImportModule(visitImportModule(ctx.importModule()));
        }
          if(ctx.Multiply()!=null){
              importAlias.setStar(ctx.Multiply().getText());
          }
        if(ctx.As()!=null){
            importAlias.setAs(ctx.As().getText());
        }
        if(ctx.Identifier()!=null){
            importAlias.setIdentifier(ctx.Identifier().getText());
        }
        return importAlias;
    }
    @Override
    public ComponentDeclaration visitComponentDeclaration(TypeScriptParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration=new ComponentDeclaration();
        if(ctx.AT_Component()!=null){
            componentDeclaration.setAt_Component(ctx.AT_Component().getText());
        }
        if(ctx.componentMetadata()!=null){
            componentDeclaration.setComponentMetadata(visitComponentMetadata(ctx.componentMetadata()));
        }
        return  componentDeclaration;
    }
    @Override
    public ComponentMetadata visitComponentMetadata(TypeScriptParser.ComponentMetadataContext ctx) {
        ComponentMetadata componentMetadata=new ComponentMetadata();
        for (int i=0;i<ctx.componentProperty().size();i++){
            if(ctx.componentProperty(i)!=null){
                componentMetadata.getComponentProperty().add(visitComponentProperty(ctx.componentProperty(i)));
            }
        }
        return componentMetadata;
    }
    @Override
    public ComponentProperty visitComponentProperty(TypeScriptParser.ComponentPropertyContext ctx) {
        if (ctx.selectorProperty() != null) {
            return visitSelectorProperty(ctx.selectorProperty());
        }
        if (ctx.standaloneProperty() != null) {
            return visitStandaloneProperty(ctx.standaloneProperty());
        }
        if (ctx.importsProperty() != null) {
            return visitImportsProperty(ctx.importsProperty());
        }
        if (ctx.templateProperty() != null) {
            return visitTemplateProperty(ctx.templateProperty());
        }
        return null;

    }
//////////////////////////////////////////////////////////////type script visitors
        @Override
        public ClassDeclaration visitClassDeclaration (TypeScriptParser.ClassDeclarationContext ctx){
            ClassDeclaration classDecl = new ClassDeclaration();

            if (ctx.EXPORT() != null) {
                classDecl.setExport(ctx.EXPORT().getText());
            }

            classDecl.setClass(ctx.CLASS().getText());  // غالباً يكون دائمًا "class"
            classDecl.setIdentifier(ctx.Identifier().getText());
            Main.semanticError.getE2().insert();
            Main.semanticError.getE3().insert();

            // زيارة classBody
            ClassBody body = (ClassBody) visit(ctx.classBody());
            classDecl.setClassBody(body);
            Main.semanticError.getE2().get();
            Main.semanticError.getE3().get();
            Main.semanticError.getE4().SetIsComponent(false);
            return classDecl;
        }

        @Override
        public ClassBody visitClassBody (TypeScriptParser.ClassBodyContext ctx){
            ClassBody body = new ClassBody();
            List<ClassMember> members = new ArrayList<>();

            for (TypeScriptParser.ClassMemberContext memberCtx : ctx.classMember()) {
                ClassMember member = (ClassMember) visit(memberCtx);
                members.add(member);
            }

            body.setClassMembers(members);
            return body;
        }

        @Override
        public PropertyDeclaration visitPropertyDeclaration (TypeScriptParser.PropertyDeclarationContext ctx){
            PropertyDeclaration prop = new PropertyDeclaration();
            Main.semanticError.getE4().insert_class_equal();
            if (ctx.Identifier() != null) {
                prop.setIdentifier(ctx.Identifier().getText());
                Main.semanticError.getE3().addVariable(ctx.Identifier().getText());
                if(Main.semanticError.getE4().GetIsComponent()){
                    Main.semanticError.getE4().addSaveVar(ctx.Identifier().getText());
                }
                Main.semanticError.getE4().insert_name_class_equal(ctx.Identifier().getText());
            }

            if (ctx.expression() != null) {
                Expression expr = (Expression) visit(ctx.expression());
                prop.setExpression(expr);
            }
            Main.semanticError.getE4().pop_class_equal();

            return prop;
        }


        @Override
        public MethodDeclaration visitMethodDeclaration (TypeScriptParser.MethodDeclarationContext ctx){
            MethodDeclaration method = new MethodDeclaration();

            if (ctx.Identifier() != null) {
                method.setIdentifier(ctx.Identifier().getText());
                Main.semanticError.check_E2(ctx.Identifier().getText() , ctx.getStart().getLine());
                if (Main.semanticError.getE4().GetIsComponent()){
                    Main.semanticError.getE6().add_fun_name_to_save_map(ctx.Identifier().getText());
                }
            }

            if (ctx.parameterList() != null) {
                ParameterList params = (ParameterList) visit(ctx.parameterList());
                method.setParameterList(params);
            }
            if (Main.semanticError.getE4().GetIsComponent()){
                Main.semanticError.getE6().get_var_from_connection(ctx.Identifier().getText());
            }


            if (ctx.typeAnnotation() != null) {
                TypeAnnotation typeAnn = (TypeAnnotation) visit(ctx.typeAnnotation());
                method.setTypeAnnotation(typeAnn);
            }

            if (ctx.block() != null) {
                Block block = (Block) visit(ctx.block());
                method.setBlock(block);
            }

            return method;
        }

        @Override
        public ParameterList visitParameterList (TypeScriptParser.ParameterListContext ctx){
            ParameterList parameterList = new ParameterList();

            for (TypeScriptParser.ParameterContext paramCtx : ctx.parameter()) {
                Parameter param = (Parameter) visit(paramCtx);
                parameterList.getParameters().add(param);
                if (Main.semanticError.getE4().GetIsComponent()){
                    Main.semanticError.getE6().add_connection_stack(param.getIdentifier());
                }
            }
            return parameterList;
        }
        @Override
        public Parameter visitParameter (TypeScriptParser.ParameterContext ctx){
            Parameter parameter = new Parameter();

            parameter.setIdentifier(ctx.Identifier().getText());

            if (ctx.typeAnnotation() != null) {
                parameter.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
            }

            return parameter;
        }

        @Override
        public TypeAnnotation visitTypeAnnotation (TypeScriptParser.TypeAnnotationContext ctx){
            TypeAnnotation typeAnnotation = new TypeAnnotation();
            typeAnnotation.setTypeName((TypeName) visit(ctx.typeName()));
            return typeAnnotation;
        }

        @Override
        public TypeName visitTypeName (TypeScriptParser.TypeNameContext ctx){
            TypeName typeName = new TypeName();

            typeName.setUnionType((UnionType) visit(ctx.unionType()));

            return typeName;
        }

        @Override
        public UnionType visitUnionType (TypeScriptParser.UnionTypeContext ctx){
            UnionType unionType = new UnionType();
            List<PrimaryType> primaryTypes = new ArrayList<>();

            for (TypeScriptParser.PrimaryTypeContext ptCtx : ctx.primaryType()) {
                primaryTypes.add((PrimaryType) visit(ptCtx));
            }
            unionType.setPrimaryTypes(primaryTypes);
            return unionType;
        }

        @Override
        public PrimaryType visitPrimaryType (TypeScriptParser.PrimaryTypeContext ctx){
            PrimaryType primaryType = new PrimaryType();
            primaryType.setTypeName(ctx.getText());
            return primaryType;
        }

        @Override
        public Block visitBlock (TypeScriptParser.BlockContext ctx){
            Block block = new Block();
            List<Statements> stmts = new ArrayList<>();

            for (TypeScriptParser.StatementsContext stmtCtx : ctx.statements()) {
                Statements stmt = visitStatements(stmtCtx);
                if (stmt != null) {
                    stmts.add(stmt);
                }
            }
            block.setStatements(stmts);
            return block;
        }

        @Override
        public Statements visitStatements (TypeScriptParser.StatementsContext ctx){
            if (ctx.assignment() != null) {
                Assignment assignment = new Assignment();
                assignment.setLeft((Expression) visit(ctx.assignment().expression(0)));
                assignment.setRight((Expression) visit(ctx.assignment().expression(1)));
                return assignment;
            }

            if (ctx.expressionStatement() != null) {
                return (Statements) visit(ctx.expressionStatement());
            }

            if (ctx.ifStatement() != null) {
                return (Statements) visit(ctx.ifStatement());
            }

            if (ctx.forStatement() != null) {
                return (Statements) visit(ctx.forStatement());
            }

            if (ctx.whileStatement() != null) {
                return (Statements) visit(ctx.whileStatement());
            }

            if (ctx.returnStatement() != null) {
                return (Statements) visit(ctx.returnStatement());
            }

            return null;
        }
/// ///لهون نحن تمام
///

        @Override
        public Expression visitClassexp (TypeScriptParser.ClassexpContext ctx){
            ClassExpression expr = new ClassExpression();
            expr.setClass(ctx.getText());
            return expr;
        }

        @Override
        public Primary visitThisExpr (TypeScriptParser.ThisExprContext ctx){
            return new ThisExpression();
        }

        @Override
        public SelectorProperty visitSelectorProperty (TypeScriptParser.SelectorPropertyContext ctx){
            SelectorProperty selectorProperty = new SelectorProperty();
            if (ctx.SELECTOR() != null) {
                selectorProperty.setSelector(ctx.SELECTOR().getText());
            }
            if (ctx.StringLiteral() != null) {
                selectorProperty.setSelectorName(ctx.StringLiteral().getText());
            }
            return selectorProperty;
        }

        @Override
        public StandaloneProperty visitStandaloneProperty (TypeScriptParser.StandalonePropertyContext ctx){
            StandaloneProperty standaloneProperty = new StandaloneProperty();
            if(ctx.STANDALONE()!=null){
                standaloneProperty.setStandalone(ctx.STANDALONE().getText());
            }
            if(ctx.BooleanLiteral()!=null){
                standaloneProperty.setCase(ctx.BooleanLiteral().getText());
            }
            return standaloneProperty;
        }

        @Override
        public ImportsProperty visitImportsProperty (TypeScriptParser.ImportsPropertyContext ctx){
            ImportsProperty importsProperty = new ImportsProperty();
            for (int i = 0; i < ctx.importModule().size(); i++) {
                if (ctx.importModule(i) != null) {
                    importsProperty.getImportModules().add(visitImportModule(ctx.importModule(i)));
                }
            }
            if(ctx.IMPORTS()!=null){
                importsProperty.setImports(ctx.IMPORTS().getText());
            }
            return importsProperty;
        }

        @Override
        public TemplateProperty visitTemplateProperty (TypeScriptParser.TemplatePropertyContext ctx){
            TemplateProperty templateProperty = new TemplateProperty();
            if (ctx.htmlNode() != null) {
                templateProperty.setHtmlNode(visitHtmlNode(ctx.htmlNode()));
            }
            return templateProperty;
        }

        @Override
        public HtmlNode visitHtmlNode (TypeScriptParser.HtmlNodeContext ctx){
            HtmlNode html = new HtmlNode();
            if(ctx.htmlElements()!=null){
                html.setHtmlElements(visitHtmlElements(ctx.htmlElements()));
            }
            return html;
        }

    @Override
    public HtmlElements visitHtmlElements(TypeScriptParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements=new HtmlElements();
        for(int i=0;i<ctx.htmlElement().size();i++){
            htmlElements.getHtmlElements().add(visitHtmlElement(ctx.htmlElement(i)));
        }
        return htmlElements;
    }

    @Override
    public HtmlElement visitHtmlElement(TypeScriptParser.HtmlElementContext ctx) {
        if(ctx.htmlPairTag()!=null){
        return  visitHtmlPairTag(ctx.htmlPairTag());
        }
        if(ctx.htmlSingleTag()!=null){
            return  visitHtmlSingleTag(ctx.htmlSingleTag());
        }
        return  null;
    }

    @Override
    public HtmlPairTag visitHtmlPairTag(TypeScriptParser.HtmlPairTagContext ctx) {
        HtmlPairTag htmlPairTag=new HtmlPairTag();

        if(ctx.htmlTagName()!=null){
            htmlPairTag.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName(0)));
            Main.semanticError.getE1().insert(ctx.htmlTagName(0).getText());
        }
        for (int i=0;i<ctx.htmlAttribute().size();i++){
            if(ctx.htmlAttribute(i)!=null){
                htmlPairTag.getHtmlAttribute().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        for(int i=0;i<ctx.htmlContent().size();i++){
        if(ctx.htmlContent()!=null){
            HtmlContent content = (HtmlContent) visit(ctx.htmlContent(i));
            htmlPairTag.getHtmlContent().add(content);
        }
        }
        Main.semanticError.getE5().set_Is_ngfor(false);
        Main.semanticError.check_E1(ctx.htmlTagName(1).getText(),ctx.htmlTagName(1).getStart().getLine());
        return htmlPairTag;
    }

    @Override
    public HtmlSingleTag visitHtmlSingleTag(TypeScriptParser.HtmlSingleTagContext ctx) {
        HtmlSingleTag htmlSingleTag=new HtmlSingleTag();
        if(ctx.htmlTagName()!=null){
            htmlSingleTag.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        for (int i=0;i<ctx.htmlAttribute().size();i++){
            if(ctx.htmlAttribute(i)!=null){
                htmlSingleTag.getHtmlAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        return  htmlSingleTag;
    }

    @Override
    public HtmlTagName visitHtmlTagName(TypeScriptParser.HtmlTagNameContext ctx) {
        HtmlTagName htmlTagName=new HtmlTagName();
        if(ctx.Identifier()!=null){
            htmlTagName.setTagName(ctx.Identifier().getText());
        }
        return htmlTagName;
    }


    @Override
    public HtmlContent visitWrapHtml(TypeScriptParser.WrapHtmlContext ctx) {
        WrapHtml wrapHtml=new WrapHtml();
        if(ctx.htmlElement()!=null){
            wrapHtml.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        return wrapHtml;

    }


    @Override
    public HtmlContent visitMostacheExp(TypeScriptParser.MostacheExpContext ctx) {
        MostacheExp mostacheExp=new MostacheExp();
        if(ctx.expressionhtml()!=null){
            mostacheExp.setExpressionHtml(visitExpressionhtml(ctx.expressionhtml()));
        }
        return mostacheExp;
    }

    @Override
    public ExpressionHtml visitExpressionhtml(TypeScriptParser.ExpressionhtmlContext ctx) {
        ExpressionHtml expressionHtml=new ExpressionHtml();
        Main.semanticError.insert_obj_check();
        for (int i=0 ; i<ctx.primaryExpressionhtml().size(); i++){
            if(ctx.primaryExpressionhtml(i)!=null){
                expressionHtml.getPrimaryExpressionHtmls().add(visitPrimaryExpressionhtml(ctx.primaryExpressionhtml(i)));
            }
        }
        return  expressionHtml;
    }

    @Override
    public PrimaryExpressionHtml visitPrimaryExpressionhtml(TypeScriptParser.PrimaryExpressionhtmlContext ctx) {
        PrimaryExpressionHtml primaryExpressionHtml=new PrimaryExpressionHtml();
        if(ctx.Identifier()!=null){
            primaryExpressionHtml.setIdentifier(ctx.Identifier().getText());
            Main.semanticError.add_check_list(ctx.Identifier().getText(),ctx.getStart().getLine());
        }
        return primaryExpressionHtml;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(TypeScriptParser.HtmlAttributeContext ctx) {
        if(ctx.standardAttribute()!=null){
            return visitStandardAttribute(ctx.standardAttribute());
        }
        if(ctx.boundAttribute()!=null){
            return visitBoundAttribute(ctx.boundAttribute());
        }if(ctx.eventAttribute()!=null){
            return visitEventAttribute(ctx.eventAttribute());
        }if(ctx.directiveAttribute()!=null){
            return visitDirectiveAttribute(ctx.directiveAttribute());
        }
        return null;
    }

    @Override
    public StandardAttribute visitStandardAttribute(TypeScriptParser.StandardAttributeContext ctx) {
        StandardAttribute standardAttribute=new StandardAttribute();
        if (ctx.CLASS()!=null) {
           standardAttribute.setClass(ctx.CLASS().getText());
        }
        for (int i=0 ;i<ctx.Identifier().size();i++){
            if (ctx.Identifier(i) != null) {
                standardAttribute.getIdentifier().add(ctx.Identifier(i).getText());

            }}

        if(ctx.htmlAttributeValue()!=null){
            standardAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        return standardAttribute;
    }@Override
    public BoundAttribute visitBoundAttribute(TypeScriptParser.BoundAttributeContext ctx) {
        BoundAttribute boundAttribute=new BoundAttribute();
        if(ctx.htmlAttributeValue()!=null){
            boundAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        if(ctx.attributeName()!=null){
            boundAttribute.setAttributeName(visitAttributeName(ctx.attributeName()));
        }
        return boundAttribute;
    }

    @Override
    public EventAttribute visitEventAttribute(TypeScriptParser.EventAttributeContext ctx) {
        EventAttribute eventAttribute=new EventAttribute();
        if(ctx.Identifier()!=null){
            eventAttribute.setIdentifier(ctx.Identifier().getText());
        }
        if(ctx.htmlAttributeValue()!=null){
          String event= visitHtmlAttributeValue(ctx.htmlAttributeValue()).getStringLiteral();
            Pattern pattern = Pattern.compile("\"(\\w+)\\s*\\(([^)]*)\\)\"");
            Matcher matcher = pattern.matcher(event);
            while (matcher.find()) {
                String functionName = matcher.group(1);  // اسم الدالة
                String arguments = matcher.group(2);     // الوسائط داخل القوسين
                String[] argsArray = arguments.split("\\s*,\\s*");
                int num = 0 ;
                for (String arg : argsArray) {
                    num++;
                }
                Main.semanticError.getE6().add_check_map(functionName, num, ctx.getStart().getLine());
            }
            eventAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        return eventAttribute;
    }

    @Override
    public DirectiveAttribute visitDirectiveAttribute(TypeScriptParser.DirectiveAttributeContext ctx) {
        DirectiveAttribute directiveAttribute=new DirectiveAttribute();
        if(ctx.Identifier()!=null){
            directiveAttribute.setIdentifier(ctx.Identifier().getText());
            if (Objects.equals(ctx.Identifier().getText(), "ngFor")){
                Main.semanticError.getE5().set_Is_ngfor(true);
            }
        }
        if(ctx.htmlAttributeValue()!=null){
            directiveAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        return directiveAttribute;
    }

    @Override
    public HtmlAttributeValue visitHtmlAttributeValue(TypeScriptParser.HtmlAttributeValueContext ctx) {
      HtmlAttributeValue htmlAttributeValue=new HtmlAttributeValue();

      if(ctx.StringLiteral()!=null){
            htmlAttributeValue.setStringLiteral(ctx.StringLiteral().getText());
          Pattern pattern = Pattern.compile("^\\s*let\\s+(\\w+)\\s+of\\s+(.+)$");
          String text = ctx.StringLiteral().getText();
          text = text.substring(1, text.length() - 1);
          Matcher matcher = pattern.matcher(text);
          if(matcher.matches()){
              String x = matcher.group(1).trim(); // المتغير بعد let
              String y = matcher.group(2).trim(); // الجزء بعد of
              Main.semanticError.getE4().setForequal(x,y ,String.valueOf(ctx.getStart().getLine()));
              Main.semanticError.getE5().setParent(x);
          }
      }
      return htmlAttributeValue;
    }

    @Override
    public AttributeName visitAttributeName(TypeScriptParser.AttributeNameContext ctx) {
        AttributeName attributeName=new AttributeName();
        if (ctx.CLASS() != null) {
            attributeName.getIdentifier().add(ctx.CLASS().getText());
        }
        for (int i=0 ;i<ctx.Identifier().size();i++){
            if (ctx.Identifier(i) != null) {
            attributeName.getIdentifier().add(ctx.Identifier(i).getText());

        }
        }
        return attributeName;
    }

    public Primary visitIdExpr (TypeScriptParser.IdExprContext ctx){
            return new IdentifierExpression(ctx.Identifier().getText());
        }

        @Override
        public Primary visitArrayExpr (TypeScriptParser.ArrayExprContext ctx){
            List<Expression> elements = new ArrayList<>();

            if (ctx.arrayLiteral() != null) {
                for (TypeScriptParser.ExpressionContext exprCtx : ctx.arrayLiteral().expression()) {
                    Expression element = (Expression) visit(exprCtx);
                    if (element != null) {
                        elements.add(element);
                    }
                }
            }

            return new ArrayExpression(elements);
        }

        @Override
        public Primary visitObjectExpr (TypeScriptParser.ObjectExprContext ctx){
            List<PropertyAssignment> properties = new ArrayList<>();

            if (ctx.objectLiteral() != null && ctx.objectLiteral().propertyAssignment() != null) {
                for (TypeScriptParser.PropertyAssignmentContext propCtx : ctx.objectLiteral().propertyAssignment()) {
                    PropertyAssignment prop = (PropertyAssignment) visit(propCtx);
                    if (prop != null) {
                        properties.add(prop);
                    }
                }
            }

            return new ObjectExpression(properties);
        }


        @Override
        public PropertyAssignment visitPropertyAssignment (TypeScriptParser.PropertyAssignmentContext ctx){
            String key = ctx.Identifier().getText();
            if(Main.semanticError.getE4().GetIsComponent()){
                Main.semanticError.getE4().addSaveAtt(ctx.Identifier().getText());
            }
            Expression value = (Expression) visit(ctx.expression());
            return new PropertyAssignment(key, value);
        }


        @Override
        public Primary visitParenExpr (TypeScriptParser.ParenExprContext ctx){
            Expression inner = (Expression) visit(ctx.expression());
            return new ParenthesizedExpression(inner);
        }

        @Override
        public Literal visitLiteral (TypeScriptParser.LiteralContext ctx){
            if (ctx.NumberLiteral() != null) {
                return new NumberLiteral(ctx.NumberLiteral().getText());
            } else if (ctx.StringLiteral() != null) {
                return new StringLiteral(ctx.StringLiteral().getText());
            } else if (ctx.objectLiteral() != null) {
//            System.out.println("inn literal///////////////////////////////////////");
                return (Literal) visit(ctx.objectLiteral());
            } else if (ctx.arrayLiteral() != null) {
                return (Literal) visit(ctx.arrayLiteral());
            }
            return null;
        }

    @Override
    public Primary visitLiteralExpr(TypeScriptParser.LiteralExprContext ctx) {
        return (Primary) visit(ctx.literal());
    }
        @Override
        public Expression visitBinaryExpr (TypeScriptParser.BinaryExprContext ctx){
            Expression left = (Expression) visit(ctx.expression(0));
            Expression right = (Expression) visit(ctx.expression(1));
            String operator = ctx.binaryOperator().getText();

            return new BinaryExpression(left, operator, right);
        }

        @Override
        public Expression visitUnaryExpr (TypeScriptParser.UnaryExprContext ctx){
            String operator = ctx.unaryOperator().getText();
            Expression expression = (Expression) visit(ctx.expression());

            return new UnaryExpression(operator, expression);
        }
        @Override
        public Statements visitExpressionStatement (TypeScriptParser.ExpressionStatementContext ctx){
            Expression expression = (Expression) visit(ctx.expression());
            ExpressionStatement statement = new ExpressionStatement();
            statement.setExpression(expression);
            return statement;
        }

        /////////////////////////////////////////////////////////////memberaccess - memberexp
        @Override
        public Expression visitMemberExpr (TypeScriptParser.MemberExprContext ctx){
            List<MemberAccess> accesses = new ArrayList<>();

            for (TypeScriptParser.MemberAccessContext accessCtx : ctx.memberAccess()) {
                // كل accessCtx قد يحتوي [expression] أو .Identifier
                for (ParseTree child : accessCtx.children) {
                    if (child instanceof TerminalNode) {
                        TerminalNode terminal = (TerminalNode) child;
                        if (terminal.getSymbol().getType() == TypeScriptParser.Dot) {
                            // التالي يجب أن يكون identifier
                            int index = accessCtx.children.indexOf(child);
                            if (index + 1 < accessCtx.children.size()) {
                                String identifier = accessCtx.getChild(index + 1).getText();
                                accesses.add(new MemberAccess("dot", identifier, null));
                                Main.semanticError.check_E3(identifier,ctx.getStart().getLine());
                                Main.semanticError.getE4().insert_value_class_equal(identifier);
                            }
                        }
                    } else if (child instanceof ParserRuleContext) {
                        ParserRuleContext ruleCtx = (ParserRuleContext) child;
                        if (ruleCtx.getRuleIndex() == TypeScriptParser.RULE_expression) {
                            Expression expr = (Expression) visit(ruleCtx);
                            accesses.add(new MemberAccess("bracket", null, expr));
                        }
                    }
                }
            }
            // تحليل primary داخل التعبير
            Expression base = (Expression) visit(ctx.primary());
            return new MemberExpression((Primary) base, accesses);
        }
    @Override
    public VariableDeclaration visitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) {
        String identifier = ctx.Identifier().getText();
        Expression value = (Expression) visit(ctx.expression());
        return new VariableDeclaration(identifier, value);
    }
}


