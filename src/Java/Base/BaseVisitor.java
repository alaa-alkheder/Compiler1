package Java.Base;

import Java.AST.FunctionDeclaration;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.Var_define.*;
import generated.SQLBaseVisitor;
import generated.SQLParser;
import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SQLBaseVisitor {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();
        List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
        p.setSqlStmts(sqlStmts);//edit dql statment in the parse
        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitError(SQLParser.ErrorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        System.out.println("ctx.sql_stmt().size()"+ctx.sql_stmt().size());
        for (int i =0; i < ctx.sql_stmt().size() ; i++){
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }

        return sqlStmt;
//        return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt   ");
        Statement s = new Statement();

        if (ctx.function_stmt()!=null){

            FunctionDeclaration functionDeclaration=new FunctionDeclaration();
            functionDeclaration.setName(ctx.function_stmt().any_name().getText());
           if (ctx.function_stmt().arguments_stmt()!=null)
            for (int i = 0; i < ctx.function_stmt().arguments_stmt().any_name().size(); i++) {
                Arrgmint a=new Arrgmint();
                a.setName(ctx.function_stmt().arguments_stmt().any_name().get(i).getText());
        //        if (ctx.var_stmt().ASSIGN(0)!=null) {
        //            a.setValues(ctx.function_stmt().arguments_stmt().NUMERIC_LITERAL().get(i).getText());
        //        }
                functionDeclaration.addHead(a);
            }
             functionDeclaration.setName("function define");

            if (ctx.function_stmt().stat().get(0).var_stmt_withscol()!=null)
            {


                if (ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().ASSIGN(0)!=null)
                {
//                 System.out.println("!!!!!!!!@@@"+ctx.var_stmt().math_expr0());
                    if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().isEmpty()) {
                        varVariable  var_stmt =new varVariable();
                        var_stmt.determinVariable( ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().get(0).getText() );
                        var_stmt.setVarName(ctx. function_stmt().stat().get(0).var_stmt_withscol().var_stmt().any_name().get(0).getText());
                        var_stmt.setName("var Variable");
                       functionDeclaration.addBody(var_stmt);
                    }


//                 if (!ctx.var_stmt().arr_stmt().isEmpty()){
//                     System.out.println("HHHHHHHHH"+ctx.var_stmt().arr_stmt().get(0).any_name().getText());
//                     for (int i = 0; i < ctx.var_stmt().arr_stmt().size(); i++) {
//                         System.out.println("kkk"+ctx.var_stmt().arr_stmt().get(i).getText());
//
//                     }
//}

                jsonObj var_stmt=new jsonObj();
                  if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().isEmpty()) {
                      System.out.println("LLLLLLLL"+ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().size());
//                      functionDeclaration.addBody(ddd(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt()));
//                      functionDeclaration.addBody(defineJsonObj(ctx,0));
//                     var_stmt.setValue(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).getText());
//                     var_stmt.setType(varType.json.toString());
                      for (int i = 0; i < ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().size(); i++) {
                          System.out.println(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().size());
                          jsonValue jsonValue = new jsonValue();
                          //get the NUMERIC_LITERAL from json file
                          if (ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).NUMERIC_LITERAL()!=null) {
                              String jj = ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).NUMERIC_LITERAL().getText();

                              jsonValue.setaFloat(Float.parseFloat(jj));
                              jsonValue.setVarType(varType.numiric);
                              String name = ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).any_name().get(0).getText();
                              var_stmt.addjsonValue(name, jsonValue);

                          }functionDeclaration.addBody(var_stmt);
                          //get the String from the json
                          if (ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).IDENTIFIER()!=null) {
                              String jj = ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).IDENTIFIER().getText();
                               jsonValue.setString(jj);
                               System.out.println("++++"+jsonValue.getString());
                               jsonValue.setVarType(varType.String);
                              String name = ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().get(i).any_name().get(0).getText();
                              var_stmt.addjsonValue(name, jsonValue);
                          }

                      }
                 }
//


            }   }
            s=functionDeclaration;
}

   /*     if (ctx.function_stmt().stat().get(0).var_stmt_withscol()!=null)
        {


             if (ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().ASSIGN(0)!=null)
             {
//                 System.out.println("!!!!!!!!@@@"+ctx.var_stmt().math_expr0());
                 if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().isEmpty()) {
                     varVariable  var_stmt =new varVariable();
                        var_stmt.determinVariable( ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().get(0).getText() );
                     var_stmt.setVarName(ctx. function_stmt().stat().get(0).var_stmt_withscol().var_stmt().any_name().get(0).getText());
                     var_stmt.setName("var Variable");
                     s=var_stmt;
                 }


                 }
//                 if (!ctx.var_stmt().arr_stmt().isEmpty()){
//                     System.out.println("HHHHHHHHH"+ctx.var_stmt().arr_stmt().get(0).any_name().getText());
//                     for (int i = 0; i < ctx.var_stmt().arr_stmt().size(); i++) {
//                         System.out.println("kkk"+ctx.var_stmt().arr_stmt().get(i).getText());
//
//                     }
////}
//                 if (!ctx.var_stmt().json_atmt().isEmpty()) {
//                     var_stmt.setValue(ctx.var_stmt().json_atmt().get(0).getText());
//                     var_stmt.setType(varType.json.toString());
//
//                 }
//


        }*/
        if (ctx.drop_table_stmt()!=null){
            dropTable_Stmt dropTable_stmt =new dropTable_Stmt();
            dropTable_stmt.setFromItem(ctx.drop_table_stmt().table_name().any_name().IDENTIFIER().getText());
            s=dropTable_stmt;
        }

        if(ctx.delete_stmt()!=null)
        {
            System.out.println("::::::::");
//            s= (Statement) visitDelete_stmt(ctx.delete_stmt());
            s= visitFactored_delete_stmt(ctx.delete_stmt() );


        }

       if(ctx.factored_select_stmt() != null){
           s = visitFactored_select_stmt(ctx.factored_select_stmt());
       }

       return s;
