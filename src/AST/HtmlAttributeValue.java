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
    StringBuilder sb = new StringBuilder("HtmlAttributeValue {\n");

    if (StringLiteral != null) {
      sb.append("  StringLiteral: '")
              .append(StringLiteral.replace("\n", "\n    "))
              .append("'\n");
    }

    sb.append("}");
    return sb.toString();
  }


}
