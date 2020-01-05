package Java.AST.QueryStmt;

import generated.SQLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.List;

public class SelectStmt extends Statement {


    @Override
    public String toString() {
        return "SelectStmt{" +
                "result_column=" + result_column.get(0).getText() +
                ", fromItem='" + fromItem + '\'' +
//                ", where=" + where.toString() +
                ", orderByElements=" +printorderByElements()+
                '}';
    }

    //    private Distinct distinct;
//    private List<SelectItem> selectItems;
    List<SQLParser.Result_columnContext> result_column;

    private String printorderByElements(){
        String temp="";
        for (int i = 0; i <  orderByElements.size(); i++) {
            temp+=i+" order is "+ orderByElements.get(i).getText()+" , ";
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
    public SQLParser.ExprContext where=null;

    //    private GroupByElement groupBy;
    List<SQLParser.Ordering_termContext> orderByElements;//    private List<OrderByElement> orderByElements;

//    private Expression having;
//    private Limit limit;
//    private Offset offset;




    public String getWhere() {
        return ""+ where.getText();
    }


    public List<SQLParser.Ordering_termContext> getOrderByElements() {
        return orderByElements;
    }

    public void setOrderByElements(List<SQLParser.Ordering_termContext> orderByElements) {

        this.orderByElements = orderByElements;
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;

    }

    public String getFromItem() {
        return fromItem;
    }
}
