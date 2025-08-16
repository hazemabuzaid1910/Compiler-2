package AST;

public class TypeName {
     UnionType unionType;

    public UnionType getUnionType() {
        return unionType;
    }

    public void setUnionType(UnionType unionType) {
        this.unionType = unionType;
    }

    @Override
    public String toString() {
        return "TypeName {\n" +
                "  unionType: " + (unionType != null ? unionType.toString() : "null") + "\n" +
                "}";
    }

}
