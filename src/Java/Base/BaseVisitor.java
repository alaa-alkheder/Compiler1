package Java.Base;

import Java.AST.Expr.SQLexprConstrint.*;
import Java.AST.Expr.SQLexprConstrint.literal_value.*;
import Java.AST.FunctionStmt.FunctionDeclaration;
import Java.AST.FunctionStmt.callFunction;
import Java.AST.FunctionStmt.printStmt;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.Expr.*;
import Java.AST.FunctionStmt.Arrgmint;
import Java.AST.QueryStmt.SqlStmt.*;
import Java.AST.QueryStmt.SqlStmt.Column_constraint.*;
import Java.AST.QueryStmt.SqlStmt.SelectStmt;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.Foreign_key_clause;
import Java.AST.QueryStmt.SqlStmt.TableConstrent.Table_constraint;
import Java.AST.QueryStmt.SqlStmt.dropTable_Stmt;
import Java.AST.Var_define.*;
import Java.AST.conditionStmt.*;
import Java.AST.loopStmt.ForStmt;
import Java.AST.loopStmt.doWhile;
import Java.AST.loopStmt.whileStmt;
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
    @Override
    public Parse visitParse(SQLParser.ParseContext ctx) {
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
    @Override
    public Object visitError(SQLParser.ErrorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        System.out.println("ctx.sql_stmt().size()" + ctx.sql_stmt().size());
        for (int i = 0; i < ctx.sql_stmt().size(); i++) {
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
    @Override
    public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {
        System.out.println("visitSql_stmt   ");
        Statement s = new Statement();
        //function define
        if (ctx.function_stmt() != null) {
            FunctionDeclaration functionDeclaration = new FunctionDeclaration();
            functionDeclaration.setFunctionName(ctx.function_stmt().any_name().getText());
            //define the arrgument
            ArrgmintDefine(ctx.function_stmt().arguments_stmt(), functionDeclaration);
//            functionDeclaration.setName("function define");

            //if define
            if (ctx.function_stmt().stat_forloop().get(0).function_call_stmt() != null) {
                s = callFunctionDefine(ctx.function_stmt().stat_forloop().get(0).function_call_stmt());
                functionDeclaration.addBody(s);
            }
            //return
            if (ctx.function_stmt().stat_forloop().get(0).return_stmt() != null) {
                s = visitReturn_stmt(ctx.function_stmt().stat_forloop(0).return_stmt());
                functionDeclaration.addBody(s);
            }
            if (ctx.function_stmt().stat_forloop(0).if_stmt() != null) {
                s = ifDefine(ctx.function_stmt().stat_forloop(0).if_stmt());
                functionDeclaration.addBody(s);

            }
//            if (ctx.function_stmt().stat_forloop(0).return_stmt().if_stmt_short() != null) {
//                s = visitIf_stmt_short(ctx.function_stmt().stat_forloop(0).return_stmt().if_stmt_short().if_stmt_short());
//                functionDeclaration.addBody(s);
//            }
            if (ctx.function_stmt().stat_forloop(0).switch_stmt() != null) {
                s = visitSwitch_stmt(ctx.function_stmt().stat_forloop(0).switch_stmt());
                functionDeclaration.addBody(s);
            }
            if (ctx.function_stmt().stat_forloop(0).K_BREAK() != null) {
                s = new K_breck();
                functionDeclaration.addBody(s);
            }
            if (ctx.function_stmt().stat_forloop(0).K_CONTINUE() != null) {

            }   //while define
            if (ctx.function_stmt().stat_forloop(0).while_stmt() != null) {
                s = whileDefine(ctx.function_stmt().stat_forloop(0).while_stmt());
                functionDeclaration.addBody(s);
            }   //do while define
            if (ctx.function_stmt().stat_forloop(0).do_while_stmt() != null) {
                s = doWhileDefine(ctx.function_stmt().stat_forloop(0).do_while_stmt());
                functionDeclaration.addBody(s);
            }
            //for define
            if (ctx.function_stmt().stat_forloop(0).for_stmt() != null) {
                s = visitForStmt(ctx.function_stmt().stat_forloop(0).for_stmt());
                functionDeclaration.addBody(s);
            }
            if (ctx.function_stmt().stat_forloop(0).print_stmt() != null) {
                s = visitPrint_stmt(ctx.function_stmt().stat_forloop(0).print_stmt());
                functionDeclaration.addBody(s);
            }
//           // var define
            if (ctx.function_stmt().stat_forloop().get(0).var_stmt() != null) {

                if (ctx.function_stmt().stat_forloop().get(0).var_stmt().ASSIGN() != null) {

                    //var x=5;// var x=5+5; //var=expr
                    if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).math_expr() != null) {
                        varVariable var_stmt = new varVariable();
//                        var_stmt.determinVariable(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().get(0).getText());
                        var_stmt.setVarName(ctx.function_stmt().stat_forloop().get(0).var_stmt().any_name().get(0).getText());
                        Expretion expretion = mathExp1(ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).math_expr(), 1);
//                        Expretion expretion = logicExpr(ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).expr_condition());
                        var_stmt.setExpretion(expretion);
                        var_stmt.setName("var Variable");
                        functionDeclaration.addBody(var_stmt);
                    }

                    if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).expr_condition() != null) {
                        varVariable var_stmt = new varVariable();
//                        var_stmt.determinVariable(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().math_expr0().get(0).getText());
                        var_stmt.setVarName(ctx.function_stmt().stat_forloop().get(0).var_stmt().any_name().get(0).getText());
//                        Expretion expretion = mathExp1(ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).math_expr(), 1);
                        Expretion expretion = logicExpr(ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).expr_condition());
                        var_stmt.setExpretion(expretion);

                        var_stmt.setName("var condition");
                        functionDeclaration.addBody(var_stmt);
                    }


                    //define the array  // var x[]={1,1,1,1,5};
                    if (!ctx.function_stmt().stat_forloop().get(0).var_stmt().arr_stmt().isEmpty()) {
                        ArrayStmt arrayStmt = new ArrayStmt();
                        arrayStmt.setName(ctx.function_stmt().stat_forloop().get(0).var_stmt().arr_stmt().get(0).any_name().getText());
                        for (int i = 0; i < ctx.function_stmt().stat_forloop().get(0).var_stmt().arr_stmt().size(); i++) {
                            arrayStmt.AddList(ctx.function_stmt().stat_forloop().get(0).var_stmt().arr_stmt().get(i).getText());
                        }
                        functionDeclaration.addBody(arrayStmt);
                    }
                    //var varable =json object
                    if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt() != null) {
                        jsonObj var_stmt = new jsonObj();

//                        System.out.println("LLLLLLLL" + ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt().json_st().size());
//                      functionDeclaration.addBody(ddd(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt()));
//                      functionDeclaration.addBody(defineJsonObj(ctx,0));
//                     var_stmt.setValue(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).getText());
                        var_stmt.setType(varType.json.toString());
                        var_stmt.setVarName(ctx.function_stmt().stat_forloop().get(0).var_stmt().any_name().get(0).getText());
                        for (int i = 0; i < ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt().json_st().size(); i++) {
//                            System.out.println(ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(0).json_st().size());
                            jsonValue jsonValue = new jsonValue();
                            //get the NUMERIC_LITERAL from json file
                            if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt().json_st().get(i).NUMERIC_LITERAL() != null) {
                                String jj = ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt().json_st().get(0).NUMERIC_LITERAL().getText();

                                jsonValue.setaFloat(Float.parseFloat(jj));
                                jsonValue.setVarType(varType.numiric);
                                String name = ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).any_name().get(0).getText();
                                var_stmt.addjsonValue(name, jsonValue);
//                                functionDeclaration.addBody(var_stmt);
                            }

                            //get the String from the json
                            if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).IDENTIFIER() != null) {
                                String jj = ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).IDENTIFIER().getText();
                                jsonValue.setString(jj);
                                System.out.println("++++" + jsonValue.getString());
                                jsonValue.setVarType(varType.String);
                                String name = ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).any_name().get(0).getText();
                                var_stmt.addjsonValue(name, jsonValue);

                            }
                            //get the internal json object
                            if (ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body().get(0).json_atmt().json_st().get(i).json_atmt() != null) {
                                jsonValue nn = new jsonValue();
                                nn.setVarJson(ddd(ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).json_atmt()));
                                String name = ctx.function_stmt().stat_forloop().get(0).var_stmt().var_body(0).json_atmt().json_st().get(i).any_name().get(0).getText();
                                var_stmt.addjsonValue(name, nn);

                            }

                        }
                        functionDeclaration.addBody(var_stmt);
                    }
                }
            }
            s = functionDeclaration;
        }
        if (ctx.insert_stmt() != null) {
            s = insertDefine(ctx.insert_stmt());

        }
        if (ctx.create_table_stmt() != null)
            s = visitCreate_table_stmt(ctx.create_table_stmt());
        if (ctx.drop_table_stmt() != null) {
            dropTable_Stmt dropTable_stmt = new dropTable_Stmt();
            dropTable_stmt.setFromItem(ctx.drop_table_stmt().table_name().any_name().IDENTIFIER().getText());
            if (ctx.drop_table_stmt().K_IF() != null)
                dropTable_stmt.setIfExsest(true);
            if (ctx.drop_table_stmt().database_name() != null)
                dropTable_stmt.setDBname(ctx.drop_table_stmt().database_name().getText());
            s = dropTable_stmt;
        }
        //DELETE TABLE
        if (ctx.delete_stmt() != null) {
            System.out.println("::::::::");
            s = visitFactored_delete_stmt(ctx.delete_stmt());


        }
        if (ctx.update_stmt() != null)
            s = updateDefine(ctx.update_stmt());
        //SELECT STATMENT
        if (ctx.factored_select_stmt() != null) {
            s = visitFactored_select_stmt(ctx.factored_select_stmt());
        }

        return s;
