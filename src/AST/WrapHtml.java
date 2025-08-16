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
        StringBuilder sb = new StringBuilder("WrapHtml {\n");

        if (htmlElement != null) {
            sb.append("  htmlElement = ").append(htmlElement.toString().replace("\n", "\n    ")).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
