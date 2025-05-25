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
        StringBuilder sb = new StringBuilder();
        sb.append("Text {")
                .append("\n  text = '").append(text).append('\'')
                .append("\n}");
        return sb.toString();
    }

}
