package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

public class ordering extends Node {
    Expretion expretion;
    boolean ASC, DESC;

    @Override
    public String toString() {
        return "ordering{" +
                "expretion=" + expretion.toString() +
                ", ASC=" + ASC +
                ", DESC=" + DESC +
                '}';
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
    }

    public void setASC(boolean ASC) {
        this.ASC = ASC;
    }

    public void setDESC(boolean DESC) {
        this.DESC = DESC;
    }
}
