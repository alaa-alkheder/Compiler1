package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Expr.numberDefine;
import Java.AST.Node;

public class TypeName extends Node {
    String name;
    String anyName1;
    String anyName2;
    boolean Star1 = false;
    boolean Star2 = false;
    numberDefine numberDefine1;
    numberDefine numberDefine2;

    public void setStar1(boolean star1) {
        Star1 = star1;
    }

    public void setStar2(boolean star2) {
        Star2 = star2;
    }

    @Override
    public String toString() {
        return "TypeName{" +
                "name='" + name + "\n'" +
                ((anyName1 != null) ? ("anyName1='" + anyName1) : "") + "\t\t" +
                ((Star1 != false) ? ("All coll='") : "") + '\t' +
                ((numberDefine1 != null) ? ("numberDefine1='" + numberDefine1.toString()) : "") + '\n' +
                ((anyName2 != null) ? ("anyName2='" + anyName2) : "") + "\t\t" +
                ((Star2 != false) ? ("All coll") : "") + '\t' +
                ((numberDefine2 != null) ? ("numberDefine2='" + numberDefine2.toString()) : "") + '\t' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnyName1(String anyName1) {
        this.anyName1 = anyName1;
    }

    public void setAnyName2(String anyName2) {
        this.anyName2 = anyName2;
    }

    public void setNumberDefine1(numberDefine numberDefine1) {
        this.numberDefine1 = numberDefine1;
    }

    public void setNumberDefine2(numberDefine numberDefine2) {
        this.numberDefine2 = numberDefine2;
    }
}
