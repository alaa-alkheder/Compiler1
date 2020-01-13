// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#stat_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_forloop(SQLParser.Stat_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_st(SQLParser.Json_stContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_atmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_atmt(SQLParser.Json_atmtContext ctx);
	/**
     * Visit a parse tree produced by {@link SQLParser#higer_order_function_stmt_head}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHiger_order_function_stmt_head(SQLParser.Higer_order_function_stmt_headContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#higer_order_function_stmt}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHiger_order_function_stmt(SQLParser.Higer_order_function_stmtContext ctx);
	/**
     * Visit a parse tree produced by {@link SQLParser#x}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitX(SQLParser.XContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#arr_stmt}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArr_stmt(SQLParser.Arr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt(SQLParser.Var_stmtContext ctx);
	/**
     * Visit a parse tree produced by {@link SQLParser#var_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
    T visitVar_body(SQLParser.Var_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(SQLParser.Print_stmtContext ctx);
	/**
     * Visit a parse tree produced by {@link SQLParser#call_array}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall_array(SQLParser.Call_arrayContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#call_json}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall_json(SQLParser.Call_jsonContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#print_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint_body(SQLParser.Print_bodyContext ctx);

    /**
	 * Visit a parse tree produced by {@link SQLParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(SQLParser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(SQLParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_stmt(SQLParser.Function_call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#params_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_stmt(SQLParser.Params_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#arguments_body_defult_paremeter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArguments_body_defult_paremeter(SQLParser.Arguments_body_defult_paremeterContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#arguments_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArguments_body(SQLParser.Arguments_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arguments_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
     */
    T visitArguments_stmt(SQLParser.Arguments_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#loop_Bady}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoop_Bady(SQLParser.Loop_BadyContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#increment}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIncrement(SQLParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stmt(SQLParser.Do_while_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
     */
    T visitCondition_block(SQLParser.Condition_blockContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#if_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_body(SQLParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_else_if}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_else_if(SQLParser.If_else_ifContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(SQLParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt_short}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_stmt_short(SQLParser.If_stmt_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt_short_head}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_stmt_short_head(SQLParser.If_stmt_short_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt_short_body}.
     * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_short_body(SQLParser.If_stmt_short_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_stmt}.
     * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(SQLParser.Case_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturn_stmt(SQLParser.Return_stmtContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#array1}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArray1(SQLParser.Array1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#one_line_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_instruction(SQLParser.One_line_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#math_op0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_op0(SQLParser.Math_op0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#math_expr_Add_one}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMath_expr_Add_one(SQLParser.Math_expr_Add_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#math_expr_Add_one_increment}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMath_expr_Add_one_increment(SQLParser.Math_expr_Add_one_incrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#math_expr_Add_one_dencrement}.
     * @param ctx the parse tree
     * @return the visitor result
	 */
	T visitMath_expr_Add_one_dencrement(SQLParser.Math_expr_Add_one_dencrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#call_expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall_expr(SQLParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType_name(SQLParser.Type_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#type_name_value}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType_name_value(SQLParser.Type_name_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#array_json}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArray_json(SQLParser.Array_jsonContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#expr_condition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr_condition(SQLParser.Expr_conditionContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#math_expr_EQ}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMath_expr_EQ(SQLParser.Math_expr_EQContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#math_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMath_expr(SQLParser.Math_exprContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#math_expr_logic}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMath_expr_logic(SQLParser.Math_expr_logicContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(SQLParser.ExprContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#foreign_key_clause_value}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForeign_key_clause_value(SQLParser.Foreign_key_clause_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#select_core}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelect_core(SQLParser.Select_coreContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#group_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGroup_expr(SQLParser.Group_exprContext ctx);

    /**
     * Visit a parse tree produced by {@link SQLParser#values_selectCore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_selectCore(SQLParser.Values_selectCoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
}