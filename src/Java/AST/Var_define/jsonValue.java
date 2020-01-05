package Java.AST.QueryStmt.Var_define;

import java.util.ArrayList;

public class jsonValue {
    @Override
    public String toString() {

        String d= "jsonValue{" +
                ((string!=null) ? ("string='" + string ): "")+ '\t' +
                ((aFloat!=null) ? ("Float='" + aFloat ): "")+ '\t' ;

       if(varJson != null)
           d+="\n" + varJson.toString();
        return d+'}'+"\n";
    }

    String string = null;
    Boolean aBoolean = null;
    Java.AST.QueryStmt.Var_define.jsonObj varJson = null;
    Float aFloat = null;
    ArrayList arrayList;
    Java.AST.QueryStmt.Var_define.varType varType;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Java.AST.QueryStmt.Var_define.jsonObj getVarJson() {
        return varJson;
    }

    public void setVarJson(Java.AST.QueryStmt.Var_define.jsonObj varJson) {
        this.varJson = varJson;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public Java.AST.QueryStmt.Var_define.varType getVarType() {
        return varType;
    }

    public void setVarType(Java.AST.QueryStmt.Var_define.varType varType) {
        this.varType = varType;
    }


    public void determinVariable(String s) {
//        System.out.println("SSSSSSSSS" + s);
        char[] temp = s.toCharArray();

        if (temp[0] == '"') {
            setString(s);
//            setType(varType.String.toString());
            return;
        } else {
            for (int i = 0; i < 10; i++) {
                int x = Integer.parseInt(String.valueOf(temp[0]));
//               System.out.println("`````"+x+"=="+i);
                if ((char) i == x) {
                    setaFloat(Float.valueOf(s));
//                    setType(varType.numiric.toString());
                    return;
                }
            }

        }
//        setObject(s);
//        setType(varType.object.toString());

    }


}
