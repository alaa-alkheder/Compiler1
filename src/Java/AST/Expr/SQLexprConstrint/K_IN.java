package Java.AST.Expr.SQLexprConstrint;

public class K_IN extends sqlExprtion {

    @Override
    public String toString() {
        return "K_IN{" +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
