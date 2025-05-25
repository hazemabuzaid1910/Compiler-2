package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlSingleTag implements HtmlElement{
    HtmlTagName htmlTagName;
    List<HtmlAttribute> htmlAttributes=new ArrayList<>();

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tHtmlSingleTag {\n")
                .append("  htmlTagName: ").append(htmlTagName).append("\n")
                .append("  htmlAttributes: ").append(htmlAttributes).append("\n")
                .append("}");
        return sb.toString();
    }

}