//        return visitChildren(ctx);
    }


    @Override
    public column_def visitColumn_def(SQLParser.Column_defContext ctx) {
        System.out.println("++++++++++++");
        column_def column_def = new column_def();
        if (ctx.column_name() != null)
            column_def.setColumn_name(ctx.column_name().getText());

        if (ctx.type_name() != null)

            System.out.println("000000000" + ctx.type_name().get(0).type_name_name().getText());
        System.out.println("=====" + ctx.type_name().get(0).any_name(0).getText());
        for (int i = 0; i < ctx.type_name().size(); i++) {
            TypeName typeName = new TypeName();
            typeName.setName(ctx.type_name().get(i).type_name_name().getText());
            if (ctx.type_name().get(i).signed_number(0) != null) {

                if (ctx.type_name().get(i).signed_number(0).STAR() != null)
                    typeName.setStar1(true);
                else {
                    if (ctx.type_name().get(i).signed_number(0).MINUS() != null) {
                        numberDefine numberDefine = new numberDefine(ctx.type_name().get(i).signed_number(0).NUMERIC_LITERAL().getText());
                        numberDefine.setOp_signed_number('-');
                        typeName.setNumberDefine1(numberDefine);
                    } else if (ctx.type_name().get(i).signed_number(0).PLUS() != null) {
                        numberDefine numberDefine = new numberDefine(ctx.type_name().get(i).signed_number(0).NUMERIC_LITERAL().getText());
                        numberDefine.setOp_signed_number('+');
                        typeName.setNumberDefine1(numberDefine);
                    }
                }

                if (ctx.type_name().get(i).signed_number(1) != null) {
                    if (ctx.type_name().get(i).signed_number(1).STAR() != null)
                        typeName.setStar2(true);
                    else if (ctx.type_name().get(i).signed_number(1).MINUS() != null) {
                        numberDefine numberDefine = new numberDefine(ctx.type_name().get(i).signed_number(1).NUMERIC_LITERAL().getText());
                        numberDefine.setOp_signed_number('-');
                        typeName.setNumberDefine2(numberDefine);
                    } else if (ctx.type_name().get(i).signed_number(1).PLUS() != null) {
                        numberDefine numberDefine = new numberDefine(ctx.type_name().get(i).signed_number(1).NUMERIC_LITERAL().getText());
                        numberDefine.setOp_signed_number('+');
                        typeName.setNumberDefine2(numberDefine);
                    }
                }
                if (ctx.type_name().get(i).any_name(0) != null)
                    typeName.setAnyName1(ctx.type_name().get(i).any_name(0).getText());

                if (ctx.type_name().get(i).any_name(0) != null)
                    typeName.setAnyName2(ctx.type_name().get(i).any_name(1).getText());

            }


            column_def.AddArray(typeName);

        }
//            }


        return column_def;
    }


    @Override
    public Table_constraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        Table_constraint table_constraint = new Table_constraint();


        return table_constraint;
    }

    @Override
    public Statement visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        CreateTable createTable = new CreateTable();
        System.out.println("*******");
        if (ctx.K_NOT() != null)
            createTable.setK_IF_NOT_EXISTS(true);
        if (ctx.database_name() != null)
            createTable.setDatabase_name(ctx.database_name().getText());
        createTable.setTable_name(ctx.table_name().getText());
        if (ctx.K_AS() != null)
            createTable.setSelect(visitFactored_select_stmt(ctx.factored_select_stmt()));
        else {
            for (int i = 0; i < ctx.column_def().size(); i++) {
                createTable.AddColumn_def(visitColumn_def(ctx.column_def(i)));
//                System.out.println("LLL"+visitColumn_def(ctx.column_def(i)).toString());
            }


            for (int i = 0; i < ctx.table_constraint().size(); i++) {
                createTable.AddColumn_def(visitTable_constraint(ctx.table_constraint(i)));
            }


        }

        return createTable;
    }

    @Override
    public Foreign_key_clause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        Foreign_key_clause foreign_key_clause = new Foreign_key_clause();
        if (ctx.database_name() != null)
            foreign_key_clause.setDatabase_name(ctx.database_name().getText());

        if (ctx.foreign_table() != null)
            foreign_key_clause.setForeign_table(ctx.foreign_table().getText());

        if (ctx.K_NULL() != null)
            foreign_key_clause.setK_SET_NULL(true);

        if (ctx.K_DELETE() != null)
            foreign_key_clause.setK_ON_DELETE(true);

        if (ctx.K_UPDATE() != null)
            foreign_key_clause.setK_ON_UPDATE(true);

        if (ctx.K_DEFAULT() != null)
            foreign_key_clause.setK_SET_DEFAULT(true);

        if (ctx.K_CASCADE() != null)
            foreign_key_clause.setK_CASCADE(true);

        if (ctx.K_RESTRICT() != null)
            foreign_key_clause.setK_RESTRICT(true);

        if (ctx.K_ACTION() != null)
            foreign_key_clause.setK_NO_ACTION(true);

