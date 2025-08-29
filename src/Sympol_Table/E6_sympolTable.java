package Sympol_Table;

import MainApp.Error_Type;
import MainApp.Main;
import MainApp.Symantic_Error;
import Sympol_Table.object.E6_obj;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class E6_sympolTable {
    private E6_obj check_map ;
    private Stack<String> connection ;
    private E6_obj save_map ;

    public void allocate(){
        check_map = new E6_obj();
        connection = new Stack<String>();
        save_map = new E6_obj();
    }

    //check map fun
    public void add_check_map(String name , int var , int line){
        String x = String.valueOf(var) ;
        String l = String.valueOf(line);
        x+="Line"+l;
        check_map.add_map(name, x);
    }

    public E6_obj getCheck_map() {
        return check_map;
    }


    //save map fun
    public void add_fun_name_to_save_map(String name ){
        connection.clear();
        connection.add(name);
    }

    public void add_save_map(String name , int var){
            String x = String.valueOf(var);
            save_map.add_map(name,x);
    }

    public E6_obj get_Save_map() {
        return save_map;
    }

    //connection fun

    public void add_connection_stack(String name){
        if(!connection.isEmpty()){
            connection.add(name);
        }
    }

    public void get_var_from_connection(String name){
        if(connection.size()==1){
            add_save_map(name,0);
        }else if(connection.size()>1){
            int var = connection.size()-1 ;
            add_save_map(name,var);
        }
        connection.clear();
    }

    public void check_E6(){
        Map<String,String> check_map = getCheck_map().getMap();
        Map<String,String> save_map = get_Save_map().getMap();
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
                   Main.errors.add(error);
                }
            }else{
                Symantic_Error error = new Symantic_Error();
                error.addError(Error_Type.EVENT_NOT_EXIST,
                        "Function name "+ key +" is not exist ",
                        afterLine);
                Main.errors.add(error);
            }
        });
    }



}
