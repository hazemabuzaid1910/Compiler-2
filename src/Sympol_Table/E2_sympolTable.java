package Sympol_Table;

import Sympol_Table.object.E2_obj;

public class E2_sympolTable extends SymbolTable<E2_obj> {

    public void insert() {
        if (stack != null) {
            E2_obj newscope = new E2_obj();
            stack.add(newscope);
        } else {
            System.out.println("Stack not allocated yet!");
        }
    }

    public boolean addfunname(String value){
        if(stack!=null){
            E2_obj lastscope =  stack.peek();
           return lastscope.add(value);
        }else{
            System.out.println("Stack not allocated yet!");
            return false;
        }
    }

}
