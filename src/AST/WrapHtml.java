package AST;

public class WrapHtml implements HtmlContent{
    HtmlElement htmlElement;

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" WrapHtml {")
                .append("\n  htmlElement = ").append(htmlElement)
                .append("\n}");
        return sb.toString();
    }

}
