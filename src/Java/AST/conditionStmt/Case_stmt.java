package Java.AST.conditionStmt;

import Java.AST.BodyStmt;
import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class Case_stmt extends Statement {
    Expretion expretion;
    BodyStmt body = new BodyStmt();

    public void setBody(BodyStmt body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Case_stmt{" +
                "expretion=" + expretion +
                ", body=" + body.toString() +
                '}';
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
    }
}
