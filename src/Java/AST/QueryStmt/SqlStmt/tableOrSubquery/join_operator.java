package Java.AST.QueryStmt.SqlStmt.tableOrSubquery;

public class join_operator {
    boolean K_LEFT;
    boolean K_OUTER;
    boolean K_INNER;

    @Override
    public String toString() {
        return "join_operator{" +
                ((K_LEFT != false) ? ("K_LEFT") : "") +
                ((K_OUTER != false) ? ("K_OUTER") : "") +
                ((K_INNER != false) ? ("K_INNER") : "") +
                '}';
    }

    public void setK_LEFT(boolean k_LEFT) {
        K_LEFT = k_LEFT;
    }

    public void setK_OUTER(boolean k_OUTER) {
        K_OUTER = k_OUTER;
    }

    public void setK_INNER(boolean k_INNER) {
        K_INNER = k_INNER;
    }
}
