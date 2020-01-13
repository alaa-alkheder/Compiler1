package Java.AST.Var_define;

import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class ListVar extends Statement {

    List<Statement> statements = new ArrayList<>();

    public void setStatements(Statement statements) {
        this.statements.add(statements);
    }
}
