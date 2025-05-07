package AST;

public class HtmlNode implements  Statement{
   HtmlElements htmlElements;

    public HtmlElements getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(HtmlElements htmlElements) {
        this.htmlElements = htmlElements;
    }

    @Override
    public String toString() {
        return "HtmlNode{" +
                "htmlElements=" + htmlElements +
                '}';
    }
}
