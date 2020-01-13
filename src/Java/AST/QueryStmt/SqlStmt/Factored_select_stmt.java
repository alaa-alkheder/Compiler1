package Java.AST.QueryStmt.SqlStmt;

import Java.AST.QueryStmt.SqlStmt.TableConstrent.LimitStmt;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.ordering;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Factored_select_stmt extends Statement {
    @Override
    public String toString() {
        return "Factored_select_stmt{" +
                "selectcore=" + selectcore.toString() +
                ((orderByElements.size() > 0) ? ("orderByElements='" + printorderByElements()) : "") +
                ((limit != null) ? ("limit='" + limit.toString()) : "") +

                '}';
    }

    SelectStmt selectcore;

    public void setSelectcore(SelectStmt selectcore) {
        this.selectcore = selectcore;
    }

    public void setOrderByElements(List<ordering> orderByElements) {
        this.orderByElements = orderByElements;
    }

    public void setLimit(LimitStmt limit) {
        this.limit = limit;
    }

    List<ordering> orderByElements = new ArrayList<>();//    private List<OrderByElement> orderByElements;
    private LimitStmt limit;


    private String printorderByElements() {
        String temp = "\n\n ";
        for (int i = 0; i < orderByElements.size(); i++) {
            temp += i + " order is " + orderByElements.get(i).toString() + " , ";
        }
        return temp;
    }


    public void AddOrderByElements(ordering orderByElements) {

        this.orderByElements.add(orderByElements);
    }

}
