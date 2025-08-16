package AST;

public class SetLocalStorage implements Statements{
    String data;
    String dataName;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    @Override
    public String toString() {
        return "SetLocalStorage{" +
                "data='" + data + '\'' +
                ", dataName='" + dataName + '\'' +
                '}';
    }
}
