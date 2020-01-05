package Java.AST.Expr.SQLexprConstrint;

import Java.AST.Expr.Expretion;

import java.util.ArrayList;

public class functionExprSql extends sqlExprtion {
    boolean distict;
    boolean star;
    ArrayList<sqlExprtion> expr = new ArrayList<>();

    public void setDistict(boolean distict) {
        this.distict = distict;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public void setExpr(sqlExprtion expr) {
        this.expr.add(expr);
    }
}
