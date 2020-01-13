package Java.AST.Expr.SQLexprConstrint;

import Java.AST.QueryStmt.SqlStmt.Factored_select_stmt;
import Java.AST.QueryStmt.SqlStmt.SelectStmt;

public class selectExpr extends sqlExprtion {
    boolean K_NOT = false, K_EXISTS = false;

    @Override
    public String toString() {
        return "selectExpr{" +
                ((K_NOT == true) ? ("K_NOT=truee") : "") + '\t' +
                ((K_EXISTS == true) ? ("K_EXISTS='true") : "") + '\t' +
                ((selectStmt != null) ? ("selectStmt='" + selectStmt.toString()) : "") + '\t' +

                '}';
    }

    public void setK_NOT(boolean k_NOT) {
        K_NOT = k_NOT;
    }

    public void setK_EXISTS(boolean k_EXISTS) {
        K_EXISTS = k_EXISTS;
    }

    public void setSelectStmt(Factored_select_stmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    Factored_select_stmt selectStmt;
}
