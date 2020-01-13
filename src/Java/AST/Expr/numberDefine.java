package Java.AST.Expr;

public class numberDefine extends math{
    public numberDefine(String num) {
        this.num = Double.valueOf(num);
    }

    char op_signed_number = ',';
    Double num;

    public char getOp_signed_number() {
        return op_signed_number;
    }

    public void setOp_signed_number(char op_signed_number) {
        this.op_signed_number = op_signed_number;
    }

    @Override
    public String toString() {
        return " " +
                ((op_signed_number == '+') ? ("+ ") : "") +
                ((op_signed_number == '-') ? ("- ") : "") +

                +num;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
}
