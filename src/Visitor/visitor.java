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
        if(ctx.importModule(i)!=null){
            block.setImportModule(visitImportModule(ctx.importModule(i)));
        }
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
        return importAlias;
    }
}


