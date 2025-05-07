package AST;

public class ObjectExpression  implements Primary , Literal,Expression {
     java.util.List<PropertyAssignment> properties;

    public ObjectExpression(java.util.List<PropertyAssignment> properties) {
        this.properties = properties;
    }

    public java.util.List<PropertyAssignment> getProperties() { return properties; }
    public void setProperties(java.util.List<PropertyAssignment> properties) { this.properties = properties; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ObjectExpression {\n");
        if (properties != null && !properties.isEmpty()) {
            for (PropertyAssignment p : properties) {
                String propStr = p != null ? p.toString().replace("\n", "\n    ") : "null";
                sb.append("  ").append(propStr).append("\n");
            }
        } else {
            sb.append("  properties: []\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
