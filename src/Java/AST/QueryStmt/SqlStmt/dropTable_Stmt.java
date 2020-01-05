package Java.AST.QueryStmt;

public class dropTable_Stmt extends Statement {

    private String fromItem;

    @Override
    public String toString() {
        return "dropTable_Stmt{" +
                "fromItem='" + fromItem + '\'' +
                '}';
    }

    @Override
    public String getFromItem() {
        return fromItem;
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }
}
