package Java.AST.conditionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class K_retuern extends Statement {
    Expretion expretion;
    ifSortStmt ifSortStmt;

    @Override
    public String toString() {
        return "K_retuern{" +
                ((expretion != null) ? ("expretion  ='" + expretion.toString()) : "") + '\t' +
                ((ifSortStmt != null) ? ("ifSortStmt  ='" + ifSortStmt.toString()) : "") + '\t' +
                '}';
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
    }

    public void setIfSortStmt(Java.AST.conditionStmt.ifSortStmt ifSortStmt) {
        this.ifSortStmt = ifSortStmt;
    }
}
