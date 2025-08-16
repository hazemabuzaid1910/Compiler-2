package AST;

public class PropertyAssignment {
     String key;
     Expression value;

    public PropertyAssignment(String key, Expression value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public Expression getValue() { return value; }
    public void setValue(Expression value) { this.value = value; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyAssignment {\n");
        sb.append("  key: \"").append(key).append("\",\n");

        if (value != null) {
            String valueStr = value.toString().replace("\n", "\n    ");
            sb.append("  value:\n    ").append(valueStr.trim()).append("\n");
        } else {
            sb.append("  value: null\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
