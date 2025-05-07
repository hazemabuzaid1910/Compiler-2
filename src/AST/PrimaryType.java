package AST;

public class PrimaryType {
     String typeName; // مثل ANY, STRING, أو اسم identifier

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "PrimaryType {\n" +
                "  typeName = '" + typeName + "'\n" +
                "}";
    }

}
