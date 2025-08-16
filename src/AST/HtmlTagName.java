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
        StringBuilder sb = new StringBuilder("HtmlTagName {\n");

        if (tagName != null) {
            sb.append("  tagName: ").append(tagName).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
