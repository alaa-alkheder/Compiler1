package Java.AST.QueryStmt.Expr;

public class numberDefine extends math{
    public numberDefine(String num) {
        this.num = Double.valueOf(num);
    }

    Double num;

    @Override
    public String toString() {
        return " "+num;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
}
