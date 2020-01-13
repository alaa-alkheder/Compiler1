package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

import Java.AST.Expr.Expretion;
import Java.AST.Node;


import java.util.ArrayList;
import java.util.List;

public class ValuesSelectCoreStmt extends Node {
    List<Expretion> expretionList = new ArrayList<>();

    private String print() {
        String s = "\n";
        for (int i = 0; i < expretionList.size(); i++) {
            s += expretionList.get(i).toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return "ValuesSelectCoreStmt{" +
                "expretionList=" + expretionList +
                '}';
    }

    public void AddExpretionList(Expretion expretionList) {
        this.expretionList.add(expretionList);
    }
}
