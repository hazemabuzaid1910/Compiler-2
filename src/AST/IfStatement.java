package AST;

public class IfStatement implements Statements {
     Expression condition;
     Block ifBlock;
     Block elseBlock; // optional

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Block getIfBlock() {
        return ifBlock;
    }

    public void setIfBlock(Block ifBlock) {
        this.ifBlock = ifBlock;
    }

    public Block getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(Block elseBlock) {
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "condition=" + (condition != null ? condition.toString() : "null") +
                ", ifBlock=" + (ifBlock != null ? ifBlock.toString() : "null") +
                ", elseBlock=" + (elseBlock != null ? elseBlock.toString() : "null") +
                '}';
    }
}
