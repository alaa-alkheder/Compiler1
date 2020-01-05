package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

public class Column_constraint extends Node {
    private String name;
    private Column_constraint_primary_key column_constraint_primary_key;
    private boolean column_constraint_not_null;
    private boolean column_constraint_null;
    private Column_constraint_foreign_key column_constraint_foreign_key;
    private Expretion CheckExpr;
    private Column_default column_default;
    private String CollateName;

    @Override
    public String toString() {
        return "Column_constraint{" +
                ((name != null) ? ("name='" + name) : "") + '\t' +
                ((column_constraint_primary_key != null) ? ("column_constraint_primary_key='" + column_constraint_primary_key.toString()) : "") + '\t' +
                ((column_constraint_foreign_key != null) ? ("column_constraint_foreign_key='" + column_constraint_foreign_key.toString()) : "") + '\t' +
                ((CheckExpr != null) ? ("CheckExpr='" + CheckExpr.toString()) : "") + '\t' +
                ((column_default != null) ? ("column_default='" + column_default.toString()) : "") + '\t' +
                ((CollateName != null) ? ("CollateName='" + CollateName.toString()) : "") + '\t' +
                ((column_constraint_null == true) ? ("column_constraint_null='" + column_constraint_null) : "") + '\t' +
                ((column_constraint_not_null == true) ? ("column_constraint_not_null='" + column_constraint_not_null) : "") + '\t' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColumn_constraint_primary_key(Column_constraint_primary_key column_constraint_primary_key) {
        this.column_constraint_primary_key = column_constraint_primary_key;
    }

    public void setColumn_constraint_not_null(boolean column_constraint_not_null) {
        this.column_constraint_not_null = column_constraint_not_null;
    }

    public void setColumn_constraint_null(boolean column_constraint_null) {
        this.column_constraint_null = column_constraint_null;
    }

    public void setClumn_constraint_foreign_key(Column_constraint_foreign_key olumn_constraint_foreign_key) {
        this.column_constraint_foreign_key = olumn_constraint_foreign_key;
    }

    public void setCheckExpr(Expretion checkExpr) {
        CheckExpr = checkExpr;
    }

    public void setColumn_default(Column_default column_default) {
        this.column_default = column_default;
    }

    public void setCollateName(String collateName) {
        CollateName = collateName;
    }
}