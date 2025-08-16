package AST;

import java.util.ArrayList;
import java.util.List;

public class AttributeName {
    List<String> identifier=new ArrayList<>();

    public List<String> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<String> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {

        // تنسيق وطباعة identifier

        String sb = "AttributeName {\n" + "  identifier: " + identifier.toString().replace("\n", "\n    ") +
                "}";
        return sb;
    }
}
