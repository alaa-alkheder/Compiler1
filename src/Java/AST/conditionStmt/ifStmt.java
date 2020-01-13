package Java.AST.conditionStmt;

import Java.AST.BodyStmt;
import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;

public class ifStmt extends Statement {
    boolean elseifBool;
    Expretion condition;
    ifStmt elseif;
    BodyStmt bodys = new BodyStmt();

    public void setBodys(BodyStmt bodys) {
        this.bodys = bodys;
    }

    public void setElseBody(BodyStmt elseBody) {
        this.elseBody = (elseBody);
    }

    BodyStmt elseBody = new BodyStmt();

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
                ((condition != null) ? ("condition  ='" + condition.toString() + ", body=" + bodys.toString()) : "the condition is null") + '\t' +
                ((elseif != null) ? ("Else if  ='" + elseif.toString()) : "") +
                ((elseBody != null) ? ("Else Body  ='" + elseBody.toString()) : "") +
                '}';
    }
}
