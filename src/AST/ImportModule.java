package AST;public class ImportModule {
   String Component;
   String CommonModule;
  String  Identifier;

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public String getCommonModule() {
        return CommonModule;
    }

    public void setCommonModule(String commonModule) {
        CommonModule = commonModule;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("YourClassName {\n");

        if (Component != null) {
            sb.append("  Component: ")
                    .append(Component.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (CommonModule != null) {
            sb.append("  CommonModule: ")
                    .append(CommonModule.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        if (Identifier != null) {
            sb.append("  Identifier: ")
                    .append(Identifier.toString().replace("\n", "\n    "))
                    .append(",\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
