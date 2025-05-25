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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlElements {\n")
                .append("  htmlElements: ").append(htmlElements).append("\n")
                .append("}");
        return sb.toString();
    }

}
