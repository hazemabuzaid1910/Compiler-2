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
        StringBuilder sb = new StringBuilder("HtmlNode {\n");

        if (htmlElements != null && htmlElements.getElements() != null && !htmlElements.getElements().isEmpty()) {
            sb.append("  htmlElements: [\n");
            for (HtmlElement element : htmlElements.getElements()) {
                sb.append("    ")
                        .append(element != null ? element.toString().replace("\n", "\n    ") : "No element")
                        .append(",\n");
            }
            sb.append("  ]\n");
        }

        sb.append("}");
        return sb.toString();
    }





}
