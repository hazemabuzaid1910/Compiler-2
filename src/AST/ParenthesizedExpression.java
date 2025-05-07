package AST;

public class ParenthesizedExpression implements Primary {
     Expression expression;

    public ParenthesizedExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() {
        return "ParenthesizedExpression{" +
                "expression=" + expression +
                '}';
    }
}
