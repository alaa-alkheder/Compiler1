package Java.AST.Var_define;

import java.util.HashMap;
import java.util.Map;

public class jsonObj extends Var_stmt {

    Map<String, jsonValue> map = new HashMap<>();

    public void addjsonValue(String name, jsonValue value) {
        map.put(name, value);
    }

    public Map<String, jsonValue> getMap() {
        return map;
    }

    public void setMap(Map<String, jsonValue> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "" +((varName!=null) ? (" varName='" + varName ): "")+ '\t' +
                ((type!=null) ? (", type='" + type ): "")+ '\t' +
                printmap() ;
    }

    public    String printmap() {
        String temp = "";
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, jsonValue> entry : map.entrySet())
            temp += "Key = " + entry.getKey() +
                    ", Value = " + entry.getValue().toString();
        return temp;
    }

    public jsonValue getjsonValue(String mame) {
        return map.get(mame);
    }


}
