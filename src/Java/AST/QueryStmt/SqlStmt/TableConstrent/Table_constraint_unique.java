package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

import java.util.ArrayList;

public class Table_constraint_unique extends Node {
    private String name;
    private ArrayList<Indexed_column> indexed_column = new ArrayList<>();


    public void addIndexed_column(Indexed_column indexed_column) {
        this.indexed_column.add(indexed_column);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "\nTable_constraint_unique" + ((name != null) ? ("name='" + name) : "") + '\t' + "{";
        for (int i = 0; i < indexed_column.size(); i++) {
            s += "i: " + i + indexed_column.get(i).toString() + "\n";
        }
        return s + '}';
    }
}