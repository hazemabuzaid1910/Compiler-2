package AST;

import java.util.ArrayList;
import java.util.List;

public class Block implements Statement{
    List<Statements> statements=new ArrayList<>();

    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Block{" +
                "statements=" + statements +
                '}';
    }
}
