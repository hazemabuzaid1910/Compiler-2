package AST;

public class HtmlAttributeValue {
  String StringLiteral;

  public String getStringLiteral() {
    return StringLiteral;
  }

  public void setStringLiteral(String stringLiteral) {
    StringLiteral = stringLiteral;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("HtmlAttributeValue {\n")
            .append("  StringLiteral: '").append(StringLiteral).append("'\n")
            .append("}");
    return sb.toString();
  }

}
