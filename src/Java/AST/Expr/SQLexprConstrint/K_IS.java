package Java.AST.Expr.SQLexprConstrint;

public class K_IS extends sqlExprtion {
    boolean K_IS_K_not = false;

    public K_IS(boolean b) {
        K_IS_K_not = b;
    }

    @Override
    public String toString() {
        return "K_IS{" +
                ((K_IS_K_not == true) ? ("not='") : "") + '\t' +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
