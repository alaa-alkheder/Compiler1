package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

//the to string not complet
public class Foreign_key_clause extends Node {

    boolean NOT_INITIALLY;
    boolean NOT_DEFERRABLE;
    boolean NOT_DEFERRED;
    boolean NOT_ENABLE;
    boolean NOT;

    public void setNOT(boolean NOT) {
        this.NOT = NOT;
    }

    boolean NOT_IMMEDIATE;
    private String database_name;
    private String foreign_table;
    private List<String> fk_target_column_name = new ArrayList<>();


    public void setForeign_key_clause_values(foreign_key_clause_value foreign_key_clause_values) {
        this.foreign_key_clause_values.add(foreign_key_clause_values);
    }

    public void setNOT_INITIALLY(boolean NOT_INITIALLY) {
        this.NOT_INITIALLY = NOT_INITIALLY;
    }

    public void setNOT_DEFERRABLE(boolean NOT_DEFERRABLE) {
        this.NOT_DEFERRABLE = NOT_DEFERRABLE;
    }

    public void setNOT_DEFERRED(boolean NOT_DEFERRED) {
        this.NOT_DEFERRED = NOT_DEFERRED;
    }

    public void setNOT_ENABLE(boolean NOT_ENABLE) {
        this.NOT_ENABLE = NOT_ENABLE;
    }

    public void setNOT_IMMEDIATE(boolean NOT_IMMEDIATE) {
        this.NOT_IMMEDIATE = NOT_IMMEDIATE;
    }

    private List<foreign_key_clause_value> foreign_key_clause_values = new ArrayList<>();



    // (  ? K ( K | K K )? K? )?


    public Foreign_key_clause(String foreign_table) {

        this.foreign_table = foreign_table;
    }


    public Foreign_key_clause() {

    }

    @Override
    public String toString() {
        String s = "\nTable_constraint_unique    " +
                ((database_name != null) ? ("database_name='" + database_name) : "") + '\t' + foreign_table + '\t' +
                +'\t' +

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


    public void AddFk_target_column_name(String fk_target_column_name) {
        this.fk_target_column_name.add(fk_target_column_name);
    }



}
