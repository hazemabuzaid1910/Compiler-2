package Sympol_Table;

import MainApp.Error_Type;
import MainApp.Main;
import MainApp.Symantic_Error;
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

    public void check_E2(String fun , int number){
        boolean error = addfunname(fun);
        if(error){
            Symantic_Error symanticError = new Symantic_Error();
            symanticError.addError(Error_Type.FUNCTION_DUPLICATION ,
                    "Repeat function name "+ fun,
                    String.valueOf(number));
            Main.errors.add(symanticError);
        }
    }
}
