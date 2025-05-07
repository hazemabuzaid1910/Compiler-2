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
        StringBuilder sb = new StringBuilder();
        if (importModule != null) {
            sb.append(importModule);
        }
        if (star != null) {
            sb.append(star).append("\t");
        }
        if (As != null) {
            sb.append(As).append("\t");
        }
        if (Identifier != null) {
            sb.append(Identifier);
        }
        return sb.toString();
    }
}