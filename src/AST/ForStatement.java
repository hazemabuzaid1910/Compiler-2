package AST;

public class ForStatement implements Statements {
     Statements initializer; // variableDeclaration or expressionStatement or null
     Expression condition;   // optional
     Expression increment;   // optional
     Block block;

    public Statements getInitializer() {
        return initializer;
    }

    public void setInitializer(Statements initializer) {
        this.initializer = initializer;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getIncrement() {
        return increment;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForStatement {\n");

        sb.append("  initializer: ")
                .append(initializer != null ? initializer.toString().replaceAll("(?m)^", "    ") : "null")
                .append("\n");

        sb.append("  condition: ")
                .append(condition != null ? condition.toString().replaceAll("(?m)^", "    ") : "null")
                .append("\n");

        sb.append("  increment: ")
                .append(increment != null ? increment.toString().replaceAll("(?m)^", "    ") : "null")
                .append("\n");

        sb.append("  block:\n")
                .append(block != null ? block.toString().replaceAll("(?m)^", "    ") : "    null")
                .append("\n");

        sb.append("}");

        return sb.toString();
    }

}
