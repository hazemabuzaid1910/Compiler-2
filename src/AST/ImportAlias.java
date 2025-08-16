package AST;

public class ImportAlias {
    ImportModule importModule;
    String star;
    String As;
    String Identifier;

    public ImportModule getImportModule() {
        return importModule;
    }

    public void setImportModule(ImportModule importModule) {
        this.importModule = importModule;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportStatement {\n");

        if (importModule != null) {
            sb.append("  importModule: ")
                    .append(importModule.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (star != null) {
            sb.append("  star: ")
                    .append(star.replace("\n", "\n    "))
                    .append(",\n");
        }

        if (As != null) {
            sb.append("  As: ")
                    .append(As.replace("\n", "\n    "))
                    .append(",\n");
        }

        if (Identifier != null) {
            sb.append("  Identifier: ")
                    .append(Identifier.replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}