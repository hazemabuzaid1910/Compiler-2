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
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrimaryExpressionHtml {")
                .append("\n  identifier: '").append(identifier).append('\'')
                .append("\n}");
        return sb.toString();
    }

}
