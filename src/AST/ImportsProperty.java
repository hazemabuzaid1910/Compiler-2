package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportsProperty implements ComponentProperty{
    String imports;
    List<ImportModule> importModules=new ArrayList<>();

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public List<ImportModule> getImportModules() {
        return importModules;
    }

    public void setImportModules(List<ImportModule> importModules) {
        this.importModules = importModules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tImportsProperty {\n")
                .append("  imports: '").append(imports).append("',\n")
                .append("  importModules: ").append(importModules).append("\n")
                .append("}");
        return sb.toString();
    }

}
