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
        StringBuilder sb = new StringBuilder("HtmlSingleTag {\n");

        // Print htmlTagName if not null
        if (htmlTagName != null) {
            sb.append("  htmlTagName: ")
                    .append(htmlTagName.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        // Print htmlAttributes if not null
        if (htmlAttributes != null) {
            sb.append("  htmlAttributes: ")
                    .append(htmlAttributes.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
