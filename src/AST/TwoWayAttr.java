package AST;

public class TwoWayAttr implements HtmlAttribute{
    String attributeName;
    HtmlAttributeValue htmlAttributeValue;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
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
        StringBuilder sb = new StringBuilder("TowWayBoundingAttribute {\n");

        if (attributeName != null) {
            sb.append("  attributeName: ")
                    .append(attributeName.replace("\n", "\n    "))
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
