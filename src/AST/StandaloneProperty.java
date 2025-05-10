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
        return "\n\t\t\t\t"+"StandaloneProperty{" +
                "standalone='" + standalone + '\'' +
                ", Case='" + Case + '\'' +
                '}';
    }
}
