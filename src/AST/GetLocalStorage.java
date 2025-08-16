package AST;

public class GetLocalStorage  extends ParseLocalStorage{
    String getItem;

    public String getGetItem() {
        return getItem;
    }

    public void setGetItem(String getItem) {
        this.getItem = getItem;
    }

    @Override
    public String toString() {
        return "GetLocalStorage{" +
                "getItem='" + getItem + '\'' +
                '}';
    }
}
