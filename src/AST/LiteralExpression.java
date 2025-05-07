package AST;

public class LiteralExpression implements Primary {
     Literal literal;

    public LiteralExpression(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() { return literal; }
    public void setLiteral(Literal literal) { this.literal = literal; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LiteralExpression {\n");

        // إضافة المسافة المناسبة للتنسيق مع التأكد من وجود literal
        sb.append("  literal: ").append(literal != null ? literal.toString().replace("\n", "\n    ") : "null").append("\n");

        sb.append("}");
        return sb.toString();
    }
}
