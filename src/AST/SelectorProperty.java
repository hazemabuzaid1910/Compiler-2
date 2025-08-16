package AST;

public class SelectorProperty implements ComponentProperty {
String selector;
String selectorName;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getSelectorName() {
        return selectorName;
    }

    public void setSelectorName(String selectorName) {
        this.selectorName = selectorName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SelectorProperty {\n");

        if (selector != null) {
            sb.append("  selector = '").append(selector).append("'\n");
        }

        if (selectorName != null) {
            sb.append("  selectorName = '").append(selectorName).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
