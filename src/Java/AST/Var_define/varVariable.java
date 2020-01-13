package Java.AST.Var_define;

import Java.AST.Expr.Expretion;

import java.util.ArrayList;

public class varVariable  extends Var_stmt{
    String string="";
    String object="";
    Boolean aBoolean=null;
      double aFloat =0.0;
    ArrayList arrayList;
    Expretion  Expretion;

    @Override
    public String toString() {
        return
                "varVariable{" +
                        "string='" + string + '\'' +
                " Expretion=" + Expretion.toString() ;
//                '}';
    }

    public void setaFloat(double aFloat) {
        this.aFloat = aFloat;
    }

    public Java.AST.Expr.Expretion getExpretion() {
        return Expretion;
    }

    public void setExpretion(Java.AST.Expr.Expretion expretion) {
        Expretion = expretion;
    }

    Java.AST.Var_define.varType varType;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public double getaFloat() {
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

    public Java.AST.Var_define.varType getVarType() {
        return varType;
    }

    public void determinVariable(String s){
        System.out.println("SSSSSSSSS"+s);
        char []temp = s.toCharArray();

        if (temp[0]=='"'){
            setString(s);
            setType(Java.AST.Var_define.varType.String.toString());
             return;
        }else {
            for (int i = 0; i < 10; i++) {
               int x= Integer.parseInt(String.valueOf(temp[0]));
//               System.out.println("`````"+x+"=="+i);
                if ((char)i==x){
                     setaFloat(Float.valueOf(s)) ;
                    setType(Java.AST.Var_define.varType.numiric.toString());
                      return;
                }
            }

        }
     setObject(s);
        setType(Java.AST.Var_define.varType.object.toString());

    }

    public void setVarType(Java.AST.Var_define.varType varType) {
        this.varType = varType;
    }
}
