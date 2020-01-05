package Java.AST.QueryStmt.Var_define;

import java.util.ArrayList;

public class varArray extends Var_stmt {

    ArrayList<varVariable> arrayList=new ArrayList<>();

    public ArrayList<varVariable> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<varVariable> arrayList) {
        this.arrayList = arrayList;
    }
    public void addVariableList(  ArrayList<String> ss){

        for (int i = 0; i <arrayList.size() ; i++) {
            varVariable varVariable=new varVariable();
            varVariable.determinVariable(ss.get(i));
            arrayList.add(varVariable);

        }

    }
}
