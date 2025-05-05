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
        StringBuilder sb=new StringBuilder();
        if(Component!=null){
            sb.append(Component);
        }
        if(CommonModule!=null){
            sb.append(CommonModule);
        }
        if(Identifier!=null){
            sb.append(Identifier);
        }

        return sb.toString();
    }
}
