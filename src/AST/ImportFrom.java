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
      StringBuilder sb=new StringBuilder();
        sb.append("\t");
       if(From!=null){
           sb.append(From);
       }
        sb.append("\t");
        if(StringLiteral!=null){
            sb.append(StringLiteral);
        }
      return sb.toString();
    }
}
