package Java.AST.QueryStmt.Expr;

public class logic implements Expretion {
    private Expretion right , left;
//    logic_op op;
String op;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public Expretion getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "logic{" +
                "right=" + right +
                ", op='" + op + '\'' + ", left=" + left +
                '}';
    }

    @Override
    public void setRight(Expretion right) {
        this.right = right;
    }

    @Override
    public Expretion getLeft() {
        return left;
    }

    @Override
    public void setLeft(Expretion left) {
        this.left = left;
    }
}
