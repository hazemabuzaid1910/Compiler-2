package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlPairTag implements HtmlElement{
    HtmlTagName htmlTagName;
    List<HtmlAttribute> htmlAttribute=new ArrayList<>();
    List<HtmlContent> htmlContent =new ArrayList<>();
    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    public List<HtmlAttribute> getHtmlAttribute() {
        return htmlAttribute;
    }

    public void setHtmlAttribute(List<HtmlAttribute> htmlAttribute) {
        this.htmlAttribute = htmlAttribute;
    }

    public List<HtmlContent> getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(List<HtmlContent> htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtmlPairTag {\n");

        // Print htmlTagName if not null
        if (htmlTagName != null) {
            sb.append("  htmlTagName: ")
                    .append(htmlTagName.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        // Print htmlAttribute if not null
        if (htmlAttribute != null) {
            sb.append("  htmlAttribute: ")
                    .append(htmlAttribute.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        // Print htmlContent if not null
        if (htmlContent != null) {
            sb.append("  htmlContent: ")
                    .append(htmlContent.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }



}