//        if (ctx.K_DEFERRABLE() != null)
//            foreign_key_clause.setDe
//
//        if (ctx. != null)
//            foreign_key_clause.set
//
//        if (ctx. != null)
//            foreign_key_clause.set
//
//        if (ctx. != null)
//            foreign_key_clause.set
//
//        if (ctx. != null)
//            foreign_key_clause.set
//
//        if (ctx. != null)
//            foreign_key_clause.set
//
//        if (ctx. != null)
//            foreign_key_clause.set


        return null;
    }

    @Override
    public Column_constraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        Column_constraint column_constraint = new Column_constraint();
        Column_constraint_primary_key CCPK = new Column_constraint_primary_key();
        Column_constraint_foreign_key CCFK = new Column_constraint_foreign_key();
        if (ctx.column_constraint_primary_key().K_ASC() != null)
            CCPK.setK_ASC(true);
        if (ctx.column_constraint_primary_key().K_DESC() != null)
            CCPK.setK_DESC(true);
        if (ctx.column_constraint_primary_key().K_AUTOINCREMENT() != null)
            CCPK.setK_AUTOINCREMENT(true);
        return column_constraint;
    }

    @Override
    public Statement visitFunction_stmt(SQLParser.Function_stmtContext ctx) {
        return null;
    }

    @Override
    public Statement visitSwitch_stmt(SQLParser.Switch_stmtContext ctx) {
        Switch_Stmt switch_stmt = new Switch_Stmt();
        if (ctx.math_expr_EQ() != null) {
            switch_stmt.setExpr(math_expr_EQ(ctx.math_expr_EQ()));
            for (int i = 0; i < ctx.math_expr().size(); i++) {
                Case_stmt case_stmt = new Case_stmt();
                case_stmt.setExpretion(mathExp1(ctx.math_expr(i), 1));
                switch_stmt.AddCase_stmts(case_stmt);
            }
        } else {
            switch_stmt.setExpr(mathExp1(ctx.math_expr(0), 1));
            for (int i = 1; i < ctx.math_expr().size(); i++) {
                Case_stmt case_stmt = new Case_stmt();
                case_stmt.setExpretion(mathExp1(ctx.math_expr(i), 1));
                switch_stmt.AddCase_stmts(case_stmt);
            }
        }


        return switch_stmt;

    }

    @Override
    public Statement visitIf_stmt_short(SQLParser.If_stmt_shortContext ctx) {
        ifSortStmt ifs = new ifSortStmt();
        if (ctx.expr_condition() != null)
            ifs.setCondition(logicExpr(ctx.expr_condition().expr_condition(0)));
        if (ctx.if_stmt_short_body(0) != null) {
            if (ctx.if_stmt_short_body(0).math_expr() != null) {
                ifs.setConditionTrue(mathExp1(ctx.if_stmt_short_body(0).math_expr(), 1));
            }
            if (ctx.if_stmt_short_body(0).expr_condition() != null) {
                ifs.setConditionTrue(logicExpr(ctx.if_stmt_short_body(0).expr_condition()));
            }
            if (ctx.if_stmt_short_body(0).if_stmt_short() != null) {
                ifs.setIfsTrue((ifSortStmt) visitIf_stmt_short(ctx.if_stmt_short_body(0).if_stmt_short()));
            }


        }
        if (ctx.if_stmt_short_body(1) != null) {
            System.out.println("KKKKK");
            if (ctx.if_stmt_short_body(1).math_expr() != null) {
                ifs.setConditionFalse(mathExp1(ctx.if_stmt_short_body(1).math_expr(), 1));
            }
            if (ctx.if_stmt_short_body(1).expr_condition() != null) {
                ifs.setConditionFalse(logicExpr(ctx.if_stmt_short_body(1).expr_condition()));
            }
            if (ctx.if_stmt_short_body(1).if_stmt_short() != null) {
                System.out.println("hhhh");
                ifs.setIfsFalse((ifSortStmt) visitIf_stmt_short(ctx.if_stmt_short_body(1).if_stmt_short()));
            }


        }

        return ifs;
    }

    private Statement updateDefine(SQLParser.Update_stmtContext ctu) {
        updateStmt updateStmt = new updateStmt();
        if (ctu.qualified_table_name().database_name() != null)
            updateStmt.setDbName(ctu.qualified_table_name().database_name().getText());
        updateStmt.setTableName(ctu.qualified_table_name().table_name().getText());
        if (ctu.qualified_table_name().index_name() != null)
            updateStmt.setIndex_by(ctu.qualified_table_name().index_name().getText());
        if (ctu.expr(ctu.column_name().size()) != null)
//            System.out.println("$$$$$$"+Expr(ctu.expr(ctu.column_name().size()).toString());
            updateStmt.setWhere(Expr(ctu.expr(ctu.column_name().size())));
        for (int i = 0; i < ctu.column_name().size(); i++) {
            updateStmt.AddColl(ctu.column_name().get(i).getText());
            updateStmt.AddExpretions(Expr(ctu.expr(i)));
        }


        return updateStmt;
    }

    private Statement insertDefine(SQLParser.Insert_stmtContext cti) {
        insertStmt insertStmt = new insertStmt();
        if (cti.database_name() != null)
            insertStmt.setDatabase_name(cti.database_name().getText());
        insertStmt.setTable_name(cti.table_name().getText());
        if (cti.column_name() != null) {
            for (int i = 0; i < cti.column_name().size(); i++) {
                insertStmt.AddColumn_name(cti.column_name().get(i).getText());
            }
        }
        if (cti.factored_select_stmt() != null) {
            insertStmt.setSelect(visitFactored_select_stmt(cti.factored_select_stmt()));

            return insertStmt;
        }
        if (cti.K_DEFAULT() != null) {
            insertStmt.setDEFAULT_VALUES(true);
            return insertStmt;
        }

        for (int i = 0; i < cti.expr().size(); i++) {

            insertStmt.AddExpr(Expr(cti.expr(i)));
        }
        return insertStmt;
    }


    private Statement callFunctionDefine(SQLParser.Function_call_stmtContext ctc) {

        callFunction callFunction = new callFunction();
        callFunction.setFinctionName(ctc.any_name().getText());

        if (ctc.params_stmt() != null) {
            for (int i = 0; i < ctc.params_stmt().size(); i++) {
                Expretion expretion = null;
                if (ctc.params_stmt(i).K_NULL() != null) {
                    expretion = new objName("null");
                }
                if (ctc.params_stmt(i).math_expr() != null) {
                    expretion = mathExp1(ctc.params_stmt(i).math_expr(), 1);
                }
                if (ctc.params_stmt(i).expr_condition() != null) {
                    expretion = logicExpr(ctc.params_stmt(i).expr_condition());
                }
                callFunction.setParameter(expretion);
            }
        }

        return callFunction;
    }

    private Statement whileDefine(SQLParser.While_stmtContext ctw) {

        Expretion expretion = logicExpr(ctw.expr_condition().expr_condition(0));
        whileStmt whileStmt = new whileStmt();
        whileStmt.setCondition(expretion);
        if (ctw.loop_Bady() != null) {
            //add body
        }

        return null;
    }

    private Statement doWhileDefine(SQLParser.Do_while_stmtContext ctw) {
        Expretion expretion = logicExpr(ctw.expr_condition().expr_condition(0));
        doWhile whileStmt = new doWhile();
        whileStmt.setCondition(expretion);
        if (ctw.stat_forloop() != null) {
            //add body
        }
        return null;
    }

    private Statement ifDefine(SQLParser.If_stmtContext cti) {
        ifStmt stmt = new ifStmt();
        Expretion e = logicExpr(cti.condition_block().expr_condition());
        stmt.setCondition(e);
        if (cti.if_body() != null) {
            //add body
            System.out.println("body");
        }
        if (cti.if_else_if() != null) {
            System.out.println("else if");
            Statement s = ifDefine(cti.if_else_if().if_stmt());
            stmt.setElseif((ifStmt) s);
        }
        if (cti.if_else() != null) {
            //add else
            System.out.println("else");
        }

        return stmt;
    }

    private Arrgmint ArrgmintDefine(SQLParser.Arguments_stmtContext cta, FunctionDeclaration fun) {
        if (cta != null) {
            for (int i = 0; i < cta.arguments_body().any_name().size(); i++) {
                Arrgmint a = new Arrgmint();
                a.setName(cta.arguments_body().any_name().get(i).getText());
                fun.addHead(a);
            }
            for (int i = 0; i < cta.arguments_body().arguments_body_defult_paremeter().size(); i++) {
                Arrgmint a = new Arrgmint();
                a.setName(cta.arguments_body().arguments_body_defult_paremeter(i).any_name().getText());
                if (cta.arguments_body().arguments_body_defult_paremeter(i).K_NULL() != null)
                    a.setValues(new objName("NULL"));
                else
                    a.setValues(mathExp1(cta.arguments_body().arguments_body_defult_paremeter(i).math_expr(), 1));
                fun.addHead(a);
            }
        }
        return null;
    }

    //Define For Stmt
    private Statement visitForStmt(SQLParser.For_stmtContext ctf) {
        ForStmt forStmt = new ForStmt();
        varVariable varVariable = new varVariable();
        Expretion e;
        System.out.println(ctf.math_expr_EQ());
        if (ctf.K_VAR() != null) {
            forStmt.setNewVar(true);
            System.out.println("cfcfcfcfcf" + ctf.any_name().getText());
            varVariable.setString(ctf.any_name().getText());
            e = mathExp1(ctf.math_expr(), 1);
            varVariable.setExpretion(e);
            forStmt.setVarVariable(varVariable);
        } else if (ctf.math_expr_EQ() != null) {
            forStmt.setNewVar(false);
            e = math_expr_EQ(ctf.math_expr_EQ());
            System.out.println(e.toString());
            varVariable.setExpretion(e);
            varVariable.setString(ctf.math_expr_EQ().any_name().getText());
            forStmt.setVarVariable(varVariable);
        }
        if (ctf.expr_condition() != null) {
            Expretion cond = logicExpr(ctf.expr_condition());
            forStmt.setCondition(cond);
        }
        if (ctf.increment() != null) {
            System.out.println("ssssssssssss");
            forStmt.setIncrement(math_expr_EQ(ctf.increment().math_expr_EQ()));
        }


        return forStmt;
    }


    @Override
    public Statement visitPrint_stmt(SQLParser.Print_stmtContext ctx) {
        printStmt printStmt = new printStmt();
        for (int i = 0; i < ctx.print_body().size(); i++) {
            if (ctx.print_body(i).math_expr() != null) {
                printStmt.setExpretion(mathExp1(ctx.print_body(i).math_expr(), 1));
            }

            if (ctx.print_body(i).expr_condition() != null) {
                printStmt.setExpretion(logicExpr(ctx.print_body(i).expr_condition()));
            }
            if (ctx.print_body(i).if_stmt_short() != null) {
                printStmt.setIfSortStmt((ifSortStmt) visitIf_stmt_short(ctx.print_body(i).if_stmt_short()));
            }
            if (ctx.print_body(i).call_array() != null) {
                arrayCallStmt arrayCallStmt = new arrayCallStmt();
                arrayCallStmt.setExpretion(mathExp1(ctx.print_body(i).call_array().math_expr(), 1));
                arrayCallStmt.setName(ctx.print_body(i).call_array().any_name().getText());
                printStmt.setExpretion(arrayCallStmt);

            }
            if (ctx.print_body(i).call_json() != null) {

                jsonCallStmt jsonCallStmt = new jsonCallStmt();
                for (int j = 0; j < ctx.print_body(i).call_json().any_name().size(); j++) {

                    jsonCallStmt.AddArray(ctx.print_body(i).call_json().any_name().get(j).getText());

                }
                printStmt.setExpretion(jsonCallStmt);
            }
         /*   if (ctx.print_body(i).any_name() != null) {
//                System.out.println("#@#@#@#@" + expr.any_name().getText());
                if (ctx.print_body(i).any_name().size() < 2) {
                    if (ctx.print_body(i).OPEN_BRACKETS() == null) {
                        arrayCallStmt arrayCallStmt = new arrayCallStmt();
                        arrayCallStmt.setExpretion(mathExp1(ctx.print_body(i).math_expr(), 1));
                        arrayCallStmt.setName(ctx.print_body(i).any_name().get(0).getText());
                        printStmt.setExpretion(arrayCallStmt);
                    } else {
                        objName obj = new objName(ctx.print_body(i).any_name().get(0).getText());
                        printStmt.setExpretion(obj);
                    }
                } else {
                    jsonCallStmt jsonCallStmt = new jsonCallStmt();
                    for (int j = 0; j < ctx.print_body(i).any_name().size(); j++) {

                        jsonCallStmt.AddArray(ctx.print_body(i).any_name().get(j).getText());
                    }
                    printStmt.setExpretion(jsonCallStmt);
                }
            }*/


        }


        return printStmt;
    }

    private Expretion Expr(SQLParser.ExprContext expr) {
        logic logic = new logic();
        math exprMath = new math();
        int x = 1;

        if (expr.PLUS() != null) {

            exprMath.setOp(math_op.getPlus());
            x = 2;
        }
        if (expr.MINUS() != null) {

            x = 2;
            exprMath.setOp(math_op.getMinos());

        }
        if (expr.STAR() != null) {

//            System.out.println(expr.expr().get(0).getText() + "*" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMult());
            x = 2;
        }
        if (expr.DIV() != null) {

//            System.out.println(expr.expr().get(0).getText() + "/" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getDivided());
            x = 2;
        }
        if (expr.MOD() != null) {

//            System.out.println(expr.expr().get(0).getText() + "%" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMod());
            x = 2;
        }
        if (x == 2) {
            if (expr.expr().size() != 1) {
                if (expr.expr().get(1).OPEN_PAR() != null && expr.expr(1).factored_select_stmt() == null) {
                    exprMath.setRight(Expr(expr.expr().get(1).expr(0)));
                } else {
                    exprMath.setRight(Expr(expr.expr().get(1)));
                }
                if (expr.expr().get(0).OPEN_PAR() != null && expr.expr(0).factored_select_stmt() == null) {
                    exprMath.setLeft(Expr(expr.expr().get(0).expr(0)));
                } else {
                    exprMath.setLeft(Expr(expr.expr().get(0)));
                }
                return exprMath;
            }
        }

        if (expr.GT() != null) {
            logic.setOp(logic_op.getGT());
            x = 3;

        }
        if (expr.GT2() != null) {
            logic.setOp(logic_op.getGT2());
            x = 3;
        }
        if (expr.GT_EQ() != null) {

            logic.setOp(logic_op.getGtEq());
            x = 3;
        }
        if (expr.LT() != null) {
            logic.setOp(logic_op.getLT());
            x = 3;
        }
        if (expr.LT2() != null) {
            logic.setOp(logic_op.getLT2());
            x = 3;
        }
        if (expr.LT_EQ() != null) {
            logic.setOp(logic_op.getLtEq());
            x = 3;
        }
        if (expr.EQ() != null) {
            //   ==
            logic.setOp(logic_op.getEQ());
            //logic logic
            x = 3;
        }
        if (expr.ASSIGN() != null) {
            //   ==
            logic.setOp(logic_op.getAssgin());
            //logic logic
            x = 3;
        }
        //math   math
//      //logic logic
        if (expr.NOT_EQ1() != null) {
            //  !=
            logic.setOp(logic_op.getNotEq());
            //logic logic
            x = 3;
        }
        if (expr.NOT_EQ2() != null) {
            //math <> math
            logic.setOp(logic_op.getNotEq2());

            //logic  logic
            x = 3;
        }
        if (expr.AMP() != null) {
            // &
            logic.setOp(logic_op.getAMP());
            //logic logic
            x = 3;

        }
        if (expr.K_AND() != null) {
            logic.setOp(logic_op.getK_and());
            //logic logic
            x = 3;
        }
        if (expr.PIPE() != null) {
            logic.setOp(logic_op.getPIPE());
            //logic logic
            x = 3;
        }
        if (expr.PIPE2() != null) {
            logic.setOp(logic_op.getPIPE2());
            x = 3;
        }
        if (expr.K_OR() != null) {
            logic.setOp(logic_op.getK_or());
            x = 3;
        }

        Expretion ex = new sqlExprtion();
        if (expr.K_GLOB() != null) {
            x = 4;
            ex = new K_GLOB();
        }
        if (expr.K_REGEXP() != null) {
            x = 4;
            ex = new K_REGEXP();
        }
        if (expr.K_MATCH() != null) {
            ex = new K_MATCH();
            x = 4;
        }
        if (expr.K_IN() != null) {
            x = 4;
            ex = new K_IN();
        }
        if (expr.K_IS() != null) {
            x = 4;
            ex = new K_IS(false);
            if (expr.K_NOT() != null) {
                ex = new K_IS(true);
            }

        }
        if (expr.K_LIKE() != null) {
            x = 4;
            ex = new K_LIKE();

        }

        if (x == 4) {
            if (!expr.isEmpty()) {
                if (expr.expr().get(1).OPEN_PAR() != null && expr.expr(1).factored_select_stmt() == null) {
                    ex.setRight(Expr(expr.expr().get(1).expr(0)));
                } else {
                    ex.setRight(Expr(expr.expr().get(1)));
                }
                if (expr.expr().get(0).OPEN_PAR() != null && expr.expr(0).factored_select_stmt() == null) {
                    ex.setLeft(Expr(expr.expr().get(0).expr(0)));
                } else {
                    ex.setLeft(Expr(expr.expr().get(0)));
                }
                return ex;
            }

        }

        if (x == 3) {
            if (!expr.isEmpty()) {
                if (expr.expr().get(1).OPEN_PAR() != null && expr.expr(1).factored_select_stmt() == null) {
                    logic.setRight(Expr(expr.expr().get(1).expr(0)));
                } else {
                    logic.setRight(Expr(expr.expr().get(1)));
                }
                if (expr.expr().get(0).OPEN_PAR() != null && expr.expr(0).factored_select_stmt() == null) {
                    logic.setLeft(Expr(expr.expr().get(0).expr(0)));
                } else {
                    logic.setLeft(Expr(expr.expr().get(0)));
                }
                return logic;
            }

        }
        // specfic word

        if (expr.literal_value() != null) {
            if (expr.literal_value().K_CURRENT_DATE() != null)
                return new K_CURRENT_DATE();
            if (expr.literal_value().K_CURRENT_TIME() != null)
                return new K_CURRENT_TIME();
            if (expr.literal_value().K_CURRENT_TIMESTAMP() != null)
                return new K_CURRENT_TIMESTAMP();
            if (expr.literal_value().BLOB_LITERAL() != null)
                return new BLOB_LITERAL();
            if (expr.literal_value().K_NULL() != null)
                return new K_NULL();
            if (expr.literal_value().NUMERIC_LITERAL() != null)
                return new numberDefine(expr.literal_value().NUMERIC_LITERAL().getText());
        }
        if (expr.function_name() != null) {

            functionExprSql functionExprSql = new functionExprSql();
            functionExprSql.setName(expr.function_name().getText());
            if (expr.K_DISTINCT() != null) {
                functionExprSql.setDistict(true);
            }
            if (expr.STAR() != null) {
                functionExprSql.setStar(true);
            }
            for (int i = 0; i < expr.expr().size(); i++) {
                functionExprSql.setExpr(Expr(expr.expr(i)));
            }
            return functionExprSql;

        }
        if (expr.column_name() != null) {
            DB_TableColl db_tableColl = new DB_TableColl();
            db_tableColl.setCollName(expr.column_name().getText());
            if (expr.table_name() != null)
                db_tableColl.setTableName(expr.table_name().getText());
            if (expr.database_name() != null)
                db_tableColl.setDBname(expr.database_name().getText());
            return db_tableColl;
        }
        if (expr.factored_select_stmt() != null) {
            selectExpr selectExpr = new selectExpr();
            selectExpr.setSelectStmt(visitFactored_select_stmt(expr.factored_select_stmt()));
            if (expr.K_EXISTS() != null)
                selectExpr.setK_EXISTS(true);
            if (expr.K_NOT() != null)
                selectExpr.setK_NOT(true);
            return selectExpr;

        }


//
        return null;
    }


    //define logic expr
    private Expretion logicExpr(SQLParser.Expr_conditionContext expr) {
        logic logic = new logic();
//        System.out.println(expr.getText());
//        if (expr.math_expr_logic().size() == 0)
//        if (expr.expr_condition()==null)
//        {
//            System.out.println("true");
//            return null;
//        }
//            if (expr.math_expr_logic() != null) {
//                return math_expr_logic(expr.math_expr_logic().get(0));
//            }

        if (expr.GT() != null) {
            logic.setOp(logic_op.getGT());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));

        }
        if (expr.GT2() != null) {
            logic.setOp(logic_op.getGT2());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));
        }
        if (expr.GT_EQ() != null) {
            logic.setOp(logic_op.getGtEq());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));
        }
        if (expr.LT() != null) {
            logic.setOp(logic_op.getLT());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));
        }
        if (expr.LT2() != null) {
            logic.setOp(logic_op.getLT2());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));
        }
        if (expr.LT_EQ() != null) {
            logic.setOp(logic_op.getLtEq());
            logic.setRight(math_expr_logic(expr.math_expr_logic(1)));
            logic.setLeft(math_expr_logic(expr.math_expr_logic(0)));
        }
        if (expr.EQ() != null) {
            //   ==
            logic.setOp(logic_op.getEQ());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
            //math   math
            if (!expr.math_expr_logic().isEmpty()) {
                if (expr.math_expr_logic().get(1).OPEN_PAR() != null) {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1).math_expr_logic(0)));
                } else {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1)));
                }
                if (expr.math_expr_logic().get(0).OPEN_PAR() != null) {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0).math_expr_logic(0)));
                } else {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0)));
                }
                return logic;
            }
        }
        if (expr.NOT_EQ1() != null) {
            //  !=
            logic.setOp(logic_op.getNotEq());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
            //math   math
            if (!expr.math_expr_logic().isEmpty()) {
                if (expr.math_expr_logic().get(1).OPEN_PAR() != null) {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1).math_expr_logic(0)));
                } else {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1)));
                }
                if (expr.math_expr_logic().get(0).OPEN_PAR() != null) {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0).math_expr_logic(0)));
                } else {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0)));
                }
                return logic;
            }

            if (expr.math_expr_logic() != null) {
                if (expr.math_expr_logic().get(1).OPEN_PAR() != null) {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1).math_expr_logic(0)));
                } else {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1)));
                }
                if (expr.math_expr_logic().get(0).OPEN_PAR() != null) {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0).math_expr_logic(0)));
                } else {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0)));
                }
            }
        }
        if (expr.NOT_EQ2() != null) {
            //math <> math
            logic.setOp(logic_op.getNotEq2());

            //logic  logic
            if (!expr.expr_condition().isEmpty()) {
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
            //math   math
            if (!expr.math_expr_logic().isEmpty()) {
                if (expr.math_expr_logic().get(1).OPEN_PAR() != null) {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1).math_expr_logic(0)));
                } else {
                    logic.setLeft(math_expr_logic(expr.math_expr_logic().get(1)));
                }
                if (expr.math_expr_logic().get(0).OPEN_PAR() != null) {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0).math_expr_logic(0)));
                } else {
                    logic.setRight(math_expr_logic(expr.math_expr_logic().get(0)));
                }
                return logic;
            }
        }
        if (expr.AMP() != null) {
            // &
            logic.setOp(logic_op.getAMP());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }

        }
        if (expr.K_AND() != null) {
            logic.setOp(logic_op.getK_and());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
        }
        if (expr.PIPE() != null) {
            logic.setOp(logic_op.getPIPE());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
        }
