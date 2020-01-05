// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler/src\Sql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OPEN_BRACKETS=13, CLOSE_BRACKETS=14, OPEN_BLOCK=15, 
		CLOSE_BLOCK=16, SCOL=17, DOT=18, OPEN_PAR=19, CLOSE_PAR=20, COMMA=21, 
		ASSIGN=22, STAR=23, PLUS=24, MINUS=25, TILDE=26, PIPE2=27, DIV=28, MOD=29, 
		LT2=30, GT2=31, AMP=32, PIPE=33, LT=34, LT_EQ=35, GT=36, GT_EQ=37, EQ=38, 
		NOT_EQ1=39, NOT_EQ2=40, K_FUNCTION=41, K_RETURN=42, K_ABORT=43, K_ACTION=44, 
		K_ADD=45, K_AFTER=46, K_ALL=47, K_ALTER=48, K_ANALYZE=49, K_AND=50, K_AS=51, 
		K_ASC=52, K_ATTACH=53, K_AUTOINCREMENT=54, K_BEFORE=55, K_BEGIN=56, K_BETWEEN=57, 
		K_BY=58, K_CASCADE=59, K_CASE=60, K_CAST=61, K_CHECK=62, K_COLLATE=63, 
		K_COLUMN=64, K_COMMIT=65, K_CONFLICT=66, K_CONSTRAINT=67, K_CREATE=68, 
		K_CROSS=69, K_CURRENT_DATE=70, K_CURRENT_TIME=71, K_CURRENT_TIMESTAMP=72, 
		K_DATABASE=73, K_DEFAULT=74, K_DEFERRABLE=75, K_DEFERRED=76, K_DELETE=77, 
		K_DESC=78, K_DETACH=79, K_DISTINCT=80, K_DROP=81, K_EACH=82, K_ELSE=83, 
		K_END=84, K_ENABLE=85, K_ESCAPE=86, K_EXCEPT=87, K_EXCLUSIVE=88, K_EXISTS=89, 
		K_EXPLAIN=90, K_FAIL=91, K_FOR=92, K_FOREIGN=93, K_FROM=94, K_FULL=95, 
		K_GLOB=96, K_GROUP=97, K_HAVING=98, K_IF=99, K_WHILE=100, K_DO=101, K_IGNORE=102, 
		K_IMMEDIATE=103, K_IN=104, K_INDEX=105, K_INDEXED=106, K_INITIALLY=107, 
		K_INNER=108, K_INSERT=109, K_INSTEAD=110, K_INTERSECT=111, K_INTO=112, 
		K_IS=113, K_ISNULL=114, K_JOIN=115, K_KEY=116, K_LEFT=117, K_LIKE=118, 
		K_LIMIT=119, K_MATCH=120, K_NATURAL=121, K_NEXTVAL=122, K_NO=123, K_NOT=124, 
		K_NOTNULL=125, K_NULL=126, K_OF=127, K_OFFSET=128, K_ON=129, K_ONLY=130, 
		K_OR=131, K_ORDER=132, K_OUTER=133, K_PLAN=134, K_PRAGMA=135, K_PRIMARY=136, 
		K_QUERY=137, K_RAISE=138, K_RECURSIVE=139, K_REFERENCES=140, K_REGEXP=141, 
		K_REINDEX=142, K_RELEASE=143, K_RENAME=144, K_REPLACE=145, K_RESTRICT=146, 
		K_RIGHT=147, K_ROLLBACK=148, K_ROW=149, K_SAVEPOINT=150, K_SELECT=151, 
		K_SET=152, K_TABLE=153, K_TEMP=154, K_TEMPORARY=155, K_THEN=156, K_TO=157, 
		K_TRANSACTION=158, K_TRIGGER=159, K_UNION=160, K_UNIQUE=161, K_UPDATE=162, 
		K_USING=163, K_VACUUM=164, K_VALUES=165, K_VIEW=166, K_VIRTUAL=167, K_WHEN=168, 
		K_WHERE=169, K_WITH=170, K_WITHOUT=171, K_VAR=172, K_TRUE=173, K_FALSE=174, 
		K_SWITCH=175, K_BREAK=176, K_PRINT=177, K_CONTINUE=178, IDENTIFIER=179, 
		NUMERIC_LITERAL=180, BIND_PARAMETER=181, STRING_LITERAL=182, BLOB_LITERAL=183, 
		MULTILINE_COMMENT=184, SPACES=185, UNEXPECTED_CHAR=186, DIGIT=187;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_stat = 4, RULE_c = 5, RULE_stat_with_return = 6, RULE_stat_forloop = 7, 
		RULE_s = 8, RULE_stat_withblock_forloop = 9, RULE_json_st = 10, RULE_json_atmt = 11, 
		RULE_higer_order_function_stmt = 12, RULE_arr_stmt = 13, RULE_var_stmt = 14, 
		RULE_var_stmt_withscol = 15, RULE_print_stmt = 16, RULE_function_head = 17, 
		RULE_function_body = 18, RULE_function_stmt = 19, RULE_function_call_stmt = 20, 
		RULE_params_stmt = 21, RULE_arguments_stmt = 22, RULE_for_stmt = 23, RULE_do_while_stmt = 24, 
		RULE_while_stmt = 25, RULE_condition_block = 26, RULE_condition_block_forloop = 27, 
		RULE_if_stmt = 28, RULE_if_stmt_forloop = 29, RULE_if_stmt_short = 30, 
		RULE_if_stmt_short_for_return = 31, RULE_if_stmt_short_forloop = 32, RULE_switch_stmt = 33, 
		RULE_break_stmt = 34, RULE_return_stmt = 35, RULE_one_line_instruction = 36, 
		RULE_math_op0 = 37, RULE_math_op1 = 38, RULE_math_op2 = 39, RULE_math_op3 = 40, 
		RULE_logic_operator1 = 41, RULE_logic_operator2 = 42, RULE_math_expr0 = 43, 
		RULE_math_expr_all = 44, RULE_identifier = 45, RULE_math_expr_plus = 46, 
		RULE_math_expr_plus_withoutbrackets = 47, RULE_math_expr1 = 48, RULE_math_expr1_withbrackets = 49, 
		RULE_math_expr2 = 50, RULE_math_expr2_withbrackets = 51, RULE_math_expr3 = 52, 
		RULE_math_expr3_withbrackets = 53, RULE_math_expr_without_digit = 54, 
		RULE_result_mathematic = 55, RULE_logic_expr1 = 56, RULE_logic_expr1_withbracets = 57, 
		RULE_logic_all = 58, RULE_logic_expr2 = 59, RULE_logic_expr2_withbrackets = 60, 
		RULE_logic_resault = 61, RULE_assingment_rule_without_bracket = 62, RULE_assingment_rule_with_bracket = 63, 
		RULE_assingment_rule_with_scol = 64, RULE_assingment_rule_without_scol = 65, 
		RULE_alter_table_stmt = 66, RULE_alter_table_add_constraint = 67, RULE_alter_table_add = 68, 
		RULE_create_table_stmt = 69, RULE_delete_stmt = 70, RULE_drop_table_stmt = 71, 
		RULE_factored_select_stmt = 72, RULE_insert_stmt = 73, RULE_select_stmt = 74, 
		RULE_select_or_values = 75, RULE_update_stmt = 76, RULE_column_def = 77, 
		RULE_type_name = 78, RULE_column_constraint = 79, RULE_column_constraint_primary_key = 80, 
		RULE_column_constraint_foreign_key = 81, RULE_column_constraint_not_null = 82, 
		RULE_column_constraint_null = 83, RULE_column_default = 84, RULE_column_default_value = 85, 
		RULE_expr = 86, RULE_foreign_key_clause = 87, RULE_fk_target_column_name = 88, 
		RULE_indexed_column = 89, RULE_table_constraint = 90, RULE_table_constraint_primary_key = 91, 
		RULE_table_constraint_foreign_key = 92, RULE_table_constraint_unique = 93, 
		RULE_table_constraint_key = 94, RULE_fk_origin_column_name = 95, RULE_qualified_table_name = 96, 
		RULE_ordering_term = 97, RULE_pragma_value = 98, RULE_common_table_expression = 99, 
		RULE_result_column = 100, RULE_table_or_subquery = 101, RULE_join_clause = 102, 
		RULE_join_operator = 103, RULE_join_constraint = 104, RULE_select_core = 105, 
		RULE_cte_table_name = 106, RULE_signed_number = 107, RULE_literal_value = 108, 
		RULE_unary_operator = 109, RULE_error_message = 110, RULE_module_argument = 111, 
		RULE_column_alias = 112, RULE_keyword = 113, RULE_unknown = 114, RULE_name = 115, 
		RULE_function_name = 116, RULE_database_name = 117, RULE_source_table_name = 118, 
		RULE_table_name = 119, RULE_table_or_index_name = 120, RULE_new_table_name = 121, 
		RULE_column_name = 122, RULE_collation_name = 123, RULE_foreign_table = 124, 
		RULE_index_name = 125, RULE_trigger_name = 126, RULE_view_name = 127, 
		RULE_module_name = 128, RULE_pragma_name = 129, RULE_savepoint_name = 130, 
		RULE_table_alias = 131, RULE_transaction_name = 132, RULE_any_name = 133;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "stat", "c", "stat_with_return", 
			"stat_forloop", "s", "stat_withblock_forloop", "json_st", "json_atmt", 
			"higer_order_function_stmt", "arr_stmt", "var_stmt", "var_stmt_withscol", 
			"print_stmt", "function_head", "function_body", "function_stmt", "function_call_stmt", 
			"params_stmt", "arguments_stmt", "for_stmt", "do_while_stmt", "while_stmt", 
			"condition_block", "condition_block_forloop", "if_stmt", "if_stmt_forloop", 
			"if_stmt_short", "if_stmt_short_for_return", "if_stmt_short_forloop", 
			"switch_stmt", "break_stmt", "return_stmt", "one_line_instruction", "math_op0", 
			"math_op1", "math_op2", "math_op3", "logic_operator1", "logic_operator2", 
			"math_expr0", "math_expr_all", "identifier", "math_expr_plus", "math_expr_plus_withoutbrackets", 
			"math_expr1", "math_expr1_withbrackets", "math_expr2", "math_expr2_withbrackets", 
			"math_expr3", "math_expr3_withbrackets", "math_expr_without_digit", "result_mathematic", 
			"logic_expr1", "logic_expr1_withbracets", "logic_all", "logic_expr2", 
			"logic_expr2_withbrackets", "logic_resault", "assingment_rule_without_bracket", 
			"assingment_rule_with_bracket", "assingment_rule_with_scol", "assingment_rule_without_scol", 
			"alter_table_stmt", "alter_table_add_constraint", "alter_table_add", 
			"create_table_stmt", "delete_stmt", "drop_table_stmt", "factored_select_stmt", 
			"insert_stmt", "select_stmt", "select_or_values", "update_stmt", "column_def", 
			"type_name", "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "cte_table_name", 
			"signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "unknown", "name", "function_name", 
			"database_name", "source_table_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'\"'", "'?'", "'++'", "'--'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'&&'", "'::'", "'['", "']'", "'{'", "'}'", "';'", "'.'", "'('", 
			"')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", 
			"'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OPEN_BRACKETS", "CLOSE_BRACKETS", "OPEN_BLOCK", "CLOSE_BLOCK", 
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
			"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_FUNCTION", 
			"K_RETURN", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", 
			"K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
			"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_WHILE", "K_DO", "K_IGNORE", "K_IMMEDIATE", "K_IN", 
			"K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", 
			"K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", 
			"K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", 
			"K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", 
			"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
			"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", 
			"K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", 
			"K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_VAR", "K_TRUE", "K_FALSE", 
			"K_SWITCH", "K_BREAK", "K_PRINT", "K_CONTINUE", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR", "DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ALTER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_CREATE - 68)) | (1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_INSERT - 68)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (K_SELECT - 151)) | (1L << (K_UPDATE - 151)) | (1L << (K_VALUES - 151)) | (1L << (IDENTIFIER - 151)) | (1L << (STRING_LITERAL - 151)) | (1L << (UNEXPECTED_CHAR - 151)))) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(268);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(269);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(280);
				match(SCOL);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			sql_stmt();
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(287);
						match(SCOL);
						}
						}
						setState(290); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(292);
					sql_stmt();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					match(SCOL);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Function_stmtContext function_stmt() {
			return getRuleContext(Function_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(304);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(305);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(306);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(307);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(308);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(309);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(310);
				update_stmt();
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(311);
				function_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public If_stmt_shortContext if_stmt_short() {
			return getRuleContext(If_stmt_shortContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Function_call_stmtContext function_call_stmt() {
			return getRuleContext(Function_call_stmtContext.class,0);
		}
		public Var_stmt_withscolContext var_stmt_withscol() {
			return getRuleContext(Var_stmt_withscolContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				if_stmt_short();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				print_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				function_call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				var_stmt_withscol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				do_while_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				switch_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				one_line_instruction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				for_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(324);
				match(OPEN_BLOCK);
				setState(325);
				match(CLOSE_BLOCK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(326);
				match(OPEN_BLOCK);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_BLOCK) | (1L << OPEN_PAR))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_FOR - 92)) | (1L << (K_IF - 92)) | (1L << (K_WHILE - 92)) | (1L << (K_DO - 92)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_VAR - 172)) | (1L << (K_SWITCH - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (STRING_LITERAL - 172)))) != 0)) {
					{
					{
					setState(327);
					stat();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
				match(CLOSE_BLOCK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c);
		int _la;
		try {
			int _alt;
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						stat();
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BLOCK || _la==K_RETURN) {
					{
					setState(342);
					return_stmt();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(OPEN_BLOCK);
				setState(346);
				c();
				setState(347);
				match(CLOSE_BLOCK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_with_returnContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Stat_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStat_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStat_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStat_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_with_returnContext stat_with_return() throws RecognitionException {
		Stat_with_returnContext _localctx = new Stat_with_returnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat_with_return);
		try {
			int _alt;
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				c();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						stat();
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(358);
				c();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_forloopContext extends ParserRuleContext {
		public If_stmt_forloopContext if_stmt_forloop() {
			return getRuleContext(If_stmt_forloopContext.class,0);
		}
		public If_stmt_short_forloopContext if_stmt_short_forloop() {
			return getRuleContext(If_stmt_short_forloopContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Function_call_stmtContext function_call_stmt() {
			return getRuleContext(Function_call_stmtContext.class,0);
		}
		public Var_stmt_withscolContext var_stmt_withscol() {
			return getRuleContext(Var_stmt_withscolContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public List<Stat_forloopContext> stat_forloop() {
			return getRuleContexts(Stat_forloopContext.class);
		}
		public Stat_forloopContext stat_forloop(int i) {
			return getRuleContext(Stat_forloopContext.class,i);
		}
		public Stat_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStat_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStat_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStat_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_forloopContext stat_forloop() throws RecognitionException {
		Stat_forloopContext _localctx = new Stat_forloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(361);
				if_stmt_forloop();
				}
				break;
			case 2:
				{
				setState(362);
				if_stmt_short_forloop();
				}
				break;
			case 3:
				{
				setState(363);
				print_stmt();
				}
				break;
			case 4:
				{
				setState(364);
				function_call_stmt();
				}
				break;
			case 5:
				{
				setState(365);
				var_stmt_withscol();
				}
				break;
			case 6:
				{
				setState(366);
				while_stmt();
				}
				break;
			case 7:
				{
				setState(367);
				one_line_instruction();
				}
				break;
			case 8:
				{
				setState(368);
				match(K_CONTINUE);
				setState(369);
				match(SCOL);
				}
				break;
			case 9:
				{
				setState(370);
				do_while_stmt();
				}
				break;
			case 10:
				{
				setState(371);
				switch_stmt();
				}
				break;
			case 11:
				{
				setState(372);
				for_stmt();
				}
				break;
			case 12:
				{
				setState(373);
				match(OPEN_BLOCK);
				setState(374);
				match(CLOSE_BLOCK);
				}
				break;
			case 13:
				{
				setState(375);
				match(OPEN_BLOCK);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_BLOCK) | (1L << OPEN_PAR))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_FOR - 92)) | (1L << (K_IF - 92)) | (1L << (K_WHILE - 92)) | (1L << (K_DO - 92)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_VAR - 172)) | (1L << (K_SWITCH - 172)) | (1L << (K_PRINT - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (STRING_LITERAL - 172)))) != 0)) {
					{
					{
					setState(376);
					stat_forloop();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				match(CLOSE_BLOCK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SContext extends ParserRuleContext {
		public List<Stat_forloopContext> stat_forloop() {
			return getRuleContexts(Stat_forloopContext.class);
		}
		public Stat_forloopContext stat_forloop(int i) {
			return getRuleContext(Stat_forloopContext.class,i);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_s);
		try {
			int _alt;
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						stat_forloop();
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(391);
					break_stmt();
					}
					break;
				case 2:
					{
					setState(392);
					return_stmt();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(395);
				match(OPEN_BLOCK);
				setState(396);
				s();
				setState(397);
				match(CLOSE_BLOCK);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_withblock_forloopContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public List<Stat_forloopContext> stat_forloop() {
			return getRuleContexts(Stat_forloopContext.class);
		}
		public Stat_forloopContext stat_forloop(int i) {
			return getRuleContext(Stat_forloopContext.class,i);
		}
		public Stat_withblock_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_withblock_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStat_withblock_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStat_withblock_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStat_withblock_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_withblock_forloopContext stat_withblock_forloop() throws RecognitionException {
		Stat_withblock_forloopContext _localctx = new Stat_withblock_forloopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat_withblock_forloop);
		try {
			int _alt;
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						stat_forloop();
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(408);
				s();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_stContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Json_atmtContext json_atmt() {
			return getRuleContext(Json_atmtContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(SqlParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(SqlParser.CLOSE_BRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Json_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_stContext json_st() throws RecognitionException {
		Json_stContext _localctx = new Json_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_json_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			any_name();
			setState(412);
			match(T__0);
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
				setState(413);
				match(NUMERIC_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				setState(414);
				match(IDENTIFIER);
				}
				break;
			case OPEN_BLOCK:
				{
				setState(415);
				json_atmt();
				}
				break;
			case OPEN_BRACKETS:
				{
				{
				setState(416);
				match(OPEN_BRACKETS);
				setState(417);
				any_name();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(418);
					match(COMMA);
					setState(419);
					any_name();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(CLOSE_BRACKETS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_atmtContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public List<Json_stContext> json_st() {
			return getRuleContexts(Json_stContext.class);
		}
		public Json_stContext json_st(int i) {
			return getRuleContext(Json_stContext.class,i);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Json_atmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_atmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson_atmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson_atmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson_atmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_atmtContext json_atmt() throws RecognitionException {
		Json_atmtContext _localctx = new Json_atmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_json_atmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(OPEN_BLOCK);
			setState(430);
			json_st();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				json_st();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higer_order_function_stmtContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Higer_order_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higer_order_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterHiger_order_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitHiger_order_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitHiger_order_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higer_order_function_stmtContext higer_order_function_stmt() throws RecognitionException {
		Higer_order_function_stmtContext _localctx = new Higer_order_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_higer_order_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			any_name();
			setState(441);
			match(OPEN_PAR);
			setState(442);
			any_name();
			setState(443);
			match(COMMA);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(444);
				any_name();
				setState(445);
				match(COMMA);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
			match(K_FUNCTION);
			setState(453);
			match(OPEN_PAR);
			setState(454);
			any_name();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(455);
				match(COMMA);
				setState(456);
				any_name();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(CLOSE_PAR);
			setState(463);
			function_body();
			setState(464);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(SqlParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(SqlParser.CLOSE_BRACKETS, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Arr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_stmtContext arr_stmt() throws RecognitionException {
		Arr_stmtContext _localctx = new Arr_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			any_name();
			setState(467);
			match(OPEN_BRACKETS);
			setState(468);
			match(CLOSE_BRACKETS);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(469);
				match(ASSIGN);
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BLOCK:
					{
					{
					setState(470);
					match(OPEN_BLOCK);
					setState(471);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(472);
						match(COMMA);
						setState(473);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(479);
					match(CLOSE_BLOCK);
					}
					}
					break;
				case K_SELECT:
				case K_VALUES:
					{
					setState(480);
					select_or_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_stmtContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Arr_stmtContext> arr_stmt() {
			return getRuleContexts(Arr_stmtContext.class);
		}
		public Arr_stmtContext arr_stmt(int i) {
			return getRuleContext(Arr_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<Math_expr0Context> math_expr0() {
			return getRuleContexts(Math_expr0Context.class);
		}
		public Math_expr0Context math_expr0(int i) {
			return getRuleContext(Math_expr0Context.class,i);
		}
		public List<Math_expr1Context> math_expr1() {
			return getRuleContexts(Math_expr1Context.class);
		}
		public Math_expr1Context math_expr1(int i) {
			return getRuleContext(Math_expr1Context.class,i);
		}
		public List<Math_expr1_withbracketsContext> math_expr1_withbrackets() {
			return getRuleContexts(Math_expr1_withbracketsContext.class);
		}
		public Math_expr1_withbracketsContext math_expr1_withbrackets(int i) {
			return getRuleContext(Math_expr1_withbracketsContext.class,i);
		}
		public List<Json_atmtContext> json_atmt() {
			return getRuleContexts(Json_atmtContext.class);
		}
		public Json_atmtContext json_atmt(int i) {
			return getRuleContext(Json_atmtContext.class,i);
		}
		public List<Higer_order_function_stmtContext> higer_order_function_stmt() {
			return getRuleContexts(Higer_order_function_stmtContext.class);
		}
		public Higer_order_function_stmtContext higer_order_function_stmt(int i) {
			return getRuleContext(Higer_order_function_stmtContext.class,i);
		}
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVar_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(K_VAR);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(486);
				any_name();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(487);
					match(ASSIGN);
					setState(494);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(488);
						math_expr0();
						}
						break;
					case 2:
						{
						setState(489);
						math_expr1();
						}
						break;
					case 3:
						{
						setState(490);
						math_expr1_withbrackets();
						}
						break;
					case 4:
						{
						setState(491);
						json_atmt();
						}
						break;
					case 5:
						{
						setState(492);
						higer_order_function_stmt();
						}
						break;
					case 6:
						{
						setState(493);
						select_or_values();
						}
						break;
					}
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(498);
				arr_stmt();
				}
				break;
			}
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					{
					setState(502);
					any_name();
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(503);
						match(ASSIGN);
						setState(510);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(504);
							math_expr0();
							}
							break;
						case 2:
							{
							setState(505);
							math_expr1();
							}
							break;
						case 3:
							{
							setState(506);
							math_expr1_withbrackets();
							}
							break;
						case 4:
							{
							setState(507);
							json_atmt();
							}
							break;
						case 5:
							{
							setState(508);
							higer_order_function_stmt();
							}
							break;
						case 6:
							{
							setState(509);
							select_or_values();
							}
							break;
						}
						}
					}

					}
					}
					break;
				case 2:
					{
					setState(514);
					arr_stmt();
					}
					break;
				}
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_stmt_withscolContext extends ParserRuleContext {
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Var_stmt_withscolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt_withscol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVar_stmt_withscol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVar_stmt_withscol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVar_stmt_withscol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmt_withscolContext var_stmt_withscol() throws RecognitionException {
		Var_stmt_withscolContext _localctx = new Var_stmt_withscolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_stmt_withscol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			var_stmt();
			setState(523);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Result_mathematicContext> result_mathematic() {
			return getRuleContexts(Result_mathematicContext.class);
		}
		public Result_mathematicContext result_mathematic(int i) {
			return getRuleContext(Result_mathematicContext.class,i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SqlParser.PLUS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(K_PRINT);
			setState(526);
			match(OPEN_PAR);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << OPEN_PAR))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (IDENTIFIER - 179)) | (1L << (NUMERIC_LITERAL - 179)) | (1L << (STRING_LITERAL - 179)))) != 0)) {
				{
				{
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(527);
					result_mathematic();
					}
					break;
				case 2:
					{
					setState(528);
					match(T__1);
					setState(529);
					any_name();
					setState(530);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(532);
					match(NUMERIC_LITERAL);
					}
					break;
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(535);
					match(PLUS);
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(536);
						result_mathematic();
						}
						break;
					case 2:
						{
						setState(537);
						match(T__1);
						setState(538);
						match(IDENTIFIER);
						setState(539);
						match(T__1);
						}
						break;
					case 3:
						{
						setState(540);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(CLOSE_PAR);
			setState(554);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Arguments_stmtContext arguments_stmt() {
			return getRuleContext(Arguments_stmtContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(OPEN_PAR);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(557);
				arguments_stmt();
				}
			}

			setState(560);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public List<Function_stmtContext> function_stmt() {
			return getRuleContexts(Function_stmtContext.class);
		}
		public Function_stmtContext function_stmt(int i) {
			return getRuleContext(Function_stmtContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(OPEN_BLOCK);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(563);
				function_stmt();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566);
					stat();
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(572);
				function_stmt();
				}
			}

			setState(575);
			return_stmt();
			setState(576);
			match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Arguments_stmtContext arguments_stmt() {
			return getRuleContext(Arguments_stmtContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmtContext function_stmt() throws RecognitionException {
		Function_stmtContext _localctx = new Function_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			any_name();
			setState(579);
			match(OPEN_PAR);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(580);
				arguments_stmt();
				}
			}

			setState(583);
			match(CLOSE_PAR);
			setState(584);
			match(OPEN_BLOCK);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					stat();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BLOCK || _la==K_RETURN) {
				{
				setState(591);
				return_stmt();
				}
			}

			setState(594);
			match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Params_stmtContext params_stmt() {
			return getRuleContext(Params_stmtContext.class,0);
		}
		public Function_call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_call_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_call_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_call_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_stmtContext function_call_stmt() throws RecognitionException {
		Function_call_stmtContext _localctx = new Function_call_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			any_name();
			setState(597);
			match(OPEN_PAR);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(598);
				params_stmt();
				}
			}

			setState(601);
			match(CLOSE_PAR);
			setState(602);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_stmtContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public Params_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParams_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParams_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParams_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_stmtContext params_stmt() throws RecognitionException {
		Params_stmtContext _localctx = new Params_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			any_name();
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(COMMA);
					setState(606);
					any_name();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(612);
				match(COMMA);
				setState(613);
				any_name();
				setState(614);
				match(ASSIGN);
				setState(615);
				match(NUMERIC_LITERAL);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_stmtContext extends ParserRuleContext {
		public List<TerminalNode> K_VAR() { return getTokens(SqlParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SqlParser.K_VAR, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public Arguments_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArguments_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArguments_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArguments_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_stmtContext arguments_stmt() throws RecognitionException {
		Arguments_stmtContext _localctx = new Arguments_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arguments_stmt);
		int _la;
		try {
			int _alt;
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(622);
				match(K_VAR);
				setState(623);
				any_name();
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(COMMA);
						setState(625);
						match(K_VAR);
						setState(626);
						any_name();
						}
						} 
					}
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(632);
					match(COMMA);
					setState(633);
					match(K_VAR);
					setState(634);
					any_name();
					setState(635);
					match(ASSIGN);
					setState(636);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(K_VAR);
				setState(644);
				any_name();
				setState(645);
				match(ASSIGN);
				setState(646);
				match(NUMERIC_LITERAL);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(647);
					match(COMMA);
					setState(648);
					match(K_VAR);
					setState(649);
					any_name();
					setState(650);
					match(ASSIGN);
					setState(651);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_withblock_forloopContext stat_withblock_forloop() {
			return getRuleContext(Stat_withblock_forloopContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Stat_forloopContext stat_forloop() {
			return getRuleContext(Stat_forloopContext.class,0);
		}
		public List<Var_stmtContext> var_stmt() {
			return getRuleContexts(Var_stmtContext.class);
		}
		public Var_stmtContext var_stmt(int i) {
			return getRuleContext(Var_stmtContext.class,i);
		}
		public List<Assingment_rule_without_scolContext> assingment_rule_without_scol() {
			return getRuleContexts(Assingment_rule_without_scolContext.class);
		}
		public Assingment_rule_without_scolContext assingment_rule_without_scol(int i) {
			return getRuleContext(Assingment_rule_without_scolContext.class,i);
		}
		public List<Math_expr_plus_withoutbracketsContext> math_expr_plus_withoutbrackets() {
			return getRuleContexts(Math_expr_plus_withoutbracketsContext.class);
		}
		public Math_expr_plus_withoutbracketsContext math_expr_plus_withoutbrackets(int i) {
			return getRuleContext(Math_expr_plus_withoutbracketsContext.class,i);
		}
		public List<Math_expr2Context> math_expr2() {
			return getRuleContexts(Math_expr2Context.class);
		}
		public Math_expr2Context math_expr2(int i) {
			return getRuleContext(Math_expr2Context.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(K_FOR);
			setState(661);
			match(OPEN_PAR);
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(662);
				var_stmt();
				}
				break;
			case 2:
				{
				setState(663);
				assingment_rule_without_scol();
				}
				break;
			case 3:
				{
				setState(664);
				math_expr_plus_withoutbrackets();
				}
				break;
			case 4:
				{
				setState(665);
				math_expr2();
				}
				break;
			case 5:
				{
				setState(666);
				match(IDENTIFIER);
				}
				break;
			}
			setState(669);
			match(SCOL);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_PAR))) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & ((1L << (K_TRUE - 173)) | (1L << (K_FALSE - 173)) | (1L << (IDENTIFIER - 173)) | (1L << (NUMERIC_LITERAL - 173)))) != 0)) {
				{
				setState(670);
				logic_resault();
				}
			}

			setState(673);
			match(SCOL);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(674);
				var_stmt();
				}
				break;
			case 2:
				{
				setState(675);
				math_expr_plus_withoutbrackets();
				}
				break;
			case 3:
				{
				setState(676);
				math_expr2();
				}
				break;
			case 4:
				{
				setState(677);
				assingment_rule_without_scol();
				}
				break;
			}
			setState(680);
			match(CLOSE_PAR);
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(681);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(682);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(683);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(684);
				match(OPEN_BLOCK);
				setState(685);
				stat_withblock_forloop();
				setState(686);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(688);
				stat_forloop();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_withblock_forloopContext stat_withblock_forloop() {
			return getRuleContext(Stat_withblock_forloopContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Stat_forloopContext stat_forloop() {
			return getRuleContext(Stat_forloopContext.class,0);
		}
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDo_while_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDo_while_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(K_DO);
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(692);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(693);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(694);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(695);
				match(OPEN_BLOCK);
				setState(696);
				stat_withblock_forloop();
				setState(697);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(699);
				stat_forloop();
				}
				break;
			}
			setState(702);
			match(K_WHILE);
			setState(703);
			match(OPEN_PAR);
			{
			setState(704);
			logic_resault();
			}
			setState(705);
			match(CLOSE_PAR);
			setState(706);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_withblock_forloopContext stat_withblock_forloop() {
			return getRuleContext(Stat_withblock_forloopContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Stat_forloopContext stat_forloop() {
			return getRuleContext(Stat_forloopContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(K_WHILE);
			setState(709);
			match(OPEN_PAR);
			{
			setState(710);
			logic_resault();
			}
			setState(711);
			match(CLOSE_PAR);
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(712);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(713);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(714);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(715);
				match(OPEN_BLOCK);
				setState(716);
				stat_withblock_forloop();
				setState(717);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(719);
				stat_forloop();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_with_returnContext stat_with_return() {
			return getRuleContext(Stat_with_returnContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(OPEN_PAR);
			{
			setState(723);
			logic_resault();
			}
			setState(724);
			match(CLOSE_PAR);
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(725);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(726);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(727);
				match(OPEN_BLOCK);
				setState(728);
				stat_with_return();
				setState(729);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(731);
				stat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_block_forloopContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_withblock_forloopContext stat_withblock_forloop() {
			return getRuleContext(Stat_withblock_forloopContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Stat_forloopContext stat_forloop() {
			return getRuleContext(Stat_forloopContext.class,0);
		}
		public Condition_block_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondition_block_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondition_block_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCondition_block_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_block_forloopContext condition_block_forloop() throws RecognitionException {
		Condition_block_forloopContext _localctx = new Condition_block_forloopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition_block_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(OPEN_PAR);
			{
			setState(735);
			logic_resault();
			}
			setState(736);
			match(CLOSE_PAR);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(737);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(738);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(739);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(740);
				match(OPEN_BLOCK);
				setState(741);
				stat_withblock_forloop();
				setState(742);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(744);
				stat_forloop();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public List<TerminalNode> K_IF() { return getTokens(SqlParser.K_IF); }
		public TerminalNode K_IF(int i) {
			return getToken(SqlParser.K_IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> K_ELSE() { return getTokens(SqlParser.K_ELSE); }
		public TerminalNode K_ELSE(int i) {
			return getToken(SqlParser.K_ELSE, i);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_with_returnContext stat_with_return() {
			return getRuleContext(Stat_with_returnContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(K_IF);
			setState(748);
			condition_block();
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					match(K_ELSE);
					setState(750);
					match(K_IF);
					setState(751);
					condition_block();
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(757);
				match(K_ELSE);
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(758);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(759);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(760);
					match(OPEN_BLOCK);
					setState(761);
					stat_with_return();
					setState(762);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(764);
					stat();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_forloopContext extends ParserRuleContext {
		public List<TerminalNode> K_IF() { return getTokens(SqlParser.K_IF); }
		public TerminalNode K_IF(int i) {
			return getToken(SqlParser.K_IF, i);
		}
		public List<Condition_block_forloopContext> condition_block_forloop() {
			return getRuleContexts(Condition_block_forloopContext.class);
		}
		public Condition_block_forloopContext condition_block_forloop(int i) {
			return getRuleContext(Condition_block_forloopContext.class,i);
		}
		public List<TerminalNode> K_ELSE() { return getTokens(SqlParser.K_ELSE); }
		public TerminalNode K_ELSE(int i) {
			return getToken(SqlParser.K_ELSE, i);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Stat_withblock_forloopContext stat_withblock_forloop() {
			return getRuleContext(Stat_withblock_forloopContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Stat_forloopContext stat_forloop() {
			return getRuleContext(Stat_forloopContext.class,0);
		}
		public If_stmt_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_forloopContext if_stmt_forloop() throws RecognitionException {
		If_stmt_forloopContext _localctx = new If_stmt_forloopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_stmt_forloop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(K_IF);
			setState(770);
			condition_block_forloop();
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					match(K_ELSE);
					setState(772);
					match(K_IF);
					setState(773);
					condition_block_forloop();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(779);
				match(K_ELSE);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(780);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(781);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(782);
					break_stmt();
					}
					break;
				case 4:
					{
					setState(783);
					match(OPEN_BLOCK);
					setState(784);
					stat_withblock_forloop();
					setState(785);
					match(CLOSE_BLOCK);
					}
					break;
				case 5:
					{
					setState(787);
					stat_forloop();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_shortContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<One_line_instructionContext> one_line_instruction() {
			return getRuleContexts(One_line_instructionContext.class);
		}
		public One_line_instructionContext one_line_instruction(int i) {
			return getRuleContext(One_line_instructionContext.class,i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public List<TerminalNode> OPEN_BLOCK() { return getTokens(SqlParser.OPEN_BLOCK); }
		public TerminalNode OPEN_BLOCK(int i) {
			return getToken(SqlParser.OPEN_BLOCK, i);
		}
		public List<Stat_with_returnContext> stat_with_return() {
			return getRuleContexts(Stat_with_returnContext.class);
		}
		public Stat_with_returnContext stat_with_return(int i) {
			return getRuleContext(Stat_with_returnContext.class,i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(SqlParser.CLOSE_BLOCK); }
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(SqlParser.CLOSE_BLOCK, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public If_stmt_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_shortContext if_stmt_short() throws RecognitionException {
		If_stmt_shortContext _localctx = new If_stmt_shortContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_stmt_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(OPEN_PAR);
			setState(793);
			logic_resault();
			setState(794);
			match(CLOSE_PAR);
			setState(795);
			match(T__2);
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(796);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(797);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(798);
				match(OPEN_BLOCK);
				setState(799);
				stat_with_return();
				setState(800);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(802);
				stat();
				}
				break;
			}
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(805);
				match(COMMA);
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(806);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(807);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(808);
					match(OPEN_BLOCK);
					setState(809);
					stat_with_return();
					setState(810);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(812);
					stat();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_short_for_returnContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public If_stmt_short_for_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_short_for_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt_short_for_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt_short_for_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt_short_for_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_short_for_returnContext if_stmt_short_for_return() throws RecognitionException {
		If_stmt_short_for_returnContext _localctx = new If_stmt_short_for_returnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_if_stmt_short_for_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(OPEN_PAR);
			setState(818);
			logic_resault();
			setState(819);
			match(CLOSE_PAR);
			setState(820);
			match(T__2);
			setState(821);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(822);
				match(COMMA);
				setState(823);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_short_forloopContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logic_resaultContext logic_resault() {
			return getRuleContext(Logic_resaultContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<One_line_instructionContext> one_line_instruction() {
			return getRuleContexts(One_line_instructionContext.class);
		}
		public One_line_instructionContext one_line_instruction(int i) {
			return getRuleContext(One_line_instructionContext.class,i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public List<TerminalNode> OPEN_BLOCK() { return getTokens(SqlParser.OPEN_BLOCK); }
		public TerminalNode OPEN_BLOCK(int i) {
			return getToken(SqlParser.OPEN_BLOCK, i);
		}
		public List<Stat_withblock_forloopContext> stat_withblock_forloop() {
			return getRuleContexts(Stat_withblock_forloopContext.class);
		}
		public Stat_withblock_forloopContext stat_withblock_forloop(int i) {
			return getRuleContext(Stat_withblock_forloopContext.class,i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(SqlParser.CLOSE_BLOCK); }
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(SqlParser.CLOSE_BLOCK, i);
		}
		public List<Stat_forloopContext> stat_forloop() {
			return getRuleContexts(Stat_forloopContext.class);
		}
		public Stat_forloopContext stat_forloop(int i) {
			return getRuleContext(Stat_forloopContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public If_stmt_short_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_short_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt_short_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt_short_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt_short_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_short_forloopContext if_stmt_short_forloop() throws RecognitionException {
		If_stmt_short_forloopContext _localctx = new If_stmt_short_forloopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_stmt_short_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(OPEN_PAR);
			setState(827);
			logic_resault();
			setState(828);
			match(CLOSE_PAR);
			setState(829);
			match(T__2);
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(830);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(831);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(832);
				match(OPEN_BLOCK);
				setState(833);
				stat_withblock_forloop();
				setState(834);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(836);
				stat_forloop();
				}
				break;
			}
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(839);
				match(COMMA);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(840);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(841);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(842);
					match(OPEN_BLOCK);
					setState(843);
					stat_withblock_forloop();
					setState(844);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(846);
					stat_forloop();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Result_mathematicContext result_mathematic() {
			return getRuleContext(Result_mathematicContext.class,0);
		}
		public List<TerminalNode> K_CASE() { return getTokens(SqlParser.K_CASE); }
		public TerminalNode K_CASE(int i) {
			return getToken(SqlParser.K_CASE, i);
		}
		public List<Math_expr0Context> math_expr0() {
			return getRuleContexts(Math_expr0Context.class);
		}
		public Math_expr0Context math_expr0(int i) {
			return getRuleContext(Math_expr0Context.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public List<Break_stmtContext> break_stmt() {
			return getRuleContexts(Break_stmtContext.class);
		}
		public Break_stmtContext break_stmt(int i) {
			return getRuleContext(Break_stmtContext.class,i);
		}
		public List<Stat_withblock_forloopContext> stat_withblock_forloop() {
			return getRuleContexts(Stat_withblock_forloopContext.class);
		}
		public Stat_withblock_forloopContext stat_withblock_forloop(int i) {
			return getRuleContext(Stat_withblock_forloopContext.class,i);
		}
		public List<One_line_instructionContext> one_line_instruction() {
			return getRuleContexts(One_line_instructionContext.class);
		}
		public One_line_instructionContext one_line_instruction(int i) {
			return getRuleContext(One_line_instructionContext.class,i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(K_SWITCH);
			setState(852);
			match(OPEN_PAR);
			{
			setState(853);
			result_mathematic();
			}
			setState(854);
			match(CLOSE_PAR);
			setState(855);
			match(OPEN_BLOCK);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(856);
				match(K_CASE);
				setState(861);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
					{
					setState(857);
					math_expr0();
					}
					break;
				case T__1:
					{
					setState(858);
					match(T__1);
					setState(859);
					match(IDENTIFIER);
					setState(860);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(863);
				match(T__0);
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(864);
					return_stmt();
					}
					break;
				case 2:
					{
					setState(865);
					break_stmt();
					}
					break;
				case 3:
					{
					setState(866);
					stat_withblock_forloop();
					}
					break;
				case 4:
					{
					setState(867);
					one_line_instruction();
					}
					break;
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(870);
						match(K_CASE);
						setState(875);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case NUMERIC_LITERAL:
							{
							setState(871);
							math_expr0();
							}
							break;
						case T__1:
							{
							setState(872);
							match(T__1);
							setState(873);
							match(IDENTIFIER);
							setState(874);
							match(T__1);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(877);
						match(T__0);
						setState(882);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(878);
							return_stmt();
							}
							break;
						case 2:
							{
							setState(879);
							break_stmt();
							}
							break;
						case 3:
							{
							setState(880);
							stat_withblock_forloop();
							}
							break;
						case 4:
							{
							setState(881);
							one_line_instruction();
							}
							break;
						}
						}
						} 
					}
					setState(888);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(889);
					match(K_DEFAULT);
					setState(890);
					match(T__0);
					setState(895);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(891);
						return_stmt();
						}
						break;
					case 2:
						{
						setState(892);
						break_stmt();
						}
						break;
					case 3:
						{
						setState(893);
						stat_withblock_forloop();
						}
						break;
					case 4:
						{
						setState(894);
						one_line_instruction();
						}
						break;
					}
					}
				}

				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_break_stmt);
		try {
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(K_BREAK);
				setState(907);
				match(SCOL);
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(OPEN_BLOCK);
				setState(909);
				break_stmt();
				setState(910);
				match(CLOSE_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public If_stmt_short_for_returnContext if_stmt_short_for_return() {
			return getRuleContext(If_stmt_short_for_returnContext.class,0);
		}
		public Math_expr2Context math_expr2() {
			return getRuleContext(Math_expr2Context.class,0);
		}
		public Math_expr2_withbracketsContext math_expr2_withbrackets() {
			return getRuleContext(Math_expr2_withbracketsContext.class,0);
		}
		public Math_expr_plusContext math_expr_plus() {
			return getRuleContext(Math_expr_plusContext.class,0);
		}
		public Assingment_rule_without_scolContext assingment_rule_without_scol() {
			return getRuleContext(Assingment_rule_without_scolContext.class,0);
		}
		public Logic_allContext logic_all() {
			return getRuleContext(Logic_allContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_stmt);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(K_RETURN);
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(915);
					if_stmt_short_for_return();
					}
					break;
				case 2:
					{
					setState(916);
					math_expr2();
					}
					break;
				case 3:
					{
					setState(917);
					math_expr2_withbrackets();
					}
					break;
				case 4:
					{
					setState(918);
					math_expr_plus();
					}
					break;
				case 5:
					{
					setState(919);
					assingment_rule_without_scol();
					}
					break;
				case 6:
					{
					setState(920);
					logic_all();
					}
					break;
				case 7:
					{
					setState(921);
					match(NUMERIC_LITERAL);
					}
					break;
				case 8:
					{
					setState(922);
					match(K_NULL);
					}
					break;
				}
				setState(925);
				match(SCOL);
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(OPEN_BLOCK);
				setState(927);
				return_stmt();
				setState(928);
				match(CLOSE_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_line_instructionContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Math_expr2Context math_expr2() {
			return getRuleContext(Math_expr2Context.class,0);
		}
		public Math_expr2_withbracketsContext math_expr2_withbrackets() {
			return getRuleContext(Math_expr2_withbracketsContext.class,0);
		}
		public Math_expr_plusContext math_expr_plus() {
			return getRuleContext(Math_expr_plusContext.class,0);
		}
		public Assingment_rule_without_scolContext assingment_rule_without_scol() {
			return getRuleContext(Assingment_rule_without_scolContext.class,0);
		}
		public One_line_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_line_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOne_line_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOne_line_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOne_line_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_line_instructionContext one_line_instruction() throws RecognitionException {
		One_line_instructionContext _localctx = new One_line_instructionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_one_line_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(932);
				math_expr2();
				}
				break;
			case 2:
				{
				setState(933);
				math_expr2_withbrackets();
				}
				break;
			case 3:
				{
				setState(934);
				math_expr_plus();
				}
				break;
			case 4:
				{
				setState(935);
				assingment_rule_without_scol();
				}
				break;
			}
			setState(938);
			match(SCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_op0Context extends ParserRuleContext {
		public Math_op0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_op0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_op0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_op0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_op0Context math_op0() throws RecognitionException {
		Math_op0Context _localctx = new Math_op0Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_math_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_op1Context extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Math_op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_op1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_op1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_op1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_op1Context math_op1() throws RecognitionException {
		Math_op1Context _localctx = new Math_op1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_math_op1);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_op2Context extends ParserRuleContext {
		public Math_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_op2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_op2Context math_op2() throws RecognitionException {
		Math_op2Context _localctx = new Math_op2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_math_op2);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_op3Context extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public Math_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_op3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_op3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_op3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_op3Context math_op3() throws RecognitionException {
		Math_op3Context _localctx = new Math_op3Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_math_op3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_operator1Context extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public Logic_operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_operator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_operator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_operator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operator1Context logic_operator1() throws RecognitionException {
		Logic_operator1Context _localctx = new Logic_operator1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_logic_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NOT_EQ1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_operator2Context extends ParserRuleContext {
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public Logic_operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_operator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_operator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_operator2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operator2Context logic_operator2() throws RecognitionException {
		Logic_operator2Context _localctx = new Logic_operator2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_logic_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==PIPE2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr0Context extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode DIGIT() { return getToken(SqlParser.DIGIT, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Math_expr0Context math_expr0() {
			return getRuleContext(Math_expr0Context.class,0);
		}
		public Math_expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr0Context math_expr0() throws RecognitionException {
		Math_expr0Context _localctx = new Math_expr0Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_math_expr0);
		try {
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				match(OPEN_PAR);
				setState(958);
				match(DIGIT);
				setState(959);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(961);
				match(OPEN_PAR);
				setState(962);
				match(IDENTIFIER);
				setState(963);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(964);
				match(OPEN_PAR);
				setState(965);
				math_expr0();
				setState(966);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr_allContext extends ParserRuleContext {
		public Math_expr1_withbracketsContext math_expr1_withbrackets() {
			return getRuleContext(Math_expr1_withbracketsContext.class,0);
		}
		public Math_expr_plusContext math_expr_plus() {
			return getRuleContext(Math_expr_plusContext.class,0);
		}
		public Math_expr2_withbracketsContext math_expr2_withbrackets() {
			return getRuleContext(Math_expr2_withbracketsContext.class,0);
		}
		public Math_expr0Context math_expr0() {
			return getRuleContext(Math_expr0Context.class,0);
		}
		public Assingment_rule_with_bracketContext assingment_rule_with_bracket() {
			return getRuleContext(Assingment_rule_with_bracketContext.class,0);
		}
		public Math_expr_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr_allContext math_expr_all() throws RecognitionException {
		Math_expr_allContext _localctx = new Math_expr_allContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_math_expr_all);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				math_expr1_withbrackets();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				math_expr_plus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				math_expr2_withbrackets();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				math_expr0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(974);
				assingment_rule_with_bracket();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(IDENTIFIER);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(OPEN_PAR);
				setState(979);
				match(IDENTIFIER);
				setState(980);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr_plusContext extends ParserRuleContext {
		public Math_op0Context math_op0() {
			return getRuleContext(Math_op0Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Math_expr_plusContext math_expr_plus() {
			return getRuleContext(Math_expr_plusContext.class,0);
		}
		public Math_expr_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr_plusContext math_expr_plus() throws RecognitionException {
		Math_expr_plusContext _localctx = new Math_expr_plusContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_math_expr_plus);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				math_op0();
				setState(984);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				identifier();
				setState(987);
				math_op0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				match(OPEN_PAR);
				setState(990);
				math_op0();
				setState(991);
				identifier();
				setState(992);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				match(OPEN_PAR);
				setState(995);
				identifier();
				setState(996);
				math_op0();
				setState(997);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(999);
				match(OPEN_PAR);
				setState(1000);
				math_expr_plus();
				setState(1001);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr_plus_withoutbracketsContext extends ParserRuleContext {
		public Math_op0Context math_op0() {
			return getRuleContext(Math_op0Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Math_expr_plus_withoutbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr_plus_withoutbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr_plus_withoutbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr_plus_withoutbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr_plus_withoutbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr_plus_withoutbracketsContext math_expr_plus_withoutbrackets() throws RecognitionException {
		Math_expr_plus_withoutbracketsContext _localctx = new Math_expr_plus_withoutbracketsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_math_expr_plus_withoutbrackets);
		try {
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				math_op0();
				setState(1006);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				identifier();
				setState(1009);
				math_op0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011);
				math_op0();
				setState(1012);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				identifier();
				setState(1015);
				math_op0();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr1Context extends ParserRuleContext {
		public List<Math_expr_allContext> math_expr_all() {
			return getRuleContexts(Math_expr_allContext.class);
		}
		public Math_expr_allContext math_expr_all(int i) {
			return getRuleContext(Math_expr_allContext.class,i);
		}
		public List<Math_op1Context> math_op1() {
			return getRuleContexts(Math_op1Context.class);
		}
		public Math_op1Context math_op1(int i) {
			return getRuleContext(Math_op1Context.class,i);
		}
		public Math_expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr1Context math_expr1() throws RecognitionException {
		Math_expr1Context _localctx = new Math_expr1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_math_expr1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			math_expr_all();
			setState(1020);
			math_op1();
			setState(1021);
			math_expr_all();
			setState(1027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022);
					math_op1();
					setState(1023);
					math_expr_all();
					}
					} 
				}
				setState(1029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr1_withbracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Math_expr1Context math_expr1() {
			return getRuleContext(Math_expr1Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Math_expr1_withbracketsContext math_expr1_withbrackets() {
			return getRuleContext(Math_expr1_withbracketsContext.class,0);
		}
		public Math_expr1_withbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr1_withbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr1_withbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr1_withbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr1_withbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr1_withbracketsContext math_expr1_withbrackets() throws RecognitionException {
		Math_expr1_withbracketsContext _localctx = new Math_expr1_withbracketsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_math_expr1_withbrackets);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(OPEN_PAR);
				setState(1031);
				math_expr1();
				setState(1032);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				match(OPEN_PAR);
				setState(1035);
				math_expr1_withbrackets();
				setState(1036);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr2Context extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Math_op2Context math_op2() {
			return getRuleContext(Math_op2Context.class,0);
		}
		public Math_expr_allContext math_expr_all() {
			return getRuleContext(Math_expr_allContext.class,0);
		}
		public Math_expr1Context math_expr1() {
			return getRuleContext(Math_expr1Context.class,0);
		}
		public Assingment_rule_without_bracketContext assingment_rule_without_bracket() {
			return getRuleContext(Assingment_rule_without_bracketContext.class,0);
		}
		public Math_expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr2Context math_expr2() throws RecognitionException {
		Math_expr2Context _localctx = new Math_expr2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_math_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			any_name();
			setState(1041);
			math_op2();
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1042);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1043);
				math_expr1();
				}
				break;
			case 3:
				{
				setState(1044);
				assingment_rule_without_bracket();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr2_withbracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Math_expr2Context math_expr2() {
			return getRuleContext(Math_expr2Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Math_expr2_withbracketsContext math_expr2_withbrackets() {
			return getRuleContext(Math_expr2_withbracketsContext.class,0);
		}
		public Math_expr2_withbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr2_withbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr2_withbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr2_withbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr2_withbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr2_withbracketsContext math_expr2_withbrackets() throws RecognitionException {
		Math_expr2_withbracketsContext _localctx = new Math_expr2_withbracketsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_math_expr2_withbrackets);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				match(OPEN_PAR);
				setState(1048);
				math_expr2();
				setState(1049);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				match(OPEN_PAR);
				setState(1052);
				math_expr2_withbrackets();
				setState(1053);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr3Context extends ParserRuleContext {
		public Math_op3Context math_op3() {
			return getRuleContext(Math_op3Context.class,0);
		}
		public List<Math_expr_allContext> math_expr_all() {
			return getRuleContexts(Math_expr_allContext.class);
		}
		public Math_expr_allContext math_expr_all(int i) {
			return getRuleContext(Math_expr_allContext.class,i);
		}
		public List<Math_expr1Context> math_expr1() {
			return getRuleContexts(Math_expr1Context.class);
		}
		public Math_expr1Context math_expr1(int i) {
			return getRuleContext(Math_expr1Context.class,i);
		}
		public Math_expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr3Context math_expr3() throws RecognitionException {
		Math_expr3Context _localctx = new Math_expr3Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_math_expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1057);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1058);
				math_expr1();
				}
				break;
			}
			setState(1061);
			math_op3();
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1062);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1063);
				math_expr1();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr3_withbracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Math_expr3Context math_expr3() {
			return getRuleContext(Math_expr3Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Math_expr3_withbracketsContext math_expr3_withbrackets() {
			return getRuleContext(Math_expr3_withbracketsContext.class,0);
		}
		public Math_expr3_withbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr3_withbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr3_withbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr3_withbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr3_withbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr3_withbracketsContext math_expr3_withbrackets() throws RecognitionException {
		Math_expr3_withbracketsContext _localctx = new Math_expr3_withbracketsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_math_expr3_withbrackets);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(OPEN_PAR);
				setState(1067);
				math_expr3();
				setState(1068);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(OPEN_PAR);
				setState(1071);
				math_expr3_withbrackets();
				setState(1072);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expr_without_digitContext extends ParserRuleContext {
		public Math_expr1Context math_expr1() {
			return getRuleContext(Math_expr1Context.class,0);
		}
		public Math_expr1_withbracketsContext math_expr1_withbrackets() {
			return getRuleContext(Math_expr1_withbracketsContext.class,0);
		}
		public Math_expr2Context math_expr2() {
			return getRuleContext(Math_expr2Context.class,0);
		}
		public Math_expr2_withbracketsContext math_expr2_withbrackets() {
			return getRuleContext(Math_expr2_withbracketsContext.class,0);
		}
		public Math_expr_plusContext math_expr_plus() {
			return getRuleContext(Math_expr_plusContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Math_expr_without_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr_without_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMath_expr_without_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMath_expr_without_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMath_expr_without_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expr_without_digitContext math_expr_without_digit() throws RecognitionException {
		Math_expr_without_digitContext _localctx = new Math_expr_without_digitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_math_expr_without_digit);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				math_expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				math_expr1_withbrackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				math_expr2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				math_expr2_withbrackets();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1080);
				math_expr_plus();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_mathematicContext extends ParserRuleContext {
		public Math_expr_allContext math_expr_all() {
			return getRuleContext(Math_expr_allContext.class,0);
		}
		public Math_expr1Context math_expr1() {
			return getRuleContext(Math_expr1Context.class,0);
		}
		public Math_expr2Context math_expr2() {
			return getRuleContext(Math_expr2Context.class,0);
		}
		public Result_mathematicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_mathematic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_mathematic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_mathematic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_mathematic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_mathematicContext result_mathematic() throws RecognitionException {
		Result_mathematicContext _localctx = new Result_mathematicContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_result_mathematic);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				math_expr_all();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				math_expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				math_expr2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expr1Context extends ParserRuleContext {
		public Logic_operator1Context logic_operator1() {
			return getRuleContext(Logic_operator1Context.class,0);
		}
		public List<Assingment_rule_with_bracketContext> assingment_rule_with_bracket() {
			return getRuleContexts(Assingment_rule_with_bracketContext.class);
		}
		public Assingment_rule_with_bracketContext assingment_rule_with_bracket(int i) {
			return getRuleContext(Assingment_rule_with_bracketContext.class,i);
		}
		public List<Math_expr_allContext> math_expr_all() {
			return getRuleContexts(Math_expr_allContext.class);
		}
		public Math_expr_allContext math_expr_all(int i) {
			return getRuleContext(Math_expr_allContext.class,i);
		}
		public List<Math_expr1Context> math_expr1() {
			return getRuleContexts(Math_expr1Context.class);
		}
		public Math_expr1Context math_expr1(int i) {
			return getRuleContext(Math_expr1Context.class,i);
		}
		public List<TerminalNode> K_TRUE() { return getTokens(SqlParser.K_TRUE); }
		public TerminalNode K_TRUE(int i) {
			return getToken(SqlParser.K_TRUE, i);
		}
		public List<TerminalNode> K_FALSE() { return getTokens(SqlParser.K_FALSE); }
		public TerminalNode K_FALSE(int i) {
			return getToken(SqlParser.K_FALSE, i);
		}
		public List<Math_expr3Context> math_expr3() {
			return getRuleContexts(Math_expr3Context.class);
		}
		public Math_expr3Context math_expr3(int i) {
			return getRuleContext(Math_expr3Context.class,i);
		}
		public List<Math_expr3_withbracketsContext> math_expr3_withbrackets() {
			return getRuleContexts(Math_expr3_withbracketsContext.class);
		}
		public Math_expr3_withbracketsContext math_expr3_withbrackets(int i) {
			return getRuleContext(Math_expr3_withbracketsContext.class,i);
		}
		public Logic_expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_expr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_expr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_expr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expr1Context logic_expr1() throws RecognitionException {
		Logic_expr1Context _localctx = new Logic_expr1Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_logic_expr1);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1089);
					assingment_rule_with_bracket();
					}
					break;
				case 2:
					{
					setState(1090);
					math_expr_all();
					}
					break;
				case 3:
					{
					setState(1091);
					math_expr1();
					}
					break;
				case 4:
					{
					setState(1092);
					match(K_TRUE);
					}
					break;
				case 5:
					{
					setState(1093);
					match(K_FALSE);
					}
					break;
				}
				setState(1096);
				logic_operator1();
				setState(1102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1097);
					assingment_rule_with_bracket();
					}
					break;
				case 2:
					{
					setState(1098);
					math_expr1();
					}
					break;
				case 3:
					{
					setState(1099);
					math_expr_all();
					}
					break;
				case 4:
					{
					setState(1100);
					match(K_TRUE);
					}
					break;
				case 5:
					{
					setState(1101);
					match(K_FALSE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1104);
					math_expr3();
					}
					break;
				case 2:
					{
					setState(1105);
					math_expr3_withbrackets();
					}
					break;
				}
				setState(1108);
				logic_operator1();
				setState(1111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1109);
					math_expr3();
					}
					break;
				case 2:
					{
					setState(1110);
					math_expr3_withbrackets();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				math_expr3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expr1_withbracetsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logic_expr1Context logic_expr1() {
			return getRuleContext(Logic_expr1Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logic_expr1_withbracetsContext logic_expr1_withbracets() {
			return getRuleContext(Logic_expr1_withbracetsContext.class,0);
		}
		public Logic_expr1_withbracetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr1_withbracets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_expr1_withbracets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_expr1_withbracets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_expr1_withbracets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expr1_withbracetsContext logic_expr1_withbracets() throws RecognitionException {
		Logic_expr1_withbracetsContext _localctx = new Logic_expr1_withbracetsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_logic_expr1_withbracets);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				match(OPEN_PAR);
				setState(1117);
				logic_expr1();
				setState(1118);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(OPEN_PAR);
				setState(1121);
				logic_expr1_withbracets();
				setState(1122);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_allContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Logic_expr1Context logic_expr1() {
			return getRuleContext(Logic_expr1Context.class,0);
		}
		public Logic_expr1_withbracetsContext logic_expr1_withbracets() {
			return getRuleContext(Logic_expr1_withbracetsContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public Logic_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_allContext logic_all() throws RecognitionException {
		Logic_allContext _localctx = new Logic_allContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_logic_all);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				logic_expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				logic_expr1_withbracets();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				match(K_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				match(K_FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expr2Context extends ParserRuleContext {
		public List<Logic_allContext> logic_all() {
			return getRuleContexts(Logic_allContext.class);
		}
		public Logic_allContext logic_all(int i) {
			return getRuleContext(Logic_allContext.class,i);
		}
		public List<Logic_operator2Context> logic_operator2() {
			return getRuleContexts(Logic_operator2Context.class);
		}
		public Logic_operator2Context logic_operator2(int i) {
			return getRuleContext(Logic_operator2Context.class,i);
		}
		public Logic_expr1Context logic_expr1() {
			return getRuleContext(Logic_expr1Context.class,0);
		}
		public Logic_expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_expr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_expr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_expr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expr2Context logic_expr2() throws RecognitionException {
		Logic_expr2Context _localctx = new Logic_expr2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_logic_expr2);
		int _la;
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				logic_all();
				setState(1134);
				logic_operator2();
				setState(1135);
				logic_all();
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10 || _la==PIPE2) {
					{
					{
					setState(1136);
					logic_operator2();
					setState(1137);
					logic_all();
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				logic_expr1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expr2_withbracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logic_expr2Context logic_expr2() {
			return getRuleContext(Logic_expr2Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logic_expr1_withbracetsContext logic_expr1_withbracets() {
			return getRuleContext(Logic_expr1_withbracetsContext.class,0);
		}
		public Logic_expr2_withbracketsContext logic_expr2_withbrackets() {
			return getRuleContext(Logic_expr2_withbracketsContext.class,0);
		}
		public Logic_expr2_withbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr2_withbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_expr2_withbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_expr2_withbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_expr2_withbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expr2_withbracketsContext logic_expr2_withbrackets() throws RecognitionException {
		Logic_expr2_withbracketsContext _localctx = new Logic_expr2_withbracketsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_logic_expr2_withbrackets);
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(OPEN_PAR);
				setState(1148);
				logic_expr2();
				setState(1149);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				logic_expr1_withbracets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				match(OPEN_PAR);
				setState(1153);
				logic_expr2_withbrackets();
				setState(1154);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_resaultContext extends ParserRuleContext {
		public Logic_expr2Context logic_expr2() {
			return getRuleContext(Logic_expr2Context.class,0);
		}
		public Logic_expr2_withbracketsContext logic_expr2_withbrackets() {
			return getRuleContext(Logic_expr2_withbracketsContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Logic_resaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_resault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogic_resault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogic_resault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogic_resault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_resaultContext logic_resault() throws RecognitionException {
		Logic_resaultContext _localctx = new Logic_resaultContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_logic_resault);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				logic_expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				logic_expr2_withbrackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				match(K_TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1161);
				match(K_FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1162);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assingment_rule_without_bracketContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Result_mathematicContext result_mathematic() {
			return getRuleContext(Result_mathematicContext.class,0);
		}
		public Assingment_rule_without_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_rule_without_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssingment_rule_without_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssingment_rule_without_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssingment_rule_without_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_rule_without_bracketContext assingment_rule_without_bracket() throws RecognitionException {
		Assingment_rule_without_bracketContext _localctx = new Assingment_rule_without_bracketContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assingment_rule_without_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			identifier();
			setState(1166);
			match(ASSIGN);
			setState(1167);
			result_mathematic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assingment_rule_with_bracketContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Result_mathematicContext result_mathematic() {
			return getRuleContext(Result_mathematicContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Assingment_rule_with_bracketContext assingment_rule_with_bracket() {
			return getRuleContext(Assingment_rule_with_bracketContext.class,0);
		}
		public Assingment_rule_with_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_rule_with_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssingment_rule_with_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssingment_rule_with_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssingment_rule_with_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_rule_with_bracketContext assingment_rule_with_bracket() throws RecognitionException {
		Assingment_rule_with_bracketContext _localctx = new Assingment_rule_with_bracketContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assingment_rule_with_bracket);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				match(OPEN_PAR);
				setState(1170);
				identifier();
				setState(1171);
				match(ASSIGN);
				setState(1172);
				result_mathematic();
				setState(1173);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				match(OPEN_PAR);
				setState(1176);
				assingment_rule_with_bracket();
				setState(1177);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assingment_rule_with_scolContext extends ParserRuleContext {
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Assingment_rule_without_bracketContext assingment_rule_without_bracket() {
			return getRuleContext(Assingment_rule_without_bracketContext.class,0);
		}
		public Assingment_rule_with_bracketContext assingment_rule_with_bracket() {
			return getRuleContext(Assingment_rule_with_bracketContext.class,0);
		}
		public Assingment_rule_with_scolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_rule_with_scol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssingment_rule_with_scol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssingment_rule_with_scol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssingment_rule_with_scol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_rule_with_scolContext assingment_rule_with_scol() throws RecognitionException {
		Assingment_rule_with_scolContext _localctx = new Assingment_rule_with_scolContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assingment_rule_with_scol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1181);
				assingment_rule_without_bracket();
				}
				break;
			case 2:
				{
				setState(1182);
				assingment_rule_with_bracket();
				}
				break;
			}
			setState(1185);
			match(CLOSE_BLOCK);
			setState(1186);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assingment_rule_without_scolContext extends ParserRuleContext {
		public Assingment_rule_without_bracketContext assingment_rule_without_bracket() {
			return getRuleContext(Assingment_rule_without_bracketContext.class,0);
		}
		public Assingment_rule_with_bracketContext assingment_rule_with_bracket() {
			return getRuleContext(Assingment_rule_with_bracketContext.class,0);
		}
		public Assingment_rule_without_scolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_rule_without_scol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssingment_rule_without_scol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssingment_rule_without_scol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssingment_rule_without_scol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_rule_without_scolContext assingment_rule_without_scol() throws RecognitionException {
		Assingment_rule_without_scolContext _localctx = new Assingment_rule_without_scolContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assingment_rule_without_scol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1188);
				assingment_rule_without_bracket();
				}
				break;
			case 2:
				{
				setState(1189);
				assingment_rule_with_bracket();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(K_ALTER);
			setState(1193);
			match(K_TABLE);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1194);
				database_name();
				setState(1195);
				match(DOT);
				}
				break;
			}
			setState(1199);
			source_table_name();
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1200);
				match(K_RENAME);
				setState(1201);
				match(K_TO);
				setState(1202);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(1203);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(1204);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(1205);
				match(K_ADD);
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(1206);
					match(K_COLUMN);
					}
				}

				setState(1209);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(K_ADD);
			setState(1213);
			match(K_CONSTRAINT);
			setState(1214);
			any_name();
			setState(1215);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(K_ADD);
			setState(1218);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(K_CREATE);
			setState(1221);
			match(K_TABLE);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1222);
				match(K_IF);
				setState(1223);
				match(K_NOT);
				setState(1224);
				match(K_EXISTS);
				}
			}

			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1227);
				database_name();
				setState(1228);
				match(DOT);
				}
				break;
			}
			setState(1232);
			table_name();
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(1233);
				match(OPEN_PAR);
				setState(1234);
				column_def();
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(1239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1235);
						match(COMMA);
						setState(1236);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(1237);
						match(COMMA);
						setState(1238);
						column_def();
						}
						break;
					}
					}
					setState(1243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1244);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(1246);
				match(K_AS);
				setState(1247);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(K_DELETE);
			setState(1251);
			match(K_FROM);
			setState(1252);
			qualified_table_name();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1253);
				match(K_WHERE);
				setState(1254);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(K_DROP);
			setState(1258);
			match(K_TABLE);
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1259);
				match(K_IF);
				setState(1260);
				match(K_EXISTS);
				}
			}

			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1263);
				database_name();
				setState(1264);
				match(DOT);
				}
				break;
			}
			setState(1268);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			select_core();
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1271);
				match(K_ORDER);
				setState(1272);
				match(K_BY);
				setState(1273);
				ordering_term();
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1274);
					match(COMMA);
					setState(1275);
					ordering_term();
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1283);
				match(K_LIMIT);
				setState(1284);
				expr(0);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1285);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1286);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(K_INSERT);
			setState(1292);
			match(K_INTO);
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1293);
				database_name();
				setState(1294);
				match(DOT);
				}
				break;
			}
			setState(1298);
			table_name();
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1299);
				match(OPEN_PAR);
				setState(1300);
				column_name();
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1301);
					match(COMMA);
					setState(1302);
					column_name();
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1308);
				match(CLOSE_PAR);
				}
			}

			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1312);
				match(K_VALUES);
				setState(1313);
				match(OPEN_PAR);
				setState(1314);
				expr(0);
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1315);
					match(COMMA);
					setState(1316);
					expr(0);
					}
					}
					setState(1321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1322);
				match(CLOSE_PAR);
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1323);
					match(COMMA);
					setState(1324);
					match(OPEN_PAR);
					setState(1325);
					expr(0);
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1326);
						match(COMMA);
						setState(1327);
						expr(0);
						}
						}
						setState(1332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1333);
					match(CLOSE_PAR);
					}
					}
					setState(1339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1340);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1341);
				match(K_DEFAULT);
				setState(1342);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			select_or_values();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1346);
				match(K_ORDER);
				setState(1347);
				match(K_BY);
				setState(1348);
				ordering_term();
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1349);
					match(COMMA);
					setState(1350);
					ordering_term();
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1358);
				match(K_LIMIT);
				setState(1359);
				expr(0);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1360);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1361);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				match(K_SELECT);
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1367);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1370);
				result_column();
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1371);
						match(COMMA);
						setState(1372);
						result_column();
						}
						} 
					}
					setState(1377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1378);
					match(K_FROM);
					setState(1388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1379);
						table_or_subquery();
						setState(1384);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1380);
								match(COMMA);
								setState(1381);
								table_or_subquery();
								}
								} 
							}
							setState(1386);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1387);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1392);
					match(K_WHERE);
					setState(1393);
					expr(0);
					}
				}

				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1396);
					match(K_GROUP);
					setState(1397);
					match(K_BY);
					setState(1398);
					expr(0);
					setState(1403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1399);
							match(COMMA);
							setState(1400);
							expr(0);
							}
							} 
						}
						setState(1405);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
					}
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1406);
						match(K_HAVING);
						setState(1407);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(K_VALUES);
				setState(1413);
				match(OPEN_PAR);
				setState(1414);
				expr(0);
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1415);
					match(COMMA);
					setState(1416);
					expr(0);
					}
					}
					setState(1421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1422);
				match(CLOSE_PAR);
				setState(1437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1423);
						match(COMMA);
						setState(1424);
						match(OPEN_PAR);
						setState(1425);
						expr(0);
						setState(1430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1426);
							match(COMMA);
							setState(1427);
							expr(0);
							}
							}
							setState(1432);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1433);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(K_UPDATE);
			setState(1443);
			qualified_table_name();
			setState(1444);
			match(K_SET);
			setState(1445);
			column_name();
			setState(1446);
			match(ASSIGN);
			setState(1447);
			expr(0);
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1448);
				match(COMMA);
				setState(1449);
				column_name();
				setState(1450);
				match(ASSIGN);
				setState(1451);
				expr(0);
				}
				}
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1458);
				match(K_WHERE);
				setState(1459);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			column_name();
			setState(1467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1465);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
						{
						setState(1463);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1464);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			name();
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1471);
				match(OPEN_PAR);
				setState(1472);
				signed_number();
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1473);
					any_name();
					}
				}

				setState(1476);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1478);
				match(OPEN_PAR);
				setState(1479);
				signed_number();
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1480);
					any_name();
					}
				}

				setState(1483);
				match(COMMA);
				setState(1484);
				signed_number();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1485);
					any_name();
					}
				}

				setState(1488);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1492);
				match(K_CONSTRAINT);
				setState(1493);
				name();
				}
			}

			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1496);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1497);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1498);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1499);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
				setState(1500);
				match(K_CHECK);
				setState(1501);
				match(OPEN_PAR);
				setState(1502);
				expr(0);
				setState(1503);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1505);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1506);
				match(K_COLLATE);
				setState(1507);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(K_PRIMARY);
			setState(1511);
			match(K_KEY);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1512);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(1515);
				match(K_AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(K_NOT);
			setState(1521);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(K_DEFAULT);
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1526);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1527);
				match(OPEN_PAR);
				setState(1528);
				expr(0);
				setState(1529);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1531);
				match(K_NEXTVAL);
				setState(1532);
				match(OPEN_PAR);
				setState(1533);
				expr(0);
				setState(1534);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1536);
				any_name();
				}
				break;
			}
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1539);
				match(T__11);
				setState(1541); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1540);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1543); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1547);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1548);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1552);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1553);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1557);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1554);
						database_name();
						setState(1555);
						match(DOT);
						}
						break;
					}
					setState(1559);
					table_name();
					setState(1560);
					match(DOT);
					}
					break;
				}
				setState(1564);
				column_name();
				}
				break;
			case 4:
				{
				setState(1565);
				unary_operator();
				setState(1566);
				expr(12);
				}
				break;
			case 5:
				{
				setState(1568);
				function_name();
				setState(1569);
				match(OPEN_PAR);
				setState(1582);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_EXISTS:
				case K_NOT:
				case K_NULL:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1570);
						match(K_DISTINCT);
						}
					}

					setState(1573);
					expr(0);
					setState(1578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1574);
						match(COMMA);
						setState(1575);
						expr(0);
						}
						}
						setState(1580);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1581);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1584);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1586);
				match(OPEN_PAR);
				setState(1587);
				expr(0);
				setState(1588);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1590);
						match(K_NOT);
						}
					}

					setState(1593);
					match(K_EXISTS);
					}
				}

				setState(1596);
				match(OPEN_PAR);
				setState(1597);
				select_stmt();
				setState(1598);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1639);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1602);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1603);
						match(PIPE2);
						setState(1604);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1605);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1606);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1607);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1608);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1609);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1610);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1611);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1612);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1613);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1614);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1615);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1616);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1617);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1630);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							setState(1618);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1619);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1620);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1621);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1622);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1623);
							match(K_IS);
							setState(1624);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1625);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1626);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1627);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1628);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1629);
							match(K_REGEXP);
							}
							break;
						}
						setState(1632);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1633);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1634);
						match(K_AND);
						setState(1635);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1636);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1637);
						match(K_OR);
						setState(1638);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(K_REFERENCES);
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1645);
				database_name();
				setState(1646);
				match(DOT);
				}
				break;
			}
			setState(1650);
			foreign_table();
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1651);
				match(OPEN_PAR);
				setState(1652);
				fk_target_column_name();
				setState(1657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1653);
					match(COMMA);
					setState(1654);
					fk_target_column_name();
					}
					}
					setState(1659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1660);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1664);
					match(K_ON);
					setState(1665);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1674);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1666);
						match(K_SET);
						setState(1667);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1668);
						match(K_SET);
						setState(1669);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1670);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1671);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1672);
						match(K_NO);
						setState(1673);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1676);
					match(K_MATCH);
					setState(1677);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1685);
					match(K_NOT);
					}
				}

				setState(1688);
				match(K_DEFERRABLE);
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1689);
					match(K_INITIALLY);
					setState(1690);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1691);
					match(K_INITIALLY);
					setState(1692);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1695);
					match(K_ENABLE);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			column_name();
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1703);
				match(K_COLLATE);
				setState(1704);
				collation_name();
				}
			}

			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1707);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1710);
				match(K_CONSTRAINT);
				setState(1711);
				name();
				}
			}

			setState(1723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1714);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1715);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1716);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1717);
				match(K_CHECK);
				setState(1718);
				match(OPEN_PAR);
				setState(1719);
				expr(0);
				setState(1720);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1722);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(K_PRIMARY);
			setState(1726);
			match(K_KEY);
			setState(1727);
			match(OPEN_PAR);
			setState(1728);
			indexed_column();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1729);
				match(COMMA);
				setState(1730);
				indexed_column();
				}
				}
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1736);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(K_FOREIGN);
			setState(1739);
			match(K_KEY);
			setState(1740);
			match(OPEN_PAR);
			setState(1741);
			fk_origin_column_name();
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1742);
				match(COMMA);
				setState(1743);
				fk_origin_column_name();
				}
				}
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1749);
			match(CLOSE_PAR);
			setState(1750);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(K_UNIQUE);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1753);
				match(K_KEY);
				}
			}

			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1756);
				name();
				}
				break;
			}
			setState(1759);
			match(OPEN_PAR);
			setState(1760);
			indexed_column();
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1761);
				match(COMMA);
				setState(1762);
				indexed_column();
				}
				}
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1768);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(K_KEY);
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1771);
				name();
				}
				break;
			}
			setState(1774);
			match(OPEN_PAR);
			setState(1775);
			indexed_column();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1776);
				match(COMMA);
				setState(1777);
				indexed_column();
				}
				}
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1783);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1787);
				database_name();
				setState(1788);
				match(DOT);
				}
				break;
			}
			setState(1792);
			table_name();
			setState(1798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1793);
				match(K_INDEXED);
				setState(1794);
				match(K_BY);
				setState(1795);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1796);
				match(K_NOT);
				setState(1797);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case OPEN_PAR:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case IDENTIFIER:
			case STRING_LITERAL:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			expr(0);
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1801);
				match(K_COLLATE);
				setState(1802);
				collation_name();
				}
			}

			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1805);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pragma_value);
		try {
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1809);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1810);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			table_name();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1814);
				match(OPEN_PAR);
				setState(1815);
				column_name();
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1816);
					match(COMMA);
					setState(1817);
					column_name();
					}
					}
					setState(1822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1823);
				match(CLOSE_PAR);
				}
			}

			setState(1827);
			match(K_AS);
			setState(1828);
			match(OPEN_PAR);
			setState(1829);
			select_stmt();
			setState(1830);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_result_column);
		int _la;
		try {
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1833);
				table_name();
				setState(1834);
				match(DOT);
				setState(1835);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1837);
				expr(0);
				setState(1842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1838);
						match(K_AS);
						}
					}

					setState(1841);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_table_or_subquery);
		int _la;
		try {
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1846);
					database_name();
					setState(1847);
					match(DOT);
					}
					break;
				}
				setState(1851);
				table_name();
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1853);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1852);
						match(K_AS);
						}
					}

					setState(1855);
					table_alias();
					}
					break;
				}
				setState(1863);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1858);
					match(K_INDEXED);
					setState(1859);
					match(K_BY);
					setState(1860);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1861);
					match(K_NOT);
					setState(1862);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case OPEN_PAR:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case K_WHERE:
				case IDENTIFIER:
				case STRING_LITERAL:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1865);
				match(OPEN_PAR);
				setState(1875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1866);
					table_or_subquery();
					setState(1871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1867);
						match(COMMA);
						setState(1868);
						table_or_subquery();
						}
						}
						setState(1873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1874);
					join_clause();
					}
					break;
				}
				setState(1877);
				match(CLOSE_PAR);
				setState(1882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1878);
						match(K_AS);
						}
					}

					setState(1881);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1884);
				match(OPEN_PAR);
				setState(1885);
				select_stmt();
				setState(1886);
				match(CLOSE_PAR);
				setState(1891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1887);
						match(K_AS);
						}
					}

					setState(1890);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			table_or_subquery();
			setState(1902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1896);
					join_operator();
					setState(1897);
					table_or_subquery();
					setState(1898);
					join_constraint();
					}
					} 
				}
				setState(1904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_join_operator);
		int _la;
		try {
			setState(1914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1906);
					match(K_LEFT);
					setState(1908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1907);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1910);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1913);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1916);
				match(K_ON);
				setState(1917);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_select_core);
		int _la;
		try {
			setState(1994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				match(K_SELECT);
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1921);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1924);
				result_column();
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1925);
					match(COMMA);
					setState(1926);
					result_column();
					}
					}
					setState(1931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1932);
					match(K_FROM);
					setState(1942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						setState(1933);
						table_or_subquery();
						setState(1938);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1934);
							match(COMMA);
							setState(1935);
							table_or_subquery();
							}
							}
							setState(1940);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1941);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1946);
					match(K_WHERE);
					setState(1947);
					expr(0);
					}
				}

				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1950);
					match(K_GROUP);
					setState(1951);
					match(K_BY);
					setState(1952);
					expr(0);
					setState(1957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1953);
						match(COMMA);
						setState(1954);
						expr(0);
						}
						}
						setState(1959);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1962);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1960);
						match(K_HAVING);
						setState(1961);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1966);
				match(K_VALUES);
				setState(1967);
				match(OPEN_PAR);
				setState(1968);
				expr(0);
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1969);
					match(COMMA);
					setState(1970);
					expr(0);
					}
					}
					setState(1975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1976);
				match(CLOSE_PAR);
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1977);
					match(COMMA);
					setState(1978);
					match(OPEN_PAR);
					setState(1979);
					expr(0);
					setState(1984);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1980);
						match(COMMA);
						setState(1981);
						expr(0);
						}
						}
						setState(1986);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1987);
					match(CLOSE_PAR);
					}
					}
					setState(1993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			table_name();
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1997);
				match(OPEN_PAR);
				setState(1998);
				column_name();
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1999);
					match(COMMA);
					setState(2000);
					column_name();
					}
					}
					setState(2005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2006);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2010);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2013);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2014);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & ((1L << (NUMERIC_LITERAL - 180)) | (1L << (STRING_LITERAL - 180)) | (1L << (BLOB_LITERAL - 180)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_module_argument);
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2024);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_CONTINUE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2031);
				matchWildcard();
				}
				}
				setState(2034); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << OPEN_BRACKETS) | (1L << CLOSE_BRACKETS) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_FUNCTION) | (1L << K_RETURN) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_WHILE - 64)) | (1L << (K_DO - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (MULTILINE_COMMENT - 128)) | (1L << (SPACES - 128)) | (1L << (UNEXPECTED_CHAR - 128)) | (1L << (DIGIT - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_any_name);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2072);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2073);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2074);
				match(OPEN_PAR);
				setState(2075);
				any_name();
				setState(2076);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 86:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bd\u0823\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\3\2\7\2\u0111\n\2\f\2\16"+
		"\2\u0114\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u011c\n\4\f\4\16\4\u011f\13"+
		"\4\3\4\3\4\6\4\u0123\n\4\r\4\16\4\u0124\3\4\7\4\u0128\n\4\f\4\16\4\u012b"+
		"\13\4\3\4\7\4\u012e\n\4\f\4\16\4\u0131\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u013b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u014b\n\6\f\6\16\6\u014e\13\6\3\6\5\6\u0151\n\6\3\7\7\7\u0154"+
		"\n\7\f\7\16\7\u0157\13\7\3\7\5\7\u015a\n\7\3\7\3\7\3\7\3\7\5\7\u0160\n"+
		"\7\3\b\3\b\7\b\u0164\n\b\f\b\16\b\u0167\13\b\3\b\5\b\u016a\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u017c\n\t"+
		"\f\t\16\t\u017f\13\t\3\t\5\t\u0182\n\t\3\n\7\n\u0185\n\n\f\n\16\n\u0188"+
		"\13\n\3\n\3\n\5\n\u018c\n\n\3\n\3\n\3\n\3\n\5\n\u0192\n\n\3\13\3\13\7"+
		"\13\u0196\n\13\f\13\16\13\u0199\13\13\3\13\5\13\u019c\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01a7\n\f\f\f\16\f\u01aa\13\f\3\f\3\f\5\f"+
		"\u01ae\n\f\3\r\3\r\3\r\3\r\7\r\u01b4\n\r\f\r\16\r\u01b7\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01c2\n\16\f\16\16\16\u01c5\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u01cc\n\16\f\16\16\16\u01cf\13\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01dd"+
		"\n\17\f\17\16\17\u01e0\13\17\3\17\3\17\5\17\u01e4\n\17\5\17\u01e6\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01f1\n\20\5\20\u01f3"+
		"\n\20\3\20\5\20\u01f6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0201\n\20\5\20\u0203\n\20\3\20\5\20\u0206\n\20\7\20\u0208\n\20"+
		"\f\20\16\20\u020b\13\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0218\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0220\n\22"+
		"\7\22\u0222\n\22\f\22\16\22\u0225\13\22\7\22\u0227\n\22\f\22\16\22\u022a"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\5\23\u0231\n\23\3\23\3\23\3\24\3\24\5"+
		"\24\u0237\n\24\3\24\7\24\u023a\n\24\f\24\16\24\u023d\13\24\3\24\5\24\u0240"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0248\n\25\3\25\3\25\3\25\7\25"+
		"\u024d\n\25\f\25\16\25\u0250\13\25\3\25\5\25\u0253\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\5\26\u025a\n\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0262\n"+
		"\27\f\27\16\27\u0265\13\27\3\27\3\27\3\27\3\27\3\27\7\27\u026c\n\27\f"+
		"\27\16\27\u026f\13\27\3\30\3\30\3\30\3\30\3\30\7\30\u0276\n\30\f\30\16"+
		"\30\u0279\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0281\n\30\f\30\16"+
		"\30\u0284\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u0290\n\30\f\30\16\30\u0293\13\30\5\30\u0295\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u029e\n\31\3\31\3\31\5\31\u02a2\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u02a9\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u02b4\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u02bf\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02d3\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u02df\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u02ec\n\35\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u02f3\n\36\f\36\16\36\u02f6\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0300\n\36\5\36\u0302\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u0309"+
		"\n\37\f\37\16\37\u030c\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0317\n\37\5\37\u0319\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u0326\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0330\n \5 \u0332\n \3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u033b\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0348\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0352\n\"\5\"\u0354\n\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0360\n#\3#\3#\3#\3#\3#\5#\u0367\n#"+
		"\3#\3#\3#\3#\3#\5#\u036e\n#\3#\3#\3#\3#\3#\5#\u0375\n#\7#\u0377\n#\f#"+
		"\16#\u037a\13#\3#\3#\3#\3#\3#\3#\5#\u0382\n#\5#\u0384\n#\7#\u0386\n#\f"+
		"#\16#\u0389\13#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0393\n$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u039e\n%\3%\3%\3%\3%\3%\5%\u03a5\n%\3&\3&\3&\3&\5&\u03ab"+
		"\n&\3&\3&\3\'\3\'\3(\3(\5(\u03b3\n(\3)\3)\5)\u03b7\n)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u03cb\n-\3.\3.\3.\3.\3.\5.\u03d2"+
		"\n.\3/\3/\3/\3/\5/\u03d8\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03ee"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u03fc\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0404\n\62\f\62\16\62\u0407"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0411\n\63\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u0418\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0422\n\65\3\66\3\66\5\66\u0426\n\66\3\66\3\66\3\66\5\66\u042b"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0435\n\67\38\38\3"+
		"8\38\38\38\58\u043d\n8\39\39\39\59\u0442\n9\3:\3:\3:\3:\3:\5:\u0449\n"+
		":\3:\3:\3:\3:\3:\3:\5:\u0451\n:\3:\3:\5:\u0455\n:\3:\3:\3:\5:\u045a\n"+
		":\3:\5:\u045d\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0467\n;\3<\3<\3<\3<\3<\5"+
		"<\u046e\n<\3=\3=\3=\3=\3=\3=\7=\u0476\n=\f=\16=\u0479\13=\3=\5=\u047c"+
		"\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0487\n>\3?\3?\3?\3?\3?\5?\u048e\n?"+
		"\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u049e\nA\3B\3B\5B\u04a2"+
		"\nB\3B\3B\3B\3C\3C\5C\u04a9\nC\3D\3D\3D\3D\3D\5D\u04b0\nD\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\5D\u04ba\nD\3D\5D\u04bd\nD\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\5G\u04cc\nG\3G\3G\3G\5G\u04d1\nG\3G\3G\3G\3G\3G\3G\3G\7G\u04da"+
		"\nG\fG\16G\u04dd\13G\3G\3G\3G\3G\5G\u04e3\nG\3H\3H\3H\3H\3H\5H\u04ea\n"+
		"H\3I\3I\3I\3I\5I\u04f0\nI\3I\3I\3I\5I\u04f5\nI\3I\3I\3J\3J\3J\3J\3J\3"+
		"J\7J\u04ff\nJ\fJ\16J\u0502\13J\5J\u0504\nJ\3J\3J\3J\3J\5J\u050a\nJ\5J"+
		"\u050c\nJ\3K\3K\3K\3K\3K\5K\u0513\nK\3K\3K\3K\3K\3K\7K\u051a\nK\fK\16"+
		"K\u051d\13K\3K\3K\5K\u0521\nK\3K\3K\3K\3K\3K\7K\u0528\nK\fK\16K\u052b"+
		"\13K\3K\3K\3K\3K\3K\3K\7K\u0533\nK\fK\16K\u0536\13K\3K\3K\7K\u053a\nK"+
		"\fK\16K\u053d\13K\3K\3K\3K\5K\u0542\nK\3L\3L\3L\3L\3L\3L\7L\u054a\nL\f"+
		"L\16L\u054d\13L\5L\u054f\nL\3L\3L\3L\3L\5L\u0555\nL\5L\u0557\nL\3M\3M"+
		"\5M\u055b\nM\3M\3M\3M\7M\u0560\nM\fM\16M\u0563\13M\3M\3M\3M\3M\7M\u0569"+
		"\nM\fM\16M\u056c\13M\3M\5M\u056f\nM\5M\u0571\nM\3M\3M\5M\u0575\nM\3M\3"+
		"M\3M\3M\3M\7M\u057c\nM\fM\16M\u057f\13M\3M\3M\5M\u0583\nM\5M\u0585\nM"+
		"\3M\3M\3M\3M\3M\7M\u058c\nM\fM\16M\u058f\13M\3M\3M\3M\3M\3M\3M\7M\u0597"+
		"\nM\fM\16M\u059a\13M\3M\3M\7M\u059e\nM\fM\16M\u05a1\13M\5M\u05a3\nM\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u05b0\nN\fN\16N\u05b3\13N\3N\3N\5N"+
		"\u05b7\nN\3O\3O\3O\7O\u05bc\nO\fO\16O\u05bf\13O\3P\3P\3P\3P\5P\u05c5\n"+
		"P\3P\3P\3P\3P\3P\5P\u05cc\nP\3P\3P\3P\5P\u05d1\nP\3P\3P\5P\u05d5\nP\3"+
		"Q\3Q\5Q\u05d9\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05e7\nQ\3R\3"+
		"R\3R\5R\u05ec\nR\3R\5R\u05ef\nR\3S\3S\3T\3T\3T\3U\3U\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\5V\u0604\nV\3V\3V\6V\u0608\nV\rV\16V\u0609\5V\u060c"+
		"\nV\3W\3W\5W\u0610\nW\3X\3X\3X\3X\3X\3X\5X\u0618\nX\3X\3X\3X\5X\u061d"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\5X\u0626\nX\3X\3X\3X\7X\u062b\nX\fX\16X\u062e"+
		"\13X\3X\5X\u0631\nX\3X\3X\3X\3X\3X\3X\3X\5X\u063a\nX\3X\5X\u063d\nX\3"+
		"X\3X\3X\3X\5X\u0643\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0661\nX\3X\3X\3X\3X\3X\3X\3"+
		"X\7X\u066a\nX\fX\16X\u066d\13X\3Y\3Y\3Y\3Y\5Y\u0673\nY\3Y\3Y\3Y\3Y\3Y"+
		"\7Y\u067a\nY\fY\16Y\u067d\13Y\3Y\3Y\5Y\u0681\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\5Y\u068d\nY\3Y\3Y\5Y\u0691\nY\7Y\u0693\nY\fY\16Y\u0696\13Y\3Y"+
		"\5Y\u0699\nY\3Y\3Y\3Y\3Y\3Y\5Y\u06a0\nY\3Y\5Y\u06a3\nY\5Y\u06a5\nY\3Z"+
		"\3Z\3[\3[\3[\5[\u06ac\n[\3[\5[\u06af\n[\3\\\3\\\5\\\u06b3\n\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u06be\n\\\3]\3]\3]\3]\3]\3]\7]\u06c6"+
		"\n]\f]\16]\u06c9\13]\3]\3]\3^\3^\3^\3^\3^\3^\7^\u06d3\n^\f^\16^\u06d6"+
		"\13^\3^\3^\3^\3_\3_\5_\u06dd\n_\3_\5_\u06e0\n_\3_\3_\3_\3_\7_\u06e6\n"+
		"_\f_\16_\u06e9\13_\3_\3_\3`\3`\5`\u06ef\n`\3`\3`\3`\3`\7`\u06f5\n`\f`"+
		"\16`\u06f8\13`\3`\3`\3a\3a\3b\3b\3b\5b\u0701\nb\3b\3b\3b\3b\3b\3b\5b\u0709"+
		"\nb\3c\3c\3c\5c\u070e\nc\3c\5c\u0711\nc\3d\3d\3d\5d\u0716\nd\3e\3e\3e"+
		"\3e\3e\7e\u071d\ne\fe\16e\u0720\13e\3e\3e\5e\u0724\ne\3e\3e\3e\3e\3e\3"+
		"f\3f\3f\3f\3f\3f\3f\5f\u0732\nf\3f\5f\u0735\nf\5f\u0737\nf\3g\3g\3g\5"+
		"g\u073c\ng\3g\3g\5g\u0740\ng\3g\5g\u0743\ng\3g\3g\3g\3g\3g\5g\u074a\n"+
		"g\3g\3g\3g\3g\7g\u0750\ng\fg\16g\u0753\13g\3g\5g\u0756\ng\3g\3g\5g\u075a"+
		"\ng\3g\5g\u075d\ng\3g\3g\3g\3g\5g\u0763\ng\3g\5g\u0766\ng\5g\u0768\ng"+
		"\3h\3h\3h\3h\3h\7h\u076f\nh\fh\16h\u0772\13h\3i\3i\3i\5i\u0777\ni\3i\5"+
		"i\u077a\ni\3i\5i\u077d\ni\3j\3j\5j\u0781\nj\3k\3k\5k\u0785\nk\3k\3k\3"+
		"k\7k\u078a\nk\fk\16k\u078d\13k\3k\3k\3k\3k\7k\u0793\nk\fk\16k\u0796\13"+
		"k\3k\5k\u0799\nk\5k\u079b\nk\3k\3k\5k\u079f\nk\3k\3k\3k\3k\3k\7k\u07a6"+
		"\nk\fk\16k\u07a9\13k\3k\3k\5k\u07ad\nk\5k\u07af\nk\3k\3k\3k\3k\3k\7k\u07b6"+
		"\nk\fk\16k\u07b9\13k\3k\3k\3k\3k\3k\3k\7k\u07c1\nk\fk\16k\u07c4\13k\3"+
		"k\3k\7k\u07c8\nk\fk\16k\u07cb\13k\5k\u07cd\nk\3l\3l\3l\3l\3l\7l\u07d4"+
		"\nl\fl\16l\u07d7\13l\3l\3l\5l\u07db\nl\3m\5m\u07de\nm\3m\3m\5m\u07e2\n"+
		"m\3n\3n\3o\3o\3p\3p\3q\3q\5q\u07ec\nq\3r\3r\3s\3s\3t\6t\u07f3\nt\rt\16"+
		"t\u07f4\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3"+
		"\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0821\n\u0087\3\u0087\2\3\u00ae\u0088"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\2\24\3\2\u00b5\u00b6\3\2\6\7\4\2\31\31\36\37"+
		"\3\2\32\33\3\2\b\n\3\2\13\f\3\2$\'\3\2()\4\2\r\r\35\35\4\2\27\27\u0082"+
		"\u0082\4\2\61\61RR\4\2\66\66PP\3\2 #\4\2OO\u00a4\u00a4\6\2HJ\u0080\u0080"+
		"\u00b6\u00b6\u00b8\u00b9\4\2\32\34~~\4\2\u00b5\u00b5\u00b8\u00b8\6\2-"+
		"eh\u0083\u0085\u00ae\u00b3\u00b4\2\u093b\2\u0112\3\2\2\2\4\u0117\3\2\2"+
		"\2\6\u011d\3\2\2\2\b\u013a\3\2\2\2\n\u0150\3\2\2\2\f\u015f\3\2\2\2\16"+
		"\u0169\3\2\2\2\20\u0181\3\2\2\2\22\u0191\3\2\2\2\24\u019b\3\2\2\2\26\u019d"+
		"\3\2\2\2\30\u01af\3\2\2\2\32\u01ba\3\2\2\2\34\u01d4\3\2\2\2\36\u01e7\3"+
		"\2\2\2 \u020c\3\2\2\2\"\u020f\3\2\2\2$\u022e\3\2\2\2&\u0234\3\2\2\2(\u0244"+
		"\3\2\2\2*\u0256\3\2\2\2,\u025e\3\2\2\2.\u0294\3\2\2\2\60\u0296\3\2\2\2"+
		"\62\u02b5\3\2\2\2\64\u02c6\3\2\2\2\66\u02d4\3\2\2\28\u02e0\3\2\2\2:\u02ed"+
		"\3\2\2\2<\u0303\3\2\2\2>\u031a\3\2\2\2@\u0333\3\2\2\2B\u033c\3\2\2\2D"+
		"\u0355\3\2\2\2F\u0392\3\2\2\2H\u03a4\3\2\2\2J\u03aa\3\2\2\2L\u03ae\3\2"+
		"\2\2N\u03b2\3\2\2\2P\u03b6\3\2\2\2R\u03b8\3\2\2\2T\u03ba\3\2\2\2V\u03bc"+
		"\3\2\2\2X\u03ca\3\2\2\2Z\u03d1\3\2\2\2\\\u03d7\3\2\2\2^\u03ed\3\2\2\2"+
		"`\u03fb\3\2\2\2b\u03fd\3\2\2\2d\u0410\3\2\2\2f\u0412\3\2\2\2h\u0421\3"+
		"\2\2\2j\u0425\3\2\2\2l\u0434\3\2\2\2n\u043c\3\2\2\2p\u0441\3\2\2\2r\u045c"+
		"\3\2\2\2t\u0466\3\2\2\2v\u046d\3\2\2\2x\u047b\3\2\2\2z\u0486\3\2\2\2|"+
		"\u048d\3\2\2\2~\u048f\3\2\2\2\u0080\u049d\3\2\2\2\u0082\u04a1\3\2\2\2"+
		"\u0084\u04a8\3\2\2\2\u0086\u04aa\3\2\2\2\u0088\u04be\3\2\2\2\u008a\u04c3"+
		"\3\2\2\2\u008c\u04c6\3\2\2\2\u008e\u04e4\3\2\2\2\u0090\u04eb\3\2\2\2\u0092"+
		"\u04f8\3\2\2\2\u0094\u050d\3\2\2\2\u0096\u0543\3\2\2\2\u0098\u05a2\3\2"+
		"\2\2\u009a\u05a4\3\2\2\2\u009c\u05b8\3\2\2\2\u009e\u05c0\3\2\2\2\u00a0"+
		"\u05d8\3\2\2\2\u00a2\u05e8\3\2\2\2\u00a4\u05f0\3\2\2\2\u00a6\u05f2\3\2"+
		"\2\2\u00a8\u05f5\3\2\2\2\u00aa\u05f7\3\2\2\2\u00ac\u060f\3\2\2\2\u00ae"+
		"\u0642\3\2\2\2\u00b0\u066e\3\2\2\2\u00b2\u06a6\3\2\2\2\u00b4\u06a8\3\2"+
		"\2\2\u00b6\u06b2\3\2\2\2\u00b8\u06bf\3\2\2\2\u00ba\u06cc\3\2\2\2\u00bc"+
		"\u06da\3\2\2\2\u00be\u06ec\3\2\2\2\u00c0\u06fb\3\2\2\2\u00c2\u0700\3\2"+
		"\2\2\u00c4\u070a\3\2\2\2\u00c6\u0715\3\2\2\2\u00c8\u0717\3\2\2\2\u00ca"+
		"\u0736\3\2\2\2\u00cc\u0767\3\2\2\2\u00ce\u0769\3\2\2\2\u00d0\u077c\3\2"+
		"\2\2\u00d2\u0780\3\2\2\2\u00d4\u07cc\3\2\2\2\u00d6\u07ce\3\2\2\2\u00d8"+
		"\u07e1\3\2\2\2\u00da\u07e3\3\2\2\2\u00dc\u07e5\3\2\2\2\u00de\u07e7\3\2"+
		"\2\2\u00e0\u07eb\3\2\2\2\u00e2\u07ed\3\2\2\2\u00e4\u07ef\3\2\2\2\u00e6"+
		"\u07f2\3\2\2\2\u00e8\u07f6\3\2\2\2\u00ea\u07f8\3\2\2\2\u00ec\u07fa\3\2"+
		"\2\2\u00ee\u07fc\3\2\2\2\u00f0\u07fe\3\2\2\2\u00f2\u0800\3\2\2\2\u00f4"+
		"\u0802\3\2\2\2\u00f6\u0804\3\2\2\2\u00f8\u0806\3\2\2\2\u00fa\u0808\3\2"+
		"\2\2\u00fc\u080a\3\2\2\2\u00fe\u080c\3\2\2\2\u0100\u080e\3\2\2\2\u0102"+
		"\u0810\3\2\2\2\u0104\u0812\3\2\2\2\u0106\u0814\3\2\2\2\u0108\u0816\3\2"+
		"\2\2\u010a\u0818\3\2\2\2\u010c\u0820\3\2\2\2\u010e\u0111\5\6\4\2\u010f"+
		"\u0111\5\4\3\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\2\2\3\u0116\3\3\2\2\2\u0117\u0118\7\u00bc"+
		"\2\2\u0118\u0119\b\3\1\2\u0119\5\3\2\2\2\u011a\u011c\7\23\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0129\5\b\5\2\u0121\u0123\7\23"+
		"\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\5\b\5\2\u0127\u0122\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012f\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7\23\2\2\u012d\u012c\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\7\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u013b\5\u0086D\2\u0133\u013b\5\u008c"+
		"G\2\u0134\u013b\5\u008eH\2\u0135\u013b\5\u0090I\2\u0136\u013b\5\u0092"+
		"J\2\u0137\u013b\5\u0094K\2\u0138\u013b\5\u009aN\2\u0139\u013b\5(\25\2"+
		"\u013a\u0132\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0135"+
		"\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\t\3\2\2\2\u013c\u0151\5:\36\2\u013d\u0151\5> \2\u013e"+
		"\u0151\5\"\22\2\u013f\u0151\5*\26\2\u0140\u0151\5 \21\2\u0141\u0151\5"+
		"\64\33\2\u0142\u0151\5\62\32\2\u0143\u0151\5D#\2\u0144\u0151\5J&\2\u0145"+
		"\u0151\5\60\31\2\u0146\u0147\7\21\2\2\u0147\u0151\7\22\2\2\u0148\u014c"+
		"\7\21\2\2\u0149\u014b\5\n\6\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0151\7\22\2\2\u0150\u013c\3\2\2\2\u0150\u013d\3\2\2\2"+
		"\u0150\u013e\3\2\2\2\u0150\u013f\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0141"+
		"\3\2\2\2\u0150\u0142\3\2\2\2\u0150\u0143\3\2\2\2\u0150\u0144\3\2\2\2\u0150"+
		"\u0145\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u0148\3\2\2\2\u0151\13\3\2\2"+
		"\2\u0152\u0154\5\n\6\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\5H%\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0160\3\2\2"+
		"\2\u015b\u015c\7\21\2\2\u015c\u015d\5\f\7\2\u015d\u015e\7\22\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u0155\3\2\2\2\u015f\u015b\3\2\2\2\u0160\r\3\2\2\2"+
		"\u0161\u016a\5\f\7\2\u0162\u0164\5\n\6\2\u0163\u0162\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\5\f\7\2\u0169\u0161\3\2\2\2\u0169\u0165\3\2"+
		"\2\2\u016a\17\3\2\2\2\u016b\u0182\5<\37\2\u016c\u0182\5B\"\2\u016d\u0182"+
		"\5\"\22\2\u016e\u0182\5*\26\2\u016f\u0182\5 \21\2\u0170\u0182\5\64\33"+
		"\2\u0171\u0182\5J&\2\u0172\u0173\7\u00b4\2\2\u0173\u0182\7\23\2\2\u0174"+
		"\u0182\5\62\32\2\u0175\u0182\5D#\2\u0176\u0182\5\60\31\2\u0177\u0178\7"+
		"\21\2\2\u0178\u0182\7\22\2\2\u0179\u017d\7\21\2\2\u017a\u017c\5\20\t\2"+
		"\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7\22\2\2"+
		"\u0181\u016b\3\2\2\2\u0181\u016c\3\2\2\2\u0181\u016d\3\2\2\2\u0181\u016e"+
		"\3\2\2\2\u0181\u016f\3\2\2\2\u0181\u0170\3\2\2\2\u0181\u0171\3\2\2\2\u0181"+
		"\u0172\3\2\2\2\u0181\u0174\3\2\2\2\u0181\u0175\3\2\2\2\u0181\u0176\3\2"+
		"\2\2\u0181\u0177\3\2\2\2\u0181\u0179\3\2\2\2\u0182\21\3\2\2\2\u0183\u0185"+
		"\5\20\t\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u018b\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018c"+
		"\5F$\2\u018a\u018c\5H%\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u0192\3\2\2\2\u018d\u018e\7\21\2\2\u018e\u018f\5"+
		"\22\n\2\u018f\u0190\7\22\2\2\u0190\u0192\3\2\2\2\u0191\u0186\3\2\2\2\u0191"+
		"\u018d\3\2\2\2\u0192\23\3\2\2\2\u0193\u019c\5\22\n\2\u0194\u0196\5\20"+
		"\t\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5\22"+
		"\n\2\u019b\u0193\3\2\2\2\u019b\u0197\3\2\2\2\u019c\25\3\2\2\2\u019d\u019e"+
		"\5\u010c\u0087\2\u019e\u01ad\7\3\2\2\u019f\u01ae\7\u00b6\2\2\u01a0\u01ae"+
		"\7\u00b5\2\2\u01a1\u01ae\5\30\r\2\u01a2\u01a3\7\17\2\2\u01a3\u01a8\5\u010c"+
		"\u0087\2\u01a4\u01a5\7\27\2\2\u01a5\u01a7\5\u010c\u0087\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\20\2\2\u01ac\u01ae\3"+
		"\2\2\2\u01ad\u019f\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad"+
		"\u01a2\3\2\2\2\u01ae\27\3\2\2\2\u01af\u01b0\7\21\2\2\u01b0\u01b5\5\26"+
		"\f\2\u01b1\u01b2\7\27\2\2\u01b2\u01b4\5\26\f\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\22\2\2\u01b9\31\3\2\2\2\u01ba\u01bb"+
		"\5\u010c\u0087\2\u01bb\u01bc\7\25\2\2\u01bc\u01bd\5\u010c\u0087\2\u01bd"+
		"\u01c3\7\27\2\2\u01be\u01bf\5\u010c\u0087\2\u01bf\u01c0\7\27\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\7+\2\2\u01c7\u01c8\7\25\2\2\u01c8\u01cd\5\u010c\u0087\2\u01c9\u01ca"+
		"\7\27\2\2\u01ca\u01cc\5\u010c\u0087\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d1\7\26\2\2\u01d1\u01d2\5&\24\2\u01d2\u01d3\7"+
		"\26\2\2\u01d3\33\3\2\2\2\u01d4\u01d5\5\u010c\u0087\2\u01d5\u01d6\7\17"+
		"\2\2\u01d6\u01e5\7\20\2\2\u01d7\u01e3\7\30\2\2\u01d8\u01d9\7\21\2\2\u01d9"+
		"\u01de\t\2\2\2\u01da\u01db\7\27\2\2\u01db\u01dd\t\2\2\2\u01dc\u01da\3"+
		"\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\7\22\2\2\u01e2\u01e4\5"+
		"\u0098M\2\u01e3\u01d8\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e6\3\2\2\2"+
		"\u01e5\u01d7\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\35\3\2\2\2\u01e7\u01f5"+
		"\7\u00ae\2\2\u01e8\u01f2\5\u010c\u0087\2\u01e9\u01f0\7\30\2\2\u01ea\u01f1"+
		"\5X-\2\u01eb\u01f1\5b\62\2\u01ec\u01f1\5d\63\2\u01ed\u01f1\5\30\r\2\u01ee"+
		"\u01f1\5\32\16\2\u01ef\u01f1\5\u0098M\2\u01f0\u01ea\3\2\2\2\u01f0\u01eb"+
		"\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01e9\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f6\5\34\17\2\u01f5\u01e8\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u0209\3\2\2\2\u01f7\u0205\7\27\2\2\u01f8\u0202\5"+
		"\u010c\u0087\2\u01f9\u0200\7\30\2\2\u01fa\u0201\5X-\2\u01fb\u0201\5b\62"+
		"\2\u01fc\u0201\5d\63\2\u01fd\u0201\5\30\r\2\u01fe\u0201\5\32\16\2\u01ff"+
		"\u0201\5\u0098M\2\u0200\u01fa\3\2\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc"+
		"\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0206\5\34\17\2\u0205\u01f8\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0208\3\2\2\2\u0207\u01f7\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\37\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d"+
		"\5\36\20\2\u020d\u020e\7\23\2\2\u020e!\3\2\2\2\u020f\u0210\7\u00b3\2\2"+
		"\u0210\u0228\7\25\2\2\u0211\u0218\5p9\2\u0212\u0213\7\4\2\2\u0213\u0214"+
		"\5\u010c\u0087\2\u0214\u0215\7\4\2\2\u0215\u0218\3\2\2\2\u0216\u0218\7"+
		"\u00b6\2\2\u0217\u0211\3\2\2\2\u0217\u0212\3\2\2\2\u0217\u0216\3\2\2\2"+
		"\u0218\u0223\3\2\2\2\u0219\u021f\7\32\2\2\u021a\u0220\5p9\2\u021b\u021c"+
		"\7\4\2\2\u021c\u021d\7\u00b5\2\2\u021d\u0220\7\4\2\2\u021e\u0220\7\u00b6"+
		"\2\2\u021f\u021a\3\2\2\2\u021f\u021b\3\2\2\2\u021f\u021e\3\2\2\2\u0220"+
		"\u0222\3\2\2\2\u0221\u0219\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0217\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\26\2\2\u022c"+
		"\u022d\7\23\2\2\u022d#\3\2\2\2\u022e\u0230\7\25\2\2\u022f\u0231\5.\30"+
		"\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233"+
		"\7\26\2\2\u0233%\3\2\2\2\u0234\u0236\7\21\2\2\u0235\u0237\5(\25\2\u0236"+
		"\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023b\3\2\2\2\u0238\u023a\5\n"+
		"\6\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\5("+
		"\25\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\5H%\2\u0242\u0243\7\22\2\2\u0243\'\3\2\2\2\u0244\u0245\5\u010c"+
		"\u0087\2\u0245\u0247\7\25\2\2\u0246\u0248\5.\30\2\u0247\u0246\3\2\2\2"+
		"\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\26\2\2\u024a\u024e"+
		"\7\21\2\2\u024b\u024d\5\n\6\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0251\u0253\5H%\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\7\22\2\2\u0255)\3\2\2\2\u0256\u0257\5\u010c"+
		"\u0087\2\u0257\u0259\7\25\2\2\u0258\u025a\5,\27\2\u0259\u0258\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7\26\2\2\u025c\u025d"+
		"\7\23\2\2\u025d+\3\2\2\2\u025e\u0263\5\u010c\u0087\2\u025f\u0260\7\27"+
		"\2\2\u0260\u0262\5\u010c\u0087\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2"+
		"\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u026d\3\2\2\2\u0265\u0263"+
		"\3\2\2\2\u0266\u0267\7\27\2\2\u0267\u0268\5\u010c\u0087\2\u0268\u0269"+
		"\7\30\2\2\u0269\u026a\7\u00b6\2\2\u026a\u026c\3\2\2\2\u026b\u0266\3\2"+
		"\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"-\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7\u00ae\2\2\u0271\u0277\5\u010c"+
		"\u0087\2\u0272\u0273\7\27\2\2\u0273\u0274\7\u00ae\2\2\u0274\u0276\5\u010c"+
		"\u0087\2\u0275\u0272\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0282\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7\27"+
		"\2\2\u027b\u027c\7\u00ae\2\2\u027c\u027d\5\u010c\u0087\2\u027d\u027e\7"+
		"\30\2\2\u027e\u027f\t\2\2\2\u027f\u0281\3\2\2\2\u0280\u027a\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0295\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7\u00ae\2\2\u0286\u0287\5\u010c\u0087"+
		"\2\u0287\u0288\7\30\2\2\u0288\u0291\7\u00b6\2\2\u0289\u028a\7\27\2\2\u028a"+
		"\u028b\7\u00ae\2\2\u028b\u028c\5\u010c\u0087\2\u028c\u028d\7\30\2\2\u028d"+
		"\u028e\t\2\2\2\u028e\u0290\3\2\2\2\u028f\u0289\3\2\2\2\u0290\u0293\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293"+
		"\u0291\3\2\2\2\u0294\u0270\3\2\2\2\u0294\u0285\3\2\2\2\u0295/\3\2\2\2"+
		"\u0296\u0297\7^\2\2\u0297\u029d\7\25\2\2\u0298\u029e\5\36\20\2\u0299\u029e"+
		"\5\u0084C\2\u029a\u029e\5`\61\2\u029b\u029e\5f\64\2\u029c\u029e\7\u00b5"+
		"\2\2\u029d\u0298\3\2\2\2\u029d\u0299\3\2\2\2\u029d\u029a\3\2\2\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a1\7\23\2\2\u02a0\u02a2\5|?\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a8\7\23\2\2\u02a4\u02a9\5"+
		"\36\20\2\u02a5\u02a9\5`\61\2\u02a6\u02a9\5f\64\2\u02a7\u02a9\5\u0084C"+
		"\2\u02a8\u02a4\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b3\7\26\2\2"+
		"\u02ab\u02b4\5J&\2\u02ac\u02b4\5H%\2\u02ad\u02b4\5F$\2\u02ae\u02af\7\21"+
		"\2\2\u02af\u02b0\5\24\13\2\u02b0\u02b1\7\22\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b4\5\20\t\2\u02b3\u02ab\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b3\u02ad\3"+
		"\2\2\2\u02b3\u02ae\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\61\3\2\2\2\u02b5"+
		"\u02be\7g\2\2\u02b6\u02bf\5J&\2\u02b7\u02bf\5H%\2\u02b8\u02bf\5F$\2\u02b9"+
		"\u02ba\7\21\2\2\u02ba\u02bb\5\24\13\2\u02bb\u02bc\7\22\2\2\u02bc\u02bf"+
		"\3\2\2\2\u02bd\u02bf\5\20\t\2\u02be\u02b6\3\2\2\2\u02be\u02b7\3\2\2\2"+
		"\u02be\u02b8\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c1\7f\2\2\u02c1\u02c2\7\25\2\2\u02c2\u02c3\5|?\2\u02c3"+
		"\u02c4\7\26\2\2\u02c4\u02c5\7\23\2\2\u02c5\63\3\2\2\2\u02c6\u02c7\7f\2"+
		"\2\u02c7\u02c8\7\25\2\2\u02c8\u02c9\5|?\2\u02c9\u02d2\7\26\2\2\u02ca\u02d3"+
		"\5J&\2\u02cb\u02d3\5H%\2\u02cc\u02d3\5F$\2\u02cd\u02ce\7\21\2\2\u02ce"+
		"\u02cf\5\24\13\2\u02cf\u02d0\7\22\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d3"+
		"\5\20\t\2\u02d2\u02ca\3\2\2\2\u02d2\u02cb\3\2\2\2\u02d2\u02cc\3\2\2\2"+
		"\u02d2\u02cd\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\65\3\2\2\2\u02d4\u02d5"+
		"\7\25\2\2\u02d5\u02d6\5|?\2\u02d6\u02de\7\26\2\2\u02d7\u02df\5J&\2\u02d8"+
		"\u02df\5H%\2\u02d9\u02da\7\21\2\2\u02da\u02db\5\16\b\2\u02db\u02dc\7\22"+
		"\2\2\u02dc\u02df\3\2\2\2\u02dd\u02df\5\n\6\2\u02de\u02d7\3\2\2\2\u02de"+
		"\u02d8\3\2\2\2\u02de\u02d9\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\67\3\2\2"+
		"\2\u02e0\u02e1\7\25\2\2\u02e1\u02e2\5|?\2\u02e2\u02eb\7\26\2\2\u02e3\u02ec"+
		"\5J&\2\u02e4\u02ec\5H%\2\u02e5\u02ec\5F$\2\u02e6\u02e7\7\21\2\2\u02e7"+
		"\u02e8\5\24\13\2\u02e8\u02e9\7\22\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02ec"+
		"\5\20\t\2\u02eb\u02e3\3\2\2\2\u02eb\u02e4\3\2\2\2\u02eb\u02e5\3\2\2\2"+
		"\u02eb\u02e6\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec9\3\2\2\2\u02ed\u02ee\7"+
		"e\2\2\u02ee\u02f4\5\66\34\2\u02ef\u02f0\7U\2\2\u02f0\u02f1\7e\2\2\u02f1"+
		"\u02f3\5\66\34\2\u02f2\u02ef\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3"+
		"\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u0301\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02ff\7U\2\2\u02f8\u0300\5J&\2\u02f9\u0300\5H%\2\u02fa\u02fb\7\21\2\2"+
		"\u02fb\u02fc\5\16\b\2\u02fc\u02fd\7\22\2\2\u02fd\u0300\3\2\2\2\u02fe\u0300"+
		"\5\n\6\2\u02ff\u02f8\3\2\2\2\u02ff\u02f9\3\2\2\2\u02ff\u02fa\3\2\2\2\u02ff"+
		"\u02fe\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02f7\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302;\3\2\2\2\u0303\u0304\7e\2\2\u0304\u030a\58\35\2\u0305\u0306"+
		"\7U\2\2\u0306\u0307\7e\2\2\u0307\u0309\58\35\2\u0308\u0305\3\2\2\2\u0309"+
		"\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0318\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030d\u0316\7U\2\2\u030e\u0317\5J&\2\u030f\u0317"+
		"\5H%\2\u0310\u0317\5F$\2\u0311\u0312\7\21\2\2\u0312\u0313\5\24\13\2\u0313"+
		"\u0314\7\22\2\2\u0314\u0317\3\2\2\2\u0315\u0317\5\20\t\2\u0316\u030e\3"+
		"\2\2\2\u0316\u030f\3\2\2\2\u0316\u0310\3\2\2\2\u0316\u0311\3\2\2\2\u0316"+
		"\u0315\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u030d\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319=\3\2\2\2\u031a\u031b\7\25\2\2\u031b\u031c\5|?\2\u031c\u031d"+
		"\7\26\2\2\u031d\u0325\7\5\2\2\u031e\u0326\5J&\2\u031f\u0326\5H%\2\u0320"+
		"\u0321\7\21\2\2\u0321\u0322\5\16\b\2\u0322\u0323\7\22\2\2\u0323\u0326"+
		"\3\2\2\2\u0324\u0326\5\n\6\2\u0325\u031e\3\2\2\2\u0325\u031f\3\2\2\2\u0325"+
		"\u0320\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u0331\3\2\2\2\u0327\u032f\7\27"+
		"\2\2\u0328\u0330\5J&\2\u0329\u0330\5H%\2\u032a\u032b\7\21\2\2\u032b\u032c"+
		"\5\16\b\2\u032c\u032d\7\22\2\2\u032d\u0330\3\2\2\2\u032e\u0330\5\n\6\2"+
		"\u032f\u0328\3\2\2\2\u032f\u0329\3\2\2\2\u032f\u032a\3\2\2\2\u032f\u032e"+
		"\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0327\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"?\3\2\2\2\u0333\u0334\7\25\2\2\u0334\u0335\5|?\2\u0335\u0336\7\26\2\2"+
		"\u0336\u0337\7\5\2\2\u0337\u033a\t\2\2\2\u0338\u0339\7\27\2\2\u0339\u033b"+
		"\t\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033bA\3\2\2\2\u033c"+
		"\u033d\7\25\2\2\u033d\u033e\5|?\2\u033e\u033f\7\26\2\2\u033f\u0347\7\5"+
		"\2\2\u0340\u0348\5J&\2\u0341\u0348\5H%\2\u0342\u0343\7\21\2\2\u0343\u0344"+
		"\5\24\13\2\u0344\u0345\7\22\2\2\u0345\u0348\3\2\2\2\u0346\u0348\5\20\t"+
		"\2\u0347\u0340\3\2\2\2\u0347\u0341\3\2\2\2\u0347\u0342\3\2\2\2\u0347\u0346"+
		"\3\2\2\2\u0348\u0353\3\2\2\2\u0349\u0351\7\27\2\2\u034a\u0352\5J&\2\u034b"+
		"\u0352\5H%\2\u034c\u034d\7\21\2\2\u034d\u034e\5\24\13\2\u034e\u034f\7"+
		"\22\2\2\u034f\u0352\3\2\2\2\u0350\u0352\5\20\t\2\u0351\u034a\3\2\2\2\u0351"+
		"\u034b\3\2\2\2\u0351\u034c\3\2\2\2\u0351\u0350\3\2\2\2\u0352\u0354\3\2"+
		"\2\2\u0353\u0349\3\2\2\2\u0353\u0354\3\2\2\2\u0354C\3\2\2\2\u0355\u0356"+
		"\7\u00b1\2\2\u0356\u0357\7\25\2\2\u0357\u0358\5p9\2\u0358\u0359\7\26\2"+
		"\2\u0359\u0387\7\21\2\2\u035a\u035f\7>\2\2\u035b\u0360\5X-\2\u035c\u035d"+
		"\7\4\2\2\u035d\u035e\7\u00b5\2\2\u035e\u0360\7\4\2\2\u035f\u035b\3\2\2"+
		"\2\u035f\u035c\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0366\7\3\2\2\u0362\u0367"+
		"\5H%\2\u0363\u0367\5F$\2\u0364\u0367\5\24\13\2\u0365\u0367\5J&\2\u0366"+
		"\u0362\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2"+
		"\2\2\u0367\u0378\3\2\2\2\u0368\u036d\7>\2\2\u0369\u036e\5X-\2\u036a\u036b"+
		"\7\4\2\2\u036b\u036c\7\u00b5\2\2\u036c\u036e\7\4\2\2\u036d\u0369\3\2\2"+
		"\2\u036d\u036a\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0374\7\3\2\2\u0370\u0375"+
		"\5H%\2\u0371\u0375\5F$\2\u0372\u0375\5\24\13\2\u0373\u0375\5J&\2\u0374"+
		"\u0370\3\2\2\2\u0374\u0371\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0373\3\2"+
		"\2\2\u0375\u0377\3\2\2\2\u0376\u0368\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0383\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037b\u037c\7L\2\2\u037c\u0381\7\3\2\2\u037d\u0382\5H%\2\u037e\u0382"+
		"\5F$\2\u037f\u0382\5\24\13\2\u0380\u0382\5J&\2\u0381\u037d\3\2\2\2\u0381"+
		"\u037e\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0380\3\2\2\2\u0382\u0384\3\2"+
		"\2\2\u0383\u037b\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385"+
		"\u035a\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\22\2\2\u038b"+
		"E\3\2\2\2\u038c\u038d\7\u00b2\2\2\u038d\u0393\7\23\2\2\u038e\u038f\7\21"+
		"\2\2\u038f\u0390\5F$\2\u0390\u0391\7\22\2\2\u0391\u0393\3\2\2\2\u0392"+
		"\u038c\3\2\2\2\u0392\u038e\3\2\2\2\u0393G\3\2\2\2\u0394\u039d\7,\2\2\u0395"+
		"\u039e\5@!\2\u0396\u039e\5f\64\2\u0397\u039e\5h\65\2\u0398\u039e\5^\60"+
		"\2\u0399\u039e\5\u0084C\2\u039a\u039e\5v<\2\u039b\u039e\7\u00b6\2\2\u039c"+
		"\u039e\7\u0080\2\2\u039d\u0395\3\2\2\2\u039d\u0396\3\2\2\2\u039d\u0397"+
		"\3\2\2\2\u039d\u0398\3\2\2\2\u039d\u0399\3\2\2\2\u039d\u039a\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a5\7\23"+
		"\2\2\u03a0\u03a1\7\21\2\2\u03a1\u03a2\5H%\2\u03a2\u03a3\7\22\2\2\u03a3"+
		"\u03a5\3\2\2\2\u03a4\u0394\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a5I\3\2\2\2"+
		"\u03a6\u03ab\5f\64\2\u03a7\u03ab\5h\65\2\u03a8\u03ab\5^\60\2\u03a9\u03ab"+
		"\5\u0084C\2\u03aa\u03a6\3\2\2\2\u03aa\u03a7\3\2\2\2\u03aa\u03a8\3\2\2"+
		"\2\u03aa\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7\23\2\2\u03ad"+
		"K\3\2\2\2\u03ae\u03af\t\3\2\2\u03afM\3\2\2\2\u03b0\u03b3\t\4\2\2\u03b1"+
		"\u03b3\t\5\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3O\3\2\2\2"+
		"\u03b4\u03b7\t\6\2\2\u03b5\u03b7\t\7\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5"+
		"\3\2\2\2\u03b7Q\3\2\2\2\u03b8\u03b9\t\b\2\2\u03b9S\3\2\2\2\u03ba\u03bb"+
		"\t\t\2\2\u03bbU\3\2\2\2\u03bc\u03bd\t\n\2\2\u03bdW\3\2\2\2\u03be\u03cb"+
		"\7\u00b6\2\2\u03bf\u03c0\7\25\2\2\u03c0\u03c1\7\u00bd\2\2\u03c1\u03cb"+
		"\7\26\2\2\u03c2\u03cb\7\u00b5\2\2\u03c3\u03c4\7\25\2\2\u03c4\u03c5\7\u00b5"+
		"\2\2\u03c5\u03cb\7\26\2\2\u03c6\u03c7\7\25\2\2\u03c7\u03c8\5X-\2\u03c8"+
		"\u03c9\7\26\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03be\3\2\2\2\u03ca\u03bf\3"+
		"\2\2\2\u03ca\u03c2\3\2\2\2\u03ca\u03c3\3\2\2\2\u03ca\u03c6\3\2\2\2\u03cb"+
		"Y\3\2\2\2\u03cc\u03d2\5d\63\2\u03cd\u03d2\5^\60\2\u03ce\u03d2\5h\65\2"+
		"\u03cf\u03d2\5X-\2\u03d0\u03d2\5\u0080A\2\u03d1\u03cc\3\2\2\2\u03d1\u03cd"+
		"\3\2\2\2\u03d1\u03ce\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"[\3\2\2\2\u03d3\u03d8\7\u00b5\2\2\u03d4\u03d5\7\25\2\2\u03d5\u03d6\7\u00b5"+
		"\2\2\u03d6\u03d8\7\26\2\2\u03d7\u03d3\3\2\2\2\u03d7\u03d4\3\2\2\2\u03d8"+
		"]\3\2\2\2\u03d9\u03da\5L\'\2\u03da\u03db\5\\/\2\u03db\u03ee\3\2\2\2\u03dc"+
		"\u03dd\5\\/\2\u03dd\u03de\5L\'\2\u03de\u03ee\3\2\2\2\u03df\u03e0\7\25"+
		"\2\2\u03e0\u03e1\5L\'\2\u03e1\u03e2\5\\/\2\u03e2\u03e3\7\26\2\2\u03e3"+
		"\u03ee\3\2\2\2\u03e4\u03e5\7\25\2\2\u03e5\u03e6\5\\/\2\u03e6\u03e7\5L"+
		"\'\2\u03e7\u03e8\7\26\2\2\u03e8\u03ee\3\2\2\2\u03e9\u03ea\7\25\2\2\u03ea"+
		"\u03eb\5^\60\2\u03eb\u03ec\7\26\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03d9\3"+
		"\2\2\2\u03ed\u03dc\3\2\2\2\u03ed\u03df\3\2\2\2\u03ed\u03e4\3\2\2\2\u03ed"+
		"\u03e9\3\2\2\2\u03ee_\3\2\2\2\u03ef\u03f0\5L\'\2\u03f0\u03f1\5\\/\2\u03f1"+
		"\u03fc\3\2\2\2\u03f2\u03f3\5\\/\2\u03f3\u03f4\5L\'\2\u03f4\u03fc\3\2\2"+
		"\2\u03f5\u03f6\5L\'\2\u03f6\u03f7\5\\/\2\u03f7\u03fc\3\2\2\2\u03f8\u03f9"+
		"\5\\/\2\u03f9\u03fa\5L\'\2\u03fa\u03fc\3\2\2\2\u03fb\u03ef\3\2\2\2\u03fb"+
		"\u03f2\3\2\2\2\u03fb\u03f5\3\2\2\2\u03fb\u03f8\3\2\2\2\u03fca\3\2\2\2"+
		"\u03fd\u03fe\5Z.\2\u03fe\u03ff\5N(\2\u03ff\u0405\5Z.\2\u0400\u0401\5N"+
		"(\2\u0401\u0402\5Z.\2\u0402\u0404\3\2\2\2\u0403\u0400\3\2\2\2\u0404\u0407"+
		"\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406c\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0408\u0409\7\25\2\2\u0409\u040a\5b\62\2\u040a\u040b\7"+
		"\26\2\2\u040b\u0411\3\2\2\2\u040c\u040d\7\25\2\2\u040d\u040e\5d\63\2\u040e"+
		"\u040f\7\26\2\2\u040f\u0411\3\2\2\2\u0410\u0408\3\2\2\2\u0410\u040c\3"+
		"\2\2\2\u0411e\3\2\2\2\u0412\u0413\5\u010c\u0087\2\u0413\u0417\5P)\2\u0414"+
		"\u0418\5Z.\2\u0415\u0418\5b\62\2\u0416\u0418\5~@\2\u0417\u0414\3\2\2\2"+
		"\u0417\u0415\3\2\2\2\u0417\u0416\3\2\2\2\u0418g\3\2\2\2\u0419\u041a\7"+
		"\25\2\2\u041a\u041b\5f\64\2\u041b\u041c\7\26\2\2\u041c\u0422\3\2\2\2\u041d"+
		"\u041e\7\25\2\2\u041e\u041f\5h\65\2\u041f\u0420\7\26\2\2\u0420\u0422\3"+
		"\2\2\2\u0421\u0419\3\2\2\2\u0421\u041d\3\2\2\2\u0422i\3\2\2\2\u0423\u0426"+
		"\5Z.\2\u0424\u0426\5b\62\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u042a\5R*\2\u0428\u042b\5Z.\2\u0429\u042b\5b\62\2"+
		"\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042bk\3\2\2\2\u042c\u042d\7"+
		"\25\2\2\u042d\u042e\5j\66\2\u042e\u042f\7\26\2\2\u042f\u0435\3\2\2\2\u0430"+
		"\u0431\7\25\2\2\u0431\u0432\5l\67\2\u0432\u0433\7\26\2\2\u0433\u0435\3"+
		"\2\2\2\u0434\u042c\3\2\2\2\u0434\u0430\3\2\2\2\u0435m\3\2\2\2\u0436\u043d"+
		"\5b\62\2\u0437\u043d\5d\63\2\u0438\u043d\5f\64\2\u0439\u043d\5h\65\2\u043a"+
		"\u043d\5^\60\2\u043b\u043d\5\\/\2\u043c\u0436\3\2\2\2\u043c\u0437\3\2"+
		"\2\2\u043c\u0438\3\2\2\2\u043c\u0439\3\2\2\2\u043c\u043a\3\2\2\2\u043c"+
		"\u043b\3\2\2\2\u043do\3\2\2\2\u043e\u0442\5Z.\2\u043f\u0442\5b\62\2\u0440"+
		"\u0442\5f\64\2\u0441\u043e\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2"+
		"\2\2\u0442q\3\2\2\2\u0443\u0449\5\u0080A\2\u0444\u0449\5Z.\2\u0445\u0449"+
		"\5b\62\2\u0446\u0449\7\u00af\2\2\u0447\u0449\7\u00b0\2\2\u0448\u0443\3"+
		"\2\2\2\u0448\u0444\3\2\2\2\u0448\u0445\3\2\2\2\u0448\u0446\3\2\2\2\u0448"+
		"\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0450\5T+\2\u044b\u0451\5\u0080"+
		"A\2\u044c\u0451\5b\62\2\u044d\u0451\5Z.\2\u044e\u0451\7\u00af\2\2\u044f"+
		"\u0451\7\u00b0\2\2\u0450\u044b\3\2\2\2\u0450\u044c\3\2\2\2\u0450\u044d"+
		"\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u045d\3\2\2\2\u0452"+
		"\u0455\5j\66\2\u0453\u0455\5l\67\2\u0454\u0452\3\2\2\2\u0454\u0453\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u0459\5T+\2\u0457\u045a\5j\66\2\u0458\u045a"+
		"\5l\67\2\u0459\u0457\3\2\2\2\u0459\u0458\3\2\2\2\u045a\u045d\3\2\2\2\u045b"+
		"\u045d\5j\66\2\u045c\u0448\3\2\2\2\u045c\u0454\3\2\2\2\u045c\u045b\3\2"+
		"\2\2\u045ds\3\2\2\2\u045e\u045f\7\25\2\2\u045f\u0460\5r:\2\u0460\u0461"+
		"\7\26\2\2\u0461\u0467\3\2\2\2\u0462\u0463\7\25\2\2\u0463\u0464\5t;\2\u0464"+
		"\u0465\7\26\2\2\u0465\u0467\3\2\2\2\u0466\u045e\3\2\2\2\u0466\u0462\3"+
		"\2\2\2\u0467u\3\2\2\2\u0468\u046e\5\\/\2\u0469\u046e\5r:\2\u046a\u046e"+
		"\5t;\2\u046b\u046e\7\u00af\2\2\u046c\u046e\7\u00b0\2\2\u046d\u0468\3\2"+
		"\2\2\u046d\u0469\3\2\2\2\u046d\u046a\3\2\2\2\u046d\u046b\3\2\2\2\u046d"+
		"\u046c\3\2\2\2\u046ew\3\2\2\2\u046f\u0470\5v<\2\u0470\u0471\5V,\2\u0471"+
		"\u0477\5v<\2\u0472\u0473\5V,\2\u0473\u0474\5v<\2\u0474\u0476\3\2\2\2\u0475"+
		"\u0472\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u047c\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047c\5r:\2\u047b\u046f"+
		"\3\2\2\2\u047b\u047a\3\2\2\2\u047cy\3\2\2\2\u047d\u047e\7\25\2\2\u047e"+
		"\u047f\5x=\2\u047f\u0480\7\26\2\2\u0480\u0487\3\2\2\2\u0481\u0487\5t;"+
		"\2\u0482\u0483\7\25\2\2\u0483\u0484\5z>\2\u0484\u0485\7\26\2\2\u0485\u0487"+
		"\3\2\2\2\u0486\u047d\3\2\2\2\u0486\u0481\3\2\2\2\u0486\u0482\3\2\2\2\u0487"+
		"{\3\2\2\2\u0488\u048e\5x=\2\u0489\u048e\5z>\2\u048a\u048e\7\u00af\2\2"+
		"\u048b\u048e\7\u00b0\2\2\u048c\u048e\5\\/\2\u048d\u0488\3\2\2\2\u048d"+
		"\u0489\3\2\2\2\u048d\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048c\3\2"+
		"\2\2\u048e}\3\2\2\2\u048f\u0490\5\\/\2\u0490\u0491\7\30\2\2\u0491\u0492"+
		"\5p9\2\u0492\177\3\2\2\2\u0493\u0494\7\25\2\2\u0494\u0495\5\\/\2\u0495"+
		"\u0496\7\30\2\2\u0496\u0497\5p9\2\u0497\u0498\7\26\2\2\u0498\u049e\3\2"+
		"\2\2\u0499\u049a\7\25\2\2\u049a\u049b\5\u0080A\2\u049b\u049c\7\26\2\2"+
		"\u049c\u049e\3\2\2\2\u049d\u0493\3\2\2\2\u049d\u0499\3\2\2\2\u049e\u0081"+
		"\3\2\2\2\u049f\u04a2\5~@\2\u04a0\u04a2\5\u0080A\2\u04a1\u049f\3\2\2\2"+
		"\u04a1\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\7\22\2\2\u04a4\u04a5"+
		"\7\23\2\2\u04a5\u0083\3\2\2\2\u04a6\u04a9\5~@\2\u04a7\u04a9\5\u0080A\2"+
		"\u04a8\u04a6\3\2\2\2\u04a8\u04a7\3\2\2\2\u04a9\u0085\3\2\2\2\u04aa\u04ab"+
		"\7\62\2\2\u04ab\u04af\7\u009b\2\2\u04ac\u04ad\5\u00ecw\2\u04ad\u04ae\7"+
		"\24\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ac\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04bc\5\u00eex\2\u04b2\u04b3\7\u0092\2\2\u04b3\u04b4"+
		"\7\u009f\2\2\u04b4\u04bd\5\u00f4{\2\u04b5\u04bd\5\u008aF\2\u04b6\u04bd"+
		"\5\u0088E\2\u04b7\u04b9\7/\2\2\u04b8\u04ba\7B\2\2\u04b9\u04b8\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\5\u009cO\2\u04bc"+
		"\u04b2\3\2\2\2\u04bc\u04b5\3\2\2\2\u04bc\u04b6\3\2\2\2\u04bc\u04b7\3\2"+
		"\2\2\u04bd\u0087\3\2\2\2\u04be\u04bf\7/\2\2\u04bf\u04c0\7E\2\2\u04c0\u04c1"+
		"\5\u010c\u0087\2\u04c1\u04c2\5\u00b6\\\2\u04c2\u0089\3\2\2\2\u04c3\u04c4"+
		"\7/\2\2\u04c4\u04c5\5\u00b6\\\2\u04c5\u008b\3\2\2\2\u04c6\u04c7\7F\2\2"+
		"\u04c7\u04cb\7\u009b\2\2\u04c8\u04c9\7e\2\2\u04c9\u04ca\7~\2\2\u04ca\u04cc"+
		"\7[\2\2\u04cb\u04c8\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d0\3\2\2\2\u04cd"+
		"\u04ce\5\u00ecw\2\u04ce\u04cf\7\24\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04cd"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04e2\5\u00f0y"+
		"\2\u04d3\u04d4\7\25\2\2\u04d4\u04db\5\u009cO\2\u04d5\u04d6\7\27\2\2\u04d6"+
		"\u04da\5\u00b6\\\2\u04d7\u04d8\7\27\2\2\u04d8\u04da\5\u009cO\2\u04d9\u04d5"+
		"\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u04df\7\26"+
		"\2\2\u04df\u04e3\3\2\2\2\u04e0\u04e1\7\65\2\2\u04e1\u04e3\5\u0096L\2\u04e2"+
		"\u04d3\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u008d\3\2\2\2\u04e4\u04e5\7O"+
		"\2\2\u04e5\u04e6\7`\2\2\u04e6\u04e9\5\u00c2b\2\u04e7\u04e8\7\u00ab\2\2"+
		"\u04e8\u04ea\5\u00aeX\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u008f\3\2\2\2\u04eb\u04ec\7S\2\2\u04ec\u04ef\7\u009b\2\2\u04ed\u04ee"+
		"\7e\2\2\u04ee\u04f0\7[\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f4\3\2\2\2\u04f1\u04f2\5\u00ecw\2\u04f2\u04f3\7\24\2\2\u04f3\u04f5"+
		"\3\2\2\2\u04f4\u04f1\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f7\5\u00f0y\2\u04f7\u0091\3\2\2\2\u04f8\u0503\5\u00d4k\2\u04f9\u04fa"+
		"\7\u0086\2\2\u04fa\u04fb\7<\2\2\u04fb\u0500\5\u00c4c\2\u04fc\u04fd\7\27"+
		"\2\2\u04fd\u04ff\5\u00c4c\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\3\2\2\2\u0500"+
		"\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2"+
		"\2\2\u0503\u04f9\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u050b\3\2\2\2\u0505"+
		"\u0506\7y\2\2\u0506\u0509\5\u00aeX\2\u0507\u0508\t\13\2\2\u0508\u050a"+
		"\5\u00aeX\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2"+
		"\2\u050b\u0505\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0093\3\2\2\2\u050d\u050e"+
		"\7o\2\2\u050e\u0512\7r\2\2\u050f\u0510\5\u00ecw\2\u0510\u0511\7\24\2\2"+
		"\u0511\u0513\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514"+
		"\3\2\2\2\u0514\u0520\5\u00f0y\2\u0515\u0516\7\25\2\2\u0516\u051b\5\u00f6"+
		"|\2\u0517\u0518\7\27\2\2\u0518\u051a\5\u00f6|\2\u0519\u0517\3\2\2\2\u051a"+
		"\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2"+
		"\2\2\u051d\u051b\3\2\2\2\u051e\u051f\7\26\2\2\u051f\u0521\3\2\2\2\u0520"+
		"\u0515\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0541\3\2\2\2\u0522\u0523\7\u00a7"+
		"\2\2\u0523\u0524\7\25\2\2\u0524\u0529\5\u00aeX\2\u0525\u0526\7\27\2\2"+
		"\u0526\u0528\5\u00aeX\2\u0527\u0525\3\2\2\2\u0528\u052b\3\2\2\2\u0529"+
		"\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u0529\3\2"+
		"\2\2\u052c\u053b\7\26\2\2\u052d\u052e\7\27\2\2\u052e\u052f\7\25\2\2\u052f"+
		"\u0534\5\u00aeX\2\u0530\u0531\7\27\2\2\u0531\u0533\5\u00aeX\2\u0532\u0530"+
		"\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\7\26\2\2\u0538\u053a\3"+
		"\2\2\2\u0539\u052d\3\2\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u0542\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u0542\5\u0096"+
		"L\2\u053f\u0540\7L\2\2\u0540\u0542\7\u00a7\2\2\u0541\u0522\3\2\2\2\u0541"+
		"\u053e\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0095\3\2\2\2\u0543\u054e\5\u0098"+
		"M\2\u0544\u0545\7\u0086\2\2\u0545\u0546\7<\2\2\u0546\u054b\5\u00c4c\2"+
		"\u0547\u0548\7\27\2\2\u0548\u054a\5\u00c4c\2\u0549\u0547\3\2\2\2\u054a"+
		"\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054f\3\2"+
		"\2\2\u054d\u054b\3\2\2\2\u054e\u0544\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0556\3\2\2\2\u0550\u0551\7y\2\2\u0551\u0554\5\u00aeX\2\u0552\u0553\t"+
		"\13\2\2\u0553\u0555\5\u00aeX\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2"+
		"\u0555\u0557\3\2\2\2\u0556\u0550\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0097"+
		"\3\2\2\2\u0558\u055a\7\u0099\2\2\u0559\u055b\t\f\2\2\u055a\u0559\3\2\2"+
		"\2\u055a\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0561\5\u00caf\2\u055d"+
		"\u055e\7\27\2\2\u055e\u0560\5\u00caf\2\u055f\u055d\3\2\2\2\u0560\u0563"+
		"\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0570\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0564\u056e\7`\2\2\u0565\u056a\5\u00ccg\2\u0566\u0567\7"+
		"\27\2\2\u0567\u0569\5\u00ccg\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2"+
		"\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056f\3\2\2\2\u056c\u056a"+
		"\3\2\2\2\u056d\u056f\5\u00ceh\2\u056e\u0565\3\2\2\2\u056e\u056d\3\2\2"+
		"\2\u056f\u0571\3\2\2\2\u0570\u0564\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0574"+
		"\3\2\2\2\u0572\u0573\7\u00ab\2\2\u0573\u0575\5\u00aeX\2\u0574\u0572\3"+
		"\2\2\2\u0574\u0575\3\2\2\2\u0575\u0584\3\2\2\2\u0576\u0577\7c\2\2\u0577"+
		"\u0578\7<\2\2\u0578\u057d\5\u00aeX\2\u0579\u057a\7\27\2\2\u057a\u057c"+
		"\5\u00aeX\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2"+
		"\2\u057d\u057e\3\2\2\2\u057e\u0582\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0581"+
		"\7d\2\2\u0581\u0583\5\u00aeX\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2"+
		"\u0583\u0585\3\2\2\2\u0584\u0576\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u05a3"+
		"\3\2\2\2\u0586\u0587\7\u00a7\2\2\u0587\u0588\7\25\2\2\u0588\u058d\5\u00ae"+
		"X\2\u0589\u058a\7\27\2\2\u058a\u058c\5\u00aeX\2\u058b\u0589\3\2\2\2\u058c"+
		"\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2"+
		"\2\2\u058f\u058d\3\2\2\2\u0590\u059f\7\26\2\2\u0591\u0592\7\27\2\2\u0592"+
		"\u0593\7\25\2\2\u0593\u0598\5\u00aeX\2\u0594\u0595\7\27\2\2\u0595\u0597"+
		"\5\u00aeX\2\u0596\u0594\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2"+
		"\2\u0598\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059c"+
		"\7\26\2\2\u059c\u059e\3\2\2\2\u059d\u0591\3\2\2\2\u059e\u05a1\3\2\2\2"+
		"\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f"+
		"\3\2\2\2\u05a2\u0558\3\2\2\2\u05a2\u0586\3\2\2\2\u05a3\u0099\3\2\2\2\u05a4"+
		"\u05a5\7\u00a4\2\2\u05a5\u05a6\5\u00c2b\2\u05a6\u05a7\7\u009a\2\2\u05a7"+
		"\u05a8\5\u00f6|\2\u05a8\u05a9\7\30\2\2\u05a9\u05b1\5\u00aeX\2\u05aa\u05ab"+
		"\7\27\2\2\u05ab\u05ac\5\u00f6|\2\u05ac\u05ad\7\30\2\2\u05ad\u05ae\5\u00ae"+
		"X\2\u05ae\u05b0\3\2\2\2\u05af\u05aa\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b6\3\2\2\2\u05b3\u05b1\3\2"+
		"\2\2\u05b4\u05b5\7\u00ab\2\2\u05b5\u05b7\5\u00aeX\2\u05b6\u05b4\3\2\2"+
		"\2\u05b6\u05b7\3\2\2\2\u05b7\u009b\3\2\2\2\u05b8\u05bd\5\u00f6|\2\u05b9"+
		"\u05bc\5\u00a0Q\2\u05ba\u05bc\5\u009eP\2\u05bb\u05b9\3\2\2\2\u05bb\u05ba"+
		"\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u009d\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05d4\5\u00e8u\2\u05c1\u05c2"+
		"\7\25\2\2\u05c2\u05c4\5\u00d8m\2\u05c3\u05c5\5\u010c\u0087\2\u05c4\u05c3"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7\26\2\2"+
		"\u05c7\u05d5\3\2\2\2\u05c8\u05c9\7\25\2\2\u05c9\u05cb\5\u00d8m\2\u05ca"+
		"\u05cc\5\u010c\u0087\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u05ce\7\27\2\2\u05ce\u05d0\5\u00d8m\2\u05cf\u05d1\5\u010c"+
		"\u0087\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d3\7\26\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05c1\3\2\2\2\u05d4\u05c8\3"+
		"\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u009f\3\2\2\2\u05d6\u05d7\7E\2\2\u05d7"+
		"\u05d9\5\u00e8u\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05e6"+
		"\3\2\2\2\u05da\u05e7\5\u00a2R\2\u05db\u05e7\5\u00a4S\2\u05dc\u05e7\5\u00a6"+
		"T\2\u05dd\u05e7\5\u00a8U\2\u05de\u05df\7@\2\2\u05df\u05e0\7\25\2\2\u05e0"+
		"\u05e1\5\u00aeX\2\u05e1\u05e2\7\26\2\2\u05e2\u05e7\3\2\2\2\u05e3\u05e7"+
		"\5\u00aaV\2\u05e4\u05e5\7A\2\2\u05e5\u05e7\5\u00f8}\2\u05e6\u05da\3\2"+
		"\2\2\u05e6\u05db\3\2\2\2\u05e6\u05dc\3\2\2\2\u05e6\u05dd\3\2\2\2\u05e6"+
		"\u05de\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7\u00a1\3\2"+
		"\2\2\u05e8\u05e9\7\u008a\2\2\u05e9\u05eb\7v\2\2\u05ea\u05ec\t\r\2\2\u05eb"+
		"\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05ef\78"+
		"\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u00a3\3\2\2\2\u05f0"+
		"\u05f1\5\u00b0Y\2\u05f1\u00a5\3\2\2\2\u05f2\u05f3\7~\2\2\u05f3\u05f4\7"+
		"\u0080\2\2\u05f4\u00a7\3\2\2\2\u05f5\u05f6\7\u0080\2\2\u05f6\u00a9\3\2"+
		"\2\2\u05f7\u0603\7L\2\2\u05f8\u0604\5\u00acW\2\u05f9\u05fa\7\25\2\2\u05fa"+
		"\u05fb\5\u00aeX\2\u05fb\u05fc\7\26\2\2\u05fc\u0604\3\2\2\2\u05fd\u05fe"+
		"\7|\2\2\u05fe\u05ff\7\25\2\2\u05ff\u0600\5\u00aeX\2\u0600\u0601\7\26\2"+
		"\2\u0601\u0604\3\2\2\2\u0602\u0604\5\u010c\u0087\2\u0603\u05f8\3\2\2\2"+
		"\u0603\u05f9\3\2\2\2\u0603\u05fd\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u060b"+
		"\3\2\2\2\u0605\u0607\7\16\2\2\u0606\u0608\5\u010c\u0087\2\u0607\u0606"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a"+
		"\u060c\3\2\2\2\u060b\u0605\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u00ab\3\2"+
		"\2\2\u060d\u0610\5\u00d8m\2\u060e\u0610\5\u00dan\2\u060f\u060d\3\2\2\2"+
		"\u060f\u060e\3\2\2\2\u0610\u00ad\3\2\2\2\u0611\u0612\bX\1\2\u0612\u0643"+
		"\5\u00dan\2\u0613\u0643\7\u00b7\2\2\u0614\u0615\5\u00ecw\2\u0615\u0616"+
		"\7\24\2\2\u0616\u0618\3\2\2\2\u0617\u0614\3\2\2\2\u0617\u0618\3\2\2\2"+
		"\u0618\u0619\3\2\2\2\u0619\u061a\5\u00f0y\2\u061a\u061b\7\24\2\2\u061b"+
		"\u061d\3\2\2\2\u061c\u0617\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061e\u0643\5\u00f6|\2\u061f\u0620\5\u00dco\2\u0620\u0621\5\u00ae"+
		"X\16\u0621\u0643\3\2\2\2\u0622\u0623\5\u00eav\2\u0623\u0630\7\25\2\2\u0624"+
		"\u0626\7R\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u062c\5\u00aeX\2\u0628\u0629\7\27\2\2\u0629\u062b\5\u00aeX"+
		"\2\u062a\u0628\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u0631\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0631\7\31\2\2"+
		"\u0630\u0625\3\2\2\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632"+
		"\3\2\2\2\u0632\u0633\7\26\2\2\u0633\u0643\3\2\2\2\u0634\u0635\7\25\2\2"+
		"\u0635\u0636\5\u00aeX\2\u0636\u0637\7\26\2\2\u0637\u0643\3\2\2\2\u0638"+
		"\u063a\7~\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2"+
		"\2\2\u063b\u063d\7[\2\2\u063c\u0639\3\2\2\2\u063c\u063d\3\2\2\2\u063d"+
		"\u063e\3\2\2\2\u063e\u063f\7\25\2\2\u063f\u0640\5\u0096L\2\u0640\u0641"+
		"\7\26\2\2\u0641\u0643\3\2\2\2\u0642\u0611\3\2\2\2\u0642\u0613\3\2\2\2"+
		"\u0642\u061c\3\2\2\2\u0642\u061f\3\2\2\2\u0642\u0622\3\2\2\2\u0642\u0634"+
		"\3\2\2\2\u0642\u063c\3\2\2\2\u0643\u066b\3\2\2\2\u0644\u0645\f\r\2\2\u0645"+
		"\u0646\7\35\2\2\u0646\u066a\5\u00aeX\16\u0647\u0648\f\f\2\2\u0648\u0649"+
		"\t\4\2\2\u0649\u066a\5\u00aeX\r\u064a\u064b\f\13\2\2\u064b\u064c\t\5\2"+
		"\2\u064c\u066a\5\u00aeX\f\u064d\u064e\f\n\2\2\u064e\u064f\t\16\2\2\u064f"+
		"\u066a\5\u00aeX\13\u0650\u0651\f\t\2\2\u0651\u0652\t\b\2\2\u0652\u066a"+
		"\5\u00aeX\n\u0653\u0660\f\b\2\2\u0654\u0661\7\30\2\2\u0655\u0661\7(\2"+
		"\2\u0656\u0661\7)\2\2\u0657\u0661\7*\2\2\u0658\u0661\7s\2\2\u0659\u065a"+
		"\7s\2\2\u065a\u0661\7~\2\2\u065b\u0661\7j\2\2\u065c\u0661\7x\2\2\u065d"+
		"\u0661\7b\2\2\u065e\u0661\7z\2\2\u065f\u0661\7\u008f\2\2\u0660\u0654\3"+
		"\2\2\2\u0660\u0655\3\2\2\2\u0660\u0656\3\2\2\2\u0660\u0657\3\2\2\2\u0660"+
		"\u0658\3\2\2\2\u0660\u0659\3\2\2\2\u0660\u065b\3\2\2\2\u0660\u065c\3\2"+
		"\2\2\u0660\u065d\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u065f\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u066a\5\u00aeX\t\u0663\u0664\f\7\2\2\u0664\u0665"+
		"\7\64\2\2\u0665\u066a\5\u00aeX\b\u0666\u0667\f\6\2\2\u0667\u0668\7\u0085"+
		"\2\2\u0668\u066a\5\u00aeX\7\u0669\u0644\3\2\2\2\u0669\u0647\3\2\2\2\u0669"+
		"\u064a\3\2\2\2\u0669\u064d\3\2\2\2\u0669\u0650\3\2\2\2\u0669\u0653\3\2"+
		"\2\2\u0669\u0663\3\2\2\2\u0669\u0666\3\2\2\2\u066a\u066d\3\2\2\2\u066b"+
		"\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u00af\3\2\2\2\u066d\u066b\3\2"+
		"\2\2\u066e\u0672\7\u008e\2\2\u066f\u0670\5\u00ecw\2\u0670\u0671\7\24\2"+
		"\2\u0671\u0673\3\2\2\2\u0672\u066f\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674"+
		"\3\2\2\2\u0674\u0680\5\u00fa~\2\u0675\u0676\7\25\2\2\u0676\u067b\5\u00b2"+
		"Z\2\u0677\u0678\7\27\2\2\u0678\u067a\5\u00b2Z\2\u0679\u0677\3\2\2\2\u067a"+
		"\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2"+
		"\2\2\u067d\u067b\3\2\2\2\u067e\u067f\7\26\2\2\u067f\u0681\3\2\2\2\u0680"+
		"\u0675\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0694\3\2\2\2\u0682\u0683\7\u0083"+
		"\2\2\u0683\u068c\t\17\2\2\u0684\u0685\7\u009a\2\2\u0685\u068d\7\u0080"+
		"\2\2\u0686\u0687\7\u009a\2\2\u0687\u068d\7L\2\2\u0688\u068d\7=\2\2\u0689"+
		"\u068d\7\u0094\2\2\u068a\u068b\7}\2\2\u068b\u068d\7.\2\2\u068c\u0684\3"+
		"\2\2\2\u068c\u0686\3\2\2\2\u068c\u0688\3\2\2\2\u068c\u0689\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068d\u0691\3\2\2\2\u068e\u068f\7z\2\2\u068f\u0691\5\u00e8"+
		"u\2\u0690\u0682\3\2\2\2\u0690\u068e\3\2\2\2\u0691\u0693\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2"+
		"\2\2\u0695\u06a4\3\2\2\2\u0696\u0694\3\2\2\2\u0697\u0699\7~\2\2\u0698"+
		"\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069f\7M"+
		"\2\2\u069b\u069c\7m\2\2\u069c\u06a0\7N\2\2\u069d\u069e\7m\2\2\u069e\u06a0"+
		"\7i\2\2\u069f\u069b\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0"+
		"\u06a2\3\2\2\2\u06a1\u06a3\7W\2\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u06a5\3\2\2\2\u06a4\u0698\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u00b1\3\2\2\2\u06a6\u06a7\5\u00e8u\2\u06a7\u00b3\3\2\2\2\u06a8\u06ab"+
		"\5\u00f6|\2\u06a9\u06aa\7A\2\2\u06aa\u06ac\5\u00f8}\2\u06ab\u06a9\3\2"+
		"\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06af\t\r\2\2\u06ae"+
		"\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u00b5\3\2\2\2\u06b0\u06b1\7E"+
		"\2\2\u06b1\u06b3\5\u00e8u\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3"+
		"\u06bd\3\2\2\2\u06b4\u06be\5\u00b8]\2\u06b5\u06be\5\u00be`\2\u06b6\u06be"+
		"\5\u00bc_\2\u06b7\u06b8\7@\2\2\u06b8\u06b9\7\25\2\2\u06b9\u06ba\5\u00ae"+
		"X\2\u06ba\u06bb\7\26\2\2\u06bb\u06be\3\2\2\2\u06bc\u06be\5\u00ba^\2\u06bd"+
		"\u06b4\3\2\2\2\u06bd\u06b5\3\2\2\2\u06bd\u06b6\3\2\2\2\u06bd\u06b7\3\2"+
		"\2\2\u06bd\u06bc\3\2\2\2\u06be\u00b7\3\2\2\2\u06bf\u06c0\7\u008a\2\2\u06c0"+
		"\u06c1\7v\2\2\u06c1\u06c2\7\25\2\2\u06c2\u06c7\5\u00b4[\2\u06c3\u06c4"+
		"\7\27\2\2\u06c4\u06c6\5\u00b4[\2\u06c5\u06c3\3\2\2\2\u06c6\u06c9\3\2\2"+
		"\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06c7"+
		"\3\2\2\2\u06ca\u06cb\7\26\2\2\u06cb\u00b9\3\2\2\2\u06cc\u06cd\7_\2\2\u06cd"+
		"\u06ce\7v\2\2\u06ce\u06cf\7\25\2\2\u06cf\u06d4\5\u00c0a\2\u06d0\u06d1"+
		"\7\27\2\2\u06d1\u06d3\5\u00c0a\2\u06d2\u06d0\3\2\2\2\u06d3\u06d6\3\2\2"+
		"\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06d4"+
		"\3\2\2\2\u06d7\u06d8\7\26\2\2\u06d8\u06d9\5\u00b0Y\2\u06d9\u00bb\3\2\2"+
		"\2\u06da\u06dc\7\u00a3\2\2\u06db\u06dd\7v\2\2\u06dc\u06db\3\2\2\2\u06dc"+
		"\u06dd\3\2\2\2\u06dd\u06df\3\2\2\2\u06de\u06e0\5\u00e8u\2\u06df\u06de"+
		"\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\7\25\2\2"+
		"\u06e2\u06e7\5\u00b4[\2\u06e3\u06e4\7\27\2\2\u06e4\u06e6\5\u00b4[\2\u06e5"+
		"\u06e3\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8\3\2"+
		"\2\2\u06e8\u06ea\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06eb\7\26\2\2\u06eb"+
		"\u00bd\3\2\2\2\u06ec\u06ee\7v\2\2\u06ed\u06ef\5\u00e8u\2\u06ee\u06ed\3"+
		"\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\7\25\2\2\u06f1"+
		"\u06f6\5\u00b4[\2\u06f2\u06f3\7\27\2\2\u06f3\u06f5\5\u00b4[\2\u06f4\u06f2"+
		"\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f9\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fa\7\26\2\2\u06fa\u00bf\3"+
		"\2\2\2\u06fb\u06fc\5\u00f6|\2\u06fc\u00c1\3\2\2\2\u06fd\u06fe\5\u00ec"+
		"w\2\u06fe\u06ff\7\24\2\2\u06ff\u0701\3\2\2\2\u0700\u06fd\3\2\2\2\u0700"+
		"\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0708\5\u00f0y\2\u0703\u0704"+
		"\7l\2\2\u0704\u0705\7<\2\2\u0705\u0709\5\u00fc\177\2\u0706\u0707\7~\2"+
		"\2\u0707\u0709\7l\2\2\u0708\u0703\3\2\2\2\u0708\u0706\3\2\2\2\u0708\u0709"+
		"\3\2\2\2\u0709\u00c3\3\2\2\2\u070a\u070d\5\u00aeX\2\u070b\u070c\7A\2\2"+
		"\u070c\u070e\5\u00f8}\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e"+
		"\u0710\3\2\2\2\u070f\u0711\t\r\2\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2"+
		"\2\2\u0711\u00c5\3\2\2\2\u0712\u0716\5\u00d8m\2\u0713\u0716\5\u00e8u\2"+
		"\u0714\u0716\7\u00b8\2\2\u0715\u0712\3\2\2\2\u0715\u0713\3\2\2\2\u0715"+
		"\u0714\3\2\2\2\u0716\u00c7\3\2\2\2\u0717\u0723\5\u00f0y\2\u0718\u0719"+
		"\7\25\2\2\u0719\u071e\5\u00f6|\2\u071a\u071b\7\27\2\2\u071b\u071d\5\u00f6"+
		"|\2\u071c\u071a\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e"+
		"\u071f\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0722\7\26"+
		"\2\2\u0722\u0724\3\2\2\2\u0723\u0718\3\2\2\2\u0723\u0724\3\2\2\2\u0724"+
		"\u0725\3\2\2\2\u0725\u0726\7\65\2\2\u0726\u0727\7\25\2\2\u0727\u0728\5"+
		"\u0096L\2\u0728\u0729\7\26\2\2\u0729\u00c9\3\2\2\2\u072a\u0737\7\31\2"+
		"\2\u072b\u072c\5\u00f0y\2\u072c\u072d\7\24\2\2\u072d\u072e\7\31\2\2\u072e"+
		"\u0737\3\2\2\2\u072f\u0734\5\u00aeX\2\u0730\u0732\7\65\2\2\u0731\u0730"+
		"\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\5\u00e2r"+
		"\2\u0734\u0731\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736\u072a"+
		"\3\2\2\2\u0736\u072b\3\2\2\2\u0736\u072f\3\2\2\2\u0737\u00cb\3\2\2\2\u0738"+
		"\u0739\5\u00ecw\2\u0739\u073a\7\24\2\2\u073a\u073c\3\2\2\2\u073b\u0738"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0742\5\u00f0y"+
		"\2\u073e\u0740\7\65\2\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740"+
		"\u0741\3\2\2\2\u0741\u0743\5\u0108\u0085\2\u0742\u073f\3\2\2\2\u0742\u0743"+
		"\3\2\2\2\u0743\u0749\3\2\2\2\u0744\u0745\7l\2\2\u0745\u0746\7<\2\2\u0746"+
		"\u074a\5\u00fc\177\2\u0747\u0748\7~\2\2\u0748\u074a\7l\2\2\u0749\u0744"+
		"\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u0768\3\2\2\2\u074b"+
		"\u0755\7\25\2\2\u074c\u0751\5\u00ccg\2\u074d\u074e\7\27\2\2\u074e\u0750"+
		"\5\u00ccg\2\u074f\u074d\3\2\2\2\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2"+
		"\2\u0751\u0752\3\2\2\2\u0752\u0756\3\2\2\2\u0753\u0751\3\2\2\2\u0754\u0756"+
		"\5\u00ceh\2\u0755\u074c\3\2\2\2\u0755\u0754\3\2\2\2\u0756\u0757\3\2\2"+
		"\2\u0757\u075c\7\26\2\2\u0758\u075a\7\65\2\2\u0759\u0758\3\2\2\2\u0759"+
		"\u075a\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075d\5\u0108\u0085\2\u075c\u0759"+
		"\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0768\3\2\2\2\u075e\u075f\7\25\2\2"+
		"\u075f\u0760\5\u0096L\2\u0760\u0765\7\26\2\2\u0761\u0763\7\65\2\2\u0762"+
		"\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\5\u0108"+
		"\u0085\2\u0765\u0762\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\3\2\2\2\u0767"+
		"\u073b\3\2\2\2\u0767\u074b\3\2\2\2\u0767\u075e\3\2\2\2\u0768\u00cd\3\2"+
		"\2\2\u0769\u0770\5\u00ccg\2\u076a\u076b\5\u00d0i\2\u076b\u076c\5\u00cc"+
		"g\2\u076c\u076d\5\u00d2j\2\u076d\u076f\3\2\2\2\u076e\u076a\3\2\2\2\u076f"+
		"\u0772\3\2\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u00cf\3\2"+
		"\2\2\u0772\u0770\3\2\2\2\u0773\u077d\7\27\2\2\u0774\u0776\7w\2\2\u0775"+
		"\u0777\7\u0087\2\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u077a"+
		"\3\2\2\2\u0778\u077a\7n\2\2\u0779\u0774\3\2\2\2\u0779\u0778\3\2\2\2\u0779"+
		"\u077a\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077d\7u\2\2\u077c\u0773\3\2"+
		"\2\2\u077c\u0779\3\2\2\2\u077d\u00d1\3\2\2\2\u077e\u077f\7\u0083\2\2\u077f"+
		"\u0781\5\u00aeX\2\u0780\u077e\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u00d3"+
		"\3\2\2\2\u0782\u0784\7\u0099\2\2\u0783\u0785\t\f\2\2\u0784\u0783\3\2\2"+
		"\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u078b\5\u00caf\2\u0787"+
		"\u0788\7\27\2\2\u0788\u078a\5\u00caf\2\u0789\u0787\3\2\2\2\u078a\u078d"+
		"\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u079a\3\2\2\2\u078d"+
		"\u078b\3\2\2\2\u078e\u0798\7`\2\2\u078f\u0794\5\u00ccg\2\u0790\u0791\7"+
		"\27\2\2\u0791\u0793\5\u00ccg\2\u0792\u0790\3\2\2\2\u0793\u0796\3\2\2\2"+
		"\u0794\u0792\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0799\3\2\2\2\u0796\u0794"+
		"\3\2\2\2\u0797\u0799\5\u00ceh\2\u0798\u078f\3\2\2\2\u0798\u0797\3\2\2"+
		"\2\u0799\u079b\3\2\2\2\u079a\u078e\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079e"+
		"\3\2\2\2\u079c\u079d\7\u00ab\2\2\u079d\u079f\5\u00aeX\2\u079e\u079c\3"+
		"\2\2\2\u079e\u079f\3\2\2\2\u079f\u07ae\3\2\2\2\u07a0\u07a1\7c\2\2\u07a1"+
		"\u07a2\7<\2\2\u07a2\u07a7\5\u00aeX\2\u07a3\u07a4\7\27\2\2\u07a4\u07a6"+
		"\5\u00aeX\2\u07a5\u07a3\3\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2"+
		"\2\u07a7\u07a8\3\2\2\2\u07a8\u07ac\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07ab"+
		"\7d\2\2\u07ab\u07ad\5\u00aeX\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2"+
		"\u07ad\u07af\3\2\2\2\u07ae\u07a0\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07cd"+
		"\3\2\2\2\u07b0\u07b1\7\u00a7\2\2\u07b1\u07b2\7\25\2\2\u07b2\u07b7\5\u00ae"+
		"X\2\u07b3\u07b4\7\27\2\2\u07b4\u07b6\5\u00aeX\2\u07b5\u07b3\3\2\2\2\u07b6"+
		"\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba\3\2"+
		"\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07c9\7\26\2\2\u07bb\u07bc\7\27\2\2\u07bc"+
		"\u07bd\7\25\2\2\u07bd\u07c2\5\u00aeX\2\u07be\u07bf\7\27\2\2\u07bf\u07c1"+
		"\5\u00aeX\2\u07c0\u07be\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2"+
		"\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07c6"+
		"\7\26\2\2\u07c6\u07c8\3\2\2\2\u07c7\u07bb\3\2\2\2\u07c8\u07cb\3\2\2\2"+
		"\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb\u07c9"+
		"\3\2\2\2\u07cc\u0782\3\2\2\2\u07cc\u07b0\3\2\2\2\u07cd\u00d5\3\2\2\2\u07ce"+
		"\u07da\5\u00f0y\2\u07cf\u07d0\7\25\2\2\u07d0\u07d5\5\u00f6|\2\u07d1\u07d2"+
		"\7\27\2\2\u07d2\u07d4\5\u00f6|\2\u07d3\u07d1\3\2\2\2\u07d4\u07d7\3\2\2"+
		"\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d8\3\2\2\2\u07d7\u07d5"+
		"\3\2\2\2\u07d8\u07d9\7\26\2\2\u07d9\u07db\3\2\2\2\u07da\u07cf\3\2\2\2"+
		"\u07da\u07db\3\2\2\2\u07db\u00d7\3\2\2\2\u07dc\u07de\t\5\2\2\u07dd\u07dc"+
		"\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e2\7\u00b6\2"+
		"\2\u07e0\u07e2\7\31\2\2\u07e1\u07dd\3\2\2\2\u07e1\u07e0\3\2\2\2\u07e2"+
		"\u00d9\3\2\2\2\u07e3\u07e4\t\20\2\2\u07e4\u00db\3\2\2\2\u07e5\u07e6\t"+
		"\21\2\2\u07e6\u00dd\3\2\2\2\u07e7\u07e8\7\u00b8\2\2\u07e8\u00df\3\2\2"+
		"\2\u07e9\u07ec\5\u00aeX\2\u07ea\u07ec\5\u009cO\2\u07eb\u07e9\3\2\2\2\u07eb"+
		"\u07ea\3\2\2\2\u07ec\u00e1\3\2\2\2\u07ed\u07ee\t\22\2\2\u07ee\u00e3\3"+
		"\2\2\2\u07ef\u07f0\t\23\2\2\u07f0\u00e5\3\2\2\2\u07f1\u07f3\13\2\2\2\u07f2"+
		"\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2"+
		"\2\2\u07f5\u00e7\3\2\2\2\u07f6\u07f7\5\u010c\u0087\2\u07f7\u00e9\3\2\2"+
		"\2\u07f8\u07f9\5\u010c\u0087\2\u07f9\u00eb\3\2\2\2\u07fa\u07fb\5\u010c"+
		"\u0087\2\u07fb\u00ed\3\2\2\2\u07fc\u07fd\5\u010c\u0087\2\u07fd\u00ef\3"+
		"\2\2\2\u07fe\u07ff\5\u010c\u0087\2\u07ff\u00f1\3\2\2\2\u0800\u0801\5\u010c"+
		"\u0087\2\u0801\u00f3\3\2\2\2\u0802\u0803\5\u010c\u0087\2\u0803\u00f5\3"+
		"\2\2\2\u0804\u0805\5\u010c\u0087\2\u0805\u00f7\3\2\2\2\u0806\u0807\5\u010c"+
		"\u0087\2\u0807\u00f9\3\2\2\2\u0808\u0809\5\u010c\u0087\2\u0809\u00fb\3"+
		"\2\2\2\u080a\u080b\5\u010c\u0087\2\u080b\u00fd\3\2\2\2\u080c\u080d\5\u010c"+
		"\u0087\2\u080d\u00ff\3\2\2\2\u080e\u080f\5\u010c\u0087\2\u080f\u0101\3"+
		"\2\2\2\u0810\u0811\5\u010c\u0087\2\u0811\u0103\3\2\2\2\u0812\u0813\5\u010c"+
		"\u0087\2\u0813\u0105\3\2\2\2\u0814\u0815\5\u010c\u0087\2\u0815\u0107\3"+
		"\2\2\2\u0816\u0817\5\u010c\u0087\2\u0817\u0109\3\2\2\2\u0818\u0819\5\u010c"+
		"\u0087\2\u0819\u010b\3\2\2\2\u081a\u0821\7\u00b5\2\2\u081b\u0821\7\u00b8"+
		"\2\2\u081c\u081d\7\25\2\2\u081d\u081e\5\u010c\u0087\2\u081e\u081f\7\26"+
		"\2\2\u081f\u0821\3\2\2\2\u0820\u081a\3\2\2\2\u0820\u081b\3\2\2\2\u0820"+
		"\u081c\3\2\2\2\u0821\u010d\3\2\2\2\u00fc\u0110\u0112\u011d\u0124\u0129"+
		"\u012f\u013a\u014c\u0150\u0155\u0159\u015f\u0165\u0169\u017d\u0181\u0186"+
		"\u018b\u0191\u0197\u019b\u01a8\u01ad\u01b5\u01c3\u01cd\u01de\u01e3\u01e5"+
		"\u01f0\u01f2\u01f5\u0200\u0202\u0205\u0209\u0217\u021f\u0223\u0228\u0230"+
		"\u0236\u023b\u023f\u0247\u024e\u0252\u0259\u0263\u026d\u0277\u0282\u0291"+
		"\u0294\u029d\u02a1\u02a8\u02b3\u02be\u02d2\u02de\u02eb\u02f4\u02ff\u0301"+
		"\u030a\u0316\u0318\u0325\u032f\u0331\u033a\u0347\u0351\u0353\u035f\u0366"+
		"\u036d\u0374\u0378\u0381\u0383\u0387\u0392\u039d\u03a4\u03aa\u03b2\u03b6"+
		"\u03ca\u03d1\u03d7\u03ed\u03fb\u0405\u0410\u0417\u0421\u0425\u042a\u0434"+
		"\u043c\u0441\u0448\u0450\u0454\u0459\u045c\u0466\u046d\u0477\u047b\u0486"+
		"\u048d\u049d\u04a1\u04a8\u04af\u04b9\u04bc\u04cb\u04d0\u04d9\u04db\u04e2"+
		"\u04e9\u04ef\u04f4\u0500\u0503\u0509\u050b\u0512\u051b\u0520\u0529\u0534"+
		"\u053b\u0541\u054b\u054e\u0554\u0556\u055a\u0561\u056a\u056e\u0570\u0574"+
		"\u057d\u0582\u0584\u058d\u0598\u059f\u05a2\u05b1\u05b6\u05bb\u05bd\u05c4"+
		"\u05cb\u05d0\u05d4\u05d8\u05e6\u05eb\u05ee\u0603\u0609\u060b\u060f\u0617"+
		"\u061c\u0625\u062c\u0630\u0639\u063c\u0642\u0660\u0669\u066b\u0672\u067b"+
		"\u0680\u068c\u0690\u0694\u0698\u069f\u06a2\u06a4\u06ab\u06ae\u06b2\u06bd"+
		"\u06c7\u06d4\u06dc\u06df\u06e7\u06ee\u06f6\u0700\u0708\u070d\u0710\u0715"+
		"\u071e\u0723\u0731\u0734\u0736\u073b\u073f\u0742\u0749\u0751\u0755\u0759"+
		"\u075c\u0762\u0765\u0767\u0770\u0776\u0779\u077c\u0780\u0784\u078b\u0794"+
		"\u0798\u079a\u079e\u07a7\u07ac\u07ae\u07b7\u07c2\u07c9\u07cc\u07d5\u07da"+
		"\u07dd\u07e1\u07eb\u07f4\u0820";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}