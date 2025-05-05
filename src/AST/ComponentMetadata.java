package AST;

public class ComponentMetadata {
    ComponentProperty componentProperty;

    public ComponentProperty getComponentProperty() {
        return componentProperty;
    }

    public void setComponentProperty(ComponentProperty componentProperty) {
        this.componentProperty = componentProperty;
    }

    @Override
    public String toString() {
   StringBuilder sb=new StringBuilder();
   if(componentProperty!=null){
       sb.append(componentProperty);
   }
   return sb.toString();
    }
}
