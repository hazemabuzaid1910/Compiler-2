package AST;

public class MostacheExp implements HtmlContent{
ExpressionHtml expressionHtml;

    public ExpressionHtml getExpressionHtml() {
        return expressionHtml;
    }

    public void setExpressionHtml(ExpressionHtml expressionHtml) {
        this.expressionHtml = expressionHtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MostacheExp {\n");

        if (expressionHtml != null) {
            sb.append("  expressionHtml: ")
                    .append(expressionHtml.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
