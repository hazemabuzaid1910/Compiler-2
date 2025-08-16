package AST;

public class ParseLocalStorage implements Expression{
  Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ParseLocalStorage{" +
                "expression=" + expression +
                '}';
    }
}
