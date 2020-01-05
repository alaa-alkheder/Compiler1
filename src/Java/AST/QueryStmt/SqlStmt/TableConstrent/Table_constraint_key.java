package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

import java.util.ArrayList;

public class Table_constraint_key extends Node {
    private String name;


    private ArrayList<Indexed_column> indexed_column = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addIndexed_column(String column_name, String collation_name, boolean k_ASC, boolean k_DESC) {
        Indexed_column indexed_column = new Indexed_column(column_name, collation_name, k_ASC, k_DESC);
        this.indexed_column.add(indexed_column);
    }

    @Override
    public String toString() {
        String s = "\nTable_constraint_key" + ((name != null) ? ("name='" + name) : "") + '\t' + "{";
        for (int i = 0; i < indexed_column.size(); i++) {
            s += "i: " + i + indexed_column.get(i).toString() + "\n";
        }
        return s + '}';
    }
}
