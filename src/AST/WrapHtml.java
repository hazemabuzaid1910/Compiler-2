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
        return "WrapHtml{" +
                "htmlElement=" + htmlElement +
                '}';
    }
}
