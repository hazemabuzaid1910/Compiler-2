package AST;

public class ReturnStatement implements Statements {
    String Return;
     Expression expression; // optional

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "Return='" + Return + '\'' +
                ", expression=" + expression +
                '}';
    }
}
