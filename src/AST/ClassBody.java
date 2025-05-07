package AST;

import java.util.List;

public class ClassBody {
    List<ClassMember> classMembers;

    public List<ClassMember> getClassMembers() {
        return classMembers;
    }

    public void setClassMembers(List<ClassMember> classMembers) {
        this.classMembers = classMembers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassBody {\n");

        // تحقق إذا كانت القائمة غير فارغة أو null
        if (classMembers != null && !classMembers.isEmpty()) {
            for (ClassMember member : classMembers) {
                if (member != null) {
                    sb.append("  ").append(member.toString().replace("\n", "\n    ")).append("\n");
                }
            }
        } else {
            sb.append("  No class members\n");
        }

        sb.append("}");
        return sb.toString();
    }

}

