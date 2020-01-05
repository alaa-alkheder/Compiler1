package Java.AST.QueryStmt.SqlStmt.TableConstrent;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Table_constraint_foreign_key extends Node {
    private List<String> fk_origin_column_name = new ArrayList<>();
    private Foreign_key_clause foreign_key_clause = new Foreign_key_clause();

}
