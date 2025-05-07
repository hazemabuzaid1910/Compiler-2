package AST;

public class WhileStatement implements Statements {
     String While;
     Expression condition;
     Block block;

    public String getWhile() {
        return While;
    }

    public void setWhile(String aWhile) {
        While = aWhile;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "WhileStatement{" +
                "While='" + While + '\'' +
                ", condition=" + condition +
                ", block=" + block +
                '}';
    }
}
