package MainApp;

import Sympol_Table.*;
import Sympol_Table.object.E4_2_obj;
import Sympol_Table.object.E4_obj;
import Sympol_Table.object.E5_obj;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class check_Symantic_Error {
    private final E1_sympolTable tagStack = new E1_sympolTable();
    private final E2_sympolTable funStack = new E2_sympolTable();
    private final E3_sympolTable thisVariable = new E3_sympolTable();
    private final E4_sympolTable bindVariable = new E4_sympolTable();
    private final E5_sympolTable forVariable = new E5_sympolTable();
    private final E6_sympolTable eventfun = new E6_sympolTable();
    private final List<Symantic_Error> errors = new ArrayList<>();;

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

    public List<Symantic_Error> getErrors() {
        return errors;
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


    public void check_E1(String endtag , int number){
        String startTag = tagStack.get();
       String endtag2 =endtag+=" id "+ Main.id_element;
        if(!Objects.equals(startTag, endtag2)){
            Symantic_Error error = new Symantic_Error();
            error.addError(Error_Type.TAG_MISMATCH ,
                    "Start tag is "+startTag+" and end tag is "+endtag ,
                    String.valueOf(number));
            errors.add(error);
            Main.id_element--;
        }else {
            Main.id_element--;
        }
    }

    public void check_E2(String fun , int number){
        boolean error = Main.semanticError.getE2().addfunname(fun);
        if(error){
            Symantic_Error symanticError = new Symantic_Error();
            symanticError.addError(Error_Type.FUNCTION_DUPLICATION ,
                    "Repeat function name "+ fun,
                    String.valueOf(number));
            errors.add(symanticError);
        }
    }

    public void check_E3(String id ,  int number){
        if(Main.semanticError.getE3().addthis(id)){
            Symantic_Error error = new Symantic_Error();
            error.addError(Error_Type.UNDECLARED_PROPERTY,
                    "The Property "+ id +" is Undeclared ",
                    String.valueOf(number));
            errors.add(error);
        }

    }

  //let x of y => let key of value
    public void check_E4_1(){
        getE4().getForequal().forEach((key, value) -> {
            E4_obj mainvar = bindVariable.get_obj_in_savemap(value.getValue());
            if (mainvar == null){
                Symantic_Error error = new Symantic_Error();
                error.addError(Error_Type.VAR_NOT_EXIST,
                        "The variable "+ value.getValue() +" is Undeclared ",
                        String.valueOf(value.getLine()));
                errors.add(error);
            }else {
                if(Objects.equals(mainvar.getType(), "Single")){
                    Symantic_Error error = new Symantic_Error();
                    error.addError(Error_Type.SINGLE_VALUED_VARIABLE,
                            "The variable "+ value.getValue() +" is Non-repeatable ",
                            String.valueOf(value.getLine()));
                    errors.add(error);
                }else{
                    getE4().addSaveVar(key);
                    for (int i = 0; i < mainvar.getAtt().size(); i++) {
                        getE4().addSaveAtt(mainvar.getAtt().get(i));
                    }
                }
            }
        });
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
                                errors.add(error);
                            }
                        }
                    }
                }
                if(!check1){
                    Symantic_Error error = new Symantic_Error();
                    error.addError(Error_Type.VAR_NOT_EXIST,
                            "The variable "+ checkName +" is Undeclared ",
                            String.valueOf(forItem.getLine()));
                    errors.add(error);
                }
                if (forItem == getE5().getFor_list().get(getE5().getFor_list().size()-1)){
                    String finalParent = parent;
                    getE4().getSavemap().removeIf(obj -> obj.getName().equals(finalParent));
                }
            }
        }
    }


    public void check_E4_2(){
        for (E4_2_obj checkItem : getE4().getCheck()) {
            String checkName = checkItem.getName();
            String checkValue = checkItem.getValue();
            boolean check1 = false ;
            for (E4_obj mapItem : getE4().getSavemap()) {
                if (mapItem.getName().equals(checkName)) {
                    check1 = true ;
                    if (!"value".equals(checkValue)) {
                        if (!mapItem.getAtt().contains(checkValue)) {
                            Symantic_Error error = new Symantic_Error();
                            error.addError(Error_Type.VAR_NOT_EXIST,
                                    "The variable "+ checkValue +" is Undeclared ",
                                    String.valueOf(checkItem.getLine()));
                            errors.add(error);
                        }
                    }
                }
            }
            if(!check1){
                Symantic_Error error = new Symantic_Error();
                error.addError(Error_Type.VAR_NOT_EXIST,
                        "The variable "+ checkName +" is Undeclared ",
                        String.valueOf(checkItem.getLine()));
                errors.add(error);
            }
        }
    }


    public void check_E5(){
        Map<String,String> check_map = getE6().getCheck_map().getMap();
        Map<String,String> save_map = getE6().get_Save_map().getMap();
        check_map.forEach((key, value) -> {
            int index = value.indexOf("Line");
            String beforeLine =" ";
            String afterLine = " ";
            if (index != -1) {
                 beforeLine = value.substring(0, index);
                 afterLine = value.substring(index + "Line".length());
            }
            if (save_map.containsKey(key)){
               String V = save_map.get(key);
               if(!Objects.equals(beforeLine, V)){
                   Symantic_Error error = new Symantic_Error();
                   error.addError(Error_Type.FUNCTION_ERROR_PARAMETER,
                           "Expected "+ V +" arguments, but got "+beforeLine,
                           afterLine);
                   errors.add(error);
               }
            }else{
                Symantic_Error error = new Symantic_Error();
                error.addError(Error_Type.EVENT_NOT_EXIST,
                        "Function name "+ key +" is not exist ",
                        afterLine);
                errors.add(error);
            }
        });
    }


    public void  check_Errors(){
        try {
            check_E4_1();
            check_E4_3();
            check_E4_2();
            check_E5();
            FileWriter test =  new FileWriter("Result\\Semantic.txt");
            if (!errors.isEmpty()){
                test.append("Semantic Check : \n");
                for (Symantic_Error error : errors) {
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
    }

}
