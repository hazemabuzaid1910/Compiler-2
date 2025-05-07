package AST;

public class MethodDeclaration implements ClassMember {
     String identifier;
     ParameterList parameterList;
     TypeAnnotation typeAnnotation;
     Block block;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MethodDeclaration {\n");

        sb.append("  identifier: ").append(identifier != null ? "'" + identifier + "'" : "NO identifier").append(",\n");

        sb.append("  parameterList:\n");
        if (parameterList != null) {
            sb.append("    ").append(parameterList.toString().replace("\n", "\n    ")).append("\n");
        } else {
            sb.append("    No parameterList\n");
        }

        sb.append("  typeAnnotation:\n");
        if (typeAnnotation != null) {
            sb.append("    ").append(typeAnnotation.toString().replace("\n", "\n    ")).append("\n");
        } else {
            sb.append("    NO typeAnnotation\n");
        }

        sb.append("  block:\n");
        if (block != null) {
            sb.append("    ").append(block.toString().replace("\n", "\n    ")).append("\n");
        } else {
            sb.append("    NO block \n");
        }

        sb.append("}");
        return sb.toString();
    }
}
