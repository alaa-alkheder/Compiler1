package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Column_default extends Node {
    private Column_default_value column_default_value;
    private Expretion expr;
    private boolean NEXTVAL;
    private String anyname;
    private List<String> anyName1 = new ArrayList<>();

    @Override
    public String toString() {
        return "Column_default{" +
                ((column_default_value != null) ? ("column_default_value='" + column_default_value.toString()) : "") + '\t' +
                ((expr != null) ? ("expr='" + expr.toString()) : "") + '\t' +
                ((anyname != null) ? ("anyname='" + anyname) : "") + '\t' +
                ((NEXTVAL == true) ? ("NEXTVAL='" + expr.toString()) : "") + '\t' +
                ((anyName1.size() > 1) ? ("::anyName1=='" + prString()) : "") + '\t' +
                '}';
    }

    private String prString() {
        String s = "\n";
        for (int i = 0; i < anyName1.size(); i++) {
            s += anyName1.get(i) + '\t';
        }
        return s;
    }

    public void setColumn_default_value(Column_default_value column_default_value) {
        this.column_default_value = column_default_value;
    }

    public void setExpr(Expretion expr) {
        this.expr = expr;
    }

    public void setNEXTVAL(boolean NEXTVAL) {
        this.NEXTVAL = NEXTVAL;
    }

    public void setAnyname(String anyname) {
        this.anyname = anyname;
    }

    public void AddAnyName1(String anyName1) {
        this.anyName1.add(anyName1);
    }
}
/*
* column_default
 : K_DEFAULT (column_default_value | '(' expr ')' | K_NEXTVAL '(' expr ')' | any_name )  ( '::' any_name+ )?
 ;*


 *
 * column_default_value
 : ( signed_number | literal_value )
 ;
 * /
 */