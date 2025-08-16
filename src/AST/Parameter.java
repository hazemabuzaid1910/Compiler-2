package AST;

public class Parameter {
     String identifier;
     TypeAnnotation typeAnnotation;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        String sb = "Parameter {\n" + "  identifier: " + (identifier != null ? "'" + identifier + "'" : "null") + "\n" +
                "  typeAnnotation: " +
                (typeAnnotation != null ? typeAnnotation.toString().replace("\n", "\n    ") : "null") +
                "\n" +
                "}";
        return sb;
    }
}

