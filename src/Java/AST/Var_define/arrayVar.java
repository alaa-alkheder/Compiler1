package Java.AST.Var_define;

import Java.AST.Expr.Expretion;

import java.util.ArrayList;
import java.util.List;

public class arrayVar extends Var_stmt {
    List<Expretion> expretions = new ArrayList<>();
    String ArrayName;

    @Override
    public String toString() {
        return "arrayVar{" +

                ", ArrayName='" + ArrayName + '\'' +
                ((expretions.size() > 0) ? ("Exprestion{" + expretions.toString() + '}') : "") +
                '}';
    }


    String print() {
        String s = "\n";
        for (int i = 0; i < expretions.size(); i++) {
            s += expretions.toString();
        }

        return s;
    }

    public void AddExpretions(Expretion expretions) {
        this.expretions.add(expretions);
    }

    public void setArrayName(String arrayName) {
        ArrayName = arrayName;
    }
}
