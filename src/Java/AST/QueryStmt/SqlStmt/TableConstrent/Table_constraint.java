package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

//the class was bulded
public class Table_constraint extends Node {
    private String name;
    private Table_constraint_primary_key table_constraint_primary_key;
    private Table_constraint_key table_constraint_key;
    private Table_constraint_unique table_constraint_unique;
    private Table_constraint_foreign_key table_constraint_foreign_key;
    private Expretion checkExpr;


    @Override
    public String toString() {
        return "Table_constraint{" +
                ((name != null) ? ("Name='" + name) : "") + '\t' +
                ((table_constraint_primary_key != null) ? ("table_constraint_primary_key='" + table_constraint_primary_key.toString()) : "") + '\t' +
                ((table_constraint_key != null) ? ("table_constraint_key='" + table_constraint_key.toString()) : "") + '\t' +
                ((table_constraint_unique != null) ? ("table_constraint_unique='" + table_constraint_unique.toString()) : "") + '\t' +
                ((table_constraint_foreign_key != null) ? ("table_constraint_foreign_key='" + table_constraint_foreign_key.toString()) : "") + '\t' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTable_constraint_primary_key(Table_constraint_primary_key table_constraint_primary_key) {
        this.table_constraint_primary_key = table_constraint_primary_key;
    }

    public void setTable_constraint_key(Table_constraint_key table_constraint_key) {
        this.table_constraint_key = table_constraint_key;
    }

    public void setTable_constraint_unique(Table_constraint_unique table_constraint_unique) {
        this.table_constraint_unique = table_constraint_unique;
    }

    public void setTable_constraint_foreign_key(Table_constraint_foreign_key table_constraint_foreign_key) {
        this.table_constraint_foreign_key = table_constraint_foreign_key;
    }

    public void setCheckExpr(Expretion checkExpr) {
        this.checkExpr = checkExpr;
    }
    /* : ( K_CONSTRAINT  )?
   ( table_constraint_primary_key
   | t
   | t
   | K_CHECK '(' expr ')'
   | t
   )*/


}
