package Java.AST.conditionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;

public class ifStmt extends Statement {
    boolean elseifBool;
    Expretion condition;
    ifStmt elseif;
    ArrayList<Statement> body = new ArrayList<>();

    public void setBody(Statement body) {
        this.body.add(body);
    }

    public void setElseBody(Statement elseBody) {
        this.elseBody.add(elseBody);
    }

    ArrayList<Statement> elseBody = new ArrayList<>();

    public void setElseifBool(boolean elseifBool) {
        this.elseifBool = elseifBool;
    }

    public void setElseif(ifStmt elseif) {
        this.elseif = elseif;
    }


    public void setCondition(Expretion condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ifStmt{" +
                ((condition != null) ? ("condition  ='" + condition.toString()) : "the condition is null") + '\t' +
                '}';
    }
}
