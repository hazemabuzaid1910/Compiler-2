package AST;

public class GetLocal implements Expression{
    GetLocalStorage getLocalStorage;

    public GetLocalStorage getGetLocalStorage() {
        return getLocalStorage;
    }

    public void setGetLocalStorage(GetLocalStorage getLocalStorage) {
        this.getLocalStorage = getLocalStorage;
    }

    @Override
    public String toString() {
        return "GetLocal{" +
                "getLocalStorage=" + getLocalStorage +
                '}';
    }
}
