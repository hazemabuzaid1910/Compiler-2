package AST;

import java.util.ArrayList;
import java.util.List;

public class StandardAttribute {
    List<String> identifier=new ArrayList<>();
    HtmlAttributeValue htmlAttributeValue;

    public List<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<String> identifier) {
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
        return "StandardAttribute{" +
                "identifier=" + identifier +
                ", htmlAttributeValue=" + htmlAttributeValue +
                '}';
    }
}
