package Java.AST.FunctionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;
import Java.AST.conditionStmt.ifSortStmt;

public class printStmt extends Statement {

    Expretion expretion;
    ifSortStmt ifSortStmt;

    @Override
    public String toString() {
        return "printStmt{" +
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
