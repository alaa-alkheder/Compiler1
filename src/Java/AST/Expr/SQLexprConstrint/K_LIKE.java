package Java.AST.Expr.SQLexprConstrint;

public class K_LIKE extends sqlExprtion {
    @Override
    public String toString() {
        return "K_LIKE{" +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
