package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList {
     List<Parameter> parameters = new ArrayList<>();

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ParameterList {\n");
        for (Parameter p : parameters) {
            if (p != null) {
                String paramStr = p.toString().replace("\n", "\n    ");
                sb.append("  ").append(paramStr).append("\n");
            } else {
                sb.append("  null\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
