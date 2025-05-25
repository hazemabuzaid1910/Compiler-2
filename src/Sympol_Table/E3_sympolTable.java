package Sympol_Table;

import Sympol_Table.object.E2_obj;

public class E3_sympolTable extends SymbolTable<E2_obj>{

    public void insert() {
        if (stack != null) {
            E2_obj newscope = new E2_obj();
            stack.add(newscope);
        } else {
            System.out.println("Stack not allocated yet!");
        }
    }

    public void addVariable(String value){
        if(stack!=null){
            E2_obj lastscope =  stack.peek();
             lastscope.getSet().add(value);
        }else{
            System.out.println("Stack not allocated yet!");
        }
    }

    public boolean addthis(String value){
        E2_obj lastscope =  stack.peek();
        if(lastscope.getSet().contains(value)){
            return false;
        }else{
            return true;
        }
    }
}
