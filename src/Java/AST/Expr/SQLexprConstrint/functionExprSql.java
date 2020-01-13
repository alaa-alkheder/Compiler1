package Java.AST.Expr.SQLexprConstrint;

import Java.AST.Expr.Expretion;

import java.util.ArrayList;

public class functionExprSql extends sqlExprtion {
    String name;
    boolean distict = false;
    boolean star = false;
    ArrayList<Expretion> expr = new ArrayList<>();

    @Override
    public String toString() {
        return "functionExprSql{" +
                "name='" + name + '\'' +
                ((distict == true) ? ("distict='true") : "") + '\t' +
                ((star == true) ? ("star=truee") : "") + '\t' +
                ((expr != null) ? ("EXPR='" + print()) : "") + '\t' +

                '}';
    }

    private String print() {
        String s = "";
        for (int i = 0; i < expr.size(); i++) {
            s += " " + i + expr.get(i).toString();
        }
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistict(boolean distict) {
        this.distict = distict;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public void setExpr(Expretion expr) {
        this.expr.add(expr);
    }
}
