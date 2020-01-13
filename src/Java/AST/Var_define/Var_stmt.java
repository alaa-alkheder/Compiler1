package Java.AST.Var_define;

import Java.AST.QueryStmt.Statement;

public   class  Var_stmt extends Statement {

String varName;
String type;

    @Override
    public String toString() {
        return "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }


}
