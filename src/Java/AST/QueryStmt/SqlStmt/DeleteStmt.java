package Java.AST.QueryStmt;

public class DeleteStmt extends Statement {

    //    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;
    private String fromItem;

    @Override
    public String toString() {
        return "DeleteStmt{" +
                "fromItem='" + fromItem + '\'' +
                ", where='" + where + '\'' +
                '}';
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    //    private List<Join> joins;
//    private Expression where;
    String where;
//    private GroupByElement groupBy;
//    private List<OrderByElement> orderByElements;
//    private Expression having;
//    private Limit limit;
//    private Offset offset;

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }

    public String getFromItem() {
        return fromItem;
    }
}

