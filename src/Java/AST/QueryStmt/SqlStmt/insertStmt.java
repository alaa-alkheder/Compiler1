package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.Expr.SQLexprConstrint.DB_TableColl;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

///test test
public class insertStmt extends Statement {
    private String database_name;
    private String table_name;
    private List<String> column_name = new ArrayList<>();
    private Statement select = null;
    private List<Expretion> expr = new ArrayList<>();
    private boolean DEFAULT_VALUES = false;

    public void setSelect(Statement select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "insertStmt{" +
                ((database_name != null) ? ("database_name='" + database_name) : "") + '\t' +
                ", table_name='" + table_name + '\'' + print() +
                '}';
    }

    private String print() {
        String temp = "\n";
        if (select != null) {
            temp = select.toString();
            return temp;
        }
        if (DEFAULT_VALUES)
            return "the values is defult";
        for (int i = 0; i < column_name.size(); i++) {
            temp += i + " column_name is " + column_name.get(i) + "\n";
        }
        for (int i = 0; i < expr.size(); i++) {
            temp += i + " expr is " + expr.get(i).toString() + "\n";
        }
        return temp;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public void AddColumn_name(String column_name) {
        this.column_name.add(column_name);
    }

    public void AddExpr(Expretion expr) {
        this.expr.add(expr);
    }

    public void setDEFAULT_VALUES(boolean DEFAULT_VALUES) {
        this.DEFAULT_VALUES = DEFAULT_VALUES;
    }
}
