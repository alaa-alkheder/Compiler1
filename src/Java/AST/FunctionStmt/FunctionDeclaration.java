package Java.AST.QueryStmt.FunctionStmt;

import Java.AST.QueryStmt.FunctionStmt.Arrgmint;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Statement {

    String FunctionName;
    List<Arrgmint> head=new ArrayList<>();
    ArrayList<Statement> body =new ArrayList<>();

    @Override
    public String toString() {

        return "FunctionDeclaration{" +

                "\n FunctionName =   '" + FunctionName + '\'' +
                "\tarrgmint=" + printArrgiment() +
                 "\nbody=\n" + printBody() + '\'' +
                "\n}end function name"+FunctionName;
    }

    private  String printArrgiment(){

        String x="";
    for (int i = 0; i < head.size(); i++) {
        x+="\n"+i+"-name is :"+head.get(i).getName() +" The Value is: "+head.get(i);
    }
        return  x;

}

    private  String printBody(){

        String x="";
        for (int i = 0; i < body.size(); i++) {
            x+="\n"+i+"-body name is :"+body.get(0).toString() ;
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

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }

    public void addBody(Statement body) {
        this.body.add( body);
    }

}
