package Java.AST.QueryStmt.loopStmt;

import Java.AST.QueryStmt.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class LoopStmt extends Statement {
    Expretion Condition;

    public void setCondition(Expretion condition) {
        Condition = condition;
    }

    @Override
    public String toString() {
        return "LoopStmt{" +
                "Condition='" + Condition.toString() + '\'' +
                '}';
    }


}