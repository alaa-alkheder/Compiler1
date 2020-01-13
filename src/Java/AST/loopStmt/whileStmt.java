package Java.AST.loopStmt;

import Java.AST.BodyStmt;

public class whileStmt extends LoopStmt {
    BodyStmt body = new BodyStmt();

    public void setBody(BodyStmt body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "whileStmt{" +
                "Condition=" + Condition.toString() + ", body=" + body.toString() +
                '}';
    }
}
