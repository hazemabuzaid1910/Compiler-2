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
        StringBuilder sb = new StringBuilder("importStatement {\n");

        if (Import != null) {
            sb.append("  Import: ")
                    .append(Import.replace("\n", "\n    "))
                    .append(",\n");
        }

        if (importFromBlock != null) {
            sb.append("  importFromBlock: ")
                    .append(importFromBlock.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
