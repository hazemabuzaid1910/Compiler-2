package Visitor;

import AST.*;
import antler.TypeScriptParser;
import antler.TypeScriptParserBaseVisitor;
import antler.TypeScriptParserVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;


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
//////////////////////////////////////////////////////////////
        @Override
        public ClassDeclaration visitClassDeclaration (TypeScriptParser.ClassDeclarationContext ctx){
            ClassDeclaration classDecl = new ClassDeclaration();

            if (ctx.EXPORT() != null) {
                classDecl.setExport(ctx.EXPORT().getText());
            }

            classDecl.setClass(ctx.CLASS().getText());  // غالباً يكون دائمًا "class"
            classDecl.setIdentifier(ctx.Identifier().getText());

            // زيارة classBody
            ClassBody body = (ClassBody) visit(ctx.classBody());
            classDecl.setClassBody(body);

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

            if (ctx.Identifier() != null) {
                prop.setIdentifier(ctx.Identifier().getText());
            }

            if (ctx.expression() != null) {
                Expression expr = (Expression) visit(ctx.expression());
                prop.setExpression(expr);
            }

            return prop;
        }


        @Override
        public MethodDeclaration visitMethodDeclaration (TypeScriptParser.MethodDeclarationContext ctx){
            MethodDeclaration method = new MethodDeclaration();

            if (ctx.Identifier() != null) {
                method.setIdentifier(ctx.Identifier().getText());
            }

            if (ctx.parameterList() != null) {
                ParameterList params = (ParameterList) visit(ctx.parameterList());
                method.setParameterList(params);
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
            return new ClassExpression(); // تحتاج إنشاء هذا الكلاس في AST
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
            return html;
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
////////////////////////////////////////////////////////////////////
///
///

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
        public VariableDeclaration visitVariableDeclaration (TypeScriptParser.VariableDeclarationContext ctx){
            String identifier = ctx.Identifier().getText();
            Expression value = (Expression) visit(ctx.expression());

            return new VariableDeclaration(identifier, value);
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


    }