//        if (expr.PIPE2()  !=null){
//            logic.setOp(logic_op.getPIPE2() );
//        }
        if (expr.K_OR() != null) {
            logic.setOp(logic_op.getK_or());
            //logic logic
            if (!expr.expr_condition().isEmpty()) {
                System.out.println("555555555");
                if (expr.expr_condition().get(1).OPEN_PAR() != null) {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
                } else {
                    logic.setLeft(logicExpr(expr.expr_condition().get(1)));
                }
                if (expr.expr_condition().get(0).OPEN_PAR() != null) {
                    logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
                } else {
                    logic.setRight(logicExpr(expr.expr_condition().get(0)));
                }
                return logic;
            }
        }
        if (expr.K_TRUE() != null)
            return new K_true();
        if (expr.K_FALSE() != null)
            return new K_false();
        if (expr.any_name() != null) {
//                System.out.println("#@#@#@#@" + expr.any_name().getText());

            return new objName(expr.any_name().getText());
        }
        if (expr.call_array() != null) {
            arrayCallStmt arrayCallStmt = new arrayCallStmt();
            arrayCallStmt.setExpretion(mathExp1(expr.call_array().math_expr(), 1));
            arrayCallStmt.setName(expr.call_array().any_name().getText());
            return (arrayCallStmt);

        }
        if (expr.call_json() != null) {

            jsonCallStmt jsonCallStmt = new jsonCallStmt();
            for (int j = 0; j < expr.call_json().any_name().size(); j++) {

                jsonCallStmt.AddArray(expr.call_json().any_name().get(j).getText());

            }
            return jsonCallStmt;
        }

