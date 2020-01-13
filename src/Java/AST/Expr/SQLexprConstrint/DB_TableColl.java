package Java.AST.Expr.SQLexprConstrint;

public class DB_TableColl extends sqlExprtion {
    private String DBname;
    private String tableName;
    private String collName;

    @Override
    public String toString() {
        return "DB_TableColl{" +
                ((DBname != null) ? ("DBname='" + DBname) : "") + '\t' +
                ((tableName != null) ? ("tableName='" + tableName) : "") + '\t' +
                ((collName != null) ? ("collName='" + collName) : "") + '\t' +
                '}';
    }

    public void setDBname(String DBname) {
        this.DBname = DBname;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }
}
