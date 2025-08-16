package AST;

import java.util.ArrayList;
import java.util.List;

public class StandardAttribute implements HtmlAttribute,Expression{
    String Classs;
    List<String> identifier=new ArrayList<>();
    HtmlAttributeValue htmlAttributeValue;


    public String getClasss() {
        return Classs;
    }

    public void setClasss(String classs) {
        Classs = classs;
    }

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
        StringBuilder sb = new StringBuilder("YourClassName {\n");

        if (Classs != null && !Classs.isEmpty()) {
            sb.append("  Class: ").append(Classs).append("\n");
        }

        if (identifier != null && !identifier.isEmpty()) {
            sb.append("  identifier: ").append(identifier).append("\n");
        }

        if (htmlAttributeValue != null) {
            sb.append("  htmlAttributeValue: ").append(htmlAttributeValue.toString().replace("\n", "\n    ")).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
