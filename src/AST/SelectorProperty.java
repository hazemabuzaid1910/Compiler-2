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
        return "SelectorProperty{" +
                "selector='" + selector + '\'' +
                ", selectorName='" + selectorName + '\'' +
                '}';
    }
}
