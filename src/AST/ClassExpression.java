package AST;

public class ClassExpression implements Expression {
    String Class;



    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public String toString() {
        return "ClassExpression" +Class;
    }

}

