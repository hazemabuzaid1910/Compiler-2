package AST;

public class Text implements HtmlContent{
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Text {\n");

        if (text != null) {
            sb.append("  text = '").append(text).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