//            if (expr.expr_condition().get(1).OPEN_PAR() != null) {
//                logic.setLeft(logicExpr(expr.expr_condition().get(1).expr_condition(0)));
//            } else {
//                logic.setLeft(logicExpr(expr.expr_condition().get(1)));
//            }
//            if (expr.expr_condition().get(0).OPEN_PAR() != null) {
//                logic.setRight(logicExpr(expr.expr_condition().get(0).expr_condition(0)));
//            } else {
//                logic.setRight(logicExpr(expr.expr_condition().get(0)));
//            }


        return logic;
    }

    private Expretion math_expr_EQ(SQLParser.Math_expr_EQContext expr) {

        math exprMath = new math();
        if (expr.math_expr_Add_one() != null) {
            System.out.println("Add one");
            if (expr.math_expr_Add_one().math_expr_Add_one_increment() != null) {
                System.out.println("Add math_expr_Add_one_increment");
                increment incr = new increment();
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name() != null)
                    incr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name().getText()));
                else
                    incr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().math_expr_logic()));

                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().PLUSPLUS() != null) {
                    incr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().MINUSMINUS() != null) {
                    incr.setMathop(math_op.getMinosminos());
                }
                return incr;
            }
            if (expr.math_expr_Add_one().math_expr_Add_one_dencrement() != null) {
                System.out.println("Add math_expr_Add_one_dencrement");
                decrement decr = new decrement();
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name() != null)
                    decr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name().getText()));
                else
                    decr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().math_expr_logic()));

                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().PLUSPLUS() != null) {
                    decr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().MINUSMINUS() != null) {
                    decr.setMathop(math_op.getMinosminos());
                }
                return decr;
            }


        }

        if (expr.STAREQ() != null) {
            exprMath.setOp(math_op.getMultEQ());
        }
        if (expr.PLUSEQ() != null) {
            exprMath.setOp(math_op.getPlusEQ());
        }
        if (expr.MODEQ() != null) {
            exprMath.setOp(math_op.getModEQ());
        }
        if (expr.MINUSEQ() != null) {
            exprMath.setOp(math_op.getMultEQ());
        }
        if (expr.DIVEQ() != null) {
            exprMath.setOp(math_op.getDividedEQ());
        }

        if (expr.ASSIGN() != null) {
            exprMath.setOp(math_op.getAssign());
        }

        exprMath.setRight(mathExp1(expr.math_expr(), 1));
        exprMath.setLeft(new objName(expr.any_name().getText()));
        return exprMath;
    }

    //define math expr
    private Expretion mathExp1(SQLParser.Math_exprContext expr, int i) {
        math exprMath = new math();
//        System.out.println("%%%" + expr.math_expr().size());
        if (expr.math_expr().size() == 0) {
            if (expr.NUMERIC_LITERAL() != null) {
//                System.out.println("#" + i + "#" + expr.NUMERIC_LITERAL().getText());
                numberDefine numberDefine = new numberDefine(expr.NUMERIC_LITERAL().getText());
                return numberDefine;
            }
            if (expr.any_name() != null) {
//                System.out.println("#@#@#@#@" + expr.any_name().getText());

                return new objName(expr.any_name().getText());
            }
            if (expr.call_array() != null) {
                arrayCallStmt arrayCallStmt = new arrayCallStmt();
                arrayCallStmt.setExpretion(mathExp1(expr.call_array().math_expr(), 1));
                arrayCallStmt.setName(expr.call_array().any_name().getText());
                return (arrayCallStmt);

            }
            if (expr.call_json() != null) {

                jsonCallStmt jsonCallStmt = new jsonCallStmt();
                for (int j = 0; j < expr.call_json().any_name().size(); j++) {
                    jsonCallStmt.AddArray(expr.call_json().any_name().get(j).getText());

                }
                return jsonCallStmt;
            }


        }
        if (expr.math_expr_Add_one() != null) {
//            System.out.println("Add one");
            if (expr.math_expr_Add_one().math_expr_Add_one_increment() != null) {
//                System.out.println("Add math_expr_Add_one_increment");
                increment incr = new increment();
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name() != null) {
                    incr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name().getText()));
                } else {
                    incr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().math_expr_logic()));
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().PLUSPLUS() != null) {
                    incr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().MINUSMINUS() != null) {
                    incr.setMathop(math_op.getMinosminos());
                }
                return incr;
            }
            if (expr.math_expr_Add_one().math_expr_Add_one_dencrement() != null) {
//                System.out.println("Add math_expr_Add_one_dencrement");
                decrement decr = new decrement();
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name() != null)
                    decr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name().getText()));
                else
                    decr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().math_expr_logic()));

                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().PLUSPLUS() != null) {
                    decr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().MINUSMINUS() != null) {
                    decr.setMathop(math_op.getMinosminos());
                }
                return decr;
            }


        }
        if (expr.PLUS() != null) {
//            System.out.println(expr.expr().get(0).getText() + "^^^^" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getPlus());
//            System.out.println(expr.expr().get(1).getText());
//            System.out.println( x1.toString()+" TOTO "+x2.toString());


        }
        if (expr.MINUS() != null) {
//            System.out.println(expr.expr().get(0).getText() + "-" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMinos());
        }
        if (expr.STAR() != null) {
//            System.out.println(expr.expr().get(0).getText() + "*" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMult());

        }
        if (expr.DIV() != null) {
//            System.out.println(expr.expr().get(0).getText() + "/" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getDivided());
        }
        if (expr.MOD() != null) {
//            System.out.println(expr.expr().get(0).getText() + "%" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMod());
        }
        System.out.println();
        if (expr.math_expr().size() != 1)
            if (expr.math_expr().get(1).OPEN_PAR() != null) {
                exprMath.setLeft(mathExp1(expr.math_expr().get(1).math_expr(0), i++));
            } else {
                exprMath.setLeft(mathExp1(expr.math_expr().get(1), i++));
            }
        else return mathExp1(expr.math_expr().get(0), i++);

        if (expr.math_expr().get(0).OPEN_PAR() != null) {
            exprMath.setRight(mathExp1(expr.math_expr().get(0).math_expr(0), i++));
        } else {
            exprMath.setRight(mathExp1(expr.math_expr().get(0), i++));
//            exprMath=mathExp1(expr.math_expr().get(0), i++));
        }

        return exprMath;
    }

    @Override
    public Statement visitReturn_stmt(SQLParser.Return_stmtContext ctx) {
        K_retuern k_retuern = new K_retuern();
        if (ctx.if_stmt_short() != null)
            k_retuern.setIfSortStmt((ifSortStmt) visitIf_stmt_short(ctx.if_stmt_short()));
        if (ctx.math_expr() != null)
            k_retuern.setExpretion(mathExp1(ctx.math_expr(), 1));
        if (ctx.expr_condition() != null)
            k_retuern.setExpretion(logicExpr(ctx.expr_condition()));
        if (ctx.K_NULL() != null)
            k_retuern.setExpretion(new K_NULL());

        return k_retuern;
    }

    private Expretion math_expr_logic(SQLParser.Math_expr_logicContext expr) {

        math exprMath = new math();

        if (expr.math_expr_Add_one() != null) {
            System.out.println("Add one");
            if (expr.math_expr_Add_one().math_expr_Add_one_increment() != null) {
                System.out.println("Add math_expr_Add_one_increment");
                increment incr = new increment();
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name() != null)
                    incr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().any_name().getText()));
                else
                    incr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_increment().identifier().math_expr_logic()));

                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().PLUSPLUS() != null) {
                    incr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_increment().math_op0().MINUSMINUS() != null) {
                    incr.setMathop(math_op.getMinosminos());
                }
                return incr;
            }
            if (expr.math_expr_Add_one().math_expr_Add_one_dencrement() != null) {
                System.out.println("Add math_expr_Add_one_dencrement");
                decrement decr = new decrement();
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name() != null)
                    decr.setExpretion(new objName(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().any_name().getText()));
                else
                    decr.setExpretion(math_expr_logic(expr.math_expr_Add_one().math_expr_Add_one_dencrement().identifier().math_expr_logic()));

                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().PLUSPLUS() != null) {
                    decr.setMathop(math_op.getPlusplus());
                }
                if (expr.math_expr_Add_one().math_expr_Add_one_dencrement().math_op0().MINUSMINUS() != null) {
                    decr.setMathop(math_op.getMinosminos());
                }
                return decr;
            }


        }
        if (expr.math_expr_logic().size() == 0) {
            if (expr.NUMERIC_LITERAL() != null) {
                System.out.println("#" + "#" + expr.NUMERIC_LITERAL().getText());
                numberDefine numberDefine = new numberDefine(expr.NUMERIC_LITERAL().getText());
                return numberDefine;
            }

            if (expr.any_name() != null) {
//                System.out.println("#@#@#@#@" + expr.any_name().getText());

                return new objName(expr.any_name().getText());
            }
            if (expr.call_array() != null) {
                arrayCallStmt arrayCallStmt = new arrayCallStmt();
                arrayCallStmt.setExpretion(mathExp1(expr.call_array().math_expr(), 1));
                arrayCallStmt.setName(expr.call_array().any_name().getText());
                return (arrayCallStmt);

            }
            if (expr.call_json() != null) {

                jsonCallStmt jsonCallStmt = new jsonCallStmt();
                for (int j = 0; j < expr.call_json().any_name().size(); j++) {

                    jsonCallStmt.AddArray(expr.call_json().any_name().get(j).getText());

                }
                return jsonCallStmt;
            }
        }
        if (expr.STAREQ() != null) {
            exprMath.setOp(math_op.getMultEQ());
        }
        if (expr.PLUSEQ() != null) {
            exprMath.setOp(math_op.getPlusEQ());
        }
        if (expr.MODEQ() != null) {
            exprMath.setOp(math_op.getModEQ());
        }
        if (expr.MINUSEQ() != null) {
            exprMath.setOp(math_op.getMultEQ());
        }
        if (expr.DIVEQ() != null) {
            exprMath.setOp(math_op.getDividedEQ());
        }


        if (expr.PLUS() != null) {
//            System.out.println(expr.expr().get(0).getText() + "^^^^" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getPlus());
//            System.out.println(expr.expr().get(1).getText());
//            System.out.println( x1.toString()+" TOTO "+x2.toString());


        }
        if (expr.MINUS() != null) {
//            System.out.println(expr.expr().get(0).getText() + "-" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMinos());
        }
        if (expr.STAR() != null) {
//            System.out.println(expr.expr().get(0).getText() + "*" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMult());

        }
        if (expr.DIV() != null) {
//            System.out.println(expr.expr().get(0).getText() + "/" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getDivided());
        }
        if (expr.MOD() != null) {
//            System.out.println(expr.expr().get(0).getText() + "%" + expr.expr().get(1).getText());
            exprMath.setOp(math_op.getMod());
        }

        if (expr.math_expr_logic().get(0).OPEN_PAR() != null) {
            exprMath.setRight(math_expr_logic(expr.math_expr_logic().get(0).math_expr_logic(0)));
        } else {
            exprMath.setRight(math_expr_logic(expr.math_expr_logic().get(0)));
        }
        if (expr.math_expr_logic().size() != 1)
            if (expr.math_expr_logic().get(1).OPEN_PAR() != null) {
                exprMath.setLeft(math_expr_logic(expr.math_expr_logic().get(1).math_expr_logic(0)));
            } else {
                exprMath.setLeft(math_expr_logic(expr.math_expr_logic().get(1)));
            }
        return exprMath;
    }

    private jsonObj ddd(SQLParser.Json_atmtContext ctx) {

        {

            jsonObj var_stmt = new jsonObj();
            for (int i = 0; i < ctx.json_st().size(); i++) {
//                System.out.println("ddd" + i);
                jsonValue jsonValue = new jsonValue();
                //get the NUMERIC_LITERAL from json file
                if (ctx.json_st().get(i).NUMERIC_LITERAL() != null) {
                    String jj = ctx.json_st().get(i).NUMERIC_LITERAL().getText();
//                    System.out.println("++++" + jj);
//                    var_stmt.setVarName("AAAAAAAAAAAAAAAAAAAAAAAAA");

                    jsonValue.setaFloat(Float.parseFloat(jj));
                    jsonValue.setVarType(varType.numiric);
                    String name = ctx.json_st().get(i).any_name().get(0).getText();
                    var_stmt.addjsonValue(name, jsonValue);

                }
                //get the String from the json
                if (ctx.json_st().get(i).IDENTIFIER() != null) {
                    String jj = ctx.json_st().get(i).IDENTIFIER().getText();
                    jsonValue.setString(jj);
                    jsonValue.setVarType(varType.String);
                    String name = ctx.json_st().get(i).any_name().get(0).getText();
                    var_stmt.addjsonValue(name, jsonValue);
                }

                if (ctx.json_st().get(i).json_atmt() != null) {
//                String xxxx=ctx.function_stmt().stat().get(0).var_stmt_withscol().var_stmt().json_atmt().get(i).json_atmt().get(0).json_atmt().get(0).json_atmt()
//                System.out.println("ddddd"+);
//                    String asa = ctx.get(i).json_st().get(i).json_atmt().json_st().get(0).any_name().get(0).getText();
                    jsonValue jsonValue1 = new jsonValue();
                    jsonValue1.setVarJson(ddd(ctx.json_st().get(i).json_atmt()));
//                    jsonValue1.toString();
                    String name = ctx.json_st().get(i).any_name().get(0).getText();
                    System.out.println("name is " + name);
                    var_stmt.addjsonValue(name, jsonValue1);

                }  /* */

            }
            return var_stmt;
        }
    }
