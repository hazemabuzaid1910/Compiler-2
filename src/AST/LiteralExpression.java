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

        // إضافة المسافة المناسبة للتنسيق مع التأكد من وجود literal

        String sb = "LiteralExpression {\n" + "  literal: " + (literal != null ? literal.toString().replace("\n", "\n    ") : "null") + "\n" +
                "}";
        return sb;
    }
}
