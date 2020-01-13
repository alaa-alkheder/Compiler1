package Java.AST.Expr.SQLexprConstrint;

public class K_REGEXP extends sqlExprtion {
    @Override
    public String toString() {
        return "K_REGEXP{" +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
