package Java.AST.Expr;

public class arrayCallStmt implements Expretion {
    String name;
    Expretion expretion;

    @Override
    public String toString() {
        return "arrayCallStmt{" +
                "name='" + name + '\'' +
                ", [=" + expretion.toString() + "]" +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
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
