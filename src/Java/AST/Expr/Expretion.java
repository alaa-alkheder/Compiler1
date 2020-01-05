package Java.AST.QueryStmt.Expr;

public interface Expretion {
    void setLeft(Expretion l);
    void setRight(Expretion r);
    Expretion getLeft();
    Expretion getRight();
}