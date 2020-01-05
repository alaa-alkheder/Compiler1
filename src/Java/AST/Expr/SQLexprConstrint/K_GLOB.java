package Java.AST.Expr.SQLexprConstrint;

public class K_GLOB extends sqlExprtion {
    @Override
    public String toString() {
        return "K_GLOB{" +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
