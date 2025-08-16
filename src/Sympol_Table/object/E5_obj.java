package Sympol_Table.object;

public class E5_obj {
    private String parent ;
    private String name ;
    private String value ;
    private int line ;
    public E5_obj(){
        this.name = " ";
        this.value ="null";
        this.line = 0 ;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParent() {
        return parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }
}
