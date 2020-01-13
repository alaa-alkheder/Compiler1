package Java.AST.QueryStmt;

public class tableName {

    @Override
    public String toString() {
        return "tableName{" +
                "DbName='" + DbName + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    String DbName = "";
    String tableName;

}
