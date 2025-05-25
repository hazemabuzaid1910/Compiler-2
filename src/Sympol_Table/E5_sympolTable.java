package Sympol_Table;

import MainApp.Main;
import Sympol_Table.object.E4_2_obj;
import Sympol_Table.object.E5_obj;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class E5_sympolTable {
    private String scope_name;
    private int scope_id ;
    private String parent ;
    private boolean is_ngfor ;
    private List<E5_obj> for_list ;

    public E5_sympolTable(){
        scope_name = "none";
        scope_id = 0 ;
        is_ngfor = false ;
        for_list = new ArrayList<E5_obj>();
    }

    public void set_scope(String scope_name , int scope_id){
        this.scope_name = scope_name;
        this.scope_id = scope_id ;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParent() {
        return parent;
    }

    public void set_Is_ngfor(boolean is_ngfor) {
        if(is_ngfor){
            scope_name = Main.semanticError.getE1().get_element();
            this.is_ngfor = true;
        }
        else{
         if(Objects.equals(scope_name, Main.semanticError.getE1().get_element())){
             this.is_ngfor = false;
         }
        }
    }

    public List<E5_obj> getFor_list() {
        return for_list;
    }

    public boolean Get_Is_ngfor() {
        return is_ngfor;
    }


    public void insert_obj_for_list(){
        E5_obj test = new E5_obj();
        for_list.add(test);
    }

    public void add_for_list(String value , int line){
        E5_obj test = for_list.get(for_list.size()-1);
        if(Objects.equals(test.getValue(), "value")){
            add_Value_for_list(value , line);
        }else {
            add_Name_for_list(value);
            add_Value_for_list("value" , line);
        }
    }

    private void add_Name_for_list(String value){
        E5_obj test = for_list.get(for_list.size()-1);
        test.setName(value);
        test.setParent(this.parent);
    }

    private void add_Value_for_list(String value , int Line){
        E5_obj test = for_list.get(for_list.size()-1);
        test.setValue(value);
        test.setLine(Line);
    }

}
