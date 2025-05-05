package AST;

public class ClassDeclaration implements Statement{
    String Component;
    ComponentMetadata componentMetadata;

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public ComponentMetadata getComponentMetadata() {
        return componentMetadata;
    }

    public void setComponentMetadata(ComponentMetadata componentMetadata) {
        this.componentMetadata = componentMetadata;
    }

    @Override
    public String toString() {
    StringBuilder sb=new StringBuilder();
    if(Component!=null){
        sb.append(Component);
    }
    if(componentMetadata!=null){
        sb.append(componentMetadata);
    }
    return sb.toString();
    }
}
