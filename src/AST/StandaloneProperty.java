package AST;

public class StandaloneProperty implements ComponentProperty{
    String standalone;
    String Case;

    public String getStandalone() {
        return standalone;
    }

    public void setStandalone(String standalone) {
        this.standalone = standalone;
    }

    @Override
    public String toString() {
        return "StandaloneProperty{" +
                "standalone='" + standalone + '\'' +
                ", Case='" + Case + '\'' +
                '}';
    }
}
