package AST;

public class TemplateProperty implements ComponentProperty{
String template;
HtmlNode htmlNode;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HtmlNode getHtmlNode() {
        return htmlNode;
    }

    public void setHtmlNode(HtmlNode htmlNode) {
        this.htmlNode = htmlNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tTemplateProperty {")
                .append("\n  template = '").append(htmlNode).append('\'')
                .append("\n}");
        return sb.toString();
    }

}
