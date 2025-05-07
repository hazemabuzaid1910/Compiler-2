package AST;

public class ExpressionStatement implements Statements {
     Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExpressionStatement {\n");

        // التحقق إذا كانت expression null
        if (expression != null) {
            sb.append("  ").append(expression.toString().replace("\n", "\n    ")).append("\n");
        } else {
            sb.append("  No expression\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
