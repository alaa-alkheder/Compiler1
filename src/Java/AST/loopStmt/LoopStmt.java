package Java.AST.loopStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;

public class LoopStmt extends Statement {
    Expretion Condition;
    ArrayList<Statement> body = new ArrayList<>();

    public void setBody(Statement body) {
        this.body.add(body);
    }

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