package AST;

public class VariableDeclaration implements Statements {
     String LET;
     String identifier;
     Expression expression;

    public VariableDeclaration(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getLET() {
        return LET;
    }

    public void setLET(String LET) {
        this.LET = LET;
    }

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
        StringBuilder sb = new StringBuilder("VariableDeclaration {\n");
        sb.append("  LET: ").append(LET != null ? LET : "NO let ").append("\n");
        sb.append("  Identifier: ").append(identifier != null ? identifier : "NO identifier").append("\n");
        sb.append("  Expression: ").append(expression != null ? expression.toString() : "NO expression").append("\n");
        sb.append("}");
        return sb.toString();
    }

}
