package Sympol_Table;

import MainApp.Main;

public class E1_sympolTable extends SymbolTable<String> {


    public void insert(String value) {
        if (stack != null) {
            Main.id_element++;
            value+=" id ";
            value+=Main.id_element;
            stack.push(value);
        } else {
            System.out.println("Stack not allocated yet!");
        }
    }

    public String get_element(){
       return stack.peek();
    }

}
