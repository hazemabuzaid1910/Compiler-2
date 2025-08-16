package Sympol_Table.object;

import java.util.HashMap;
import java.util.Map;

public class E6_obj {
   private final Map<String,String> map ;

   public E6_obj(){
       this.map = new HashMap<String,String>();
   }

   public void add_map(String name , String var){
       map.put(name,var);
   }

    public Map<String, String> getMap() {
        return map;
    }

}
