package Java.AST.QueryStmt.loopStmt;

import Java.AST.QueryStmt.Expr.Expretion;
import Java.AST.QueryStmt.Var_define.varVariable;

public class ForStmt extends LoopStmt {
boolean newVar;

    public void setNewVar(boolean newVar) {
        this.newVar = newVar;
    }

    Java.AST.QueryStmt.Var_define.varVariable varVariable;
    Expretion increment;

    @Override
    public String toString() {
        String d= "For Stmt{" +
                ((varVariable!=null) ? ("Var define ='" + varVariable.toString() ): "Var define is null")+ '\t' +
                ((Condition!=null) ? ("Condition='" + Condition.toString() ): "the loop is infinty")+ '\t' +
        ((increment!=null) ? ("increment='" + increment.toString()): "increment is null")+ '\t' ;

        return d+'}'+"\n";
    }

    public void setVarVariable(Java.AST.QueryStmt.Var_define.varVariable varVariable) {
        this.varVariable = varVariable;
    }

    public void setIncrement(Expretion increment) {
        this.increment = increment;
    }
}
