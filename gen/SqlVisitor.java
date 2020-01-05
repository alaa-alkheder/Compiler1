// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler/src\Sql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SqlParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(SqlParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stat_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_with_return(SqlParser.Stat_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stat_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_forloop(SqlParser.Stat_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SqlParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stat_withblock_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_withblock_forloop(SqlParser.Stat_withblock_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_st(SqlParser.Json_stContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_atmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_atmt(SqlParser.Json_atmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#higer_order_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiger_order_function_stmt(SqlParser.Higer_order_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_stmt(SqlParser.Arr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt(SqlParser.Var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_stmt_withscol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt_withscol(SqlParser.Var_stmt_withscolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(SqlParser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SqlParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(SqlParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_stmt(SqlParser.Function_call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#params_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_stmt(SqlParser.Params_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arguments_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_stmt(SqlParser.Arguments_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(SqlParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#do_while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stmt(SqlParser.Do_while_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(SqlParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#condition_block_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block_forloop(SqlParser.Condition_block_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_forloop(SqlParser.If_stmt_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_short(SqlParser.If_stmt_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt_short_for_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_short_for_return(SqlParser.If_stmt_short_for_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt_short_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_short_forloop(SqlParser.If_stmt_short_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#one_line_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_instruction(SqlParser.One_line_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_op0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_op0(SqlParser.Math_op0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_op1(SqlParser.Math_op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_op2(SqlParser.Math_op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_op3(SqlParser.Math_op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_operator1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator1(SqlParser.Logic_operator1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_operator2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator2(SqlParser.Logic_operator2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr0(SqlParser.Math_expr0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr_all(SqlParser.Math_expr_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr_plus(SqlParser.Math_expr_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr_plus_withoutbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr_plus_withoutbrackets(SqlParser.Math_expr_plus_withoutbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr1(SqlParser.Math_expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr1_withbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr1_withbrackets(SqlParser.Math_expr1_withbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr2(SqlParser.Math_expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr2_withbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr2_withbrackets(SqlParser.Math_expr2_withbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr3(SqlParser.Math_expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr3_withbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr3_withbrackets(SqlParser.Math_expr3_withbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#math_expr_without_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr_without_digit(SqlParser.Math_expr_without_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_mathematic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_mathematic(SqlParser.Result_mathematicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr1(SqlParser.Logic_expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_expr1_withbracets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr1_withbracets(SqlParser.Logic_expr1_withbracetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_all(SqlParser.Logic_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr2(SqlParser.Logic_expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_expr2_withbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr2_withbrackets(SqlParser.Logic_expr2_withbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logic_resault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_resault(SqlParser.Logic_resaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assingment_rule_without_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_rule_without_bracket(SqlParser.Assingment_rule_without_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assingment_rule_with_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_rule_with_bracket(SqlParser.Assingment_rule_with_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assingment_rule_with_scol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_rule_with_scol(SqlParser.Assingment_rule_with_scolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assingment_rule_without_scol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_rule_without_scol(SqlParser.Assingment_rule_without_scolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
}