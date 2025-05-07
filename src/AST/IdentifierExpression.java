package AST;

public class IdentifierExpression implements Primary {
     String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "IdentifierExpression {\n" +
                "    name = '" + (name != null ? name : "No Identifier ") + "'\n" +
                "}";
    }
}
