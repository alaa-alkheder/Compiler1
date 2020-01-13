package Java.AST.one_line_instruction;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;
import Java.AST.Var_define.ArrayStmt;

public class one_line_instruction extends Statement {
    Expretion expr;
    ArrayStmt arrayStmt;
    Statement statement;

    public void setOne_line_instructionNmae(String one_line_instructionNmae) {
        this.one_line_instructionNmae = one_line_instructionNmae;
    }

    @Override
    public String toString() {
        return "one_line_instruction{" +
                ", one_line_instructionNmae='" + one_line_instructionNmae + '\'' +
                ((arrayStmt != null) ? ("array" + arrayStmt.toString()) : "") +
                ((expr != null) ? ("Expr" + expr.toString()) : "") +
                ((statement != null) ? ("statment" + statement.toString()) : "") +

                '}';
    }


    String one_line_instructionNmae;

    public void setExpr(Expretion expr) {
        this.expr = expr;
    }

    public void setArrayStmt(ArrayStmt arrayStmt) {
        this.arrayStmt = arrayStmt;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
