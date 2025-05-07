package AST;

public class ComponentDeclaration implements Statement {

    String At_Component;
    ComponentMetadata componentMetadata;

    public String getAt_Component() {
        return At_Component;
    }

    public void setAt_Component(String at_Component) {
        At_Component = at_Component;
    }

    public ComponentMetadata getComponentMetadata() {
        return componentMetadata;
    }

    public void setComponentMetadata(ComponentMetadata componentMetadata) {
        this.componentMetadata = componentMetadata;
    }

    @Override
    public String toString() {
        return "\n"+ "ComponentDeclaration{" +
                "At_Component='" + At_Component + '\'' +
                ", componentMetadata=" + componentMetadata +
                '}';
    }
}

