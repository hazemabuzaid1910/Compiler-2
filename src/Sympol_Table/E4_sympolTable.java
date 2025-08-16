package Sympol_Table;

import Sympol_Table.object.E4_2_obj;
import Sympol_Table.object.E4_3_obj;
import Sympol_Table.object.E4_obj;

import java.util.*;

public class E4_sympolTable  {
    private List<E4_obj> savemap ;
    private Stack<E4_2_obj> classequal ;
    private Map<String, E4_3_obj> forequal ;
    private List<E4_2_obj> checkList ;
    private boolean iscomponent ;

    public void allocate(){
        savemap = new ArrayList<>();
        iscomponent = true ;
        classequal = new Stack<E4_2_obj>();
        forequal = new HashMap<String, E4_3_obj>();
        checkList = new ArrayList<E4_2_obj>();
    }
//////////////////////////////////////////////////////////
    // Is Component Fun
    public boolean GetIsComponent() {
        return iscomponent;
    }

    public void SetIsComponent(boolean iscomponent) {
       this.iscomponent = iscomponent ;
    }

    ///////////////////////////////////////////////////////////////////////////////
    // save map fun

    public List<E4_obj> getSavemap() {
        return savemap;
    }

    public void addSaveVar(String name){
        E4_obj Value = new E4_obj();
        Value.setName(name);
       savemap.add(Value);
    }

    public void addSaveAtt(String att){
        E4_obj x = savemap.get(savemap.size()-1);
        x.setAtt(att);
        x.setType("Multi");
    }

    public boolean found_name_savemap(String tt){
      return savemap.stream()
                .anyMatch(obj -> tt.equals(obj.getName()));
    }

    public E4_obj get_obj_in_savemap( String tt) {
          E4_obj test= savemap.stream()
                .filter(obj -> tt.equals(obj.getName()))
                .findFirst()
                .orElse(null);
          return test ;
    }

//////////////////////////////////////////////////////////////////////////////////
     //class equal fun

    public void insert_class_equal(){
        E4_2_obj test = new E4_2_obj();
        classequal.push(test);
    }

    public void insert_name_class_equal(String name ){
        if(!classequal.isEmpty()){
            E4_2_obj test = classequal.peek();
            test.setName(name);
        }
    }

    public void insert_value_class_equal(String value ){
        if(!classequal.isEmpty()){
            E4_2_obj test = classequal.peek();
            test.setValue(value);
        }
    }

    public void pop_class_equal(){
        if(!classequal.isEmpty()){
            E4_2_obj test = classequal.pop();
            if(found_name_savemap(test.getName())&&found_name_savemap(test.getValue())){
                E4_obj x =  get_obj_in_savemap(test.getName());
                E4_obj y = get_obj_in_savemap(test.getValue());
                x.setType(y.getType());
                for (int i = 0; i < y.getAtt().size(); i++) {
                    x.setAtt(y.getAtt().get(i));
                }
            }
        }
    }

    public Stack<E4_2_obj> getClassequal() {
        return classequal;
    }
///////////////////////////////////////////////
    //for equal fun

    public void setForequal(String var1 ,String var2 , String line) {
        E4_3_obj t = new E4_3_obj();
        t.setValue(var2);
        t.setLine(line);
        this.forequal.put(var1, t);
    }

    public Map<String, E4_3_obj> getForequal() {
        return forequal;
    }

    //////////////////////////////////////////
    //check fun

    public void insert_obj_check(){
        E4_2_obj test = new E4_2_obj();
        checkList.add(test);
    }

    public void add_check_list(String value , int line){
            E4_2_obj test = checkList.get(checkList.size()-1);
            if(Objects.equals(test.getValue(), "value")){
                add_Value_checklist(value , line);
            }else {
                add_Name_checklist(value);
                add_Value_checklist("value" , line);
            }
    }

    private void add_Name_checklist(String value){
        E4_2_obj test = checkList.get(checkList.size()-1);
        test.setName(value);
    }

    private void add_Value_checklist(String value , int Line){
        E4_2_obj test = checkList.get(checkList.size()-1);
        test.setValue(value);
        test.setLine(Line);
    }


    public List<E4_2_obj> getCheck() {
        return checkList;
    }
}
