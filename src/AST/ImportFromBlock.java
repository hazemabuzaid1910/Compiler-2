package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportFromBlock {
    ImportFrom importFrom;
    List<ImportModule> importModule=new ArrayList<>();
    ImportAlias importAlias;
    String StringLiteral;

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    public List<ImportModule> getImportModule() {
        return importModule;
    }

    public void setImportModule(List<ImportModule> importModule) {
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
        StringBuilder sb = new StringBuilder("ImportDeclaration {\n");

        if (importModule != null && !importModule.isEmpty()) {
            sb.append("  importModule: [\n");
            for (ImportModule stmt : importModule) {
                sb.append("    ")
                        .append(stmt != null ? stmt.toString().replace("\n", "\n    ") : "null")
                        .append(",\n");
            }
            sb.append("  ]\n");
        }

        if (importAlias != null) {
            sb.append("  importAlias: ")
                    .append(importAlias.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (importFrom != null) {
            sb.append("  importFrom: ")
                    .append(importFrom.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (StringLiteral != null) {
            sb.append("  StringLiteral: ")
                    .append(StringLiteral.replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
