package Sympol_Table;

import MainApp.Main;
import Sympol_Table.object.E6_obj;

import java.util.List;
import java.util.Map;
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



}
