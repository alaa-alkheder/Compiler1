package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.LimitStmt;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.ordering;
import Java.AST.QueryStmt.Statement;
import generated.SQLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends Statement {


    @Override
    public String toString() {
        return "SelectStmt{" +
                "result_column=" + result_column.get(0).getText() +
                ", fromItem='" + fromItem + '\'' +
//                ", where=" + where.toString() +
                ", orderByElements=" + printorderByElements() +
                '}';
    }

    //    private Distinct distinct;
//    private List<SelectItem> selectItems;
    List<SQLParser.Result_columnContext> result_column;

    private String printorderByElements() {
        String temp = "";
        for (int i = 0; i < orderByElements.size(); i++) {
            temp += i + " order is " + orderByElements.get(i).toString() + " , ";
        }
        return temp;
    }

    public List<SQLParser.Result_columnContext> getResult_column() {
        return result_column;
    }

    public void setResult_column(List<SQLParser.Result_columnContext> result_column) {
        this.result_column = result_column;
    }

    //    private List<Table> intoTables;
    private String fromItem;
    //    private List<Join> joins;
    public Expretion where = null;
    private GroupByElement groupBy;
    List<ordering> orderByElements = new ArrayList<>();//    private List<OrderByElement> orderByElements;
    private Expretion having;
    private LimitStmt limit;


    public void setWhere(Expretion where) {
        this.where = where;
    }


    public void AddOrderByElements(ordering orderByElements) {

        this.orderByElements.add(orderByElements);
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;

    }

    public String getFromItem() {
        return fromItem;
    }
}
