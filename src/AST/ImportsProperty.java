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
        StringBuilder sb = new StringBuilder("ImportsProperty {\n");

        if (imports != null) {
            sb.append("  imports: ")
                    .append(imports.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (importModules != null) {
            sb.append("  importModules: ")
                    .append(importModules.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
