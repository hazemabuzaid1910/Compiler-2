package AST;

import java.util.ArrayList;
import java.util.List;

public class UnionType {
    private List<PrimaryType> primaryTypes = new ArrayList<>();

    public List<PrimaryType> getPrimaryTypes() {
        return primaryTypes;
    }

    public void setPrimaryTypes(List<PrimaryType> primaryTypes) {
        this.primaryTypes = primaryTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UnionType {\n");
        if (primaryTypes != null && !primaryTypes.isEmpty()) {
            for (PrimaryType pt : primaryTypes) {
                sb.append("  ").append(pt != null ? pt.toString() : "null").append("\n");
            }
        } else {
            sb.append("  null\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
