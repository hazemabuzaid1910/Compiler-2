package AST;

public class HtmlTagName {
 String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nHtmlTagName {\n")
                .append("  tagName: ").append(tagName).append("\n")
                .append("}");
        return sb.toString();
    }

}
