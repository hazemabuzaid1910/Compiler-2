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
        StringBuilder sb = new StringBuilder("BoundAttribute {\n");

        if (attributeName != null) {
            sb.append("  attributeName: ")
                    .append(attributeName.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (htmlAttributeValue != null) {
            sb.append("  htmlAttributeValue: ")
                    .append(htmlAttributeValue.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
