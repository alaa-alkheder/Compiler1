package Java.AST.FunctionStmt;

import Java.AST.BodyStmt;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Statement {

    String FunctionName;
    List<Arrgmint> head=new ArrayList<>();
    BodyStmt body = new BodyStmt();

    @Override
    public String toString() {

        return "FunctionDeclaration{" +

                "\n FunctionName =   '" + FunctionName + '\'' +
                "\tarrgmint=" + printArrgiment() +
                " body=" + body.toString() +
                "\n}end function name"+FunctionName;
    }

    private  String printArrgiment(){

        String x="";
    for (int i = 0; i < head.size(); i++) {
        x+="\n"+i+"-name is :"+head.get(i).getName() +" The Value is: "+head.get(i);
    }
        return  x;

}


    public List<Arrgmint> getHead() {
        return head;
    }

    public void setHead(List<Arrgmint> head) {
        this.head = head;
    }

    public void addHead(Arrgmint head) {
        this.head.add(head);
    }

    public String getFunctionName() {
        return FunctionName;
    }

    public void setFunctionName(String name) {
        this.FunctionName = name;
    }

    public void setBody(BodyStmt body) {
        this.body = body;
    }
}
