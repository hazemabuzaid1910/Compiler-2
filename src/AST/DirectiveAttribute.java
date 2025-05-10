package AST;

public class DirectiveAttribute implements HtmlAttribute {
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
        return "DirectiveAttribute{" +
                "identifier='" + identifier + '\'' +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
