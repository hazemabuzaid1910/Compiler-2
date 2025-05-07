package AST;

public class ArrayExpression implements Primary, Literal,Expression {
     java.util.List<Expression> elements;

    public ArrayExpression(java.util.List<Expression> elements) {
        this.elements = elements;
    }

    public java.util.List<Expression> getElements() { return elements; }
    public void setElements(java.util.List<Expression> elements) { this.elements = elements; }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayExpression {\n");
        sb.append("  elements: [\n");

        // تحقق من العناصر في القائمة وإضافة العناصر غير الـ null فقط
        if (elements != null && !elements.isEmpty()) {
            for (Expression e : elements) {
                if (e != null) {
                    sb.append("    ").append(e.toString().replace("\n", "\n    ")).append(",\n");
                }
            }
        }

        if (elements == null || elements.isEmpty()) {
            sb.append("    {}");
        } else {
            sb.deleteCharAt(sb.length() - 2);  // حذف آخر فاصلة زائدة
            sb.append("  ]\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
