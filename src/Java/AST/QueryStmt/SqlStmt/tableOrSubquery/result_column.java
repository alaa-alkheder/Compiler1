package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

public class result_column extends Node {
    boolean Star;
    String tableName; /*table_name '.' '*'*/

    @Override
    public String toString() {
        return "result_column{" +
                ((Star != false) ? ("Star") : "") +
                ((tableName != null) ? ("tableName='" + tableName) : "") +
                ((expr != null) ? ("expr='" + expr.toString()) : "") +
                ((column_alias != null) ? ("column_alias='" + column_alias.toString()) : "") +
                '}';
    }

    public void setStar(boolean star) {
        Star = star;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setExpr(Expretion expr) {
        this.expr = expr;
    }

    public void setColumn_alias(String column_alias) {
        this.column_alias = column_alias;
    }

    Expretion expr;
    String column_alias;
}
