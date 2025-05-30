package AST;

public class StandaloneProperty implements ComponentProperty{
    String standalone;
    String Case;

    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getStandalone() {
        return standalone;
    }

    public void setStandalone(String standalone) {
        this.standalone = standalone;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StandaloneProperty {\n");

        if (standalone != null) {
            sb.append("  standalone = '").append(standalone).append("'\n");
        }

        if (Case != null) {
            sb.append("  Case = '").append(Case).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
