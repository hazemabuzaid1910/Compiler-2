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
        return "\n\t"+"HtmlSingleTag{" +
                "htmlTagName=" + htmlTagName +
               ",htmlAttributes=" + htmlAttributes +
                '}';
    }
}
