package AST;

public class PropertyDeclaration implements ClassMember {
     String identifier;
     Expression expression;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyDeclaration {\n");
        sb.append("  identifier: '").append(identifier).append("',\n");

        if (expression != null) {
            String exprStr = expression.toString().replace("\n", "\n    ");
            sb.append("  expression:\n    ").append(exprStr.trim()).append("\n");
        } else {
            sb.append("  expression: null\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
