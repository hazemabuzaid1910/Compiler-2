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
        String sb = "VariableDeclaration {\n" + "  LET: " + (LET != null ? LET : "NO let ") + "\n" +
                "  Identifier: " + (identifier != null ? identifier : "NO identifier") + "\n" +
                "  Expression: " + (expression != null ? expression.toString() : "NO expression") + "\n" +
                "}";
        return sb;
    }

}
