package Java.AST.FunctionStmt;

import Java.AST.Expr.Expretion;

public class Arrgmint {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    String name;

    @Override
    public String toString() {
        return "Arrgmint{" +
                "name='" + name + '\'' +
                ((values!=null) ? ("values  ='" + values.toString() ): "the values is null")+ '\t' +
                        '}';
    }

    public void setValues(Expretion values) {
        this.values = values;
    }

    Expretion values;


}
