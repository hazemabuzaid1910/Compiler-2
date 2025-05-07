package Visitor;

import AST.*;
import antler.TypeScriptParser;
import antler.TypeScriptParserBaseVisitor;
import antler.TypeScriptParserVisitor;

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
       if (ctx.selectorProperty()!=null){
           return visitSelectorProperty(ctx.selectorProperty());
       }
       if(ctx.standaloneProperty()!=null){
           return visitStandaloneProperty(ctx.standaloneProperty());
       }
       if(ctx.importsProperty()!=null){
           return visitImportsProperty(ctx.importsProperty());
       }
        if(ctx.templateProperty()!=null){
            return visitTemplateProperty(ctx.templateProperty());
        }
       return null;
    }


    @Override
    public SelectorProperty visitSelectorProperty(TypeScriptParser.SelectorPropertyContext ctx) {
        SelectorProperty selectorProperty=new SelectorProperty();
        if(ctx.SELECTOR()!=null){
            selectorProperty.setSelector(ctx.SELECTOR().getText());
        }
        if(ctx.StringLiteral()!=null){
            selectorProperty.setSelectorName(ctx.StringLiteral().getText());
        }
        return selectorProperty;
    }

    @Override
    public StandaloneProperty visitStandaloneProperty(TypeScriptParser.StandalonePropertyContext ctx) {
        StandaloneProperty standaloneProperty=new StandaloneProperty();
        return standaloneProperty;
    }

    @Override
    public ImportsProperty visitImportsProperty(TypeScriptParser.ImportsPropertyContext ctx) {
        ImportsProperty importsProperty=new ImportsProperty();
        for (int i = 0 ; i < ctx.importModule().size() ; i++){
            if(ctx.importModule(i)!=null){
                importsProperty.getImportModules().add(visitImportModule(ctx.importModule(i)));
        }
        }
        return importsProperty;
    }

    @Override
    public TemplateProperty visitTemplateProperty(TypeScriptParser.TemplatePropertyContext ctx) {
        TemplateProperty templateProperty=new TemplateProperty();
        if(ctx.htmlNode()!=null){
            templateProperty.setHtmlNode(visitHtmlNode(ctx.htmlNode()));
        }
        return templateProperty;
    }

    @Override
    public HtmlNode visitHtmlNode(TypeScriptParser.HtmlNodeContext ctx) {
        HtmlNode html=new HtmlNode();
        return  html;
    }
}


