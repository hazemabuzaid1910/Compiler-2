package AST;

public class BinaryExpression implements Expression {
     Expression left;
     String operator;
     Expression right;

    public BinaryExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Expression getLeft() { return left; }
    public void setLeft(Expression left) { this.left = left; }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public Expression getRight() { return right; }
    public void setRight(Expression right) { this.right = right; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BinaryExpression {\n");

        // طباعة left إذا كانت غير null
        if (left != null) {
            sb.append("  left: ")
                    .append(left.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        // طباعة operator
        if (operator != null) {
            sb.append("  operator: '").append(operator).append("',\n");
        }

        // طباعة right إذا كانت غير null
        if (right != null) {
            sb.append("  right: ")
                    .append(right.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
