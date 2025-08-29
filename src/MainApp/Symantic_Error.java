package MainApp;

public class Symantic_Error {
    private Error_Type name;
    private String type;
    private String number;

    public Symantic_Error() {
    }

    public Error_Type getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    // Setters
    public void setName(Error_Type name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getError(){
        String error = "Error Name : "+getName()
                +" , Error Description : "+getType()
                + " , Error Location : "+ getNumber();
        return error ;
    }
   public void addError(Error_Type name , String des , String line){
       this.name = name ;
       this.type = des;
       this.number = line ;
   }
}
