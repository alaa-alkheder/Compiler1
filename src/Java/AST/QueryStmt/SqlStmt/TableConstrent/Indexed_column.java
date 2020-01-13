package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

public class Indexed_column extends Node {
    private String column_name;
    private String collation_name;
    private boolean K_ASC = false;
    private Boolean K_DESC = false;

    @Override
    public String toString() {
        return "Indexed_column{" +
                "column_name='" + column_name + '\'' +
                ", collation_name='" + collation_name + '\'' +
                ((K_ASC == true) ? ("K_ASC='" + K_ASC) : "") + '\t' +
                ((K_DESC == true) ? ("K_DESC='" + K_DESC) : "") + '\t' +

                '}';
    }


    public Indexed_column(String column_name, String collation_name, boolean k_ASC, Boolean k_DESC) {
        this.column_name = column_name;
        this.collation_name = collation_name;
        K_ASC = k_ASC;
        K_DESC = k_DESC;
    }
}
