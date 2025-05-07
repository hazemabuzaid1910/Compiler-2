package AST;

public class NumberLiteral implements Literal {
     String value;

    public NumberLiteral(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public String toString() {
        return "NumberLiteral {\n" +
                "  value: '" + value + "'\n" +
                "}";
    }
}
