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
    return "HtmlAttributeValue{" +
            "StringLiteral='" + StringLiteral + '\'' +
            '}';
  }
}
