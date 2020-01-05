package Java.AST.QueryStmt.Expr;

public enum logic_op {;
    private static final String GT = ">";
    private static final String GT2 = ">>";
    private static final String GT_EQ = ">=";
    private static final String LT = "<";
    private static final String LT2 = "<<";
    private static final String LT_EQ = "<=";
     private static final String EQ = "==";
    private static final String NOT_EQ = "!=";
    private static final String NOT_EQ2 = "<>";
    private static final String PIPE = "|";
    private static final String PIPE2 = "||";
    private static final String AMP = "&";
    private static final String K_and = "and";
    private static final String K_or = "or";

    public static String getGT() {
        return GT;
    }

    public static String getGT2() {
        return GT2;
    }

    public static String getGtEq() {
        return GT_EQ;
    }

    public static String getLT() {
        return LT;
    }

    public static String getLT2() {
        return LT2;
    }

    public static String getLtEq() {
        return LT_EQ;
    }

    public static String getEQ() {
        return EQ;
    }

    public static String getNotEq() {
        return NOT_EQ;
    }

    public static String getNotEq2() {
        return NOT_EQ2;
    }

    public static String getPIPE() {
        return PIPE;
    }

    public static String getPIPE2() {
        return PIPE2;
    }

    public static String getAMP() {
        return AMP;
    }

    public static String getK_and() {
        return K_and;
    }

    public static String getK_or() {
        return K_or;
    }
}
