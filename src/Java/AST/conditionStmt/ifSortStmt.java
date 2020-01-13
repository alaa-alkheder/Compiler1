package Java.AST.conditionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class ifSortStmt extends Statement {

    Expretion Condition;

    public void setIfsTrue(ifSortStmt ifsTrue) {
        this.ifsTrue = ifsTrue;
    }

    public void setIfsFalse(ifSortStmt ifsFalse) {
        this.ifsFalse = ifsFalse;
    }

    Expretion ConditionTrue;
    Statement ifsTrue;
    Statement ifsFalse;

    @Override
    public String toString() {
        return "ifSortStmt{" +
                ((Condition != null) ? ("condition  ='" + Condition.toString()) : "the condition is null") + '\t' +
                ((ConditionTrue != null) ? ("ConditionTrue  ='" + ConditionTrue.toString()) : "the condition is null") + '\t' +
                ((ifsTrue != null) ? ("ifsTrue  ='" + ifsTrue.toString()) : "the condition is null") + '\t' +
                ((ConditionFalse != null) ? ("ConditionFalse  ='" + ConditionFalse.toString()) : "the condition is null") + '\t' +
                ((ifsFalse != null) ? ("ifsFalse  ='" + ifsFalse.toString()) : "the condition is null") + '\t' +
                '}';
    }

    public void setCondition(Expretion condition) {
        Condition = condition;
    }

    public void setConditionTrue(Expretion conditionTrue) {
        ConditionTrue = conditionTrue;
    }

    public void setConditionFalse(Expretion conditionFalse) {
        ConditionFalse = conditionFalse;
    }

    Expretion ConditionFalse;


}
