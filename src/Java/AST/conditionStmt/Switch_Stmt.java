package Java.AST.conditionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Switch_Stmt extends Statement {
    Expretion expr;
    List<Case_stmt> case_stmts = new ArrayList<>();


    @Override
    public String toString() {
        return "Switch_Stmt{" +
                "expr=" + expr.toString() +
                ", case_stmts=" + printArray() +
                '}';
    }

    private String printArray() {
        String s = "\n";
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
