package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Node;

public class Column_constraint_primary_key extends Node {
    private boolean K_ASC;
    private boolean K_DESC;
    private boolean K_AUTOINCREMENT;

    @Override
    public String toString() {
        return "Column_constraint_primary_key{" +
                "K_ASC=" + K_ASC +
                ", K_DESC=" + K_DESC +
                ", K_AUTOINCREMENT=" + K_AUTOINCREMENT +
                '}';
    }

    public void setK_ASC(boolean k_ASC) {
        K_ASC = k_ASC;
    }

    public void setK_DESC(boolean k_DESC) {
        K_DESC = k_DESC;
    }

    public void setK_AUTOINCREMENT(boolean k_AUTOINCREMENT) {
        K_AUTOINCREMENT = k_AUTOINCREMENT;
    }
}
/*
 * ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
 * */