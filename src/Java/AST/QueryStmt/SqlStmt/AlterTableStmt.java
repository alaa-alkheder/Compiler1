package Java.AST.QueryStmt.SqlStmt;

import Java.AST.QueryStmt.SqlStmt.Column_constraint.column_def;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.Table_constraint;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.alter_table_add_constraint;
import Java.AST.QueryStmt.Statement;
import Java.AST.QueryStmt.tableName;

public class AlterTableStmt extends Statement {
    tableName tableName;
    String new_table_name;
    Table_constraint alter_table_add;
    alter_table_add_constraint alter_table_add_constraint;
    boolean K_COLUMN;

    @Override
    public String toString() {
        return "AlterTableStmt{" +
                "tableName=" + tableName +
                ((new_table_name != null) ? ("new_table_name='" + new_table_name) : "") + '\t' +
                ((alter_table_add != null) ? ("alter_table_add='" + alter_table_add.toString()) : "") + '\t' +
                ((alter_table_add_constraint != null) ? ("alter_table_add_constraint='" + alter_table_add_constraint) : "") + '\t' +
                ((K_COLUMN != false) ? ("K_COLUMN='") : "") + '\t' +
                ((column_def != null) ? ("column_def='" + column_def) : "") + '\t' +
                '}';
    }

    public void setK_COLUMN(boolean k_COLUMN) {
        K_COLUMN = k_COLUMN;
    }

    column_def column_def;

    public void setTableName(Java.AST.QueryStmt.tableName tableName) {
        this.tableName = tableName;
    }

    public void setNew_table_name(String new_table_name) {
        this.new_table_name = new_table_name;
    }

    public void setAlter_table_add(Table_constraint alter_table_add) {
        this.alter_table_add = alter_table_add;
    }

    public void setAlter_table_add_constraint(Java.AST.QueryStmt.SqlStmt.TableConstrent.alter_table_add_constraint alter_table_add_constraint) {
        this.alter_table_add_constraint = alter_table_add_constraint;
    }

    public void setColumn_def(Java.AST.QueryStmt.SqlStmt.Column_constraint.column_def column_def) {
        this.column_def = column_def;
    }


}


/*
alter_table_stmt
 --: K_ALTER K_TABLE  ( database_name '.' )? source_table_name
   ( K_RENAME K_TO new_table_name
   | alter_table_add
   | alter_table_add_constraint
   | K_ADD K_COLUMN? column_def
   )
 ;
* */
