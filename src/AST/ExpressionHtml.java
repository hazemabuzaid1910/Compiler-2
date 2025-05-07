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
        return "ExpressionHtml{" +
                "primaryExpressionHtmls=" + primaryExpressionHtmls +
                '}';
    }
}
