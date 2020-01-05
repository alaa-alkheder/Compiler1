package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Expr.SQLexprConstrint.sqlExprtion;
import Java.AST.Node;
import Java.AST.Expr.numberDefine;

public class Column_default_value extends Node {

    private numberDefine numberdefine;
    private sqlExprtion literal_value;

    @Override
    public String toString() {
        return "Column_default_value{" +
                ((numberdefine != null) ? ("numberdefine='" + numberdefine.toString()) : "") + '\t' +
                ((literal_value != null) ? ("literal_value='" + literal_value.toString()) : "") + '\t' +
                '}';
    }

    public void setNumberdefine(numberDefine numberdefine) {
        this.numberdefine = numberdefine;
    }

    public void setLiteral_value(sqlExprtion literal_value) {
        this.literal_value = literal_value;
    }
}
