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
        StringBuilder sb = new StringBuilder("Parameter {\n");
        sb.append("  identifier: ").append(identifier != null ? "'" + identifier + "'" : "null").append("\n");
        sb.append("  typeAnnotation: ")
                .append(typeAnnotation != null ? typeAnnotation.toString().replace("\n", "\n    ") : "null")
                .append("\n");
        sb.append("}");
        return sb.toString();
    }
}

