package AST;

public class TypeAnnotation {
    TypeName typeName;

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeAnnotation {\n" +
                "  typeName: " + (typeName != null ? typeName.toString() : "null") + "\n" +
                "}";
    }

}

