package Java.AST.Expr;

public interface Expretion {
    void setLeft(Expretion l);
    void setRight(Expretion r);
    Expretion getLeft();
    Expretion getRight();
}