package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.SQLexprConstrint.DB_TableColl;
import Java.AST.QueryStmt.Statement;

public class dropTable_Stmt extends Statement {

    private String fromItem;
    private String DBname;
    private boolean ifExsest = false;

    @Override
    public String toString() {
        return "dropTable_Stmt{" +
                ((ifExsest == true) ? ("ifExsest=truee") : "") + '\t' +
                ((DBname != null) ? ("DBname='" + DBname) : "") + '\t' +
                "fromItem='" + fromItem + '\'' +
                '}';
    }

    public void setDBname(String DBname) {
        this.DBname = DBname;
    }

    public void setIfExsest(boolean ifExsest) {
        this.ifExsest = ifExsest;
    }

    @Override
    public String getFromItem() {
        return fromItem;
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }
}
