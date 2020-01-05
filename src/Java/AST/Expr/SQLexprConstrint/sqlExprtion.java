package Java.AST.Expr.SQLexprConstrint;

import Java.AST.Expr.Expretion;

public class sqlExprtion implements Expretion {
    protected Expretion right, left;
    String op;

    @Override
    public String toString() {
        return "Expr is {" +
                ((left != null) ? ("left='" + left.toString()) : "") + '\t' +
                ((op != null) ? ("op='" + op) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
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
