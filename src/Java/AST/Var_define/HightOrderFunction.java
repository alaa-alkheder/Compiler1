package Java.AST.Var_define;

import Java.AST.BodyStmt;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class HightOrderFunction extends Statement {
    List<String> head = new ArrayList<>();
    List<String> argumint = new ArrayList<>();
    BodyStmt bodyStmt;

    String print() {

        String s = "\n print head \n";
        for (int i = 0; i < head.size(); i++) {
            s += head.get(i);
        }
        return s;
    }

    String name;

    @Override
    public String toString() {
        name = argumint.remove(0);
        return "HightOrderFunction{" +

                "String=" + name + "head=" + head +
                ", argumint=" + print() +
                ", bodyStmt=" + print1() +
                '}';
    }

    String print1() {

        String s = "\n print argumint \n";
        for (int i = 0; i < argumint.size(); i++) {
            s += "," + argumint.get(i);
        }
        return s;
    }

    public void AddHead(String head) {
        this.head.add(head);
    }

    public void AddArgumint(String argumint) {
        this.argumint.add(argumint);
    }

    public void setBodyStmt(BodyStmt bodyStmt) {
        this.bodyStmt = bodyStmt;
    }
}