//        return visitChildren(ctx);
    }
/*
private jsonObj ddd(List<SQLParser.Json_atmtContext > ctx){

    {

        jsonObj var_stmt=new jsonObj();
        for (int i = 0; i < 2; i++) {
            System.out.println("ddd"+i);
            jsonValue jsonValue=new jsonValue();
            //get the NUMERIC_LITERAL from json file
            if (!ctx.get(0).NUMERIC_LITERAL().isEmpty())
            {
                String jj=ctx.get(0).NUMERIC_LITERAL().get(i).getText();
//                            System.out.println("++++"+);
                jsonValue.setaFloat(Float.parseFloat(jj));
                jsonValue.setVarType(varType.numiric);
                String name=ctx.get(0).any_name().get(i).getText();
                var_stmt.addjsonValue(name,jsonValue);

            }
            //get the String from the json
            if (!ctx.get(0).IDENTIFIER().isEmpty())
            {
                String jj=ctx.get(0).IDENTIFIER().get(i).getText();
                jsonValue.setString(jj);
                jsonValue.setVarType(varType.String);
                String name=ctx.get(0).any_name().get(i).getText();
                var_stmt.addjsonValue(name,jsonValue);
            }

            if (!ctx.get(i).json_atmt().isEmpty()){
//                String xxxx=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).json_atmt().get(0).json_atmt().get(0).json_atmt()
//                System.out.println("ddddd"+);
                String asa=ctx.get(i).json_atmt().get(i).json_atmt().get(0).any_name().get(0).getText();
                jsonValue jsonValue1=new jsonValue();
//                jsonValue1.setVarJson(ddd(ctx.get(i).json_atmt().get(i).json_atmt().get(0)));
                jsonValue1.toString();
                var_stmt.addjsonValue(asa,jsonValue1);

            }

        } return var_stmt;
    }
}
    private jsonObj defineJsonObj(SQLParser.Sql_stmtContext ctx ,int j){
        jsonObj var_stmt=new jsonObj();
        for (int i = 0; i < ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().size(); i++) {

            jsonValue jsonValue=new jsonValue();
            //get the NUMERIC_LITERAL from json file
            if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).NUMERIC_LITERAL().isEmpty())
            {
                String jj=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).NUMERIC_LITERAL().get(0).getText();
//                            System.out.println("++++"+);
                jsonValue.setaFloat(Float.parseFloat(jj));
                jsonValue.setVarType(varType.numiric);
                String name=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).any_name().get(0).getText();
                var_stmt.addjsonValue(name,jsonValue);

            }
            //get the String from the json
            if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).IDENTIFIER().isEmpty())
            {
                String jj=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).IDENTIFIER().get(0).getText();
                jsonValue.setString(jj);
                jsonValue.setVarType(varType.String);
                String name=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).any_name().get(0).getText();
                var_stmt.addjsonValue(name,jsonValue);
        }

            if (!ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).json_atmt().isEmpty()){
//                String xxxx=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).json_atmt().get(0).json_atmt().get(0).json_atmt()

            }





    } return var_stmt;
    }
*/

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");

        return visitChildren(ctx); }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public SelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx)
    {
        System.out.println("visitFactored_select_stmt");

        SelectStmt select = new SelectStmt();
        select.setFromItem( visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
        select.where=   ctx.select_core().expr(0);
        select.setOrderByElements(ctx.ordering_term());
        select.setResult_column(ctx.select_core().result_column());

        select.setName("Select");
        return select;
//        return visitChildren(ctx);

    }
   public DeleteStmt visitFactored_delete_stmt(SQLParser.Delete_stmtContext ctx)
    {
//        System.out.println("visitFactored_deleteStmt   from "+ctx.K_FROM().getText());

      DeleteStmt deleteStmt=new DeleteStmt();
        deleteStmt.setFromItem( ctx.qualified_table_name().table_name().any_name().IDENTIFIER().toString());
        deleteStmt.setWhere(ctx.expr().getText());
        deleteStmt.setName("deleteStmt");
        return deleteStmt;
//        return visitChildren(ctx);

    }









    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitOrdering_term(SQLParser.Ordering_termContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitExpr(SQLParser.ExprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitResult_column(SQLParser.Result_columnContext ctx) { return visitChildren(ctx); }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {

        System.out.println("visitTable_or_subquery");
        String tableName = "";

        if(ctx.table_name() != null){
            tableName = ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();
        }
        return tableName;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_alias(SQLParser.Column_aliasContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_name(SQLParser.Column_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println(ctx.any_name().IDENTIFIER().getText());
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitDatabase_name(SQLParser.Database_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCollation_name(SQLParser.Collation_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitLiteral_value(SQLParser.Literal_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitAny_name(SQLParser.Any_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }
}
