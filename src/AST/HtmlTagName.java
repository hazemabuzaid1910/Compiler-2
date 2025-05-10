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
        return "\n"+"HtmlTagName{" +
                "tagName=" + tagName + '\n' +
                '}';
    }
}
