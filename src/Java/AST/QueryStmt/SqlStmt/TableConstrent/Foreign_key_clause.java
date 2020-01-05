package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Foreign_key_clause extends Node {
    private String database_name;
    private String foreign_table;
    private String K_MATCH_name;
    private List<String> fk_target_column_name = new ArrayList<>();
    private boolean K_ON_DELETE;
    private boolean K_ON_UPDATE;
    private boolean K_SET_NULL;
    private boolean K_SET_DEFAULT;
    private boolean K_CASCADE;
    private boolean K_RESTRICT;

    boolean NOT_INITIALLY;
    boolean NOT_DEFERRABLE;
    boolean NOT_DEFERRED;
    boolean NOT_ENABLE;
    boolean NOT_IMMEDIATE;


    // (  ? K ( K | K K )? K? )?
    boolean K_NO_ACTION;

    public Foreign_key_clause(String foreign_table) {

        this.foreign_table = foreign_table;
    }

    boolean K_MATCH_Name;

    public Foreign_key_clause() {

    }

    @Override
    public String toString() {
        String s = "\nTable_constraint_unique    " +
                ((database_name != null) ? ("database_name='" + database_name) : "") + '\t' + foreign_table + '\t' +
                ((K_ON_DELETE == true) ? ("K_ON_DELETE='" + K_ON_DELETE) : "") + '\t' +
                ((K_ON_UPDATE == true) ? ("K_ON_UPDATE='" + K_ON_UPDATE) : "") + '\t' +
                ((K_SET_NULL == true) ? ("K_SET_NULL='" + K_SET_NULL) : "") + '\t' +
                ((K_SET_DEFAULT == true) ? ("K_SET_DEFAULT='" + K_SET_DEFAULT) : "") + '\t' +
                ((K_CASCADE == true) ? ("K_CASCADE='" + K_CASCADE) : "") + '\t' +
                ((K_RESTRICT == true) ? ("K_RESTRICT='" + K_RESTRICT) : "") + '\t' +
                ((K_NO_ACTION == true) ? ("K_NO_ACTION='" + K_NO_ACTION) : "") + '\t' +
                ((K_MATCH_Name == true) ? ("K_MATCH_Name='" + K_MATCH_name) : "") + '\t' +
                "{";
        for (int i = 0; i < fk_target_column_name.size(); i++) {
            s += "i: " + i + fk_target_column_name.get(i) + "\n";
        }
        return s + '}';
    }


    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public void setForeign_table(String foreign_table) {
        this.foreign_table = foreign_table;
    }

    public void setK_MATCH_name(String k_MATCH_name) {
        K_MATCH_name = k_MATCH_name;
    }

    public void AddFk_target_column_name(String fk_target_column_name) {
        this.fk_target_column_name.add(fk_target_column_name);
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