/* //don't use
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
    @Override
    public Object visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public SelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        System.out.println("visitFactored_select_stmt");
        SelectStmt select = new SelectStmt();
        select.setFromItem(visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
//        select.where = ctx.select_core().expr(0);
//        select.setOrderByElements(ctx.ordering_term());
        select.setResult_column(ctx.select_core().result_column());
        select.setName("Select");
        return select;
//        return visitChildren(ctx);

    }

    public DeleteStmt visitFactored_delete_stmt(SQLParser.Delete_stmtContext ctx) {
        DeleteStmt deleteStmt = new DeleteStmt();
        deleteStmt.setFromItem(ctx.qualified_table_name().table_name().any_name().IDENTIFIER().toString());
        if (ctx.expr() != null)
            deleteStmt.setWhere(Expr(ctx.expr()));
        System.out.println(Expr(ctx.expr()).toString());
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
    @Override
    public Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
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
    @Override
    public Object visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitExpr(SQLParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitResult_column(SQLParser.Result_columnContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {

        System.out.println("visitTable_or_subquery");
        String tableName = "";

        if (ctx.table_name() != null) {
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
    @Override
    public Object visitColumn_alias(SQLParser.Column_aliasContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitColumn_name(SQLParser.Column_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println(ctx.any_name().IDENTIFIER().getText());
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitDatabase_name(SQLParser.Database_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitCollation_name(SQLParser.Collation_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitAny_name(SQLParser.Any_nameContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitKeyword(SQLParser.KeywordContext ctx) {
        return visitChildren(ctx);
    }
}