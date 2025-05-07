package AST;

public class PrimaryExpressionHtml {
String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\n"+"PrimaryExpressionHtml{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
