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
        StringBuilder sb = new StringBuilder("PrimaryExpressionHtml {\n");

        if (identifier != null) {
            sb.append("  identifier: '").append(identifier).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
