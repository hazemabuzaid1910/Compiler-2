package AST;

public class ImportFrom {
    String From;
    String StringLiteral;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FromStatement {\n");

        if (From != null) {
            sb.append("  From: ")
                    .append(From.replace("\n", "\n    "))
                    .append(",\n");
        }

        if (StringLiteral != null) {
            sb.append("  StringLiteral: ")
                    .append(StringLiteral.replace("\n", "\n    "))
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
