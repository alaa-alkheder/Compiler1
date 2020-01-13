package Java.AST.conditionStmt;

import Java.AST.BodyStmt;
import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Switch_Stmt extends Statement {
    Expretion expr;
    List<Case_stmt> case_stmts = new ArrayList<>();
    BodyStmt defult;

    public void setDefult(BodyStmt defult) {
        this.defult = defult;
    }

    @Override
    public String toString() {
        return "Switch_Stmt{" +
                ((expr != null) ? ("Expr" + expr.toString()) : "") +
                ((case_stmts != null) ? ("case_stmts" + printArray()) : "") +
                ((defult != null) ? ("defult" + defult.toString()) : "") +

                '}';
    }

    private String printArray() {
        String s = "\n" + case_stmts.size();
        for (int i = 0; i < case_stmts.size(); i++) {
            s += "i= " + i + case_stmts.get(i).toString() + "\n";
        }
        return s;
    }

    public void setExpr(Expretion expr) {
        this.expr = expr;
    }

    public void AddCase_stmts(Case_stmt case_stmts) {
        this.case_stmts.add(case_stmts);
    }


}
