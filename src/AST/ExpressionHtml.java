package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionHtml {
    List<PrimaryExpressionHtml> primaryExpressionHtmls=new ArrayList<>();

    public List<PrimaryExpressionHtml> getPrimaryExpressionHtmls() {
        return primaryExpressionHtmls;
    }

    public void setPrimaryExpressionHtmls(List<PrimaryExpressionHtml> primaryExpressionHtmls) {
        this.primaryExpressionHtmls = primaryExpressionHtmls;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExpressionHtml {\n");

        if (primaryExpressionHtmls != null && !primaryExpressionHtmls.isEmpty()) {
            sb.append("  Primary Expressions: [\n");
            for (Object expr : primaryExpressionHtmls) { // Adjust type if needed
                sb.append("    ")
                        .append(expr != null ? expr.toString().replace("\n", "\n    ") : "null")
                        .append(",\n");
            }
            sb.append("  ]\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
