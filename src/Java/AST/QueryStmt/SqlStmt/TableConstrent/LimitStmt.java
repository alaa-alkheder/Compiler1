package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class LimitStmt extends Statement {
    boolean K_OFFSET;
    Expretion expretion1;
    Expretion expretion2;

    @Override
    public String toString() {
        return "LimitStmt{" +
                ", expretion1=" + expretion1.toString() +
                (K_OFFSET == true ? "K_OFFSET=" : ',') +
                ", expretion2=" + expretion2 +
                '}';
    }

    public void setK_OFFSET(boolean k_OFFSET) {
        K_OFFSET = k_OFFSET;
    }

    public void setExpretion1(Expretion expretion1) {
        this.expretion1 = expretion1;
    }

    public void setExpretion2(Expretion expretion2) {
        this.expretion2 = expretion2;
    }
}
