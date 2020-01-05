package Java.AST.QueryStmt.Expr;

public class digit implements Expretion{
    private Expretion right , left;
    number num;
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
