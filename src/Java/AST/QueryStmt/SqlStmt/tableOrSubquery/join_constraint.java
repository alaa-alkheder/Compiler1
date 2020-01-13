package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

public class join_constraint extends Node {

    Expretion expr;

    @Override
    public String toString() {
        return
                ((expr != null) ? ("join_constraint{" +
                        "expr=" + expr.toString() +
                        '}') : "")
                ;
    }

    public void setExpr(Expretion expr) {
        this.expr = expr;
    }
}
