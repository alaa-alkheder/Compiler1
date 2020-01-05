package Java.AST.QueryStmt.Expr;

public class ChOne implements Expretion {
    String mathop;
    Expretion expretion;

    public String getMathop() {
        return mathop;
    }

    public void setMathop(String mathop) {
        this.mathop = mathop;
    }

    public Expretion getExpretion() {
        return expretion;
    }

    public void setExpretion(Expretion expretion) {
        this.expretion = expretion;
    }

    @Override
    public void setLeft(Expretion l) {

    }

    @Override
    public void setRight(Expretion r) {

    }

    @Override
    public Expretion getLeft() {
        return null;
    }

    @Override
    public Expretion getRight() {
        return null;
    }
}
