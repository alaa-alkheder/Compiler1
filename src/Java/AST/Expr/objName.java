package Java.AST.Expr;

public class objName implements Expretion{
    String name="";

    public objName(String text) {
        this.name=text;}

    @Override
    public String toString() {
        return   name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
