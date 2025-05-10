package AST;

import java.util.ArrayList;
import java.util.List;

public class StandardAttribute implements HtmlAttribute,Expression{
    String Class;
    List<String> identifier=new ArrayList<>();
    HtmlAttributeValue htmlAttributeValue;



    public void setClass(String aClass) {
        Class = aClass;
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
        StringBuilder sb=new StringBuilder();
        if (Class!=null && !Class.isEmpty()){
            sb.append(Class);
        }
        if (identifier!=null && !identifier.isEmpty()){
            sb.append(identifier);
        }if (htmlAttributeValue!=null){
            sb.append(htmlAttributeValue);
        }
        return  sb.toString();

    }
}
