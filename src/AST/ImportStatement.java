package AST;

public class ImportStatement implements Statement {

     String Import;
     ImportFromBlock importFromBlock;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public ImportFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ImportFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("\n").append("importStatement{");
        if(Import!=null){
            sb.append(Import).append("\t");
        }
        if(importFromBlock!=null){
            sb.append(importFromBlock).append("}");
        }
        return sb.toString();
    }
}
