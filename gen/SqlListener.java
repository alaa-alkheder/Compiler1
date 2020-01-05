// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler/src\Sql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqlParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SqlParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SqlParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(SqlParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(SqlParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stat_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_with_return(SqlParser.Stat_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stat_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_with_return(SqlParser.Stat_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stat_forloop}.
	 * @param ctx the parse tree
	 */
	void enterStat_forloop(SqlParser.Stat_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stat_forloop}.
	 * @param ctx the parse tree
	 */
	void exitStat_forloop(SqlParser.Stat_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SqlParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SqlParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stat_withblock_forloop}.
	 * @param ctx the parse tree
	 */
	void enterStat_withblock_forloop(SqlParser.Stat_withblock_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stat_withblock_forloop}.
	 * @param ctx the parse tree
	 */
	void exitStat_withblock_forloop(SqlParser.Stat_withblock_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json_st}.
	 * @param ctx the parse tree
	 */
	void enterJson_st(SqlParser.Json_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json_st}.
	 * @param ctx the parse tree
	 */
	void exitJson_st(SqlParser.Json_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json_atmt}.
	 * @param ctx the parse tree
	 */
	void enterJson_atmt(SqlParser.Json_atmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json_atmt}.
	 * @param ctx the parse tree
	 */
	void exitJson_atmt(SqlParser.Json_atmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#higer_order_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHiger_order_function_stmt(SqlParser.Higer_order_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#higer_order_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHiger_order_function_stmt(SqlParser.Higer_order_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArr_stmt(SqlParser.Arr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArr_stmt(SqlParser.Arr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt(SqlParser.Var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt(SqlParser.Var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_stmt_withscol}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt_withscol(SqlParser.Var_stmt_withscolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_stmt_withscol}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt_withscol(SqlParser.Var_stmt_withscolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(SqlParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(SqlParser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SqlParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SqlParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stmt(SqlParser.Function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stmt(SqlParser.Function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stmt(SqlParser.Function_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stmt(SqlParser.Function_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#params_stmt}.
	 * @param ctx the parse tree
	 */
	void enterParams_stmt(SqlParser.Params_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#params_stmt}.
	 * @param ctx the parse tree
	 */
	void exitParams_stmt(SqlParser.Params_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arguments_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArguments_stmt(SqlParser.Arguments_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arguments_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArguments_stmt(SqlParser.Arguments_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SqlParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SqlParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stmt(SqlParser.Do_while_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stmt(SqlParser.Do_while_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(SqlParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(SqlParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#condition_block_forloop}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block_forloop(SqlParser.Condition_block_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#condition_block_forloop}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block_forloop(SqlParser.Condition_block_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt_forloop}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_forloop(SqlParser.If_stmt_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt_forloop}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_forloop(SqlParser.If_stmt_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt_short}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_short(SqlParser.If_stmt_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt_short}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_short(SqlParser.If_stmt_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt_short_for_return}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_short_for_return(SqlParser.If_stmt_short_for_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt_short_for_return}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_short_for_return(SqlParser.If_stmt_short_for_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt_short_forloop}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_short_forloop(SqlParser.If_stmt_short_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt_short_forloop}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_short_forloop(SqlParser.If_stmt_short_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#one_line_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_instruction(SqlParser.One_line_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#one_line_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_instruction(SqlParser.One_line_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void enterMath_op0(SqlParser.Math_op0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void exitMath_op0(SqlParser.Math_op0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_op1}.
	 * @param ctx the parse tree
	 */
	void enterMath_op1(SqlParser.Math_op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_op1}.
	 * @param ctx the parse tree
	 */
	void exitMath_op1(SqlParser.Math_op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_op2}.
	 * @param ctx the parse tree
	 */
	void enterMath_op2(SqlParser.Math_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_op2}.
	 * @param ctx the parse tree
	 */
	void exitMath_op2(SqlParser.Math_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_op3}.
	 * @param ctx the parse tree
	 */
	void enterMath_op3(SqlParser.Math_op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_op3}.
	 * @param ctx the parse tree
	 */
	void exitMath_op3(SqlParser.Math_op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_operator1}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator1(SqlParser.Logic_operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_operator1}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator1(SqlParser.Logic_operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_operator2}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator2(SqlParser.Logic_operator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_operator2}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator2(SqlParser.Logic_operator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr0}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr0(SqlParser.Math_expr0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr0}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr0(SqlParser.Math_expr0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr_all}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr_all(SqlParser.Math_expr_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr_all}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr_all(SqlParser.Math_expr_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr_plus}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr_plus(SqlParser.Math_expr_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr_plus}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr_plus(SqlParser.Math_expr_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr_plus_withoutbrackets}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr_plus_withoutbrackets(SqlParser.Math_expr_plus_withoutbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr_plus_withoutbrackets}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr_plus_withoutbrackets(SqlParser.Math_expr_plus_withoutbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr1}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr1(SqlParser.Math_expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr1}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr1(SqlParser.Math_expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr1_withbrackets}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr1_withbrackets(SqlParser.Math_expr1_withbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr1_withbrackets}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr1_withbrackets(SqlParser.Math_expr1_withbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr2}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr2(SqlParser.Math_expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr2}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr2(SqlParser.Math_expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr2_withbrackets}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr2_withbrackets(SqlParser.Math_expr2_withbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr2_withbrackets}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr2_withbrackets(SqlParser.Math_expr2_withbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr3}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr3(SqlParser.Math_expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr3}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr3(SqlParser.Math_expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr3_withbrackets}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr3_withbrackets(SqlParser.Math_expr3_withbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr3_withbrackets}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr3_withbrackets(SqlParser.Math_expr3_withbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#math_expr_without_digit}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr_without_digit(SqlParser.Math_expr_without_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#math_expr_without_digit}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr_without_digit(SqlParser.Math_expr_without_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_mathematic}.
	 * @param ctx the parse tree
	 */
	void enterResult_mathematic(SqlParser.Result_mathematicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_mathematic}.
	 * @param ctx the parse tree
	 */
	void exitResult_mathematic(SqlParser.Result_mathematicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_expr1}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr1(SqlParser.Logic_expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_expr1}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr1(SqlParser.Logic_expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_expr1_withbracets}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr1_withbracets(SqlParser.Logic_expr1_withbracetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_expr1_withbracets}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr1_withbracets(SqlParser.Logic_expr1_withbracetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_all}.
	 * @param ctx the parse tree
	 */
	void enterLogic_all(SqlParser.Logic_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_all}.
	 * @param ctx the parse tree
	 */
	void exitLogic_all(SqlParser.Logic_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_expr2}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr2(SqlParser.Logic_expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_expr2}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr2(SqlParser.Logic_expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_expr2_withbrackets}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr2_withbrackets(SqlParser.Logic_expr2_withbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_expr2_withbrackets}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr2_withbrackets(SqlParser.Logic_expr2_withbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logic_resault}.
	 * @param ctx the parse tree
	 */
	void enterLogic_resault(SqlParser.Logic_resaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logic_resault}.
	 * @param ctx the parse tree
	 */
	void exitLogic_resault(SqlParser.Logic_resaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assingment_rule_without_bracket}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_rule_without_bracket(SqlParser.Assingment_rule_without_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assingment_rule_without_bracket}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_rule_without_bracket(SqlParser.Assingment_rule_without_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assingment_rule_with_bracket}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_rule_with_bracket(SqlParser.Assingment_rule_with_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assingment_rule_with_bracket}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_rule_with_bracket(SqlParser.Assingment_rule_with_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assingment_rule_with_scol}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_rule_with_scol(SqlParser.Assingment_rule_with_scolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assingment_rule_with_scol}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_rule_with_scol(SqlParser.Assingment_rule_with_scolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assingment_rule_without_scol}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_rule_without_scol(SqlParser.Assingment_rule_without_scolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assingment_rule_without_scol}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_rule_without_scol(SqlParser.Assingment_rule_without_scolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqlParser.Any_nameContext ctx);
}