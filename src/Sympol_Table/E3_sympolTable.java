package Sympol_Table;

import MainApp.Error_Type;
import MainApp.Main;
import MainApp.Symantic_Error;
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
        return !lastscope.getSet().contains(value);
    }

    public void check_E3(String id ,  int number){
        if(Main.semanticError.getE3().addthis(id)){
            Symantic_Error error = new Symantic_Error();
            error.addError(Error_Type.UNDECLARED_PROPERTY,
                    "The Property "+ id +" is Undeclared ",
                    String.valueOf(number));
            Main.errors.add(error);
        }

    }
}
