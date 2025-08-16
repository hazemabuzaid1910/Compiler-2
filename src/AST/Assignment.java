package AST;

public class Assignment implements Statements {
     Expression left;
     Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Assignment {\n");

        if (left != null) {
            sb.append("  left: ")
                    .append(left.toString().replace("\n", "\n    "))
                    .append(",\n");
        }
        if (right != null) {
            sb.append("  right: ")
                    .append(right.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
