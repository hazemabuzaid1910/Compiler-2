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
        return "\n\t\t\t\t"+"TemplateProperty{" +
                "template='" + htmlNode + '\'' +
                '}';
    }
}
