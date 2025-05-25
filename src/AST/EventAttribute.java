package AST;

public class EventAttribute implements HtmlAttribute{

    String identifier;
    HtmlAttributeValue htmlAttributeValue;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventAttribute {\n")
                .append("  Identifier: '").append(identifier).append("'\n")
                .append("  HTML Attribute Value: ").append(htmlAttributeValue).append("\n")
                .append("}");
        return sb.toString();
    }

}
