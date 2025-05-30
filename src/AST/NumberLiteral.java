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
        StringBuilder sb = new StringBuilder("NumberLiteral {\n");

        if (value != null) {
            sb.append("  value: '").append(value).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
