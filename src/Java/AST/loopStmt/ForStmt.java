package Java.AST.loopStmt;

import Java.AST.BodyStmt;
import Java.AST.Expr.Expretion;

public class ForStmt extends LoopStmt {
    boolean newVar;

    public void setNewVar(boolean newVar) {
        this.newVar = newVar;
    }

    Java.AST.Var_define.varVariable varVariable;
    Expretion increment;
    BodyStmt body = new BodyStmt();

    public void setBody(BodyStmt body) {
        this.body = body;
    }

    @Override
    public String toString() {
        String d = "For Stmt{" +
                ((varVariable != null) ? ("Var define ='" + varVariable.toString()) : "Var define is null") + '\t' +
                ((Condition != null) ? ("Condition='" + Condition.toString()) : "the loop is infinty") + '\t' +
                ((increment != null) ? ("increment='" + increment.toString()) : "increment is null") + '\t'
                + ", body=" + body.toString();

        return d + '}' + "\n";
    }

    public void setVarVariable(Java.AST.Var_define.varVariable varVariable) {
        this.varVariable = varVariable;
    }

    public void setIncrement(Expretion increment) {
        this.increment = increment;
    }
}
