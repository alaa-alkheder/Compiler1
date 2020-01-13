package Java.AST.loopStmt;

import Java.AST.BodyStmt;

public class doWhile extends LoopStmt {
    BodyStmt body = new BodyStmt();

    public void setBody(BodyStmt body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "doWhile{" +
                "Condition=" + Condition.toString() + ", body=" + body.toString() +
                '}';
    }
}
