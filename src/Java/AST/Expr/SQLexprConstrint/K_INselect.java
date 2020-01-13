package Java.AST.Expr.SQLexprConstrint;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.SqlStmt.Factored_select_stmt;

import java.util.ArrayList;
import java.util.List;

public class K_INselect extends sqlExprtion {
    /*expr K_NOT? K_IN ( '(' ( factored_select_stmt | expr ( ',' expr )* )? ')' | ( database_name '.' )? table_name )*/

    @Override
    public String toString() {
        return "K_IN select{" +
                "expretions" + expretions.get(0).toString() +
                ((K_Not == true) ? ("Not In") : "") +
                ((factored_select_stmt != null) ? ("factored_select_stmt" + factored_select_stmt.toString()) : "") +
                ((expretions.size() > 2) ? ("Expr" + print()) : "") +
                ((dataBaseName != null) ? ("dataBaseName" + dataBaseName) : "") +
                ((table != null) ? ("table" + table) : "") +
                '}';
    }

    String print() {
        String s = "\n";
        for (int i = 1; i < expretions.size(); i++) {
            s += "\n" + expretions.get(i).toString();
        }
        return s;

    }


    public void AddExpretions(Expretion expretions) {
        this.expretions.add(expretions);
    }

    public void setK_Not(boolean k_Not) {
        K_Not = k_Not;
    }

    public void setFactored_select_stmt(Factored_select_stmt factored_select_stmt) {
        this.factored_select_stmt = factored_select_stmt;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setTable(String table) {
        this.table = table;
    }

    List<Expretion> expretions = new ArrayList<>();
    boolean K_Not;
    Factored_select_stmt factored_select_stmt;
    String dataBaseName;
    String table;


}
