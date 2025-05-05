package AST;

public class ImportFromBlock {
    ImportFrom importFrom;
    ImportModule importModule;
    ImportAlias importAlias;
    String StringLiteral;

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    public ImportModule getImportModule() {
        return importModule;
    }

    public void setImportModule(ImportModule importModule) {
        this.importModule = importModule;
    }

    public ImportAlias getImportAlias() {
        return importAlias;
    }

    public void setImportAlias(ImportAlias importAlias) {
        this.importAlias = importAlias;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
    StringBuilder sb=new StringBuilder();
    if(importModule!=null){
        sb.append(importModule);
    }
    if(importAlias!=null){
        sb.append(importAlias);
    }
    if(importFrom!=null){
        sb.append(importFrom);
    }
        if(StringLiteral!=null){
            sb.append(StringLiteral);
        }
    return  sb.toString();
    }
}
