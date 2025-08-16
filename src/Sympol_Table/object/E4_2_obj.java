package Sympol_Table.object;

public class E4_2_obj {
    private String name ;
    private String value ;
    private int line ;
    public E4_2_obj(){
        this.name = " ";
        this.value ="null";
        this.line = 0 ;
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
