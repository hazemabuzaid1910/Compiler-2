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
        return "EventAttribute{" +
                "identifier='" + identifier + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
