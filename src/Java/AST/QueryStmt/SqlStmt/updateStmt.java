package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class updateStmt extends Statement {
    String DbName;
    String tableName;
    String index_by;
    List<String> coll = new ArrayList<>();
    List<Expretion> expretions = new ArrayList<>();
    Expretion where;

    public void setWhere(Expretion where) {
        this.where = where;
    }

    @Override
    public String toString() {
        return "updateStmt{" +
                ((DbName != null) ? ("DBname='" + DbName) : "") + '\t' +
                ", tableName='" + tableName + '\'' +
                ((index_by != null) ? ("index_by='" + index_by) : "with out index") + '\t'
                + print() +
                ((where != null) ? ("where='" + where.toString()) : "") +
                '}';
    }

    private String print() {
        String temp = "\n";
        for (int i = 0; i < coll.size(); i++) {
            temp += i + " column_name is " + coll.get(i) + "\t";
            temp += " expr is " + expretions.get(i).toString() + "\n";
        }
        return temp;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setIndex_by(String index_by) {
        this.index_by = index_by;
    }

    public void AddColl(String coll) {
        this.coll.add(coll);
    }

    public void AddExpretions(Expretion expretions) {
        this.expretions.add(expretions);
    }
}
