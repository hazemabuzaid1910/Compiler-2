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
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\t\tSelectorProperty {")
                .append("\n  selector = '").append(selector).append('\'')
                .append("\n  selectorName = '").append(selectorName).append('\'')
                .append("\n}");
        return sb.toString();
    }

}
