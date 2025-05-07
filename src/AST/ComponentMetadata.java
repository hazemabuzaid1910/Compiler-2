package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadata {
  List<ComponentProperty> componentProperty=new ArrayList<>();

    public List<ComponentProperty> getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(List<ComponentProperty> componentProperty) {
        this.componentProperty = componentProperty;
    }

    @Override
    public String toString() {
   StringBuilder sb=new StringBuilder();
   if(componentProperty!=null){
       sb.append("\n").append(componentProperty);
   }
   return sb.toString();
    }
}
