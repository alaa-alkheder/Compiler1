package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

public class ordering extends Node {
    Expretion expretion;
    boolean ASC, DESC;
    String collation_name;

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name;
    }

    @Override
    public String toString() {
        return "ordering{" +
                "expretion=" + expretion +
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
