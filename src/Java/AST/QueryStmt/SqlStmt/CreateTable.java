package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt.Column_constraint.column_def;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class CreateTable extends Statement {
    boolean K_IF_NOT_EXISTS;
    String database_name;
    String table_name;
    Statement select;
    List<Node> column_def = new ArrayList<>();

    @Override
    public String toString() {
        return "CreateTable{" +
                "K_IF_NOT_EXISTS=" + K_IF_NOT_EXISTS +

                ((database_name != null) ? ("\tdatabase_name='" + database_name) : "") + '\t' +
                ", table_name='" + table_name + '\'' +
                ((select != null) ? ("Select='" + select) : "") + '\t' +
                ((column_def.size() > 0) ? ("Column is ='" + print()) : "") + '\t' +
                '}';
    }

    private String print() {
        String s = "\n";
        for (int i = 0; i < column_def.size(); i++) {
            s += "\n i=" + i + column_def.get(i).toString();
        }
        return s;

    }

    public void setK_IF_NOT_EXISTS(boolean k_IF_NOT_EXISTS) {
        K_IF_NOT_EXISTS = k_IF_NOT_EXISTS;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public void setSelect(Statement select) {
        this.select = select;
    }

    public void AddColumn_def(Node column_def) {
        this.column_def.add(column_def);
    }
}
