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
        StringBuilder sb = new StringBuilder();
        sb.append("\n   HtmlPairTag {\n")
                .append("    htmlTagName: ").append(htmlTagName).append("\n")
                .append("    htmlAttribute: ").append(htmlAttribute).append("\n")
                .append("    htmlContent: ").append(htmlContent).append("\n")
                .append("}");
        return sb.toString();
    }

}
