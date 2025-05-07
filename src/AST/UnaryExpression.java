package AST;

public class UnaryExpression implements Expression {
     String operator;
     Expression expression;

    public UnaryExpression(String operator, Expression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() {
        return "UnaryExpression {\n" +
                "  operator: '" + operator + "',\n" +
                "  expression: " + (expression != null ? expression.toString() : "null") + "\n" +
                "}";
    }

}

