package MainApp;

import Sympol_Table.*;
import Sympol_Table.object.E4_obj;
import Sympol_Table.object.E5_obj;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class check_Symantic_Error {
    private final E1_sympolTable tagStack = new E1_sympolTable();
    private final E2_sympolTable funStack = new E2_sympolTable();
    private final E3_sympolTable thisVariable = new E3_sympolTable();
    private final E4_sympolTable bindVariable = new E4_sympolTable();
    private final E5_sympolTable forVariable = new E5_sympolTable();
    private final E6_sympolTable eventfun = new E6_sympolTable();

    public check_Symantic_Error() {
        tagStack.allocate();
        funStack.allocate();
        thisVariable.allocate();
        bindVariable.allocate();
        eventfun.allocate();
    }
    public E1_sympolTable getE1() {
        return tagStack;
    }

    public E2_sympolTable getE2(){
        return funStack;
    }

    public E3_sympolTable getE3(){
        return thisVariable;
    }

    public E4_sympolTable getE4(){
        return bindVariable;
    }

    public E5_sympolTable getE5() {
        return forVariable;
    }

    public E6_sympolTable getE6() {
        return eventfun;
    }


    public void insert_obj_check(){
        if (getE5().Get_Is_ngfor()){
            getE5().insert_obj_for_list();
        }else {
            getE4().insert_obj_check();
        }
    }

    public void add_check_list(String value , int line){
        if (getE5().Get_Is_ngfor()){
            getE5().add_for_list( value ,  line);
        }else {
            getE4().add_check_list( value , line);
        }
    }


    public void check_E4_3(){
        if(!getE5().getFor_list().isEmpty()){
            String parent = getE5().getFor_list().get(0).getParent();
            for (E5_obj forItem : getE5().getFor_list()) {
                if(!Objects.equals(forItem.getParent(), parent) && !Objects.equals(forItem.getParent(), "null")){
                    String finalParent = parent;
                    getE4().getSavemap().removeIf(obj -> obj.getName().equals(finalParent));
                }
                String checkName = forItem.getName();
                String checkValue = forItem.getValue();
                parent = forItem.getParent();
                boolean check1 = false ;
                for (E4_obj mapItem : getE4().getSavemap()) {
                    if (mapItem.getName().equals(checkName)) {
                        check1 = true ;
                        if (!"value".equals(checkValue)) {
                            if (!mapItem.getAtt().contains(checkValue)) {
                                Symantic_Error error = new Symantic_Error();
                                error.addError(Error_Type.VAR_NOT_EXIST,
                                        "The variable "+ checkValue +" is Undeclared ",
                                        String.valueOf(forItem.getLine()));
                               Main.errors.add(error);
                            }
                        }
                    }
                }
                if(!check1){
                    Symantic_Error error = new Symantic_Error();
                    error.addError(Error_Type.VAR_NOT_EXIST,
                            "The variable "+ checkName +" is Undeclared ",
                            String.valueOf(forItem.getLine()));
                    Main.errors.add(error);
                }
                if (forItem == getE5().getFor_list().get(getE5().getFor_list().size()-1)){
                    String finalParent = parent;
                    getE4().getSavemap().removeIf(obj -> obj.getName().equals(finalParent));
                }
            }
        }
    }


    public void  check_Errors(){
        try {
           getE4().check_E4_1();
            check_E4_3();
           getE4().check_E4_2();
           getE6().check_E6();
            FileWriter test;
            if(Main.first){
                 test =  new FileWriter("Result\\Semantic.txt" , false);
            }else{
                 test = new FileWriter("Result\\Semantic.txt", true);
                 test.append("Another file : \n");
            }
            if (!Main.errors.isEmpty()){
                test.append("Semantic Check : \n");
                for (Symantic_Error error :Main.errors) {
                    test.append(error.getError()).append("\n");
                }
            }else {
                test.append("No Semantic Error");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Main.first = false ;
    }

}
