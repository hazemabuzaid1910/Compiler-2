package AST;

import java.util.List;

public class HtmlPairTag implements HtmlElement{
    HtmlTagName htmlTagName;
    List<HtmlAttribute> htmlAttribute;
    List<HtmlContent> htmlContent;
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
        return "HtmlPairTag{" +
                "htmlTagName=" + htmlTagName +
                ", htmlAttribute=" + htmlAttribute +
                ", htmlContent=" + htmlContent +
                '}';
    }
}
