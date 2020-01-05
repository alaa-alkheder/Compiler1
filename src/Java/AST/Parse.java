package Java.AST;

import Java.AST.FunctionStmt.FunctionDeclaration;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    
    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    @Override
    public String toString(){
        for (int i = 0; i < getSqlStmts().size(); i++) {
            System.out.println( "-------sql stmts is  "+ getSqlStmts().get(i).toString());
        }
        return "";
    }
}
