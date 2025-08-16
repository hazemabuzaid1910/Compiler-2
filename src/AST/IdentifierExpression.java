package AST;

public class IdentifierExpression implements Primary {
    String keyword;
     String name;


    public IdentifierExpression(String name,String keyword) {
        this.name = name;
        this.keyword=keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "IdentifierExpression {\n" +
                "    key word = '" + (keyword != null ? keyword : "No key word ") + "'\n" +
                "\n"+
                "    name = '" + (name != null ? name : "No Identifier ") + "'\n" +
                "}";
    }
}
