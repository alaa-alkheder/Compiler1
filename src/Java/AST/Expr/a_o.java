package Java.AST.Expr;

public class a_o implements Expretion{
    private Expretion right , left;
    and_or op;
    @Override
    public void setLeft(Expretion l) {
        this.left = l;
    }

    @Override
    public void setRight(Expretion r) {
        this.right = r;
    }

    @Override
    public Expretion getLeft() {
        return this.left;
    }

    @Override
    public Expretion getRight() {
        return this.right;
    }
}