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
        if(Import!=null){
            sb.append(Import);
        }
        if(importFromBlock!=null){
            sb.append(importFromBlock).append("\n");
        }
        return sb.toString();
    }
}
