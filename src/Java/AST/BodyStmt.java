package Java.AST;

import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class BodyStmt extends Node {
    List<Statement> body = new ArrayList<>();

    @Override
    public String toString() {
        return
                ((body.size() > 0) ? ("\nBodyStmt{" + "body=" + print() + '}') : "");

    }

    String print() {
        System.out.println("XXXX" + body.size());
        String s = "\n print Body \n";
        for (int i = 0; i < body.size(); i++) {
            s += "\n" + body.get(i);
        }
        return s;
    }

    public void setBody(Statement body) {
        this.body.add(body);
    }
}
