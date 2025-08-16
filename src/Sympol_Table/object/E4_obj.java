package Sympol_Table.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E4_obj {
  private String name ;
  private String type ;
  private final List<String> att ;

  public E4_obj(){
      name ="";
     type = "Single";
     att = new ArrayList<>();
  }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAtt(String x) {
      if(!att.contains(x)) {
          this.att.add(x);
      }
    }

    public List<String> getAtt() {
        return att;
    }

    public String printatt(){
      String x = "";
      for (int i = 0 ; i<att.size();i++){
         x+=att.get(i);
         x+="  ";
      }
      return x;
  }
}

