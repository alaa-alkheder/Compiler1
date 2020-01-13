package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt.Factored_select_stmt;
import Java.AST.QueryStmt.SqlStmt.SelectStmt;

import java.util.ArrayList;
import java.util.List;

public class table_or_subquery extends Node {
    String database_name;
    String table_name;
    String table_alias;
    String index_name;
    boolean indexed;
    Factored_select_stmt selectStmt;
    join_clause join_clause;
    List<table_or_subquery> table_or_subqueryList = new ArrayList<>();


    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public void setTable_alias(String table_alias) {
        this.table_alias = table_alias;
    }

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    @Override
    public String toString() {
        return "table_or_subquery{" +
                ((database_name != null) ? ("database_name='" + database_name) : "") +
                ((table_name != null) ? ("table_name='" + table_name) : "") +
                ((table_alias != null) ? ("table_alias='" + table_alias) : "") +
                ((index_name != null) ? ("index_name='" + index_name.toString()) : "") +
                ((indexed != false) ? ("indexed='") : "") +
                ((selectStmt != null) ? ("selectStmt='" + selectStmt.toString()) : "") +
                ((join_clause != null) ? ("join_clause='" + join_clause.toString()) : "") +
                ((table_or_subqueryList.size() > 0) ? ("table or subquere='" + print()) : "") +
                '}';
    }

    private String print() {
        for (int i = 0; i < table_or_subqueryList.size(); i++) {
            System.out.println(table_or_subqueryList.get(i).toString() + ",");
        }
        return "";
    }

    public void setFactored_select_stmt(Factored_select_stmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public void setJoin_clause(Java.AST.QueryStmt.SqlStmt.tableOrSubquery.join_clause join_clause) {
        this.join_clause = join_clause;
    }

    public void AddTable_or_subqueryList(table_or_subquery table_or_subqueryList) {
        this.table_or_subqueryList.add(table_or_subqueryList);
    }


}
