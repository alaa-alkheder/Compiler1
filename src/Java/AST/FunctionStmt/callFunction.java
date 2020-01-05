package Java.AST.FunctionStmt;

import Java.AST.Expr.Expretion;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;

public class callFunction extends Statement {
    public void setFinctionName(String finctionName) {
        this.finctionName = finctionName;
    }

    @Override
    public String toString() {
        return "callFunction{" +
                "finctionName='" + finctionName + '\'' +
                ", parameter=" + printParameter() +
                '}';
    }

    private String printParameter() {
        String s = "";
        for (Expretion e :
                parameter) {
            s += "\t," + e.toString();
        }


        return s;
    }

    public void setParameter(Expretion parameter) {
        this.parameter.add(parameter);
    }

    String finctionName;
    ArrayList<Expretion> parameter = new ArrayList<>();

}
