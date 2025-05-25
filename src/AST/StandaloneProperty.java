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
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tStandaloneProperty {")
                .append("\n  standalone = '").append(standalone).append('\'')
                .append("\n  Case = '").append(Case).append('\'')
                .append("\n}");
        return sb.toString();
    }

}
