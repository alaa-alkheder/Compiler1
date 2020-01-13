package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

public class foreign_key_clause_value extends Node {

    private boolean K_ON_DELETE;
    private boolean K_ON_UPDATE;
    private boolean K_SET_NULL;
    boolean K_MATCH_Name;
    private boolean K_SET_DEFAULT;
    boolean K_NO_ACTION;
    private boolean K_CASCADE;
    private boolean K_RESTRICT;
    private String K_MATCH_name;

    @Override
    public String toString() {
        return "foreign_key_clause_value{" + "" +
                ((K_ON_DELETE == true) ? ("K_ON_DELETE='" + K_ON_DELETE) : "") + '\t' +
                ((K_ON_UPDATE == true) ? ("K_ON_UPDATE='" + K_ON_UPDATE) : "") + '\t' +
                ((K_SET_NULL == true) ? ("K_SET_NULL='" + K_SET_NULL) : "") + '\t' +
                ((K_SET_DEFAULT == true) ? ("K_SET_DEFAULT='" + K_SET_DEFAULT) : "") + '\t' +
                ((K_CASCADE == true) ? ("K_CASCADE='" + K_CASCADE) : "") + '\t' +
                ((K_RESTRICT == true) ? ("K_RESTRICT='" + K_RESTRICT) : "") + '\t' +
                ((K_NO_ACTION == true) ? ("K_NO_ACTION='" + K_NO_ACTION) : "") +
                ((K_MATCH_Name == true) ? ("K_MATCH_Name='" + K_MATCH_name) : "") + '\t' +
                "}";
    }

    public void setK_MATCH_name(String k_MATCH_name) {
        K_MATCH_name = k_MATCH_name;
    }

    public void setK_ON_DELETE(boolean k_ON_DELETE) {
        K_ON_DELETE = k_ON_DELETE;
    }

    public void setK_ON_UPDATE(boolean k_ON_UPDATE) {
        K_ON_UPDATE = k_ON_UPDATE;
    }

    public void setK_SET_NULL(boolean k_SET_NULL) {
        K_SET_NULL = k_SET_NULL;
    }

    public void setK_SET_DEFAULT(boolean k_SET_DEFAULT) {
        K_SET_DEFAULT = k_SET_DEFAULT;
    }

    public void setK_CASCADE(boolean k_CASCADE) {
        K_CASCADE = k_CASCADE;
    }

    public void setK_RESTRICT(boolean k_RESTRICT) {
        K_RESTRICT = k_RESTRICT;
    }

    public void setK_NO_ACTION(boolean k_NO_ACTION) {
        K_NO_ACTION = k_NO_ACTION;
    }

    public void setK_MATCH_Name(boolean k_MATCH_Name) {
        K_MATCH_Name = k_MATCH_Name;
    }

}


