package AST;

public class HtmlNode implements  Statement{
   HtmlElements htmlElements;

    public HtmlElements getHtmlElements(Object o) {
        return htmlElements;
    }

    public void setHtmlElements(HtmlElements htmlElements) {
        this.htmlElements = htmlElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlNode {\n")
                .append("  htmlElements: ").append(htmlElements).append("\n")
                .append("}");
        return sb.toString();
    }

}
