package AST;

public class PushArray implements Statements{
    String objectName;
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PushArray{" +
                "objectName='" + objectName + '\'' +
                ", expression=" + expression +
                '}';
    }
}
