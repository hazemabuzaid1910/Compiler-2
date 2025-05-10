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
        return "MostacheExp{" +
                "expressionHtml=" + expressionHtml +
                '}';
    }
}
