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

        String sb = "ForStatement {\n" + "  initializer: " +
                (initializer != null ? initializer.toString().replaceAll("(?m)^", "    ") : "null") +
                "\n" +
                "  condition: " +
                (condition != null ? condition.toString().replaceAll("(?m)^", "    ") : "null") +
                "\n" +
                "  increment: " +
                (increment != null ? increment.toString().replaceAll("(?m)^", "    ") : "null") +
                "\n" +
                "  block:\n" +
                (block != null ? block.toString().replaceAll("(?m)^", "    ") : "    null") +
                "\n" +
                "}";

        return sb;
    }

}
