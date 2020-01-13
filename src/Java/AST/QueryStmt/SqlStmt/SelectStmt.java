package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.LimitStmt;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.ordering;
import Java.AST.QueryStmt.SqlStmt.tableOrSubquery.ValuesSelectCoreStmt;
import Java.AST.QueryStmt.SqlStmt.tableOrSubquery.join_clause;
import Java.AST.QueryStmt.SqlStmt.tableOrSubquery.result_column;
import Java.AST.QueryStmt.SqlStmt.tableOrSubquery.table_or_subquery;
import Java.AST.QueryStmt.Statement;
import generated.SQLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends Statement {
    private boolean K_DISTINCT;
    private boolean K_ALL;
    List<Java.AST.QueryStmt.SqlStmt.tableOrSubquery.result_column> result_columnList = new ArrayList<>();
    List<table_or_subquery> FromTable = new ArrayList<>();
    join_clause join_clause;
    public Expretion where = null;
    private GroupByElement groupBy;
    private Expretion having;
    List<ValuesSelectCoreStmt> valuesSelectCoreStmts = new ArrayList<>();

    @Override
    public String toString() {
        return "SelectStmt{" +
                ((K_DISTINCT != false) ? ("K_DISTINCT='") : "") +
                ((K_ALL != false) ? ("K_ALL='") : "") +
                ((result_columnList.size() > 0) ? ("result_columnList='" + ptint_result_columnList()) : "") +
                ((FromTable.size() > 0) ? ("\nFromTable='" + ptint_FromTable()) : "") +
                ((join_clause != null) ? ("join_clause='" + join_clause.toString()) : "") +
                ((where != null) ? ("\nwhere='" + where.toString()) : "") +
                ((groupBy != null) ? ("groupBy='" + groupBy.toString()) : "") +
                ((having != null) ? ("having='" + having.toString()) : "") +
                ((valuesSelectCoreStmts.size() > 0) ? ("valuesSelectCoreStmts='" + ptint_valuesSelectCoreStmts()) : "") +
                '}';
    }

    private String ptint_result_columnList() {
        String s = "\n";
        for (int i = 0; i < result_columnList.size(); i++) {
            s += (i + 1 + result_columnList.get(i).toString());
        }


        return s;
    }

    private String ptint_valuesSelectCoreStmts() {
        String s = "\n";
        for (int i = 0; i < valuesSelectCoreStmts.size(); i++) {
            s += (valuesSelectCoreStmts.get(i).toString());
        }


        return s;
    }


    private String ptint_FromTable() {
        String s = "\n";
        for (int i = 0; i < FromTable.size(); i++) {
            s += (FromTable.get(i).toString());
        }


        return s;
    }


    public void setK_DISTINCT(boolean k_DISTINCT) {
        K_DISTINCT = k_DISTINCT;
    }

    public void setK_ALL(boolean k_ALL) {
        K_ALL = k_ALL;
    }

    public void AddResult_columnList(result_column result_columnList) {
        this.result_columnList.add(result_columnList);
    }

    public void AddFromTable(table_or_subquery fromTable) {
        FromTable.add(fromTable);
    }

    public void setJoin_clause(Java.AST.QueryStmt.SqlStmt.tableOrSubquery.join_clause join_clause) {
        this.join_clause = join_clause;
    }

    public void setWhere(Expretion where) {
        this.where = where;
    }

    public void setGroupBy(GroupByElement groupBy) {
        this.groupBy = groupBy;
    }

    public void setHaving(Expretion having) {
        this.having = having;
    }


    public void AddValuesSelectCoreStmts(ValuesSelectCoreStmt valuesSelectCoreStmts) {
        this.valuesSelectCoreStmts.add(valuesSelectCoreStmts);
    }


}
