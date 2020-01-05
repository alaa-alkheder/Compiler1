package Java.AST.QueryStmt.Expr;

public class math implements Expretion{
    private Expretion right , left;
    String op;

    @Override
    public String toString() {
        return "Expr is {" +
                " left=" + left +
                ", op='" + op + '\'' +
                 ",right=" + right +
                '}';
    }

    @Override
    public void setLeft(Expretion l) {
        this.left = l;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
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
