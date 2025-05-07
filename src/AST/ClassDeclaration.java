package AST;

public class ClassDeclaration implements Statement{
    String Export;
    String className;
    String Identifier;
    ClassBody classBody;

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    public String getExport() {
        return Export;
    }

    public void setExport(String export) {
        Export = export;
    }

    public String getClassName() {
        return className;
    }

    public void setClass(String aClass) {
        className = aClass;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nClassDeclaration {\n");

        // طباعة Export مع التحقق من null
        sb.append("  Export: ").append(Export != null ? Export : "null").append("\n");

        // طباعة className مع التحقق من null
        sb.append("  Class: ").append(className != null ? className : "null").append("\n");

        // طباعة Identifier مع التحقق من null
        sb.append("  Identifier: ").append(Identifier != null ? Identifier : "null").append("\n");

        // طباعة ClassBody إذا كانت موجودة
        sb.append("  ClassBody:\n");
        if (classBody != null) {
            String bodyStr = classBody.toString().replace("\n", "\n    ");
            sb.append("    ").append(bodyStr.trim()).append("\n");
        } else {
            sb.append("    null\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
