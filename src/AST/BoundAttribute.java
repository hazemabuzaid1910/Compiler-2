package AST;

public class BoundAttribute implements HtmlAttribute{
AttributeName attributeName;
HtmlAttributeValue htmlAttributeValue;

    public AttributeName getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(AttributeName attributeName) {
        this.attributeName = attributeName;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        return "BoundAttribute{" +
                "attributeName=" + attributeName +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
