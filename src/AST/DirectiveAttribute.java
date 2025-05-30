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
        StringBuilder sb = new StringBuilder("DirectiveAttribute {\n");

        if (identifier != null) {
            sb.append("  Identifier: '")
                    .append(identifier.toString().replace("\n", "\n    "))
                    .append("',\n");
        }

        if (htmlAttributeValue != null) {
            sb.append("  HTML Attribute Value: ")
                    .append(htmlAttributeValue.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
