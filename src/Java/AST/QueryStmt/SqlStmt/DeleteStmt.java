package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

public class DeleteStmt extends Statement {
    private String fromItem;
    private Expretion where;


    public void setWhere(Expretion where) {
        this.where = where;
    }
    //    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;

    @Override
    public String toString() {
        return "DeleteStmt{" +
                "fromItem='" + fromItem +
                ((where != null) ? ("where='" + where.toString()) : "") +
                '}';
    }

//    public String getWhere() {
//        return where;
//    }
//
//    public void setWhere(String where) {
//        this.where = where;
//    }

    //    private List<Join> joins;
//    private Expression where;
//    String where;
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

