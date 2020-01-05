package Java.AST.QueryStmt.Expr;

public enum math_op {;

    private static final String mod = "%";
    private static final String mult = "*";
    private static final String divided = "/";
    private static final String plus = "+";
    private static final String minos = "-";
    private static final String modEQ = "%=";
    private static final String multEQ = "*=";
    private static final String dividedEQ = "/=";
    private static final String plusEQ = "+=";
    private static final String minosEQ = "-=";
    private static final String assign = "=";

    public static String getAssign() {
        return assign;
    }

    public static String getPlusplus() {
        return plusplus;
    }

    public static String getMinosminos() {
        return minosminos;
    }

    private static final String plusplus = "++";
    private static final String minosminos = "--";
    public static String getModEQ() {
        return modEQ;
    }

    public static String getMultEQ() {
        return multEQ;
    }

    public static String getDividedEQ() {
        return dividedEQ;
    }

    public static String getPlusEQ() {
        return plusEQ;
    }

    public static String getMinosEQ() {
        return minosEQ;
    }

    public static String getAddOne() {
        return AddOne;
    }

    public static String getMinosOne() {
        return MinosOne;
    }

    private static final String AddOne = "++";
    private static final String MinosOne = "--";
    public static String getMod() {
        return mod;
    }

    public static String getMult() {
        return mult;
    }

    public static String getDivided() {
        return divided;
    }

    public static String getPlus() {
        return plus;
    }

    public static String getMinos() {
        return minos;
    }
}
