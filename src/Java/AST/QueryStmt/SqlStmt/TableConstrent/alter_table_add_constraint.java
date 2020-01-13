package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

public class alter_table_add_constraint extends Node {

    String anyname;

    Table_constraint table_constraint;

    @Override
    public String toString() {
        return "alter_table_add_constraint{" +
                "anyname='" + anyname + '\'' +
                ", table_constraint=" + table_constraint +
                '}';
    }

    public void setAnyname(String anyname) {
        this.anyname = anyname;
    }

    public void setTable_constraint(Table_constraint table_constraint) {
        this.table_constraint = table_constraint;
    }
}
