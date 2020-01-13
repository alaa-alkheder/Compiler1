package Java.AST.Expr;

import java.util.ArrayList;
import java.util.List;

public class jsonCallStmt implements Expretion {
    List<String> array = new ArrayList<>();

    @Override
    public String toString() {
        String s = "\n";
        for (int i = 0; i < array.size(); i++) {
            s += array.get(i) + " . ";
        }

        return "jsonCallStmt{" +
                "" + s +
                '}';
    }

    public void AddArray(String array) {
        this.array.add(array);
    }

    @Override
    public void setLeft(Expretion l) {

    }

    @Override
    public void setRight(Expretion r) {

    }

    @Override
    public Expretion getLeft() {
        return null;
    }

    @Override
    public Expretion getRight() {
        return null;
    }
}