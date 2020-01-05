package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.Foreign_key_clause;

public class Column_constraint_foreign_key extends Node {
    private Foreign_key_clause foreign_key_clause;

    public Column_constraint_foreign_key() {

    }

    @Override
    public String toString() {
        return "Column_constraint_foreign_key{" +
                "foreign_key_clause=" + foreign_key_clause +
                '}';
    }

    public Column_constraint_foreign_key(Foreign_key_clause foreign_key_clause) {
        this.foreign_key_clause = foreign_key_clause;
    }
}
