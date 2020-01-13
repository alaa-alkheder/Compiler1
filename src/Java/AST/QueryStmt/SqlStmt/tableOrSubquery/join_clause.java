package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class join_clause extends Node {
    table_or_subquery table_or_subquery;
    List<join_operator> join_operatorList = new ArrayList<>();
    List<table_or_subquery> table_or_subqueryList = new ArrayList<>();
    List<join_constraint> join_constraintList = new ArrayList<>();

    @Override
    public String toString() {
        return "join_clause{" +
                print() +
                '}';
    }

    String print() {
        String s = "\n";
        s += (table_or_subquery.toString());
        for (int i = 0; i < join_operatorList.size(); i++) {
            s += ("," + join_operatorList.get(i).toString() + "  " + table_or_subqueryList.get(i).toString() + "  " + join_constraintList.get(i).toString());
        }
        return s;
    }

    public void setTable_or_subquery(Java.AST.QueryStmt.SqlStmt.tableOrSubquery.table_or_subquery table_or_subquery) {
        this.table_or_subquery = table_or_subquery;
    }

    public void AddJoin_operatorList(join_operator join_operatorList) {
        this.join_operatorList.add(join_operatorList);
    }

    public void AddTable_or_subqueryList(Java.AST.QueryStmt.SqlStmt.tableOrSubquery.table_or_subquery table_or_subqueryList) {
        this.table_or_subqueryList.add(table_or_subqueryList);
    }

    public void AddJoin_constraintList(join_constraint join_constraintList) {
        this.join_constraintList.add(join_constraintList);
    }

}
