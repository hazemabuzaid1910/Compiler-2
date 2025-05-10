package AST;

import java.util.*;

public class Program  {
    List<Statement> statementList=new ArrayList<>();

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return "Program{" +
                "statementList=" +"\n"+ statementList+"\n" +
                '}';
    }
}
