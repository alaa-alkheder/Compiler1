package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class GroupByElement extends Node {
    @Override
    public String toString() {
        return "GroupByElement{" +
                "expretions=" + print() +
                '}';
    }

    List<Expretion> expretions = new ArrayList<>();

    public void AddExpretions(Expretion expretions) {
        this.expretions.add(expretions);
    }

    private String print() {
        String temp = "";
        for (int i = 0; i < expretions.size(); i++) {
            temp += i + " order is " + expretions.get(i).toString() + " , ";
        }
        return temp;
    }


}
