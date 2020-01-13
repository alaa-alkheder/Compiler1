package Java.AST.Var_define;

import Java.AST.QueryStmt.Statement;

public class varEQfunction extends Statement {
    Statement x;

    public varEQfunction(Statement callFunctionDefine) {
        x = callFunctionDefine;
    }

    @Override
    public String toString() {
        return "varEQfunction{" +
                ((x != null) ? "call function " + x.toString() : "") +
                '}';
    }

    public void setX(Statement x) {
        this.x = x;
    }
}
