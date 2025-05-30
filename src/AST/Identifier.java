package AST;

public class Identifier implements HtmlContent{
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Identifier {\n");

        if (identifier != null) {
            sb.append("  identifier: '").append(identifier).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
