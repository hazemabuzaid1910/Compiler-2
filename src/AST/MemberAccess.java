package AST;

public class MemberAccess implements Expression {
     String type; // "dot" or "bracket"
     String identifier;
     Expression indexExpression;

    public MemberAccess(String type, String identifier, Expression indexExpression) {
        this.type = type;
        this.identifier = identifier;
        this.indexExpression = indexExpression;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    public Expression getIndexExpression() { return indexExpression; }
    public void setIndexExpression(Expression indexExpression) { this.indexExpression = indexExpression; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MemberAccess {\n");

        sb.append("  type: '").append(type).append("',\n");
        sb.append("  identifier: '").append(identifier).append("',\n");

        // إضافة التحقق من null لـ indexExpression
        if(indexExpression != null) {
            sb.append("  indexExpression: ")
                    .append( indexExpression.toString().replace("\n", "\n    "))
                    .append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
