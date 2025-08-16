package AST;

import java.util.List;

public class MemberExpression implements Expression {
     Primary primary;
     List<MemberAccess> accesses;

    public MemberExpression(Primary primary, List<MemberAccess> accesses) {
        this.primary = primary;
        this.accesses = accesses;
    }

    public Primary getPrimary() { return primary; }
    public void setPrimary(Primary primary) { this.primary = primary; }

    public List<MemberAccess> getAccesses() { return accesses; }
    public void setAccesses(List<MemberAccess> accesses) { this.accesses = accesses; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MemberExpression {\n");

        // إضافة مسافة وتنظيم الطباعة للـ primary
        sb.append("  primary: ").append(primary != null ? primary.toString().replace("\n", "\n    ") : "No primary").append(",\n");

        // إضافة مسافة وتنظيم الطباعة للقائمة accesses

        if (accesses != null && !accesses.isEmpty()) {
            sb.append("  accesses: [\n");
            for (MemberAccess access : accesses) {
                sb.append("    ").append(access != null ? access.toString().replace("\n", "\n    ") : "No access").append(",\n");
                sb.append("  ]\n");
            }
        } else {
        }


        sb.append("}");
        return sb.toString();
    }
}
