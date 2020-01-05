package Java.AST.conditionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class Case_stmt extends Statement {
    Expretion expretion;

    @Override
    public String toString() {
        return "Case_stmt{" +
                "expretion=" + expretion.toString() +
                '}';
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
    }
}
