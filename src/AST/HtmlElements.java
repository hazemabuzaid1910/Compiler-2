package AST;
import java.util.ArrayList;
import java.util.List;

public class HtmlElements {
    List<HtmlElement> htmlElements=new ArrayList<>();

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(List<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }
    public boolean isEmpty() {
        return htmlElements == null || htmlElements.isEmpty();
    }

    public List<HtmlElement> getElements() {
        return htmlElements;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlElements {\n");

        if (htmlElements != null && !htmlElements.isEmpty()) {
            sb.append("  htmlElements: [\n");
            for (Object element : htmlElements) { // Adjust type if needed
                sb.append("    ")
                        .append(element != null ? element.toString().replace("\n", "\n    ") : "null")
                        .append(",\n");
            }
            sb.append("  ]\n");
        }

        sb.append("}");
        return sb.toString();
    }



}
