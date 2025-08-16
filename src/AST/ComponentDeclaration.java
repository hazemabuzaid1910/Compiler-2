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
        StringBuilder sb = new StringBuilder("ComponentDeclaration {\n");

        if (At_Component != null) {
            sb.append("  At_Component: ")
                    .append(At_Component.replace("\n", "\n    "))
                    .append(",\n");
        }

        if (componentMetadata != null) {
            sb.append("  ComponentMetadata: ")
                    .append(componentMetadata.toString().replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}

