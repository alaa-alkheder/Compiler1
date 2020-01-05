package Java.AST.QueryStmt.Var_define;

import Java.AST.QueryStmt.Statement;

import javax.json.JsonValue;
import java.util.ArrayList;
import java.util.List;

public class ArrayStmt extends Var_stmt {
    List<jsonValue> list = new ArrayList<>();

    public List<jsonValue> getList() {
        return list;
    }

    public void setList(List<jsonValue> list) {
        this.list = list;
    }

    public void AddList(String x) {
        jsonValue temp = new jsonValue();
        temp.determinVariable(x);
        this.list.add(temp);
    }

    private String printArray() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).toString();
        }
        return "";
    }

    @Override
    public String toString() {
        return "ArrayStmt{" +
                "list=" + list +
                ", varName='" + varName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
