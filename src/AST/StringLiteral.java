package AST;

public class StringLiteral implements Literal {
     String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "StringLiteral {\n" +
                "  value: '" + value + "'\n" +
                "}";
    }
}
