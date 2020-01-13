package Java.AST.QueryStmt.SqlStmt.Column_constraint;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class column_def extends Node {
    String column_name;
    /*
     * column_constraint
     * type_name
     * */
    List<Node> array = new ArrayList<>();

    @Override
    public String toString() {
        return "column_def{" +
                "column_name='" + column_name +
                ((array.size() > 0) ? ("array is ='" + print()) : "") +
                '}';
    }

    private String print() {
        String s = "\n";
        for (int i = 0; i < array.size(); i++) {
            s += "\n i=" + i + array.get(i).toString();
        }
        return s;

    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public void AddArray(Node array) {
        this.array.add(array);
    }


}
