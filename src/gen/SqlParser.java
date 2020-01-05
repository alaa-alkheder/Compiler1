// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler\Sql.g4 by ANTLR 4.7.2
package gen;
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
		RULE_s = 8, RULE_stat_withblock_forloop = 9, RULE_json_atmt = 10, RULE_higer_order_function_stmt = 11, 
		RULE_arr_stmt = 12, RULE_var_stmt = 13, RULE_var_stmt_withscol = 14, RULE_print_stmt = 15, 
		RULE_function_head = 16, RULE_function_body = 17, RULE_function_stmt = 18, 
		RULE_function_call_stmt = 19, RULE_params_stmt = 20, RULE_arguments_stmt = 21, 
		RULE_for_stmt = 22, RULE_do_while_stmt = 23, RULE_while_stmt = 24, RULE_condition_block = 25, 
		RULE_condition_block_forloop = 26, RULE_if_stmt = 27, RULE_if_stmt_forloop = 28, 
		RULE_if_stmt_short = 29, RULE_if_stmt_short_forloop = 30, RULE_switch_stmt = 31, 
		RULE_break_stmt = 32, RULE_return_stmt = 33, RULE_one_line_instruction = 34, 
		RULE_math_op0 = 35, RULE_math_op1 = 36, RULE_math_op2 = 37, RULE_math_op3 = 38, 
		RULE_logic_operator1 = 39, RULE_logic_operator2 = 40, RULE_math_expr0 = 41, 
		RULE_math_expr_all = 42, RULE_identifier = 43, RULE_math_expr_plus = 44, 
		RULE_math_expr_plus_withoutbrackets = 45, RULE_math_expr1 = 46, RULE_math_expr1_withbrackets = 47, 
		RULE_math_expr2 = 48, RULE_math_expr2_withbrackets = 49, RULE_math_expr3 = 50, 
		RULE_math_expr3_withbrackets = 51, RULE_math_expr_without_digit = 52, 
		RULE_result_mathematic = 53, RULE_logic_expr1 = 54, RULE_logic_expr1_withbracets = 55, 
		RULE_logic_all = 56, RULE_logic_expr2 = 57, RULE_logic_expr2_withbrackets = 58, 
		RULE_logic_resault = 59, RULE_assingment_rule_without_bracket = 60, RULE_assingment_rule_with_bracket = 61, 
		RULE_assingment_rule_with_scol = 62, RULE_assingment_rule_without_scol = 63, 
		RULE_alter_table_stmt = 64, RULE_alter_table_add_constraint = 65, RULE_alter_table_add = 66, 
		RULE_create_table_stmt = 67, RULE_delete_stmt = 68, RULE_drop_table_stmt = 69, 
		RULE_factored_select_stmt = 70, RULE_insert_stmt = 71, RULE_select_stmt = 72, 
		RULE_select_or_values = 73, RULE_update_stmt = 74, RULE_column_def = 75, 
		RULE_type_name = 76, RULE_column_constraint = 77, RULE_column_constraint_primary_key = 78, 
		RULE_column_constraint_foreign_key = 79, RULE_column_constraint_not_null = 80, 
		RULE_column_constraint_null = 81, RULE_column_default = 82, RULE_column_default_value = 83, 
		RULE_expr = 84, RULE_foreign_key_clause = 85, RULE_fk_target_column_name = 86, 
		RULE_indexed_column = 87, RULE_table_constraint = 88, RULE_table_constraint_primary_key = 89, 
		RULE_table_constraint_foreign_key = 90, RULE_table_constraint_unique = 91, 
		RULE_table_constraint_key = 92, RULE_fk_origin_column_name = 93, RULE_qualified_table_name = 94, 
		RULE_ordering_term = 95, RULE_pragma_value = 96, RULE_common_table_expression = 97, 
		RULE_result_column = 98, RULE_table_or_subquery = 99, RULE_join_clause = 100, 
		RULE_join_operator = 101, RULE_join_constraint = 102, RULE_select_core = 103, 
		RULE_cte_table_name = 104, RULE_signed_number = 105, RULE_literal_value = 106, 
		RULE_unary_operator = 107, RULE_error_message = 108, RULE_module_argument = 109, 
		RULE_column_alias = 110, RULE_keyword = 111, RULE_unknown = 112, RULE_name = 113, 
		RULE_function_name = 114, RULE_database_name = 115, RULE_source_table_name = 116, 
		RULE_table_name = 117, RULE_table_or_index_name = 118, RULE_new_table_name = 119, 
		RULE_column_name = 120, RULE_collation_name = 121, RULE_foreign_table = 122, 
		RULE_index_name = 123, RULE_trigger_name = 124, RULE_view_name = 125, 
		RULE_module_name = 126, RULE_pragma_name = 127, RULE_savepoint_name = 128, 
		RULE_table_alias = 129, RULE_transaction_name = 130, RULE_any_name = 131;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "stat", "c", "stat_with_return", 
			"stat_forloop", "s", "stat_withblock_forloop", "json_atmt", "higer_order_function_stmt", 
			"arr_stmt", "var_stmt", "var_stmt_withscol", "print_stmt", "function_head", 
			"function_body", "function_stmt", "function_call_stmt", "params_stmt", 
			"arguments_stmt", "for_stmt", "do_while_stmt", "while_stmt", "condition_block", 
			"condition_block_forloop", "if_stmt", "if_stmt_forloop", "if_stmt_short", 
			"if_stmt_short_forloop", "switch_stmt", "break_stmt", "return_stmt", 
			"one_line_instruction", "math_op0", "math_op1", "math_op2", "math_op3", 
			"logic_operator1", "logic_operator2", "math_expr0", "math_expr_all", 
			"identifier", "math_expr_plus", "math_expr_plus_withoutbrackets", "math_expr1", 
			"math_expr1_withbrackets", "math_expr2", "math_expr2_withbrackets", "math_expr3", 
			"math_expr3_withbrackets", "math_expr_without_digit", "result_mathematic", 
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
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_ALTER || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_CREATE - 68)) | (1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_INSERT - 68)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (K_SELECT - 151)) | (1L << (K_UPDATE - 151)) | (1L << (K_VALUES - 151)) | (1L << (K_VAR - 151)) | (1L << (UNEXPECTED_CHAR - 151)))) != 0)) {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case K_VAR:
					{
					setState(264);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(265);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
			setState(273);
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(276);
				match(SCOL);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			sql_stmt();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(283);
						match(SCOL);
						}
						}
						setState(286); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(288);
					sql_stmt();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(SCOL);
					}
					} 
				}
				setState(299);
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
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(300);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(301);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(302);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(303);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(304);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(305);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(306);
				update_stmt();
				}
				break;
			case K_VAR:
				{
				setState(307);
				var_stmt();
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				if_stmt_short();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				print_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				function_call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				var_stmt_withscol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				do_while_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(317);
				switch_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(318);
				one_line_instruction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(319);
				for_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(320);
				match(OPEN_BLOCK);
				setState(321);
				match(CLOSE_BLOCK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(322);
				match(OPEN_BLOCK);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_BLOCK) | (1L << OPEN_PAR))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_FOR - 92)) | (1L << (K_IF - 92)) | (1L << (K_WHILE - 92)) | (1L << (K_DO - 92)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_VAR - 172)) | (1L << (K_SWITCH - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (STRING_LITERAL - 172)))) != 0)) {
					{
					{
					setState(323);
					stat();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						stat();
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BLOCK || _la==K_RETURN) {
					{
					setState(338);
					return_stmt();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(OPEN_BLOCK);
				setState(342);
				c();
				setState(343);
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				c();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						stat();
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(354);
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
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(357);
				if_stmt_forloop();
				}
				break;
			case 2:
				{
				setState(358);
				if_stmt_short_forloop();
				}
				break;
			case 3:
				{
				setState(359);
				print_stmt();
				}
				break;
			case 4:
				{
				setState(360);
				function_call_stmt();
				}
				break;
			case 5:
				{
				setState(361);
				var_stmt_withscol();
				}
				break;
			case 6:
				{
				setState(362);
				while_stmt();
				}
				break;
			case 7:
				{
				setState(363);
				one_line_instruction();
				}
				break;
			case 8:
				{
				setState(364);
				match(K_CONTINUE);
				setState(365);
				match(SCOL);
				}
				break;
			case 9:
				{
				setState(366);
				do_while_stmt();
				}
				break;
			case 10:
				{
				setState(367);
				switch_stmt();
				}
				break;
			case 11:
				{
				setState(368);
				for_stmt();
				}
				break;
			case 12:
				{
				setState(369);
				match(OPEN_BLOCK);
				setState(370);
				match(CLOSE_BLOCK);
				}
				break;
			case 13:
				{
				setState(371);
				match(OPEN_BLOCK);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_BLOCK) | (1L << OPEN_PAR))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_FOR - 92)) | (1L << (K_IF - 92)) | (1L << (K_WHILE - 92)) | (1L << (K_DO - 92)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_VAR - 172)) | (1L << (K_SWITCH - 172)) | (1L << (K_PRINT - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (STRING_LITERAL - 172)))) != 0)) {
					{
					{
					setState(372);
					stat_forloop();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(381);
						stat_forloop();
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(387);
					break_stmt();
					}
					break;
				case 2:
					{
					setState(388);
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
				setState(391);
				match(OPEN_BLOCK);
				setState(392);
				s();
				setState(393);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						stat_forloop();
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(404);
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

	public static class Json_atmtContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(SqlParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SqlParser.CLOSE_BLOCK, 0); }
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
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<Json_atmtContext> json_atmt() {
			return getRuleContexts(Json_atmtContext.class);
		}
		public Json_atmtContext json_atmt(int i) {
			return getRuleContext(Json_atmtContext.class,i);
		}
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(SqlParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(SqlParser.OPEN_BRACKETS, i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(SqlParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(SqlParser.CLOSE_BRACKETS, i);
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
		enterRule(_localctx, 20, RULE_json_atmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OPEN_BLOCK);
			{
			setState(408);
			any_name();
			setState(409);
			match(T__0);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
				setState(410);
				match(NUMERIC_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				setState(411);
				match(IDENTIFIER);
				}
				break;
			case OPEN_BLOCK:
				{
				setState(412);
				json_atmt();
				}
				break;
			case OPEN_BRACKETS:
				{
				{
				setState(413);
				match(OPEN_BRACKETS);
				setState(414);
				any_name();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(415);
					match(COMMA);
					setState(416);
					any_name();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				match(CLOSE_BRACKETS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				any_name();
				setState(428);
				match(T__0);
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC_LITERAL:
					{
					setState(429);
					match(NUMERIC_LITERAL);
					}
					break;
				case IDENTIFIER:
					{
					setState(430);
					match(IDENTIFIER);
					}
					break;
				case OPEN_BLOCK:
					{
					setState(431);
					json_atmt();
					}
					break;
				case OPEN_BRACKETS:
					{
					{
					setState(432);
					match(OPEN_BRACKETS);
					setState(433);
					any_name();
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(434);
						match(COMMA);
						setState(435);
						any_name();
						}
						}
						setState(440);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(441);
					match(CLOSE_BRACKETS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
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
		enterRule(_localctx, 22, RULE_higer_order_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			any_name();
			setState(453);
			match(OPEN_PAR);
			setState(454);
			any_name();
			setState(455);
			match(COMMA);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(456);
				any_name();
				setState(457);
				match(COMMA);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(K_FUNCTION);
			setState(465);
			match(OPEN_PAR);
			setState(466);
			any_name();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(467);
				match(COMMA);
				setState(468);
				any_name();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(CLOSE_PAR);
			setState(475);
			function_body();
			setState(476);
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
		enterRule(_localctx, 24, RULE_arr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			any_name();
			setState(479);
			match(OPEN_BRACKETS);
			setState(480);
			match(CLOSE_BRACKETS);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(481);
				match(ASSIGN);
				setState(493);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BLOCK:
					{
					{
					setState(482);
					match(OPEN_BLOCK);
					setState(483);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(484);
						match(COMMA);
						setState(485);
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
						setState(490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(491);
					match(CLOSE_BLOCK);
					}
					}
					break;
				case K_SELECT:
				case K_VALUES:
					{
					setState(492);
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
		enterRule(_localctx, 26, RULE_var_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(K_VAR);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				{
				setState(498);
				any_name();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(499);
					match(ASSIGN);
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(500);
						math_expr0();
						}
						break;
					case 2:
						{
						setState(501);
						math_expr1();
						}
						break;
					case 3:
						{
						setState(502);
						math_expr1_withbrackets();
						}
						break;
					case 4:
						{
						setState(503);
						json_atmt();
						}
						break;
					case 5:
						{
						setState(504);
						higer_order_function_stmt();
						}
						break;
					case 6:
						{
						setState(505);
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
				setState(510);
				arr_stmt();
				}
				break;
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(513);
				match(COMMA);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					{
					setState(514);
					any_name();
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(515);
						match(ASSIGN);
						setState(522);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(516);
							math_expr0();
							}
							break;
						case 2:
							{
							setState(517);
							math_expr1();
							}
							break;
						case 3:
							{
							setState(518);
							math_expr1_withbrackets();
							}
							break;
						case 4:
							{
							setState(519);
							json_atmt();
							}
							break;
						case 5:
							{
							setState(520);
							higer_order_function_stmt();
							}
							break;
						case 6:
							{
							setState(521);
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
					setState(526);
					arr_stmt();
					}
					break;
				}
				}
				}
				setState(533);
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
		enterRule(_localctx, 28, RULE_var_stmt_withscol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			var_stmt();
			setState(535);
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
		enterRule(_localctx, 30, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(K_PRINT);
			setState(538);
			match(OPEN_PAR);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << OPEN_PAR))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (IDENTIFIER - 179)) | (1L << (NUMERIC_LITERAL - 179)) | (1L << (STRING_LITERAL - 179)))) != 0)) {
				{
				{
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(539);
					result_mathematic();
					}
					break;
				case 2:
					{
					setState(540);
					match(T__1);
					setState(541);
					any_name();
					setState(542);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(544);
					match(NUMERIC_LITERAL);
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(547);
					match(PLUS);
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(548);
						result_mathematic();
						}
						break;
					case 2:
						{
						setState(549);
						match(T__1);
						setState(550);
						match(IDENTIFIER);
						setState(551);
						match(T__1);
						}
						break;
					case 3:
						{
						setState(552);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(CLOSE_PAR);
			setState(566);
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
		enterRule(_localctx, 32, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(OPEN_PAR);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(569);
				arguments_stmt();
				}
			}

			setState(572);
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
		enterRule(_localctx, 34, RULE_function_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(OPEN_BLOCK);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(575);
				function_stmt();
				}
				break;
			}
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(578);
					stat();
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(584);
				function_stmt();
				}
			}

			setState(587);
			return_stmt();
			setState(588);
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
		enterRule(_localctx, 36, RULE_function_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			any_name();
			setState(591);
			match(OPEN_PAR);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(592);
				arguments_stmt();
				}
			}

			setState(595);
			match(CLOSE_PAR);
			setState(596);
			match(OPEN_BLOCK);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					stat();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BLOCK || _la==K_RETURN) {
				{
				setState(603);
				return_stmt();
				}
			}

			setState(606);
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
		enterRule(_localctx, 38, RULE_function_call_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			any_name();
			setState(609);
			match(OPEN_PAR);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(610);
				params_stmt();
				}
			}

			setState(613);
			match(CLOSE_PAR);
			setState(614);
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
		enterRule(_localctx, 40, RULE_params_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			any_name();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(COMMA);
					setState(618);
					any_name();
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(624);
				match(COMMA);
				setState(625);
				any_name();
				setState(626);
				match(ASSIGN);
				setState(627);
				match(NUMERIC_LITERAL);
				}
				}
				setState(633);
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
		enterRule(_localctx, 42, RULE_arguments_stmt);
		int _la;
		try {
			int _alt;
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(634);
				match(K_VAR);
				setState(635);
				any_name();
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						match(COMMA);
						setState(637);
						match(K_VAR);
						setState(638);
						any_name();
						}
						} 
					}
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(644);
					match(COMMA);
					setState(645);
					match(K_VAR);
					setState(646);
					any_name();
					setState(647);
					match(ASSIGN);
					setState(648);
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
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(K_VAR);
				setState(656);
				any_name();
				setState(657);
				match(ASSIGN);
				setState(658);
				match(NUMERIC_LITERAL);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(659);
					match(COMMA);
					setState(660);
					match(K_VAR);
					setState(661);
					any_name();
					setState(662);
					match(ASSIGN);
					setState(663);
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
					setState(669);
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
		enterRule(_localctx, 44, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(K_FOR);
			setState(673);
			match(OPEN_PAR);
			setState(679);
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
				assingment_rule_without_scol();
				}
				break;
			case 3:
				{
				setState(676);
				math_expr_plus_withoutbrackets();
				}
				break;
			case 4:
				{
				setState(677);
				math_expr2();
				}
				break;
			case 5:
				{
				setState(678);
				match(IDENTIFIER);
				}
				break;
			}
			setState(681);
			match(SCOL);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << OPEN_PAR))) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & ((1L << (K_TRUE - 173)) | (1L << (K_FALSE - 173)) | (1L << (IDENTIFIER - 173)) | (1L << (NUMERIC_LITERAL - 173)))) != 0)) {
				{
				setState(682);
				logic_resault();
				}
			}

			setState(685);
			match(SCOL);
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(686);
				var_stmt();
				}
				break;
			case 2:
				{
				setState(687);
				math_expr_plus_withoutbrackets();
				}
				break;
			case 3:
				{
				setState(688);
				math_expr2();
				}
				break;
			case 4:
				{
				setState(689);
				assingment_rule_without_scol();
				}
				break;
			}
			setState(692);
			match(CLOSE_PAR);
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(693);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(694);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(695);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(696);
				match(OPEN_BLOCK);
				setState(697);
				stat_withblock_forloop();
				setState(698);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(700);
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
		enterRule(_localctx, 46, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(K_DO);
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(704);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(705);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(706);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(707);
				match(OPEN_BLOCK);
				setState(708);
				stat_withblock_forloop();
				setState(709);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(711);
				stat_forloop();
				}
				break;
			}
			setState(714);
			match(K_WHILE);
			setState(715);
			match(OPEN_PAR);
			{
			setState(716);
			logic_resault();
			}
			setState(717);
			match(CLOSE_PAR);
			setState(718);
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
		enterRule(_localctx, 48, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(K_WHILE);
			setState(721);
			match(OPEN_PAR);
			{
			setState(722);
			logic_resault();
			}
			setState(723);
			match(CLOSE_PAR);
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(724);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(725);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(726);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(727);
				match(OPEN_BLOCK);
				setState(728);
				stat_withblock_forloop();
				setState(729);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(731);
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
		enterRule(_localctx, 50, RULE_condition_block);
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
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
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
				match(OPEN_BLOCK);
				setState(740);
				stat_with_return();
				setState(741);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(743);
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
		enterRule(_localctx, 52, RULE_condition_block_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(OPEN_PAR);
			{
			setState(747);
			logic_resault();
			}
			setState(748);
			match(CLOSE_PAR);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(749);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(750);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(751);
				break_stmt();
				}
				break;
			case 4:
				{
				setState(752);
				match(OPEN_BLOCK);
				setState(753);
				stat_withblock_forloop();
				setState(754);
				match(CLOSE_BLOCK);
				}
				break;
			case 5:
				{
				setState(756);
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
		enterRule(_localctx, 54, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(K_IF);
			setState(760);
			condition_block();
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761);
					match(K_ELSE);
					setState(762);
					match(K_IF);
					setState(763);
					condition_block();
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(769);
				match(K_ELSE);
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(770);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(771);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(772);
					match(OPEN_BLOCK);
					setState(773);
					stat_with_return();
					setState(774);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(776);
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
		enterRule(_localctx, 56, RULE_if_stmt_forloop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(K_IF);
			setState(782);
			condition_block_forloop();
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					match(K_ELSE);
					setState(784);
					match(K_IF);
					setState(785);
					condition_block_forloop();
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(791);
				match(K_ELSE);
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(792);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(793);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(794);
					break_stmt();
					}
					break;
				case 4:
					{
					setState(795);
					match(OPEN_BLOCK);
					setState(796);
					stat_withblock_forloop();
					setState(797);
					match(CLOSE_BLOCK);
					}
					break;
				case 5:
					{
					setState(799);
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
		enterRule(_localctx, 58, RULE_if_stmt_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(OPEN_PAR);
			setState(805);
			logic_resault();
			setState(806);
			match(CLOSE_PAR);
			setState(807);
			match(T__2);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(808);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(809);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(810);
				match(OPEN_BLOCK);
				setState(811);
				stat_with_return();
				setState(812);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(814);
				stat();
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(817);
				match(COMMA);
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(818);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(819);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(820);
					match(OPEN_BLOCK);
					setState(821);
					stat_with_return();
					setState(822);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(824);
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
		enterRule(_localctx, 60, RULE_if_stmt_short_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(OPEN_PAR);
			setState(830);
			logic_resault();
			setState(831);
			match(CLOSE_PAR);
			setState(832);
			match(T__2);
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(833);
				one_line_instruction();
				}
				break;
			case 2:
				{
				setState(834);
				return_stmt();
				}
				break;
			case 3:
				{
				setState(835);
				match(OPEN_BLOCK);
				setState(836);
				stat_withblock_forloop();
				setState(837);
				match(CLOSE_BLOCK);
				}
				break;
			case 4:
				{
				setState(839);
				stat_forloop();
				}
				break;
			}
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(842);
				match(COMMA);
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(843);
					one_line_instruction();
					}
					break;
				case 2:
					{
					setState(844);
					return_stmt();
					}
					break;
				case 3:
					{
					setState(845);
					match(OPEN_BLOCK);
					setState(846);
					stat_withblock_forloop();
					setState(847);
					match(CLOSE_BLOCK);
					}
					break;
				case 4:
					{
					setState(849);
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
		enterRule(_localctx, 62, RULE_switch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(K_SWITCH);
			setState(855);
			match(OPEN_PAR);
			{
			setState(856);
			result_mathematic();
			}
			setState(857);
			match(CLOSE_PAR);
			setState(858);
			match(OPEN_BLOCK);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(859);
				match(K_CASE);
				setState(864);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
					{
					setState(860);
					math_expr0();
					}
					break;
				case T__1:
					{
					setState(861);
					match(T__1);
					setState(862);
					match(IDENTIFIER);
					setState(863);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(866);
				match(T__0);
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(867);
					return_stmt();
					}
					break;
				case 2:
					{
					setState(868);
					break_stmt();
					}
					break;
				case 3:
					{
					setState(869);
					stat_withblock_forloop();
					}
					break;
				case 4:
					{
					setState(870);
					one_line_instruction();
					}
					break;
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(873);
						match(K_CASE);
						setState(878);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case NUMERIC_LITERAL:
							{
							setState(874);
							math_expr0();
							}
							break;
						case T__1:
							{
							setState(875);
							match(T__1);
							setState(876);
							match(IDENTIFIER);
							setState(877);
							match(T__1);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(880);
						match(T__0);
						setState(885);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(881);
							return_stmt();
							}
							break;
						case 2:
							{
							setState(882);
							break_stmt();
							}
							break;
						case 3:
							{
							setState(883);
							stat_withblock_forloop();
							}
							break;
						case 4:
							{
							setState(884);
							one_line_instruction();
							}
							break;
						}
						}
						} 
					}
					setState(891);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(892);
					match(K_DEFAULT);
					setState(893);
					match(T__0);
					setState(898);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(894);
						return_stmt();
						}
						break;
					case 2:
						{
						setState(895);
						break_stmt();
						}
						break;
					case 3:
						{
						setState(896);
						stat_withblock_forloop();
						}
						break;
					case 4:
						{
						setState(897);
						one_line_instruction();
						}
						break;
					}
					}
				}

				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
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
		enterRule(_localctx, 64, RULE_break_stmt);
		try {
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(K_BREAK);
				setState(910);
				match(SCOL);
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(OPEN_BLOCK);
				setState(912);
				break_stmt();
				setState(913);
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
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
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
		enterRule(_localctx, 66, RULE_return_stmt);
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(K_RETURN);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(918);
					var_stmt();
					}
					break;
				case 2:
					{
					setState(919);
					math_expr2();
					}
					break;
				case 3:
					{
					setState(920);
					math_expr2_withbrackets();
					}
					break;
				case 4:
					{
					setState(921);
					math_expr_plus();
					}
					break;
				case 5:
					{
					setState(922);
					assingment_rule_without_scol();
					}
					break;
				case 6:
					{
					setState(923);
					logic_all();
					}
					break;
				case 7:
					{
					setState(924);
					match(NUMERIC_LITERAL);
					}
					break;
				case 8:
					{
					setState(925);
					match(K_NULL);
					}
					break;
				}
				setState(928);
				match(SCOL);
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(OPEN_BLOCK);
				setState(930);
				return_stmt();
				setState(931);
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
		enterRule(_localctx, 68, RULE_one_line_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(935);
				math_expr2();
				}
				break;
			case 2:
				{
				setState(936);
				math_expr2_withbrackets();
				}
				break;
			case 3:
				{
				setState(937);
				math_expr_plus();
				}
				break;
			case 4:
				{
				setState(938);
				assingment_rule_without_scol();
				}
				break;
			}
			setState(941);
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
		enterRule(_localctx, 70, RULE_math_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
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
		enterRule(_localctx, 72, RULE_math_op1);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
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
				setState(946);
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
		enterRule(_localctx, 74, RULE_math_op2);
		int _la;
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
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
				setState(950);
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
		enterRule(_localctx, 76, RULE_math_op3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
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
		enterRule(_localctx, 78, RULE_logic_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
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
		enterRule(_localctx, 80, RULE_logic_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
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
		enterRule(_localctx, 82, RULE_math_expr0);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(OPEN_PAR);
				setState(961);
				match(DIGIT);
				setState(962);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				match(OPEN_PAR);
				setState(965);
				match(IDENTIFIER);
				setState(966);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				match(OPEN_PAR);
				setState(968);
				math_expr0();
				setState(969);
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
		enterRule(_localctx, 84, RULE_math_expr_all);
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				math_expr1_withbrackets();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				math_expr_plus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(975);
				math_expr2_withbrackets();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(976);
				math_expr0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(977);
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
		enterRule(_localctx, 86, RULE_identifier);
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				match(IDENTIFIER);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(OPEN_PAR);
				setState(982);
				match(IDENTIFIER);
				setState(983);
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
		enterRule(_localctx, 88, RULE_math_expr_plus);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				math_op0();
				setState(987);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				identifier();
				setState(990);
				math_op0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				match(OPEN_PAR);
				setState(993);
				math_op0();
				setState(994);
				identifier();
				setState(995);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				match(OPEN_PAR);
				setState(998);
				identifier();
				setState(999);
				math_op0();
				setState(1000);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				match(OPEN_PAR);
				setState(1003);
				math_expr_plus();
				setState(1004);
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
		enterRule(_localctx, 90, RULE_math_expr_plus_withoutbrackets);
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				math_op0();
				setState(1009);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				identifier();
				setState(1012);
				math_op0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				math_op0();
				setState(1015);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				identifier();
				setState(1018);
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
		enterRule(_localctx, 92, RULE_math_expr1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			math_expr_all();
			setState(1023);
			math_op1();
			setState(1024);
			math_expr_all();
			setState(1030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1025);
					math_op1();
					setState(1026);
					math_expr_all();
					}
					} 
				}
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 94, RULE_math_expr1_withbrackets);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(OPEN_PAR);
				setState(1034);
				math_expr1();
				setState(1035);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(OPEN_PAR);
				setState(1038);
				math_expr1_withbrackets();
				setState(1039);
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
		enterRule(_localctx, 96, RULE_math_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			any_name();
			setState(1044);
			math_op2();
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1045);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1046);
				math_expr1();
				}
				break;
			case 3:
				{
				setState(1047);
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
		enterRule(_localctx, 98, RULE_math_expr2_withbrackets);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(OPEN_PAR);
				setState(1051);
				math_expr2();
				setState(1052);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				match(OPEN_PAR);
				setState(1055);
				math_expr2_withbrackets();
				setState(1056);
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
		enterRule(_localctx, 100, RULE_math_expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1060);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1061);
				math_expr1();
				}
				break;
			}
			setState(1064);
			math_op3();
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1065);
				math_expr_all();
				}
				break;
			case 2:
				{
				setState(1066);
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
		enterRule(_localctx, 102, RULE_math_expr3_withbrackets);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				match(OPEN_PAR);
				setState(1070);
				math_expr3();
				setState(1071);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(OPEN_PAR);
				setState(1074);
				math_expr3_withbrackets();
				setState(1075);
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
		enterRule(_localctx, 104, RULE_math_expr_without_digit);
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				math_expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1080);
				math_expr1_withbrackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				math_expr2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1082);
				math_expr2_withbrackets();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
				math_expr_plus();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1084);
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
		enterRule(_localctx, 106, RULE_result_mathematic);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				math_expr_all();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				math_expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
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
		enterRule(_localctx, 108, RULE_logic_expr1);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1092);
					assingment_rule_with_bracket();
					}
					break;
				case 2:
					{
					setState(1093);
					math_expr_all();
					}
					break;
				case 3:
					{
					setState(1094);
					math_expr1();
					}
					break;
				case 4:
					{
					setState(1095);
					match(K_TRUE);
					}
					break;
				case 5:
					{
					setState(1096);
					match(K_FALSE);
					}
					break;
				}
				setState(1099);
				logic_operator1();
				setState(1105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1100);
					assingment_rule_with_bracket();
					}
					break;
				case 2:
					{
					setState(1101);
					math_expr1();
					}
					break;
				case 3:
					{
					setState(1102);
					math_expr_all();
					}
					break;
				case 4:
					{
					setState(1103);
					match(K_TRUE);
					}
					break;
				case 5:
					{
					setState(1104);
					match(K_FALSE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1107);
					math_expr3();
					}
					break;
				case 2:
					{
					setState(1108);
					math_expr3_withbrackets();
					}
					break;
				}
				setState(1111);
				logic_operator1();
				setState(1114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1112);
					math_expr3();
					}
					break;
				case 2:
					{
					setState(1113);
					math_expr3_withbrackets();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1116);
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
		enterRule(_localctx, 110, RULE_logic_expr1_withbracets);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(OPEN_PAR);
				setState(1120);
				logic_expr1();
				setState(1121);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(OPEN_PAR);
				setState(1124);
				logic_expr1_withbracets();
				setState(1125);
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
		enterRule(_localctx, 112, RULE_logic_all);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				logic_expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				logic_expr1_withbracets();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				match(K_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1133);
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
		enterRule(_localctx, 114, RULE_logic_expr2);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				logic_all();
				setState(1137);
				logic_operator2();
				setState(1138);
				logic_all();
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10 || _la==PIPE2) {
					{
					{
					setState(1139);
					logic_operator2();
					setState(1140);
					logic_all();
					}
					}
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
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
		enterRule(_localctx, 116, RULE_logic_expr2_withbrackets);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				match(OPEN_PAR);
				setState(1151);
				logic_expr2();
				setState(1152);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				logic_expr1_withbracets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				match(OPEN_PAR);
				setState(1156);
				logic_expr2_withbrackets();
				setState(1157);
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
		enterRule(_localctx, 118, RULE_logic_resault);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				logic_expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				logic_expr2_withbrackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				match(K_TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				match(K_FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1165);
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
		enterRule(_localctx, 120, RULE_assingment_rule_without_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			identifier();
			setState(1169);
			match(ASSIGN);
			setState(1170);
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
		enterRule(_localctx, 122, RULE_assingment_rule_with_bracket);
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				match(OPEN_PAR);
				setState(1173);
				identifier();
				setState(1174);
				match(ASSIGN);
				setState(1175);
				result_mathematic();
				setState(1176);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(OPEN_PAR);
				setState(1179);
				assingment_rule_with_bracket();
				setState(1180);
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
		enterRule(_localctx, 124, RULE_assingment_rule_with_scol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1184);
				assingment_rule_without_bracket();
				}
				break;
			case 2:
				{
				setState(1185);
				assingment_rule_with_bracket();
				}
				break;
			}
			setState(1188);
			match(CLOSE_BLOCK);
			setState(1189);
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
		enterRule(_localctx, 126, RULE_assingment_rule_without_scol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1191);
				assingment_rule_without_bracket();
				}
				break;
			case 2:
				{
				setState(1192);
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
		enterRule(_localctx, 128, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(K_ALTER);
			setState(1196);
			match(K_TABLE);
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1197);
				database_name();
				setState(1198);
				match(DOT);
				}
				break;
			}
			setState(1202);
			source_table_name();
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1203);
				match(K_RENAME);
				setState(1204);
				match(K_TO);
				setState(1205);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(1206);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(1207);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(1208);
				match(K_ADD);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(1209);
					match(K_COLUMN);
					}
				}

				setState(1212);
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
		enterRule(_localctx, 130, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(K_ADD);
			setState(1216);
			match(K_CONSTRAINT);
			setState(1217);
			any_name();
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
		enterRule(_localctx, 132, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(K_ADD);
			setState(1221);
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
		enterRule(_localctx, 134, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(K_CREATE);
			setState(1224);
			match(K_TABLE);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1225);
				match(K_IF);
				setState(1226);
				match(K_NOT);
				setState(1227);
				match(K_EXISTS);
				}
			}

			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1230);
				database_name();
				setState(1231);
				match(DOT);
				}
				break;
			}
			setState(1235);
			table_name();
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(1236);
				match(OPEN_PAR);
				setState(1237);
				column_def();
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(1242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1238);
						match(COMMA);
						setState(1239);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(1240);
						match(COMMA);
						setState(1241);
						column_def();
						}
						break;
					}
					}
					setState(1246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1247);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(1249);
				match(K_AS);
				setState(1250);
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
		enterRule(_localctx, 136, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(K_DELETE);
			setState(1254);
			match(K_FROM);
			setState(1255);
			qualified_table_name();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1256);
				match(K_WHERE);
				setState(1257);
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
		enterRule(_localctx, 138, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(K_DROP);
			setState(1261);
			match(K_TABLE);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1262);
				match(K_IF);
				setState(1263);
				match(K_EXISTS);
				}
			}

			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1266);
				database_name();
				setState(1267);
				match(DOT);
				}
				break;
			}
			setState(1271);
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
		enterRule(_localctx, 140, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			select_core();
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1274);
				match(K_ORDER);
				setState(1275);
				match(K_BY);
				setState(1276);
				ordering_term();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1277);
					match(COMMA);
					setState(1278);
					ordering_term();
					}
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1286);
				match(K_LIMIT);
				setState(1287);
				expr(0);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1288);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1289);
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
		enterRule(_localctx, 142, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(K_INSERT);
			setState(1295);
			match(K_INTO);
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1296);
				database_name();
				setState(1297);
				match(DOT);
				}
				break;
			}
			setState(1301);
			table_name();
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1302);
				match(OPEN_PAR);
				setState(1303);
				column_name();
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1304);
					match(COMMA);
					setState(1305);
					column_name();
					}
					}
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1311);
				match(CLOSE_PAR);
				}
			}

			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1315);
				match(K_VALUES);
				setState(1316);
				match(OPEN_PAR);
				setState(1317);
				expr(0);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1318);
					match(COMMA);
					setState(1319);
					expr(0);
					}
					}
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1325);
				match(CLOSE_PAR);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1326);
					match(COMMA);
					setState(1327);
					match(OPEN_PAR);
					setState(1328);
					expr(0);
					setState(1333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1329);
						match(COMMA);
						setState(1330);
						expr(0);
						}
						}
						setState(1335);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1336);
					match(CLOSE_PAR);
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1343);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1344);
				match(K_DEFAULT);
				setState(1345);
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
		enterRule(_localctx, 144, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			select_or_values();
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1349);
				match(K_ORDER);
				setState(1350);
				match(K_BY);
				setState(1351);
				ordering_term();
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1352);
					match(COMMA);
					setState(1353);
					ordering_term();
					}
					}
					setState(1358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1361);
				match(K_LIMIT);
				setState(1362);
				expr(0);
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1363);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1364);
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
		enterRule(_localctx, 146, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				match(K_SELECT);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1370);
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

				setState(1373);
				result_column();
				setState(1378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1374);
						match(COMMA);
						setState(1375);
						result_column();
						}
						} 
					}
					setState(1380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1381);
					match(K_FROM);
					setState(1391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1382);
						table_or_subquery();
						setState(1387);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1383);
								match(COMMA);
								setState(1384);
								table_or_subquery();
								}
								} 
							}
							setState(1389);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1390);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1395);
					match(K_WHERE);
					setState(1396);
					expr(0);
					}
				}

				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1399);
					match(K_GROUP);
					setState(1400);
					match(K_BY);
					setState(1401);
					expr(0);
					setState(1406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1402);
							match(COMMA);
							setState(1403);
							expr(0);
							}
							} 
						}
						setState(1408);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1409);
						match(K_HAVING);
						setState(1410);
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
				setState(1415);
				match(K_VALUES);
				setState(1416);
				match(OPEN_PAR);
				setState(1417);
				expr(0);
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1418);
					match(COMMA);
					setState(1419);
					expr(0);
					}
					}
					setState(1424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1425);
				match(CLOSE_PAR);
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1426);
						match(COMMA);
						setState(1427);
						match(OPEN_PAR);
						setState(1428);
						expr(0);
						setState(1433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1429);
							match(COMMA);
							setState(1430);
							expr(0);
							}
							}
							setState(1435);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1436);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 148, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(K_UPDATE);
			setState(1446);
			qualified_table_name();
			setState(1447);
			match(K_SET);
			setState(1448);
			column_name();
			setState(1449);
			match(ASSIGN);
			setState(1450);
			expr(0);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1451);
				match(COMMA);
				setState(1452);
				column_name();
				setState(1453);
				match(ASSIGN);
				setState(1454);
				expr(0);
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1461);
				match(K_WHERE);
				setState(1462);
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
		enterRule(_localctx, 150, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			column_name();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (OPEN_PAR - 19)) | (1L << (K_CHECK - 19)) | (1L << (K_COLLATE - 19)) | (1L << (K_CONSTRAINT - 19)) | (1L << (K_DEFAULT - 19)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (K_NOT - 124)) | (1L << (K_NULL - 124)) | (1L << (K_PRIMARY - 124)) | (1L << (K_REFERENCES - 124)) | (1L << (IDENTIFIER - 124)) | (1L << (STRING_LITERAL - 124)))) != 0)) {
				{
				setState(1468);
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
					setState(1466);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1467);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1472);
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
		enterRule(_localctx, 152, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			name();
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1474);
				match(OPEN_PAR);
				setState(1475);
				signed_number();
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1476);
					any_name();
					}
				}

				setState(1479);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1481);
				match(OPEN_PAR);
				setState(1482);
				signed_number();
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1483);
					any_name();
					}
				}

				setState(1486);
				match(COMMA);
				setState(1487);
				signed_number();
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1488);
					any_name();
					}
				}

				setState(1491);
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
		enterRule(_localctx, 154, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1495);
				match(K_CONSTRAINT);
				setState(1496);
				name();
				}
			}

			setState(1511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1499);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1500);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1501);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1502);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
				setState(1503);
				match(K_CHECK);
				setState(1504);
				match(OPEN_PAR);
				setState(1505);
				expr(0);
				setState(1506);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1508);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1509);
				match(K_COLLATE);
				setState(1510);
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
		enterRule(_localctx, 156, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(K_PRIMARY);
			setState(1514);
			match(K_KEY);
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1515);
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

			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(1518);
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
		enterRule(_localctx, 158, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
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
		enterRule(_localctx, 160, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(K_NOT);
			setState(1524);
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
		enterRule(_localctx, 162, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
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
		enterRule(_localctx, 164, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(K_DEFAULT);
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1529);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1530);
				match(OPEN_PAR);
				setState(1531);
				expr(0);
				setState(1532);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1534);
				match(K_NEXTVAL);
				setState(1535);
				match(OPEN_PAR);
				setState(1536);
				expr(0);
				setState(1537);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1539);
				any_name();
				}
				break;
			}
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1542);
				match(T__11);
				setState(1544); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1543);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1546); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 166, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1550);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1551);
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
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1555);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1556);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1560);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1557);
						database_name();
						setState(1558);
						match(DOT);
						}
						break;
					}
					setState(1562);
					table_name();
					setState(1563);
					match(DOT);
					}
					break;
				}
				setState(1567);
				column_name();
				}
				break;
			case 4:
				{
				setState(1568);
				unary_operator();
				setState(1569);
				expr(11);
				}
				break;
			case 5:
				{
				setState(1571);
				function_name();
				setState(1572);
				match(OPEN_PAR);
				setState(1585);
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
				case K_NOT:
				case K_NULL:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1573);
						match(K_DISTINCT);
						}
					}

					setState(1576);
					expr(0);
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1577);
						match(COMMA);
						setState(1578);
						expr(0);
						}
						}
						setState(1583);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1584);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1587);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1589);
				match(OPEN_PAR);
				setState(1590);
				expr(0);
				setState(1591);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1595);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1596);
						match(PIPE2);
						setState(1597);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1598);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1599);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1600);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1601);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1602);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1603);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1604);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1605);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1606);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1607);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1608);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1609);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1610);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1623);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(1611);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1612);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1613);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1614);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1615);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1616);
							match(K_IS);
							setState(1617);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1618);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1619);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1620);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1621);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1622);
							match(K_REGEXP);
							}
							break;
						}
						setState(1625);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1626);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1627);
						match(K_AND);
						setState(1628);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1629);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1630);
						match(K_OR);
						setState(1631);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 170, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(K_REFERENCES);
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1638);
				database_name();
				setState(1639);
				match(DOT);
				}
				break;
			}
			setState(1643);
			foreign_table();
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1644);
				match(OPEN_PAR);
				setState(1645);
				fk_target_column_name();
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1646);
					match(COMMA);
					setState(1647);
					fk_target_column_name();
					}
					}
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1653);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1657);
					match(K_ON);
					setState(1658);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1659);
						match(K_SET);
						setState(1660);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1661);
						match(K_SET);
						setState(1662);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1663);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1664);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1665);
						match(K_NO);
						setState(1666);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1669);
					match(K_MATCH);
					setState(1670);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1678);
					match(K_NOT);
					}
				}

				setState(1681);
				match(K_DEFERRABLE);
				setState(1686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1682);
					match(K_INITIALLY);
					setState(1683);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1684);
					match(K_INITIALLY);
					setState(1685);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1688);
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
		enterRule(_localctx, 172, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
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
		enterRule(_localctx, 174, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			column_name();
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1696);
				match(K_COLLATE);
				setState(1697);
				collation_name();
				}
			}

			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1700);
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
		enterRule(_localctx, 176, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1703);
				match(K_CONSTRAINT);
				setState(1704);
				name();
				}
			}

			setState(1716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1707);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1708);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1709);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1710);
				match(K_CHECK);
				setState(1711);
				match(OPEN_PAR);
				setState(1712);
				expr(0);
				setState(1713);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1715);
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
		enterRule(_localctx, 178, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(K_PRIMARY);
			setState(1719);
			match(K_KEY);
			setState(1720);
			match(OPEN_PAR);
			setState(1721);
			indexed_column();
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1722);
				match(COMMA);
				setState(1723);
				indexed_column();
				}
				}
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1729);
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
		enterRule(_localctx, 180, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(K_FOREIGN);
			setState(1732);
			match(K_KEY);
			setState(1733);
			match(OPEN_PAR);
			setState(1734);
			fk_origin_column_name();
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1735);
				match(COMMA);
				setState(1736);
				fk_origin_column_name();
				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1742);
			match(CLOSE_PAR);
			setState(1743);
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
		enterRule(_localctx, 182, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(K_UNIQUE);
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1746);
				match(K_KEY);
				}
			}

			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1749);
				name();
				}
				break;
			}
			setState(1752);
			match(OPEN_PAR);
			setState(1753);
			indexed_column();
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1754);
				match(COMMA);
				setState(1755);
				indexed_column();
				}
				}
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1761);
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
		enterRule(_localctx, 184, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(K_KEY);
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1764);
				name();
				}
				break;
			}
			setState(1767);
			match(OPEN_PAR);
			setState(1768);
			indexed_column();
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1769);
				match(COMMA);
				setState(1770);
				indexed_column();
				}
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1776);
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
		enterRule(_localctx, 186, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
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
		enterRule(_localctx, 188, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1780);
				database_name();
				setState(1781);
				match(DOT);
				}
				break;
			}
			setState(1785);
			table_name();
			setState(1791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1786);
				match(K_INDEXED);
				setState(1787);
				match(K_BY);
				setState(1788);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1789);
				match(K_NOT);
				setState(1790);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
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
			case K_VAR:
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
		enterRule(_localctx, 190, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			expr(0);
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1794);
				match(K_COLLATE);
				setState(1795);
				collation_name();
				}
			}

			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1798);
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
		enterRule(_localctx, 192, RULE_pragma_value);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1803);
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
		enterRule(_localctx, 194, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			table_name();
			setState(1818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1807);
				match(OPEN_PAR);
				setState(1808);
				column_name();
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1809);
					match(COMMA);
					setState(1810);
					column_name();
					}
					}
					setState(1815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1816);
				match(CLOSE_PAR);
				}
			}

			setState(1820);
			match(K_AS);
			setState(1821);
			match(OPEN_PAR);
			setState(1822);
			select_stmt();
			setState(1823);
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
		enterRule(_localctx, 196, RULE_result_column);
		int _la;
		try {
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				table_name();
				setState(1827);
				match(DOT);
				setState(1828);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1830);
				expr(0);
				setState(1835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1831);
						match(K_AS);
						}
					}

					setState(1834);
					column_alias();
					}
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
		enterRule(_localctx, 198, RULE_table_or_subquery);
		int _la;
		try {
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1839);
					database_name();
					setState(1840);
					match(DOT);
					}
					break;
				}
				setState(1844);
				table_name();
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1846);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1845);
						match(K_AS);
						}
					}

					setState(1848);
					table_alias();
					}
				}

				setState(1856);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1851);
					match(K_INDEXED);
					setState(1852);
					match(K_BY);
					setState(1853);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1854);
					match(K_NOT);
					setState(1855);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
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
				case K_VAR:
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
				setState(1858);
				match(OPEN_PAR);
				setState(1868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1859);
					table_or_subquery();
					setState(1864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1860);
						match(COMMA);
						setState(1861);
						table_or_subquery();
						}
						}
						setState(1866);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1867);
					join_clause();
					}
					break;
				}
				setState(1870);
				match(CLOSE_PAR);
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1872);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1871);
						match(K_AS);
						}
					}

					setState(1874);
					table_alias();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				match(OPEN_PAR);
				setState(1878);
				select_stmt();
				setState(1879);
				match(CLOSE_PAR);
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1881);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1880);
						match(K_AS);
						}
					}

					setState(1883);
					table_alias();
					}
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
		enterRule(_localctx, 200, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			table_or_subquery();
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1889);
					join_operator();
					setState(1890);
					table_or_subquery();
					setState(1891);
					join_constraint();
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		enterRule(_localctx, 202, RULE_join_operator);
		int _la;
		try {
			setState(1907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1899);
					match(K_LEFT);
					setState(1901);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1900);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1903);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1906);
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
		enterRule(_localctx, 204, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1909);
				match(K_ON);
				setState(1910);
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
		enterRule(_localctx, 206, RULE_select_core);
		int _la;
		try {
			setState(1987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1913);
				match(K_SELECT);
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1914);
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

				setState(1917);
				result_column();
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1918);
					match(COMMA);
					setState(1919);
					result_column();
					}
					}
					setState(1924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1925);
					match(K_FROM);
					setState(1935);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						setState(1926);
						table_or_subquery();
						setState(1931);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1927);
							match(COMMA);
							setState(1928);
							table_or_subquery();
							}
							}
							setState(1933);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1934);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1939);
					match(K_WHERE);
					setState(1940);
					expr(0);
					}
				}

				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1943);
					match(K_GROUP);
					setState(1944);
					match(K_BY);
					setState(1945);
					expr(0);
					setState(1950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1946);
						match(COMMA);
						setState(1947);
						expr(0);
						}
						}
						setState(1952);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1955);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1953);
						match(K_HAVING);
						setState(1954);
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
				setState(1959);
				match(K_VALUES);
				setState(1960);
				match(OPEN_PAR);
				setState(1961);
				expr(0);
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1962);
					match(COMMA);
					setState(1963);
					expr(0);
					}
					}
					setState(1968);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1969);
				match(CLOSE_PAR);
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1970);
					match(COMMA);
					setState(1971);
					match(OPEN_PAR);
					setState(1972);
					expr(0);
					setState(1977);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1973);
						match(COMMA);
						setState(1974);
						expr(0);
						}
						}
						setState(1979);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1980);
					match(CLOSE_PAR);
					}
					}
					setState(1986);
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
		enterRule(_localctx, 208, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			table_name();
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1990);
				match(OPEN_PAR);
				setState(1991);
				column_name();
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1992);
					match(COMMA);
					setState(1993);
					column_name();
					}
					}
					setState(1998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1999);
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
		enterRule(_localctx, 210, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2003);
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

				setState(2006);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2007);
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
		enterRule(_localctx, 212, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
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
		enterRule(_localctx, 214, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
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
		enterRule(_localctx, 216, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
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
		enterRule(_localctx, 218, RULE_module_argument);
		try {
			setState(2018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2016);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
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
		enterRule(_localctx, 220, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
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
		enterRule(_localctx, 222, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
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
		enterRule(_localctx, 224, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2024);
				matchWildcard();
				}
				}
				setState(2027); 
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
		enterRule(_localctx, 226, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
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
		enterRule(_localctx, 228, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
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
		enterRule(_localctx, 230, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
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
		enterRule(_localctx, 232, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
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
		enterRule(_localctx, 234, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
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
		enterRule(_localctx, 236, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
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
		enterRule(_localctx, 238, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
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
		enterRule(_localctx, 240, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
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
		enterRule(_localctx, 242, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
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
		enterRule(_localctx, 244, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
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
		enterRule(_localctx, 246, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
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
		enterRule(_localctx, 248, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
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
		enterRule(_localctx, 250, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
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
		enterRule(_localctx, 252, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
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
		enterRule(_localctx, 254, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
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
		enterRule(_localctx, 256, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
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
		enterRule(_localctx, 258, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
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
		enterRule(_localctx, 260, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
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
		enterRule(_localctx, 262, RULE_any_name);
		try {
			setState(2071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2065);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2067);
				match(OPEN_PAR);
				setState(2068);
				any_name();
				setState(2069);
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
		case 84:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bd\u081c\4\2\t"+
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
		"\t\u0085\3\2\3\2\7\2\u010d\n\2\f\2\16\2\u0110\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\7\4\u0118\n\4\f\4\16\4\u011b\13\4\3\4\3\4\6\4\u011f\n\4\r\4\16\4"+
		"\u0120\3\4\7\4\u0124\n\4\f\4\16\4\u0127\13\4\3\4\7\4\u012a\n\4\f\4\16"+
		"\4\u012d\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0137\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0147\n\6\f\6\16\6"+
		"\u014a\13\6\3\6\5\6\u014d\n\6\3\7\7\7\u0150\n\7\f\7\16\7\u0153\13\7\3"+
		"\7\5\7\u0156\n\7\3\7\3\7\3\7\3\7\5\7\u015c\n\7\3\b\3\b\7\b\u0160\n\b\f"+
		"\b\16\b\u0163\13\b\3\b\5\b\u0166\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0178\n\t\f\t\16\t\u017b\13\t\3\t\5"+
		"\t\u017e\n\t\3\n\7\n\u0181\n\n\f\n\16\n\u0184\13\n\3\n\3\n\5\n\u0188\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u018e\n\n\3\13\3\13\7\13\u0192\n\13\f\13\16\13"+
		"\u0195\13\13\3\13\5\13\u0198\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u01a4\n\f\f\f\16\f\u01a7\13\f\3\f\3\f\5\f\u01ab\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01b7\n\f\f\f\16\f\u01ba\13\f\3\f\3"+
		"\f\5\f\u01be\n\f\7\f\u01c0\n\f\f\f\16\f\u01c3\13\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u01ce\n\r\f\r\16\r\u01d1\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u01d8\n\r\f\r\16\r\u01db\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u01e9\n\16\f\16\16\16\u01ec\13\16\3\16\3\16"+
		"\5\16\u01f0\n\16\5\16\u01f2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u01fd\n\17\5\17\u01ff\n\17\3\17\5\17\u0202\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u020d\n\17\5\17\u020f\n\17\3"+
		"\17\5\17\u0212\n\17\7\17\u0214\n\17\f\17\16\17\u0217\13\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0224\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u022c\n\21\7\21\u022e\n\21\f\21\16\21\u0231"+
		"\13\21\7\21\u0233\n\21\f\21\16\21\u0236\13\21\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u023d\n\22\3\22\3\22\3\23\3\23\5\23\u0243\n\23\3\23\7\23\u0246\n"+
		"\23\f\23\16\23\u0249\13\23\3\23\5\23\u024c\n\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\5\24\u0254\n\24\3\24\3\24\3\24\7\24\u0259\n\24\f\24\16\24\u025c"+
		"\13\24\3\24\5\24\u025f\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u0266\n\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\7\26\u026e\n\26\f\26\16\26\u0271\13\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0278\n\26\f\26\16\26\u027b\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0282\n\27\f\27\16\27\u0285\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u028d\n\27\f\27\16\27\u0290\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u029c\n\27\f\27\16\27\u029f"+
		"\13\27\5\27\u02a1\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02aa\n"+
		"\30\3\30\3\30\5\30\u02ae\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u02b5\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02c0\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02cb\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02df\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u02eb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02f8\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u02ff\n\35\f\35\16\35\u0302"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u030c\n\35\5\35\u030e"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\7\36\u0315\n\36\f\36\16\36\u0318\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0323\n\36\5\36\u0325"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0332"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u033c\n\37\5\37\u033e"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u034b\n \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0355\n \5 \u0357\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0363\n"+
		"!\3!\3!\3!\3!\3!\5!\u036a\n!\3!\3!\3!\3!\3!\5!\u0371\n!\3!\3!\3!\3!\3"+
		"!\5!\u0378\n!\7!\u037a\n!\f!\16!\u037d\13!\3!\3!\3!\3!\3!\3!\5!\u0385"+
		"\n!\5!\u0387\n!\7!\u0389\n!\f!\16!\u038c\13!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0396\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03a1\n#\3#\3#\3#\3#"+
		"\3#\5#\u03a8\n#\3$\3$\3$\3$\5$\u03ae\n$\3$\3$\3%\3%\3&\3&\5&\u03b6\n&"+
		"\3\'\3\'\5\'\u03ba\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\5+\u03ce\n+\3,\3,\3,\3,\3,\5,\u03d5\n,\3-\3-\3-\3-\5-\u03db\n"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03f1"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03ff\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\7\60\u0407\n\60\f\60\16\60\u040a\13\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0414\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u041b"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0425\n\63\3\64\3\64"+
		"\5\64\u0429\n\64\3\64\3\64\3\64\5\64\u042e\n\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u0438\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0440\n\66\3\67\3\67\3\67\5\67\u0445\n\67\38\38\38\38\38\58\u044c\n8"+
		"\38\38\38\38\38\38\58\u0454\n8\38\38\58\u0458\n8\38\38\38\58\u045d\n8"+
		"\38\58\u0460\n8\39\39\39\39\39\39\39\39\59\u046a\n9\3:\3:\3:\3:\3:\5:"+
		"\u0471\n:\3;\3;\3;\3;\3;\3;\7;\u0479\n;\f;\16;\u047c\13;\3;\5;\u047f\n"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u048a\n<\3=\3=\3=\3=\3=\5=\u0491\n=\3"+
		">\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04a1\n?\3@\3@\5@\u04a5\n"+
		"@\3@\3@\3@\3A\3A\5A\u04ac\nA\3B\3B\3B\3B\3B\5B\u04b3\nB\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\5B\u04bd\nB\3B\5B\u04c0\nB\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"E\3E\3E\5E\u04cf\nE\3E\3E\3E\5E\u04d4\nE\3E\3E\3E\3E\3E\3E\3E\7E\u04dd"+
		"\nE\fE\16E\u04e0\13E\3E\3E\3E\3E\5E\u04e6\nE\3F\3F\3F\3F\3F\5F\u04ed\n"+
		"F\3G\3G\3G\3G\5G\u04f3\nG\3G\3G\3G\5G\u04f8\nG\3G\3G\3H\3H\3H\3H\3H\3"+
		"H\7H\u0502\nH\fH\16H\u0505\13H\5H\u0507\nH\3H\3H\3H\3H\5H\u050d\nH\5H"+
		"\u050f\nH\3I\3I\3I\3I\3I\5I\u0516\nI\3I\3I\3I\3I\3I\7I\u051d\nI\fI\16"+
		"I\u0520\13I\3I\3I\5I\u0524\nI\3I\3I\3I\3I\3I\7I\u052b\nI\fI\16I\u052e"+
		"\13I\3I\3I\3I\3I\3I\3I\7I\u0536\nI\fI\16I\u0539\13I\3I\3I\7I\u053d\nI"+
		"\fI\16I\u0540\13I\3I\3I\3I\5I\u0545\nI\3J\3J\3J\3J\3J\3J\7J\u054d\nJ\f"+
		"J\16J\u0550\13J\5J\u0552\nJ\3J\3J\3J\3J\5J\u0558\nJ\5J\u055a\nJ\3K\3K"+
		"\5K\u055e\nK\3K\3K\3K\7K\u0563\nK\fK\16K\u0566\13K\3K\3K\3K\3K\7K\u056c"+
		"\nK\fK\16K\u056f\13K\3K\5K\u0572\nK\5K\u0574\nK\3K\3K\5K\u0578\nK\3K\3"+
		"K\3K\3K\3K\7K\u057f\nK\fK\16K\u0582\13K\3K\3K\5K\u0586\nK\5K\u0588\nK"+
		"\3K\3K\3K\3K\3K\7K\u058f\nK\fK\16K\u0592\13K\3K\3K\3K\3K\3K\3K\7K\u059a"+
		"\nK\fK\16K\u059d\13K\3K\3K\7K\u05a1\nK\fK\16K\u05a4\13K\5K\u05a6\nK\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\7L\u05b3\nL\fL\16L\u05b6\13L\3L\3L\5L"+
		"\u05ba\nL\3M\3M\3M\7M\u05bf\nM\fM\16M\u05c2\13M\3N\3N\3N\3N\5N\u05c8\n"+
		"N\3N\3N\3N\3N\3N\5N\u05cf\nN\3N\3N\3N\5N\u05d4\nN\3N\3N\5N\u05d8\nN\3"+
		"O\3O\5O\u05dc\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u05ea\nO\3P\3"+
		"P\3P\5P\u05ef\nP\3P\5P\u05f2\nP\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\5T\u0607\nT\3T\3T\6T\u060b\nT\rT\16T\u060c\5T\u060f"+
		"\nT\3U\3U\5U\u0613\nU\3V\3V\3V\3V\3V\3V\5V\u061b\nV\3V\3V\3V\5V\u0620"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\5V\u0629\nV\3V\3V\3V\7V\u062e\nV\fV\16V\u0631"+
		"\13V\3V\5V\u0634\nV\3V\3V\3V\3V\3V\3V\5V\u063c\nV\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u065a"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\7V\u0663\nV\fV\16V\u0666\13V\3W\3W\3W\3W\5W\u066c"+
		"\nW\3W\3W\3W\3W\3W\7W\u0673\nW\fW\16W\u0676\13W\3W\3W\5W\u067a\nW\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0686\nW\3W\3W\5W\u068a\nW\7W\u068c\nW\f"+
		"W\16W\u068f\13W\3W\5W\u0692\nW\3W\3W\3W\3W\3W\5W\u0699\nW\3W\5W\u069c"+
		"\nW\5W\u069e\nW\3X\3X\3Y\3Y\3Y\5Y\u06a5\nY\3Y\5Y\u06a8\nY\3Z\3Z\5Z\u06ac"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u06b7\nZ\3[\3[\3[\3[\3[\3[\7[\u06bf"+
		"\n[\f[\16[\u06c2\13[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u06cc\n\\\f\\\16"+
		"\\\u06cf\13\\\3\\\3\\\3\\\3]\3]\5]\u06d6\n]\3]\5]\u06d9\n]\3]\3]\3]\3"+
		"]\7]\u06df\n]\f]\16]\u06e2\13]\3]\3]\3^\3^\5^\u06e8\n^\3^\3^\3^\3^\7^"+
		"\u06ee\n^\f^\16^\u06f1\13^\3^\3^\3_\3_\3`\3`\3`\5`\u06fa\n`\3`\3`\3`\3"+
		"`\3`\3`\5`\u0702\n`\3a\3a\3a\5a\u0707\na\3a\5a\u070a\na\3b\3b\3b\5b\u070f"+
		"\nb\3c\3c\3c\3c\3c\7c\u0716\nc\fc\16c\u0719\13c\3c\3c\5c\u071d\nc\3c\3"+
		"c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\5d\u072b\nd\3d\5d\u072e\nd\5d\u0730\n"+
		"d\3e\3e\3e\5e\u0735\ne\3e\3e\5e\u0739\ne\3e\5e\u073c\ne\3e\3e\3e\3e\3"+
		"e\5e\u0743\ne\3e\3e\3e\3e\7e\u0749\ne\fe\16e\u074c\13e\3e\5e\u074f\ne"+
		"\3e\3e\5e\u0753\ne\3e\5e\u0756\ne\3e\3e\3e\3e\5e\u075c\ne\3e\5e\u075f"+
		"\ne\5e\u0761\ne\3f\3f\3f\3f\3f\7f\u0768\nf\ff\16f\u076b\13f\3g\3g\3g\5"+
		"g\u0770\ng\3g\5g\u0773\ng\3g\5g\u0776\ng\3h\3h\5h\u077a\nh\3i\3i\5i\u077e"+
		"\ni\3i\3i\3i\7i\u0783\ni\fi\16i\u0786\13i\3i\3i\3i\3i\7i\u078c\ni\fi\16"+
		"i\u078f\13i\3i\5i\u0792\ni\5i\u0794\ni\3i\3i\5i\u0798\ni\3i\3i\3i\3i\3"+
		"i\7i\u079f\ni\fi\16i\u07a2\13i\3i\3i\5i\u07a6\ni\5i\u07a8\ni\3i\3i\3i"+
		"\3i\3i\7i\u07af\ni\fi\16i\u07b2\13i\3i\3i\3i\3i\3i\3i\7i\u07ba\ni\fi\16"+
		"i\u07bd\13i\3i\3i\7i\u07c1\ni\fi\16i\u07c4\13i\5i\u07c6\ni\3j\3j\3j\3"+
		"j\3j\7j\u07cd\nj\fj\16j\u07d0\13j\3j\3j\5j\u07d4\nj\3k\5k\u07d7\nk\3k"+
		"\3k\5k\u07db\nk\3l\3l\3m\3m\3n\3n\3o\3o\5o\u07e5\no\3p\3p\3q\3q\3r\6r"+
		"\u07ec\nr\rr\16r\u07ed\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3"+
		"z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u081a\n\u0085\3\u0085\2\3\u00aa\u0086"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\2\24\3\2\u00b5\u00b6\3\2\6\7\4\2\31\31\36\37\3\2\32\33\3"+
		"\2\b\n\3\2\13\f\3\2$\'\3\2()\4\2\r\r\35\35\4\2\27\27\u0082\u0082\4\2\61"+
		"\61RR\4\2\66\66PP\3\2 #\4\2OO\u00a4\u00a4\6\2HJ\u0080\u0080\u00b6\u00b6"+
		"\u00b8\u00b9\4\2\32\34~~\4\2\u00b5\u00b5\u00b8\u00b8\6\2-eh\u0083\u0085"+
		"\u00ae\u00b3\u00b4\2\u0936\2\u010e\3\2\2\2\4\u0113\3\2\2\2\6\u0119\3\2"+
		"\2\2\b\u0136\3\2\2\2\n\u014c\3\2\2\2\f\u015b\3\2\2\2\16\u0165\3\2\2\2"+
		"\20\u017d\3\2\2\2\22\u018d\3\2\2\2\24\u0197\3\2\2\2\26\u0199\3\2\2\2\30"+
		"\u01c6\3\2\2\2\32\u01e0\3\2\2\2\34\u01f3\3\2\2\2\36\u0218\3\2\2\2 \u021b"+
		"\3\2\2\2\"\u023a\3\2\2\2$\u0240\3\2\2\2&\u0250\3\2\2\2(\u0262\3\2\2\2"+
		"*\u026a\3\2\2\2,\u02a0\3\2\2\2.\u02a2\3\2\2\2\60\u02c1\3\2\2\2\62\u02d2"+
		"\3\2\2\2\64\u02e0\3\2\2\2\66\u02ec\3\2\2\28\u02f9\3\2\2\2:\u030f\3\2\2"+
		"\2<\u0326\3\2\2\2>\u033f\3\2\2\2@\u0358\3\2\2\2B\u0395\3\2\2\2D\u03a7"+
		"\3\2\2\2F\u03ad\3\2\2\2H\u03b1\3\2\2\2J\u03b5\3\2\2\2L\u03b9\3\2\2\2N"+
		"\u03bb\3\2\2\2P\u03bd\3\2\2\2R\u03bf\3\2\2\2T\u03cd\3\2\2\2V\u03d4\3\2"+
		"\2\2X\u03da\3\2\2\2Z\u03f0\3\2\2\2\\\u03fe\3\2\2\2^\u0400\3\2\2\2`\u0413"+
		"\3\2\2\2b\u0415\3\2\2\2d\u0424\3\2\2\2f\u0428\3\2\2\2h\u0437\3\2\2\2j"+
		"\u043f\3\2\2\2l\u0444\3\2\2\2n\u045f\3\2\2\2p\u0469\3\2\2\2r\u0470\3\2"+
		"\2\2t\u047e\3\2\2\2v\u0489\3\2\2\2x\u0490\3\2\2\2z\u0492\3\2\2\2|\u04a0"+
		"\3\2\2\2~\u04a4\3\2\2\2\u0080\u04ab\3\2\2\2\u0082\u04ad\3\2\2\2\u0084"+
		"\u04c1\3\2\2\2\u0086\u04c6\3\2\2\2\u0088\u04c9\3\2\2\2\u008a\u04e7\3\2"+
		"\2\2\u008c\u04ee\3\2\2\2\u008e\u04fb\3\2\2\2\u0090\u0510\3\2\2\2\u0092"+
		"\u0546\3\2\2\2\u0094\u05a5\3\2\2\2\u0096\u05a7\3\2\2\2\u0098\u05bb\3\2"+
		"\2\2\u009a\u05c3\3\2\2\2\u009c\u05db\3\2\2\2\u009e\u05eb\3\2\2\2\u00a0"+
		"\u05f3\3\2\2\2\u00a2\u05f5\3\2\2\2\u00a4\u05f8\3\2\2\2\u00a6\u05fa\3\2"+
		"\2\2\u00a8\u0612\3\2\2\2\u00aa\u063b\3\2\2\2\u00ac\u0667\3\2\2\2\u00ae"+
		"\u069f\3\2\2\2\u00b0\u06a1\3\2\2\2\u00b2\u06ab\3\2\2\2\u00b4\u06b8\3\2"+
		"\2\2\u00b6\u06c5\3\2\2\2\u00b8\u06d3\3\2\2\2\u00ba\u06e5\3\2\2\2\u00bc"+
		"\u06f4\3\2\2\2\u00be\u06f9\3\2\2\2\u00c0\u0703\3\2\2\2\u00c2\u070e\3\2"+
		"\2\2\u00c4\u0710\3\2\2\2\u00c6\u072f\3\2\2\2\u00c8\u0760\3\2\2\2\u00ca"+
		"\u0762\3\2\2\2\u00cc\u0775\3\2\2\2\u00ce\u0779\3\2\2\2\u00d0\u07c5\3\2"+
		"\2\2\u00d2\u07c7\3\2\2\2\u00d4\u07da\3\2\2\2\u00d6\u07dc\3\2\2\2\u00d8"+
		"\u07de\3\2\2\2\u00da\u07e0\3\2\2\2\u00dc\u07e4\3\2\2\2\u00de\u07e6\3\2"+
		"\2\2\u00e0\u07e8\3\2\2\2\u00e2\u07eb\3\2\2\2\u00e4\u07ef\3\2\2\2\u00e6"+
		"\u07f1\3\2\2\2\u00e8\u07f3\3\2\2\2\u00ea\u07f5\3\2\2\2\u00ec\u07f7\3\2"+
		"\2\2\u00ee\u07f9\3\2\2\2\u00f0\u07fb\3\2\2\2\u00f2\u07fd\3\2\2\2\u00f4"+
		"\u07ff\3\2\2\2\u00f6\u0801\3\2\2\2\u00f8\u0803\3\2\2\2\u00fa\u0805\3\2"+
		"\2\2\u00fc\u0807\3\2\2\2\u00fe\u0809\3\2\2\2\u0100\u080b\3\2\2\2\u0102"+
		"\u080d\3\2\2\2\u0104\u080f\3\2\2\2\u0106\u0811\3\2\2\2\u0108\u0819\3\2"+
		"\2\2\u010a\u010d\5\6\4\2\u010b\u010d\5\4\3\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\2\2\3\u0112"+
		"\3\3\2\2\2\u0113\u0114\7\u00bc\2\2\u0114\u0115\b\3\1\2\u0115\5\3\2\2\2"+
		"\u0116\u0118\7\23\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0125\5\b\5\2\u011d\u011f\7\23\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\5\b\5\2\u0123\u011e\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u012b\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u012a\7\23\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\7\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0137"+
		"\5\u0082B\2\u012f\u0137\5\u0088E\2\u0130\u0137\5\u008aF\2\u0131\u0137"+
		"\5\u008cG\2\u0132\u0137\5\u008eH\2\u0133\u0137\5\u0090I\2\u0134\u0137"+
		"\5\u0096L\2\u0135\u0137\5\34\17\2\u0136\u012e\3\2\2\2\u0136\u012f\3\2"+
		"\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\t\3\2\2\2"+
		"\u0138\u014d\58\35\2\u0139\u014d\5<\37\2\u013a\u014d\5 \21\2\u013b\u014d"+
		"\5(\25\2\u013c\u014d\5\36\20\2\u013d\u014d\5\62\32\2\u013e\u014d\5\60"+
		"\31\2\u013f\u014d\5@!\2\u0140\u014d\5F$\2\u0141\u014d\5.\30\2\u0142\u0143"+
		"\7\21\2\2\u0143\u014d\7\22\2\2\u0144\u0148\7\21\2\2\u0145\u0147\5\n\6"+
		"\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\7\22\2\2"+
		"\u014c\u0138\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u013a\3\2\2\2\u014c\u013b"+
		"\3\2\2\2\u014c\u013c\3\2\2\2\u014c\u013d\3\2\2\2\u014c\u013e\3\2\2\2\u014c"+
		"\u013f\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0142\3\2"+
		"\2\2\u014c\u0144\3\2\2\2\u014d\13\3\2\2\2\u014e\u0150\5\n\6\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\5D#\2\u0155\u0154\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156\u015c\3\2\2\2\u0157\u0158\7\21\2\2\u0158"+
		"\u0159\5\f\7\2\u0159\u015a\7\22\2\2\u015a\u015c\3\2\2\2\u015b\u0151\3"+
		"\2\2\2\u015b\u0157\3\2\2\2\u015c\r\3\2\2\2\u015d\u0166\5\f\7\2\u015e\u0160"+
		"\5\n\6\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\5\f"+
		"\7\2\u0165\u015d\3\2\2\2\u0165\u0161\3\2\2\2\u0166\17\3\2\2\2\u0167\u017e"+
		"\5:\36\2\u0168\u017e\5> \2\u0169\u017e\5 \21\2\u016a\u017e\5(\25\2\u016b"+
		"\u017e\5\36\20\2\u016c\u017e\5\62\32\2\u016d\u017e\5F$\2\u016e\u016f\7"+
		"\u00b4\2\2\u016f\u017e\7\23\2\2\u0170\u017e\5\60\31\2\u0171\u017e\5@!"+
		"\2\u0172\u017e\5.\30\2\u0173\u0174\7\21\2\2\u0174\u017e\7\22\2\2\u0175"+
		"\u0179\7\21\2\2\u0176\u0178\5\20\t\2\u0177\u0176\3\2\2\2\u0178\u017b\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017e\7\22\2\2\u017d\u0167\3\2\2\2\u017d\u0168\3"+
		"\2\2\2\u017d\u0169\3\2\2\2\u017d\u016a\3\2\2\2\u017d\u016b\3\2\2\2\u017d"+
		"\u016c\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u016e\3\2\2\2\u017d\u0170\3\2"+
		"\2\2\u017d\u0171\3\2\2\2\u017d\u0172\3\2\2\2\u017d\u0173\3\2\2\2\u017d"+
		"\u0175\3\2\2\2\u017e\21\3\2\2\2\u017f\u0181\5\20\t\2\u0180\u017f\3\2\2"+
		"\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0187"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0188\5B\"\2\u0186\u0188\5D#\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018e\3\2"+
		"\2\2\u0189\u018a\7\21\2\2\u018a\u018b\5\22\n\2\u018b\u018c\7\22\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0182\3\2\2\2\u018d\u0189\3\2\2\2\u018e\23\3\2\2"+
		"\2\u018f\u0198\5\22\n\2\u0190\u0192\5\20\t\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0198\5\22\n\2\u0197\u018f\3\2\2\2\u0197"+
		"\u0193\3\2\2\2\u0198\25\3\2\2\2\u0199\u019a\7\21\2\2\u019a\u019b\5\u0108"+
		"\u0085\2\u019b\u01aa\7\3\2\2\u019c\u01ab\7\u00b6\2\2\u019d\u01ab\7\u00b5"+
		"\2\2\u019e\u01ab\5\26\f\2\u019f\u01a0\7\17\2\2\u01a0\u01a5\5\u0108\u0085"+
		"\2\u01a1\u01a2\7\27\2\2\u01a2\u01a4\5\u0108\u0085\2\u01a3\u01a1\3\2\2"+
		"\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\20\2\2\u01a9\u01ab\3\2\2\2"+
		"\u01aa\u019c\3\2\2\2\u01aa\u019d\3\2\2\2\u01aa\u019e\3\2\2\2\u01aa\u019f"+
		"\3\2\2\2\u01ab\u01c1\3\2\2\2\u01ac\u01ad\7\27\2\2\u01ad\u01ae\5\u0108"+
		"\u0085\2\u01ae\u01bd\7\3\2\2\u01af\u01be\7\u00b6\2\2\u01b0\u01be\7\u00b5"+
		"\2\2\u01b1\u01be\5\26\f\2\u01b2\u01b3\7\17\2\2\u01b3\u01b8\5\u0108\u0085"+
		"\2\u01b4\u01b5\7\27\2\2\u01b5\u01b7\5\u0108\u0085\2\u01b6\u01b4\3\2\2"+
		"\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\20\2\2\u01bc\u01be\3\2\2\2"+
		"\u01bd\u01af\3\2\2\2\u01bd\u01b0\3\2\2\2\u01bd\u01b1\3\2\2\2\u01bd\u01b2"+
		"\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01ac\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c5\7\22\2\2\u01c5\27\3\2\2\2\u01c6\u01c7\5\u0108\u0085\2"+
		"\u01c7\u01c8\7\25\2\2\u01c8\u01c9\5\u0108\u0085\2\u01c9\u01cf\7\27\2\2"+
		"\u01ca\u01cb\5\u0108\u0085\2\u01cb\u01cc\7\27\2\2\u01cc\u01ce\3\2\2\2"+
		"\u01cd\u01ca\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7+\2\2\u01d3"+
		"\u01d4\7\25\2\2\u01d4\u01d9\5\u0108\u0085\2\u01d5\u01d6\7\27\2\2\u01d6"+
		"\u01d8\5\u0108\u0085\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01dd\7\26\2\2\u01dd\u01de\5$\23\2\u01de\u01df\7\26\2\2\u01df\31\3\2"+
		"\2\2\u01e0\u01e1\5\u0108\u0085\2\u01e1\u01e2\7\17\2\2\u01e2\u01f1\7\20"+
		"\2\2\u01e3\u01ef\7\30\2\2\u01e4\u01e5\7\21\2\2\u01e5\u01ea\t\2\2\2\u01e6"+
		"\u01e7\7\27\2\2\u01e7\u01e9\t\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f0\7\22\2\2\u01ee\u01f0\5\u0094K\2\u01ef\u01e4"+
		"\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01e3\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\33\3\2\2\2\u01f3\u0201\7\u00ae\2\2\u01f4\u01fe\5"+
		"\u0108\u0085\2\u01f5\u01fc\7\30\2\2\u01f6\u01fd\5T+\2\u01f7\u01fd\5^\60"+
		"\2\u01f8\u01fd\5`\61\2\u01f9\u01fd\5\26\f\2\u01fa\u01fd\5\30\r\2\u01fb"+
		"\u01fd\5\u0094K\2\u01fc\u01f6\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f8"+
		"\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u01f5\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u0202\5\32\16\2\u0201\u01f4\3\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0215\3\2\2\2\u0203\u0211\7\27\2\2\u0204\u020e\5\u0108\u0085\2\u0205"+
		"\u020c\7\30\2\2\u0206\u020d\5T+\2\u0207\u020d\5^\60\2\u0208\u020d\5`\61"+
		"\2\u0209\u020d\5\26\f\2\u020a\u020d\5\30\r\2\u020b\u020d\5\u0094K\2\u020c"+
		"\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u0205\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u0212\5\32"+
		"\16\2\u0211\u0204\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0203\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\35\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\5\34\17\2\u0219"+
		"\u021a\7\23\2\2\u021a\37\3\2\2\2\u021b\u021c\7\u00b3\2\2\u021c\u0234\7"+
		"\25\2\2\u021d\u0224\5l\67\2\u021e\u021f\7\4\2\2\u021f\u0220\5\u0108\u0085"+
		"\2\u0220\u0221\7\4\2\2\u0221\u0224\3\2\2\2\u0222\u0224\7\u00b6\2\2\u0223"+
		"\u021d\3\2\2\2\u0223\u021e\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u022f\3\2"+
		"\2\2\u0225\u022b\7\32\2\2\u0226\u022c\5l\67\2\u0227\u0228\7\4\2\2\u0228"+
		"\u0229\7\u00b5\2\2\u0229\u022c\7\4\2\2\u022a\u022c\7\u00b6\2\2\u022b\u0226"+
		"\3\2\2\2\u022b\u0227\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u0225\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0223\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\26\2\2\u0238\u0239\7\23\2\2\u0239"+
		"!\3\2\2\2\u023a\u023c\7\25\2\2\u023b\u023d\5,\27\2\u023c\u023b\3\2\2\2"+
		"\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\26\2\2\u023f#\3"+
		"\2\2\2\u0240\u0242\7\21\2\2\u0241\u0243\5&\24\2\u0242\u0241\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0246\5\n\6\2\u0245\u0244\3\2"+
		"\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\5&\24\2\u024b\u024a\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5D#\2\u024e\u024f"+
		"\7\22\2\2\u024f%\3\2\2\2\u0250\u0251\5\u0108\u0085\2\u0251\u0253\7\25"+
		"\2\2\u0252\u0254\5,\27\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\7\26\2\2\u0256\u025a\7\21\2\2\u0257\u0259\5"+
		"\n\6\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\5D"+
		"#\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\7\22\2\2\u0261\'\3\2\2\2\u0262\u0263\5\u0108\u0085\2\u0263\u0265"+
		"\7\25\2\2\u0264\u0266\5*\26\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0266\u0267\3\2\2\2\u0267\u0268\7\26\2\2\u0268\u0269\7\23\2\2\u0269)"+
		"\3\2\2\2\u026a\u026f\5\u0108\u0085\2\u026b\u026c\7\27\2\2\u026c\u026e"+
		"\5\u0108\u0085\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3"+
		"\2\2\2\u026f\u0270\3\2\2\2\u0270\u0279\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0273\7\27\2\2\u0273\u0274\5\u0108\u0085\2\u0274\u0275\7\30\2\2\u0275"+
		"\u0276\7\u00b6\2\2\u0276\u0278\3\2\2\2\u0277\u0272\3\2\2\2\u0278\u027b"+
		"\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a+\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027d\7\u00ae\2\2\u027d\u0283\5\u0108\u0085\2\u027e"+
		"\u027f\7\27\2\2\u027f\u0280\7\u00ae\2\2\u0280\u0282\5\u0108\u0085\2\u0281"+
		"\u027e\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u028e\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\27\2\2\u0287"+
		"\u0288\7\u00ae\2\2\u0288\u0289\5\u0108\u0085\2\u0289\u028a\7\30\2\2\u028a"+
		"\u028b\t\2\2\2\u028b\u028d\3\2\2\2\u028c\u0286\3\2\2\2\u028d\u0290\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u02a1\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0292\7\u00ae\2\2\u0292\u0293\5\u0108\u0085\2\u0293"+
		"\u0294\7\30\2\2\u0294\u029d\7\u00b6\2\2\u0295\u0296\7\27\2\2\u0296\u0297"+
		"\7\u00ae\2\2\u0297\u0298\5\u0108\u0085\2\u0298\u0299\7\30\2\2\u0299\u029a"+
		"\t\2\2\2\u029a\u029c\3\2\2\2\u029b\u0295\3\2\2\2\u029c\u029f\3\2\2\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2"+
		"\2\2\u02a0\u027c\3\2\2\2\u02a0\u0291\3\2\2\2\u02a1-\3\2\2\2\u02a2\u02a3"+
		"\7^\2\2\u02a3\u02a9\7\25\2\2\u02a4\u02aa\5\34\17\2\u02a5\u02aa\5\u0080"+
		"A\2\u02a6\u02aa\5\\/\2\u02a7\u02aa\5b\62\2\u02a8\u02aa\7\u00b5\2\2\u02a9"+
		"\u02a4\3\2\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02a6\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ad\7\23\2\2\u02ac\u02ae\5x=\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b4\7\23\2\2\u02b0\u02b5\5\34\17\2\u02b1"+
		"\u02b5\5\\/\2\u02b2\u02b5\5b\62\2\u02b3\u02b5\5\u0080A\2\u02b4\u02b0\3"+
		"\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02bf\7\26\2\2\u02b7\u02c0\5"+
		"F$\2\u02b8\u02c0\5D#\2\u02b9\u02c0\5B\"\2\u02ba\u02bb\7\21\2\2\u02bb\u02bc"+
		"\5\24\13\2\u02bc\u02bd\7\22\2\2\u02bd\u02c0\3\2\2\2\u02be\u02c0\5\20\t"+
		"\2\u02bf\u02b7\3\2\2\2\u02bf\u02b8\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf\u02ba"+
		"\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0/\3\2\2\2\u02c1\u02ca\7g\2\2\u02c2\u02cb"+
		"\5F$\2\u02c3\u02cb\5D#\2\u02c4\u02cb\5B\"\2\u02c5\u02c6\7\21\2\2\u02c6"+
		"\u02c7\5\24\13\2\u02c7\u02c8\7\22\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02cb"+
		"\5\20\t\2\u02ca\u02c2\3\2\2\2\u02ca\u02c3\3\2\2\2\u02ca\u02c4\3\2\2\2"+
		"\u02ca\u02c5\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd"+
		"\7f\2\2\u02cd\u02ce\7\25\2\2\u02ce\u02cf\5x=\2\u02cf\u02d0\7\26\2\2\u02d0"+
		"\u02d1\7\23\2\2\u02d1\61\3\2\2\2\u02d2\u02d3\7f\2\2\u02d3\u02d4\7\25\2"+
		"\2\u02d4\u02d5\5x=\2\u02d5\u02de\7\26\2\2\u02d6\u02df\5F$\2\u02d7\u02df"+
		"\5D#\2\u02d8\u02df\5B\"\2\u02d9\u02da\7\21\2\2\u02da\u02db\5\24\13\2\u02db"+
		"\u02dc\7\22\2\2\u02dc\u02df\3\2\2\2\u02dd\u02df\5\20\t\2\u02de\u02d6\3"+
		"\2\2\2\u02de\u02d7\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02d9\3\2\2\2\u02de"+
		"\u02dd\3\2\2\2\u02df\63\3\2\2\2\u02e0\u02e1\7\25\2\2\u02e1\u02e2\5x=\2"+
		"\u02e2\u02ea\7\26\2\2\u02e3\u02eb\5F$\2\u02e4\u02eb\5D#\2\u02e5\u02e6"+
		"\7\21\2\2\u02e6\u02e7\5\16\b\2\u02e7\u02e8\7\22\2\2\u02e8\u02eb\3\2\2"+
		"\2\u02e9\u02eb\5\n\6\2\u02ea\u02e3\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e5"+
		"\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\65\3\2\2\2\u02ec\u02ed\7\25\2\2\u02ed"+
		"\u02ee\5x=\2\u02ee\u02f7\7\26\2\2\u02ef\u02f8\5F$\2\u02f0\u02f8\5D#\2"+
		"\u02f1\u02f8\5B\"\2\u02f2\u02f3\7\21\2\2\u02f3\u02f4\5\24\13\2\u02f4\u02f5"+
		"\7\22\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f8\5\20\t\2\u02f7\u02ef\3\2\2\2"+
		"\u02f7\u02f0\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7\u02f2\3\2\2\2\u02f7\u02f6"+
		"\3\2\2\2\u02f8\67\3\2\2\2\u02f9\u02fa\7e\2\2\u02fa\u0300\5\64\33\2\u02fb"+
		"\u02fc\7U\2\2\u02fc\u02fd\7e\2\2\u02fd\u02ff\5\64\33\2\u02fe\u02fb\3\2"+
		"\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u030d\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u030b\7U\2\2\u0304\u030c\5F$"+
		"\2\u0305\u030c\5D#\2\u0306\u0307\7\21\2\2\u0307\u0308\5\16\b\2\u0308\u0309"+
		"\7\22\2\2\u0309\u030c\3\2\2\2\u030a\u030c\5\n\6\2\u030b\u0304\3\2\2\2"+
		"\u030b\u0305\3\2\2\2\u030b\u0306\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u030e"+
		"\3\2\2\2\u030d\u0303\3\2\2\2\u030d\u030e\3\2\2\2\u030e9\3\2\2\2\u030f"+
		"\u0310\7e\2\2\u0310\u0316\5\66\34\2\u0311\u0312\7U\2\2\u0312\u0313\7e"+
		"\2\2\u0313\u0315\5\66\34\2\u0314\u0311\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0324\3\2\2\2\u0318\u0316\3\2"+
		"\2\2\u0319\u0322\7U\2\2\u031a\u0323\5F$\2\u031b\u0323\5D#\2\u031c\u0323"+
		"\5B\"\2\u031d\u031e\7\21\2\2\u031e\u031f\5\24\13\2\u031f\u0320\7\22\2"+
		"\2\u0320\u0323\3\2\2\2\u0321\u0323\5\20\t\2\u0322\u031a\3\2\2\2\u0322"+
		"\u031b\3\2\2\2\u0322\u031c\3\2\2\2\u0322\u031d\3\2\2\2\u0322\u0321\3\2"+
		"\2\2\u0323\u0325\3\2\2\2\u0324\u0319\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		";\3\2\2\2\u0326\u0327\7\25\2\2\u0327\u0328\5x=\2\u0328\u0329\7\26\2\2"+
		"\u0329\u0331\7\5\2\2\u032a\u0332\5F$\2\u032b\u0332\5D#\2\u032c\u032d\7"+
		"\21\2\2\u032d\u032e\5\16\b\2\u032e\u032f\7\22\2\2\u032f\u0332\3\2\2\2"+
		"\u0330\u0332\5\n\6\2\u0331\u032a\3\2\2\2\u0331\u032b\3\2\2\2\u0331\u032c"+
		"\3\2\2\2\u0331\u0330\3\2\2\2\u0332\u033d\3\2\2\2\u0333\u033b\7\27\2\2"+
		"\u0334\u033c\5F$\2\u0335\u033c\5D#\2\u0336\u0337\7\21\2\2\u0337\u0338"+
		"\5\16\b\2\u0338\u0339\7\22\2\2\u0339\u033c\3\2\2\2\u033a\u033c\5\n\6\2"+
		"\u033b\u0334\3\2\2\2\u033b\u0335\3\2\2\2\u033b\u0336\3\2\2\2\u033b\u033a"+
		"\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u0333\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"=\3\2\2\2\u033f\u0340\7\25\2\2\u0340\u0341\5x=\2\u0341\u0342\7\26\2\2"+
		"\u0342\u034a\7\5\2\2\u0343\u034b\5F$\2\u0344\u034b\5D#\2\u0345\u0346\7"+
		"\21\2\2\u0346\u0347\5\24\13\2\u0347\u0348\7\22\2\2\u0348\u034b\3\2\2\2"+
		"\u0349\u034b\5\20\t\2\u034a\u0343\3\2\2\2\u034a\u0344\3\2\2\2\u034a\u0345"+
		"\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u0356\3\2\2\2\u034c\u0354\7\27\2\2"+
		"\u034d\u0355\5F$\2\u034e\u0355\5D#\2\u034f\u0350\7\21\2\2\u0350\u0351"+
		"\5\24\13\2\u0351\u0352\7\22\2\2\u0352\u0355\3\2\2\2\u0353\u0355\5\20\t"+
		"\2\u0354\u034d\3\2\2\2\u0354\u034e\3\2\2\2\u0354\u034f\3\2\2\2\u0354\u0353"+
		"\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u034c\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"?\3\2\2\2\u0358\u0359\7\u00b1\2\2\u0359\u035a\7\25\2\2\u035a\u035b\5l"+
		"\67\2\u035b\u035c\7\26\2\2\u035c\u038a\7\21\2\2\u035d\u0362\7>\2\2\u035e"+
		"\u0363\5T+\2\u035f\u0360\7\4\2\2\u0360\u0361\7\u00b5\2\2\u0361\u0363\7"+
		"\4\2\2\u0362\u035e\3\2\2\2\u0362\u035f\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0369\7\3\2\2\u0365\u036a\5D#\2\u0366\u036a\5B\"\2\u0367\u036a\5\24\13"+
		"\2\u0368\u036a\5F$\2\u0369\u0365\3\2\2\2\u0369\u0366\3\2\2\2\u0369\u0367"+
		"\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u037b\3\2\2\2\u036b\u0370\7>\2\2\u036c"+
		"\u0371\5T+\2\u036d\u036e\7\4\2\2\u036e\u036f\7\u00b5\2\2\u036f\u0371\7"+
		"\4\2\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0377\7\3\2\2\u0373\u0378\5D#\2\u0374\u0378\5B\"\2\u0375\u0378\5\24\13"+
		"\2\u0376\u0378\5F$\2\u0377\u0373\3\2\2\2\u0377\u0374\3\2\2\2\u0377\u0375"+
		"\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u036b\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0386\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037e\u037f\7L\2\2\u037f\u0384\7\3\2\2\u0380"+
		"\u0385\5D#\2\u0381\u0385\5B\"\2\u0382\u0385\5\24\13\2\u0383\u0385\5F$"+
		"\2\u0384\u0380\3\2\2\2\u0384\u0381\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0383"+
		"\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u037e\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0389\3\2\2\2\u0388\u035d\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d"+
		"\u038e\7\22\2\2\u038eA\3\2\2\2\u038f\u0390\7\u00b2\2\2\u0390\u0396\7\23"+
		"\2\2\u0391\u0392\7\21\2\2\u0392\u0393\5B\"\2\u0393\u0394\7\22\2\2\u0394"+
		"\u0396\3\2\2\2\u0395\u038f\3\2\2\2\u0395\u0391\3\2\2\2\u0396C\3\2\2\2"+
		"\u0397\u03a0\7,\2\2\u0398\u03a1\5\34\17\2\u0399\u03a1\5b\62\2\u039a\u03a1"+
		"\5d\63\2\u039b\u03a1\5Z.\2\u039c\u03a1\5\u0080A\2\u039d\u03a1\5r:\2\u039e"+
		"\u03a1\7\u00b6\2\2\u039f\u03a1\7\u0080\2\2\u03a0\u0398\3\2\2\2\u03a0\u0399"+
		"\3\2\2\2\u03a0\u039a\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a0"+
		"\u039d\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03a8\7\23\2\2\u03a3\u03a4\7\21\2\2\u03a4\u03a5\5D#\2\u03a5"+
		"\u03a6\7\22\2\2\u03a6\u03a8\3\2\2\2\u03a7\u0397\3\2\2\2\u03a7\u03a3\3"+
		"\2\2\2\u03a8E\3\2\2\2\u03a9\u03ae\5b\62\2\u03aa\u03ae\5d\63\2\u03ab\u03ae"+
		"\5Z.\2\u03ac\u03ae\5\u0080A\2\u03ad\u03a9\3\2\2\2\u03ad\u03aa\3\2\2\2"+
		"\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0"+
		"\7\23\2\2\u03b0G\3\2\2\2\u03b1\u03b2\t\3\2\2\u03b2I\3\2\2\2\u03b3\u03b6"+
		"\t\4\2\2\u03b4\u03b6\t\5\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b6"+
		"K\3\2\2\2\u03b7\u03ba\t\6\2\2\u03b8\u03ba\t\7\2\2\u03b9\u03b7\3\2\2\2"+
		"\u03b9\u03b8\3\2\2\2\u03baM\3\2\2\2\u03bb\u03bc\t\b\2\2\u03bcO\3\2\2\2"+
		"\u03bd\u03be\t\t\2\2\u03beQ\3\2\2\2\u03bf\u03c0\t\n\2\2\u03c0S\3\2\2\2"+
		"\u03c1\u03ce\7\u00b6\2\2\u03c2\u03c3\7\25\2\2\u03c3\u03c4\7\u00bd\2\2"+
		"\u03c4\u03ce\7\26\2\2\u03c5\u03ce\7\u00b5\2\2\u03c6\u03c7\7\25\2\2\u03c7"+
		"\u03c8\7\u00b5\2\2\u03c8\u03ce\7\26\2\2\u03c9\u03ca\7\25\2\2\u03ca\u03cb"+
		"\5T+\2\u03cb\u03cc\7\26\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03c1\3\2\2\2\u03cd"+
		"\u03c2\3\2\2\2\u03cd\u03c5\3\2\2\2\u03cd\u03c6\3\2\2\2\u03cd\u03c9\3\2"+
		"\2\2\u03ceU\3\2\2\2\u03cf\u03d5\5`\61\2\u03d0\u03d5\5Z.\2\u03d1\u03d5"+
		"\5d\63\2\u03d2\u03d5\5T+\2\u03d3\u03d5\5|?\2\u03d4\u03cf\3\2\2\2\u03d4"+
		"\u03d0\3\2\2\2\u03d4\u03d1\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d3\3\2"+
		"\2\2\u03d5W\3\2\2\2\u03d6\u03db\7\u00b5\2\2\u03d7\u03d8\7\25\2\2\u03d8"+
		"\u03d9\7\u00b5\2\2\u03d9\u03db\7\26\2\2\u03da\u03d6\3\2\2\2\u03da\u03d7"+
		"\3\2\2\2\u03dbY\3\2\2\2\u03dc\u03dd\5H%\2\u03dd\u03de\5X-\2\u03de\u03f1"+
		"\3\2\2\2\u03df\u03e0\5X-\2\u03e0\u03e1\5H%\2\u03e1\u03f1\3\2\2\2\u03e2"+
		"\u03e3\7\25\2\2\u03e3\u03e4\5H%\2\u03e4\u03e5\5X-\2\u03e5\u03e6\7\26\2"+
		"\2\u03e6\u03f1\3\2\2\2\u03e7\u03e8\7\25\2\2\u03e8\u03e9\5X-\2\u03e9\u03ea"+
		"\5H%\2\u03ea\u03eb\7\26\2\2\u03eb\u03f1\3\2\2\2\u03ec\u03ed\7\25\2\2\u03ed"+
		"\u03ee\5Z.\2\u03ee\u03ef\7\26\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03dc\3\2"+
		"\2\2\u03f0\u03df\3\2\2\2\u03f0\u03e2\3\2\2\2\u03f0\u03e7\3\2\2\2\u03f0"+
		"\u03ec\3\2\2\2\u03f1[\3\2\2\2\u03f2\u03f3\5H%\2\u03f3\u03f4\5X-\2\u03f4"+
		"\u03ff\3\2\2\2\u03f5\u03f6\5X-\2\u03f6\u03f7\5H%\2\u03f7\u03ff\3\2\2\2"+
		"\u03f8\u03f9\5H%\2\u03f9\u03fa\5X-\2\u03fa\u03ff\3\2\2\2\u03fb\u03fc\5"+
		"X-\2\u03fc\u03fd\5H%\2\u03fd\u03ff\3\2\2\2\u03fe\u03f2\3\2\2\2\u03fe\u03f5"+
		"\3\2\2\2\u03fe\u03f8\3\2\2\2\u03fe\u03fb\3\2\2\2\u03ff]\3\2\2\2\u0400"+
		"\u0401\5V,\2\u0401\u0402\5J&\2\u0402\u0408\5V,\2\u0403\u0404\5J&\2\u0404"+
		"\u0405\5V,\2\u0405\u0407\3\2\2\2\u0406\u0403\3\2\2\2\u0407\u040a\3\2\2"+
		"\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409_\3\2\2\2\u040a\u0408"+
		"\3\2\2\2\u040b\u040c\7\25\2\2\u040c\u040d\5^\60\2\u040d\u040e\7\26\2\2"+
		"\u040e\u0414\3\2\2\2\u040f\u0410\7\25\2\2\u0410\u0411\5`\61\2\u0411\u0412"+
		"\7\26\2\2\u0412\u0414\3\2\2\2\u0413\u040b\3\2\2\2\u0413\u040f\3\2\2\2"+
		"\u0414a\3\2\2\2\u0415\u0416\5\u0108\u0085\2\u0416\u041a\5L\'\2\u0417\u041b"+
		"\5V,\2\u0418\u041b\5^\60\2\u0419\u041b\5z>\2\u041a\u0417\3\2\2\2\u041a"+
		"\u0418\3\2\2\2\u041a\u0419\3\2\2\2\u041bc\3\2\2\2\u041c\u041d\7\25\2\2"+
		"\u041d\u041e\5b\62\2\u041e\u041f\7\26\2\2\u041f\u0425\3\2\2\2\u0420\u0421"+
		"\7\25\2\2\u0421\u0422\5d\63\2\u0422\u0423\7\26\2\2\u0423\u0425\3\2\2\2"+
		"\u0424\u041c\3\2\2\2\u0424\u0420\3\2\2\2\u0425e\3\2\2\2\u0426\u0429\5"+
		"V,\2\u0427\u0429\5^\60\2\u0428\u0426\3\2\2\2\u0428\u0427\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u042d\5N(\2\u042b\u042e\5V,\2\u042c\u042e\5^\60\2"+
		"\u042d\u042b\3\2\2\2\u042d\u042c\3\2\2\2\u042eg\3\2\2\2\u042f\u0430\7"+
		"\25\2\2\u0430\u0431\5f\64\2\u0431\u0432\7\26\2\2\u0432\u0438\3\2\2\2\u0433"+
		"\u0434\7\25\2\2\u0434\u0435\5h\65\2\u0435\u0436\7\26\2\2\u0436\u0438\3"+
		"\2\2\2\u0437\u042f\3\2\2\2\u0437\u0433\3\2\2\2\u0438i\3\2\2\2\u0439\u0440"+
		"\5^\60\2\u043a\u0440\5`\61\2\u043b\u0440\5b\62\2\u043c\u0440\5d\63\2\u043d"+
		"\u0440\5Z.\2\u043e\u0440\5X-\2\u043f\u0439\3\2\2\2\u043f\u043a\3\2\2\2"+
		"\u043f\u043b\3\2\2\2\u043f\u043c\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u043e"+
		"\3\2\2\2\u0440k\3\2\2\2\u0441\u0445\5V,\2\u0442\u0445\5^\60\2\u0443\u0445"+
		"\5b\62\2\u0444\u0441\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0443\3\2\2\2\u0445"+
		"m\3\2\2\2\u0446\u044c\5|?\2\u0447\u044c\5V,\2\u0448\u044c\5^\60\2\u0449"+
		"\u044c\7\u00af\2\2\u044a\u044c\7\u00b0\2\2\u044b\u0446\3\2\2\2\u044b\u0447"+
		"\3\2\2\2\u044b\u0448\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044a\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u0453\5P)\2\u044e\u0454\5|?\2\u044f\u0454\5^\60\2"+
		"\u0450\u0454\5V,\2\u0451\u0454\7\u00af\2\2\u0452\u0454\7\u00b0\2\2\u0453"+
		"\u044e\3\2\2\2\u0453\u044f\3\2\2\2\u0453\u0450\3\2\2\2\u0453\u0451\3\2"+
		"\2\2\u0453\u0452\3\2\2\2\u0454\u0460\3\2\2\2\u0455\u0458\5f\64\2\u0456"+
		"\u0458\5h\65\2\u0457\u0455\3\2\2\2\u0457\u0456\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u045c\5P)\2\u045a\u045d\5f\64\2\u045b\u045d\5h\65\2\u045c\u045a"+
		"\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u0460\5f\64\2\u045f"+
		"\u044b\3\2\2\2\u045f\u0457\3\2\2\2\u045f\u045e\3\2\2\2\u0460o\3\2\2\2"+
		"\u0461\u0462\7\25\2\2\u0462\u0463\5n8\2\u0463\u0464\7\26\2\2\u0464\u046a"+
		"\3\2\2\2\u0465\u0466\7\25\2\2\u0466\u0467\5p9\2\u0467\u0468\7\26\2\2\u0468"+
		"\u046a\3\2\2\2\u0469\u0461\3\2\2\2\u0469\u0465\3\2\2\2\u046aq\3\2\2\2"+
		"\u046b\u0471\5X-\2\u046c\u0471\5n8\2\u046d\u0471\5p9\2\u046e\u0471\7\u00af"+
		"\2\2\u046f\u0471\7\u00b0\2\2\u0470\u046b\3\2\2\2\u0470\u046c\3\2\2\2\u0470"+
		"\u046d\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u046f\3\2\2\2\u0471s\3\2\2\2"+
		"\u0472\u0473\5r:\2\u0473\u0474\5R*\2\u0474\u047a\5r:\2\u0475\u0476\5R"+
		"*\2\u0476\u0477\5r:\2\u0477\u0479\3\2\2\2\u0478\u0475\3\2\2\2\u0479\u047c"+
		"\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047f\3\2\2\2\u047c"+
		"\u047a\3\2\2\2\u047d\u047f\5n8\2\u047e\u0472\3\2\2\2\u047e\u047d\3\2\2"+
		"\2\u047fu\3\2\2\2\u0480\u0481\7\25\2\2\u0481\u0482\5t;\2\u0482\u0483\7"+
		"\26\2\2\u0483\u048a\3\2\2\2\u0484\u048a\5p9\2\u0485\u0486\7\25\2\2\u0486"+
		"\u0487\5v<\2\u0487\u0488\7\26\2\2\u0488\u048a\3\2\2\2\u0489\u0480\3\2"+
		"\2\2\u0489\u0484\3\2\2\2\u0489\u0485\3\2\2\2\u048aw\3\2\2\2\u048b\u0491"+
		"\5t;\2\u048c\u0491\5v<\2\u048d\u0491\7\u00af\2\2\u048e\u0491\7\u00b0\2"+
		"\2\u048f\u0491\5X-\2\u0490\u048b\3\2\2\2\u0490\u048c\3\2\2\2\u0490\u048d"+
		"\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u048f\3\2\2\2\u0491y\3\2\2\2\u0492"+
		"\u0493\5X-\2\u0493\u0494\7\30\2\2\u0494\u0495\5l\67\2\u0495{\3\2\2\2\u0496"+
		"\u0497\7\25\2\2\u0497\u0498\5X-\2\u0498\u0499\7\30\2\2\u0499\u049a\5l"+
		"\67\2\u049a\u049b\7\26\2\2\u049b\u04a1\3\2\2\2\u049c\u049d\7\25\2\2\u049d"+
		"\u049e\5|?\2\u049e\u049f\7\26\2\2\u049f\u04a1\3\2\2\2\u04a0\u0496\3\2"+
		"\2\2\u04a0\u049c\3\2\2\2\u04a1}\3\2\2\2\u04a2\u04a5\5z>\2\u04a3\u04a5"+
		"\5|?\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04a7\7\22\2\2\u04a7\u04a8\7\23\2\2\u04a8\177\3\2\2\2\u04a9\u04ac\5z"+
		">\2\u04aa\u04ac\5|?\2\u04ab\u04a9\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\u0081"+
		"\3\2\2\2\u04ad\u04ae\7\62\2\2\u04ae\u04b2\7\u009b\2\2\u04af\u04b0\5\u00e8"+
		"u\2\u04b0\u04b1\7\24\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04af\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04bf\5\u00eav\2\u04b5\u04b6"+
		"\7\u0092\2\2\u04b6\u04b7\7\u009f\2\2\u04b7\u04c0\5\u00f0y\2\u04b8\u04c0"+
		"\5\u0086D\2\u04b9\u04c0\5\u0084C\2\u04ba\u04bc\7/\2\2\u04bb\u04bd\7B\2"+
		"\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0"+
		"\5\u0098M\2\u04bf\u04b5\3\2\2\2\u04bf\u04b8\3\2\2\2\u04bf\u04b9\3\2\2"+
		"\2\u04bf\u04ba\3\2\2\2\u04c0\u0083\3\2\2\2\u04c1\u04c2\7/\2\2\u04c2\u04c3"+
		"\7E\2\2\u04c3\u04c4\5\u0108\u0085\2\u04c4\u04c5\5\u00b2Z\2\u04c5\u0085"+
		"\3\2\2\2\u04c6\u04c7\7/\2\2\u04c7\u04c8\5\u00b2Z\2\u04c8\u0087\3\2\2\2"+
		"\u04c9\u04ca\7F\2\2\u04ca\u04ce\7\u009b\2\2\u04cb\u04cc\7e\2\2\u04cc\u04cd"+
		"\7~\2\2\u04cd\u04cf\7[\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04d3\3\2\2\2\u04d0\u04d1\5\u00e8u\2\u04d1\u04d2\7\24\2\2\u04d2\u04d4"+
		"\3\2\2\2\u04d3\u04d0\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04e5\5\u00ecw\2\u04d6\u04d7\7\25\2\2\u04d7\u04de\5\u0098M\2\u04d8\u04d9"+
		"\7\27\2\2\u04d9\u04dd\5\u00b2Z\2\u04da\u04db\7\27\2\2\u04db\u04dd\5\u0098"+
		"M\2\u04dc\u04d8\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04de\3\2"+
		"\2\2\u04e1\u04e2\7\26\2\2\u04e2\u04e6\3\2\2\2\u04e3\u04e4\7\65\2\2\u04e4"+
		"\u04e6\5\u0092J\2\u04e5\u04d6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u0089"+
		"\3\2\2\2\u04e7\u04e8\7O\2\2\u04e8\u04e9\7`\2\2\u04e9\u04ec\5\u00be`\2"+
		"\u04ea\u04eb\7\u00ab\2\2\u04eb\u04ed\5\u00aaV\2\u04ec\u04ea\3\2\2\2\u04ec"+
		"\u04ed\3\2\2\2\u04ed\u008b\3\2\2\2\u04ee\u04ef\7S\2\2\u04ef\u04f2\7\u009b"+
		"\2\2\u04f0\u04f1\7e\2\2\u04f1\u04f3\7[\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f7\3\2\2\2\u04f4\u04f5\5\u00e8u\2\u04f5\u04f6\7\24\2"+
		"\2\u04f6\u04f8\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9"+
		"\3\2\2\2\u04f9\u04fa\5\u00ecw\2\u04fa\u008d\3\2\2\2\u04fb\u0506\5\u00d0"+
		"i\2\u04fc\u04fd\7\u0086\2\2\u04fd\u04fe\7<\2\2\u04fe\u0503\5\u00c0a\2"+
		"\u04ff\u0500\7\27\2\2\u0500\u0502\5\u00c0a\2\u0501\u04ff\3\2\2\2\u0502"+
		"\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0507\3\2"+
		"\2\2\u0505\u0503\3\2\2\2\u0506\u04fc\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u050e\3\2\2\2\u0508\u0509\7y\2\2\u0509\u050c\5\u00aaV\2\u050a\u050b\t"+
		"\13\2\2\u050b\u050d\5\u00aaV\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2"+
		"\u050d\u050f\3\2\2\2\u050e\u0508\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u008f"+
		"\3\2\2\2\u0510\u0511\7o\2\2\u0511\u0515\7r\2\2\u0512\u0513\5\u00e8u\2"+
		"\u0513\u0514\7\24\2\2\u0514\u0516\3\2\2\2\u0515\u0512\3\2\2\2\u0515\u0516"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0523\5\u00ecw\2\u0518\u0519\7\25\2"+
		"\2\u0519\u051e\5\u00f2z\2\u051a\u051b\7\27\2\2\u051b\u051d\5\u00f2z\2"+
		"\u051c\u051a\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0522\7\26\2\2"+
		"\u0522\u0524\3\2\2\2\u0523\u0518\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0544"+
		"\3\2\2\2\u0525\u0526\7\u00a7\2\2\u0526\u0527\7\25\2\2\u0527\u052c\5\u00aa"+
		"V\2\u0528\u0529\7\27\2\2\u0529\u052b\5\u00aaV\2\u052a\u0528\3\2\2\2\u052b"+
		"\u052e\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2"+
		"\2\2\u052e\u052c\3\2\2\2\u052f\u053e\7\26\2\2\u0530\u0531\7\27\2\2\u0531"+
		"\u0532\7\25\2\2\u0532\u0537\5\u00aaV\2\u0533\u0534\7\27\2\2\u0534\u0536"+
		"\5\u00aaV\2\u0535\u0533\3\2\2\2\u0536\u0539\3\2\2\2\u0537\u0535\3\2\2"+
		"\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2\u0539\u0537\3\2\2\2\u053a\u053b"+
		"\7\26\2\2\u053b\u053d\3\2\2\2\u053c\u0530\3\2\2\2\u053d\u0540\3\2\2\2"+
		"\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0545\3\2\2\2\u0540\u053e"+
		"\3\2\2\2\u0541\u0545\5\u0092J\2\u0542\u0543\7L\2\2\u0543\u0545\7\u00a7"+
		"\2\2\u0544\u0525\3\2\2\2\u0544\u0541\3\2\2\2\u0544\u0542\3\2\2\2\u0545"+
		"\u0091\3\2\2\2\u0546\u0551\5\u0094K\2\u0547\u0548\7\u0086\2\2\u0548\u0549"+
		"\7<\2\2\u0549\u054e\5\u00c0a\2\u054a\u054b\7\27\2\2\u054b\u054d\5\u00c0"+
		"a\2\u054c\u054a\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0547\3\2"+
		"\2\2\u0551\u0552\3\2\2\2\u0552\u0559\3\2\2\2\u0553\u0554\7y\2\2\u0554"+
		"\u0557\5\u00aaV\2\u0555\u0556\t\13\2\2\u0556\u0558\5\u00aaV\2\u0557\u0555"+
		"\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559\u0553\3\2\2\2\u0559"+
		"\u055a\3\2\2\2\u055a\u0093\3\2\2\2\u055b\u055d\7\u0099\2\2\u055c\u055e"+
		"\t\f\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0564\5\u00c6d\2\u0560\u0561\7\27\2\2\u0561\u0563\5\u00c6d\2\u0562\u0560"+
		"\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0573\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0571\7`\2\2\u0568\u056d\5\u00c8"+
		"e\2\u0569\u056a\7\27\2\2\u056a\u056c\5\u00c8e\2\u056b\u0569\3\2\2\2\u056c"+
		"\u056f\3\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0572\3\2"+
		"\2\2\u056f\u056d\3\2\2\2\u0570\u0572\5\u00caf\2\u0571\u0568\3\2\2\2\u0571"+
		"\u0570\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0567\3\2\2\2\u0573\u0574\3\2"+
		"\2\2\u0574\u0577\3\2\2\2\u0575\u0576\7\u00ab\2\2\u0576\u0578\5\u00aaV"+
		"\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0587\3\2\2\2\u0579\u057a"+
		"\7c\2\2\u057a\u057b\7<\2\2\u057b\u0580\5\u00aaV\2\u057c\u057d\7\27\2\2"+
		"\u057d\u057f\5\u00aaV\2\u057e\u057c\3\2\2\2\u057f\u0582\3\2\2\2\u0580"+
		"\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0585\3\2\2\2\u0582\u0580\3\2"+
		"\2\2\u0583\u0584\7d\2\2\u0584\u0586\5\u00aaV\2\u0585\u0583\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587\u0579\3\2\2\2\u0587\u0588\3\2"+
		"\2\2\u0588\u05a6\3\2\2\2\u0589\u058a\7\u00a7\2\2\u058a\u058b\7\25\2\2"+
		"\u058b\u0590\5\u00aaV\2\u058c\u058d\7\27\2\2\u058d\u058f\5\u00aaV\2\u058e"+
		"\u058c\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0593\3\2\2\2\u0592\u0590\3\2\2\2\u0593\u05a2\7\26\2\2\u0594"+
		"\u0595\7\27\2\2\u0595\u0596\7\25\2\2\u0596\u059b\5\u00aaV\2\u0597\u0598"+
		"\7\27\2\2\u0598\u059a\5\u00aaV\2\u0599\u0597\3\2\2\2\u059a\u059d\3\2\2"+
		"\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059b"+
		"\3\2\2\2\u059e\u059f\7\26\2\2\u059f\u05a1\3\2\2\2\u05a0\u0594\3\2\2\2"+
		"\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a6"+
		"\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u055b\3\2\2\2\u05a5\u0589\3\2\2\2\u05a6"+
		"\u0095\3\2\2\2\u05a7\u05a8\7\u00a4\2\2\u05a8\u05a9\5\u00be`\2\u05a9\u05aa"+
		"\7\u009a\2\2\u05aa\u05ab\5\u00f2z\2\u05ab\u05ac\7\30\2\2\u05ac\u05b4\5"+
		"\u00aaV\2\u05ad\u05ae\7\27\2\2\u05ae\u05af\5\u00f2z\2\u05af\u05b0\7\30"+
		"\2\2\u05b0\u05b1\5\u00aaV\2\u05b1\u05b3\3\2\2\2\u05b2\u05ad\3\2\2\2\u05b3"+
		"\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b9\3\2"+
		"\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b8\7\u00ab\2\2\u05b8\u05ba\5\u00aaV"+
		"\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u0097\3\2\2\2\u05bb\u05c0"+
		"\5\u00f2z\2\u05bc\u05bf\5\u009cO\2\u05bd\u05bf\5\u009aN\2\u05be\u05bc"+
		"\3\2\2\2\u05be\u05bd\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0"+
		"\u05c1\3\2\2\2\u05c1\u0099\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05d7\5\u00e4"+
		"s\2\u05c4\u05c5\7\25\2\2\u05c5\u05c7\5\u00d4k\2\u05c6\u05c8\5\u0108\u0085"+
		"\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca"+
		"\7\26\2\2\u05ca\u05d8\3\2\2\2\u05cb\u05cc\7\25\2\2\u05cc\u05ce\5\u00d4"+
		"k\2\u05cd\u05cf\5\u0108\u0085\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2"+
		"\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7\27\2\2\u05d1\u05d3\5\u00d4k\2\u05d2"+
		"\u05d4\5\u0108\u0085\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5"+
		"\3\2\2\2\u05d5\u05d6\7\26\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05c4\3\2\2\2"+
		"\u05d7\u05cb\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u009b\3\2\2\2\u05d9\u05da"+
		"\7E\2\2\u05da\u05dc\5\u00e4s\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2"+
		"\u05dc\u05e9\3\2\2\2\u05dd\u05ea\5\u009eP\2\u05de\u05ea\5\u00a0Q\2\u05df"+
		"\u05ea\5\u00a2R\2\u05e0\u05ea\5\u00a4S\2\u05e1\u05e2\7@\2\2\u05e2\u05e3"+
		"\7\25\2\2\u05e3\u05e4\5\u00aaV\2\u05e4\u05e5\7\26\2\2\u05e5\u05ea\3\2"+
		"\2\2\u05e6\u05ea\5\u00a6T\2\u05e7\u05e8\7A\2\2\u05e8\u05ea\5\u00f4{\2"+
		"\u05e9\u05dd\3\2\2\2\u05e9\u05de\3\2\2\2\u05e9\u05df\3\2\2\2\u05e9\u05e0"+
		"\3\2\2\2\u05e9\u05e1\3\2\2\2\u05e9\u05e6\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea"+
		"\u009d\3\2\2\2\u05eb\u05ec\7\u008a\2\2\u05ec\u05ee\7v\2\2\u05ed\u05ef"+
		"\t\r\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0"+
		"\u05f2\78\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u009f\3\2"+
		"\2\2\u05f3\u05f4\5\u00acW\2\u05f4\u00a1\3\2\2\2\u05f5\u05f6\7~\2\2\u05f6"+
		"\u05f7\7\u0080\2\2\u05f7\u00a3\3\2\2\2\u05f8\u05f9\7\u0080\2\2\u05f9\u00a5"+
		"\3\2\2\2\u05fa\u0606\7L\2\2\u05fb\u0607\5\u00a8U\2\u05fc\u05fd\7\25\2"+
		"\2\u05fd\u05fe\5\u00aaV\2\u05fe\u05ff\7\26\2\2\u05ff\u0607\3\2\2\2\u0600"+
		"\u0601\7|\2\2\u0601\u0602\7\25\2\2\u0602\u0603\5\u00aaV\2\u0603\u0604"+
		"\7\26\2\2\u0604\u0607\3\2\2\2\u0605\u0607\5\u0108\u0085\2\u0606\u05fb"+
		"\3\2\2\2\u0606\u05fc\3\2\2\2\u0606\u0600\3\2\2\2\u0606\u0605\3\2\2\2\u0607"+
		"\u060e\3\2\2\2\u0608\u060a\7\16\2\2\u0609\u060b\5\u0108\u0085\2\u060a"+
		"\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060f\3\2\2\2\u060e\u0608\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u00a7\3\2\2\2\u0610\u0613\5\u00d4k\2\u0611\u0613\5\u00d6l\2\u0612\u0610"+
		"\3\2\2\2\u0612\u0611\3\2\2\2\u0613\u00a9\3\2\2\2\u0614\u0615\bV\1\2\u0615"+
		"\u063c\5\u00d6l\2\u0616\u063c\7\u00b7\2\2\u0617\u0618\5\u00e8u\2\u0618"+
		"\u0619\7\24\2\2\u0619\u061b\3\2\2\2\u061a\u0617\3\2\2\2\u061a\u061b\3"+
		"\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\5\u00ecw\2\u061d\u061e\7\24\2\2"+
		"\u061e\u0620\3\2\2\2\u061f\u061a\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u063c\5\u00f2z\2\u0622\u0623\5\u00d8m\2\u0623\u0624\5\u00aa"+
		"V\r\u0624\u063c\3\2\2\2\u0625\u0626\5\u00e6t\2\u0626\u0633\7\25\2\2\u0627"+
		"\u0629\7R\2\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u062f\5\u00aaV\2\u062b\u062c\7\27\2\2\u062c\u062e\5\u00aaV"+
		"\2\u062d\u062b\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630"+
		"\3\2\2\2\u0630\u0634\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u0634\7\31\2\2"+
		"\u0633\u0628\3\2\2\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635"+
		"\3\2\2\2\u0635\u0636\7\26\2\2\u0636\u063c\3\2\2\2\u0637\u0638\7\25\2\2"+
		"\u0638\u0639\5\u00aaV\2\u0639\u063a\7\26\2\2\u063a\u063c\3\2\2\2\u063b"+
		"\u0614\3\2\2\2\u063b\u0616\3\2\2\2\u063b\u061f\3\2\2\2\u063b\u0622\3\2"+
		"\2\2\u063b\u0625\3\2\2\2\u063b\u0637\3\2\2\2\u063c\u0664\3\2\2\2\u063d"+
		"\u063e\f\f\2\2\u063e\u063f\7\35\2\2\u063f\u0663\5\u00aaV\r\u0640\u0641"+
		"\f\13\2\2\u0641\u0642\t\4\2\2\u0642\u0663\5\u00aaV\f\u0643\u0644\f\n\2"+
		"\2\u0644\u0645\t\5\2\2\u0645\u0663\5\u00aaV\13\u0646\u0647\f\t\2\2\u0647"+
		"\u0648\t\16\2\2\u0648\u0663\5\u00aaV\n\u0649\u064a\f\b\2\2\u064a\u064b"+
		"\t\b\2\2\u064b\u0663\5\u00aaV\t\u064c\u0659\f\7\2\2\u064d\u065a\7\30\2"+
		"\2\u064e\u065a\7(\2\2\u064f\u065a\7)\2\2\u0650\u065a\7*\2\2\u0651\u065a"+
		"\7s\2\2\u0652\u0653\7s\2\2\u0653\u065a\7~\2\2\u0654\u065a\7j\2\2\u0655"+
		"\u065a\7x\2\2\u0656\u065a\7b\2\2\u0657\u065a\7z\2\2\u0658\u065a\7\u008f"+
		"\2\2\u0659\u064d\3\2\2\2\u0659\u064e\3\2\2\2\u0659\u064f\3\2\2\2\u0659"+
		"\u0650\3\2\2\2\u0659\u0651\3\2\2\2\u0659\u0652\3\2\2\2\u0659\u0654\3\2"+
		"\2\2\u0659\u0655\3\2\2\2\u0659\u0656\3\2\2\2\u0659\u0657\3\2\2\2\u0659"+
		"\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u0663\5\u00aaV\b\u065c\u065d"+
		"\f\6\2\2\u065d\u065e\7\64\2\2\u065e\u0663\5\u00aaV\7\u065f\u0660\f\5\2"+
		"\2\u0660\u0661\7\u0085\2\2\u0661\u0663\5\u00aaV\6\u0662\u063d\3\2\2\2"+
		"\u0662\u0640\3\2\2\2\u0662\u0643\3\2\2\2\u0662\u0646\3\2\2\2\u0662\u0649"+
		"\3\2\2\2\u0662\u064c\3\2\2\2\u0662\u065c\3\2\2\2\u0662\u065f\3\2\2\2\u0663"+
		"\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u00ab\3\2"+
		"\2\2\u0666\u0664\3\2\2\2\u0667\u066b\7\u008e\2\2\u0668\u0669\5\u00e8u"+
		"\2\u0669\u066a\7\24\2\2\u066a\u066c\3\2\2\2\u066b\u0668\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0679\5\u00f6|\2\u066e\u066f"+
		"\7\25\2\2\u066f\u0674\5\u00aeX\2\u0670\u0671\7\27\2\2\u0671\u0673\5\u00ae"+
		"X\2\u0672\u0670\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0674\3\2\2\2\u0677\u0678\7\26"+
		"\2\2\u0678\u067a\3\2\2\2\u0679\u066e\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u068d\3\2\2\2\u067b\u067c\7\u0083\2\2\u067c\u0685\t\17\2\2\u067d\u067e"+
		"\7\u009a\2\2\u067e\u0686\7\u0080\2\2\u067f\u0680\7\u009a\2\2\u0680\u0686"+
		"\7L\2\2\u0681\u0686\7=\2\2\u0682\u0686\7\u0094\2\2\u0683\u0684\7}\2\2"+
		"\u0684\u0686\7.\2\2\u0685\u067d\3\2\2\2\u0685\u067f\3\2\2\2\u0685\u0681"+
		"\3\2\2\2\u0685\u0682\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u068a\3\2\2\2\u0687"+
		"\u0688\7z\2\2\u0688\u068a\5\u00e4s\2\u0689\u067b\3\2\2\2\u0689\u0687\3"+
		"\2\2\2\u068a\u068c\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u068f\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u069d\3\2\2\2\u068f\u068d\3\2"+
		"\2\2\u0690\u0692\7~\2\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692"+
		"\u0693\3\2\2\2\u0693\u0698\7M\2\2\u0694\u0695\7m\2\2\u0695\u0699\7N\2"+
		"\2\u0696\u0697\7m\2\2\u0697\u0699\7i\2\2\u0698\u0694\3\2\2\2\u0698\u0696"+
		"\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\3\2\2\2\u069a\u069c\7W\2\2\u069b"+
		"\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u0691\3\2"+
		"\2\2\u069d\u069e\3\2\2\2\u069e\u00ad\3\2\2\2\u069f\u06a0\5\u00e4s\2\u06a0"+
		"\u00af\3\2\2\2\u06a1\u06a4\5\u00f2z\2\u06a2\u06a3\7A\2\2\u06a3\u06a5\5"+
		"\u00f4{\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\3\2\2\2"+
		"\u06a6\u06a8\t\r\2\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u00b1"+
		"\3\2\2\2\u06a9\u06aa\7E\2\2\u06aa\u06ac\5\u00e4s\2\u06ab\u06a9\3\2\2\2"+
		"\u06ab\u06ac\3\2\2\2\u06ac\u06b6\3\2\2\2\u06ad\u06b7\5\u00b4[\2\u06ae"+
		"\u06b7\5\u00ba^\2\u06af\u06b7\5\u00b8]\2\u06b0\u06b1\7@\2\2\u06b1\u06b2"+
		"\7\25\2\2\u06b2\u06b3\5\u00aaV\2\u06b3\u06b4\7\26\2\2\u06b4\u06b7\3\2"+
		"\2\2\u06b5\u06b7\5\u00b6\\\2\u06b6\u06ad\3\2\2\2\u06b6\u06ae\3\2\2\2\u06b6"+
		"\u06af\3\2\2\2\u06b6\u06b0\3\2\2\2\u06b6\u06b5\3\2\2\2\u06b7\u00b3\3\2"+
		"\2\2\u06b8\u06b9\7\u008a\2\2\u06b9\u06ba\7v\2\2\u06ba\u06bb\7\25\2\2\u06bb"+
		"\u06c0\5\u00b0Y\2\u06bc\u06bd\7\27\2\2\u06bd\u06bf\5\u00b0Y\2\u06be\u06bc"+
		"\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1"+
		"\u06c3\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c3\u06c4\7\26\2\2\u06c4\u00b5\3"+
		"\2\2\2\u06c5\u06c6\7_\2\2\u06c6\u06c7\7v\2\2\u06c7\u06c8\7\25\2\2\u06c8"+
		"\u06cd\5\u00bc_\2\u06c9\u06ca\7\27\2\2\u06ca\u06cc\5\u00bc_\2\u06cb\u06c9"+
		"\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce"+
		"\u06d0\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d1\7\26\2\2\u06d1\u06d2\5"+
		"\u00acW\2\u06d2\u00b7\3\2\2\2\u06d3\u06d5\7\u00a3\2\2\u06d4\u06d6\7v\2"+
		"\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d9"+
		"\5\u00e4s\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2"+
		"\2\u06da\u06db\7\25\2\2\u06db\u06e0\5\u00b0Y\2\u06dc\u06dd\7\27\2\2\u06dd"+
		"\u06df\5\u00b0Y\2\u06de\u06dc\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3"+
		"\u06e4\7\26\2\2\u06e4\u00b9\3\2\2\2\u06e5\u06e7\7v\2\2\u06e6\u06e8\5\u00e4"+
		"s\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9"+
		"\u06ea\7\25\2\2\u06ea\u06ef\5\u00b0Y\2\u06eb\u06ec\7\27\2\2\u06ec\u06ee"+
		"\5\u00b0Y\2\u06ed\u06eb\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2\2"+
		"\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f3"+
		"\7\26\2\2\u06f3\u00bb\3\2\2\2\u06f4\u06f5\5\u00f2z\2\u06f5\u00bd\3\2\2"+
		"\2\u06f6\u06f7\5\u00e8u\2\u06f7\u06f8\7\24\2\2\u06f8\u06fa\3\2\2\2\u06f9"+
		"\u06f6\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0701\5\u00ec"+
		"w\2\u06fc\u06fd\7l\2\2\u06fd\u06fe\7<\2\2\u06fe\u0702\5\u00f8}\2\u06ff"+
		"\u0700\7~\2\2\u0700\u0702\7l\2\2\u0701\u06fc\3\2\2\2\u0701\u06ff\3\2\2"+
		"\2\u0701\u0702\3\2\2\2\u0702\u00bf\3\2\2\2\u0703\u0706\5\u00aaV\2\u0704"+
		"\u0705\7A\2\2\u0705\u0707\5\u00f4{\2\u0706\u0704\3\2\2\2\u0706\u0707\3"+
		"\2\2\2\u0707\u0709\3\2\2\2\u0708\u070a\t\r\2\2\u0709\u0708\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u00c1\3\2\2\2\u070b\u070f\5\u00d4k\2\u070c\u070f"+
		"\5\u00e4s\2\u070d\u070f\7\u00b8\2\2\u070e\u070b\3\2\2\2\u070e\u070c\3"+
		"\2\2\2\u070e\u070d\3\2\2\2\u070f\u00c3\3\2\2\2\u0710\u071c\5\u00ecw\2"+
		"\u0711\u0712\7\25\2\2\u0712\u0717\5\u00f2z\2\u0713\u0714\7\27\2\2\u0714"+
		"\u0716\5\u00f2z\2\u0715\u0713\3\2\2\2\u0716\u0719\3\2\2\2\u0717\u0715"+
		"\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\3\2\2\2\u0719\u0717\3\2\2\2\u071a"+
		"\u071b\7\26\2\2\u071b\u071d\3\2\2\2\u071c\u0711\3\2\2\2\u071c\u071d\3"+
		"\2\2\2\u071d\u071e\3\2\2\2\u071e\u071f\7\65\2\2\u071f\u0720\7\25\2\2\u0720"+
		"\u0721\5\u0092J\2\u0721\u0722\7\26\2\2\u0722\u00c5\3\2\2\2\u0723\u0730"+
		"\7\31\2\2\u0724\u0725\5\u00ecw\2\u0725\u0726\7\24\2\2\u0726\u0727\7\31"+
		"\2\2\u0727\u0730\3\2\2\2\u0728\u072d\5\u00aaV\2\u0729\u072b\7\65\2\2\u072a"+
		"\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072e\5\u00de"+
		"p\2\u072d\u072a\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f"+
		"\u0723\3\2\2\2\u072f\u0724\3\2\2\2\u072f\u0728\3\2\2\2\u0730\u00c7\3\2"+
		"\2\2\u0731\u0732\5\u00e8u\2\u0732\u0733\7\24\2\2\u0733\u0735\3\2\2\2\u0734"+
		"\u0731\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u073b\5\u00ec"+
		"w\2\u0737\u0739\7\65\2\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u073c\5\u0104\u0083\2\u073b\u0738\3\2\2\2\u073b\u073c"+
		"\3\2\2\2\u073c\u0742\3\2\2\2\u073d\u073e\7l\2\2\u073e\u073f\7<\2\2\u073f"+
		"\u0743\5\u00f8}\2\u0740\u0741\7~\2\2\u0741\u0743\7l\2\2\u0742\u073d\3"+
		"\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0761\3\2\2\2\u0744"+
		"\u074e\7\25\2\2\u0745\u074a\5\u00c8e\2\u0746\u0747\7\27\2\2\u0747\u0749"+
		"\5\u00c8e\2\u0748\u0746\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2"+
		"\2\u074a\u074b\3\2\2\2\u074b\u074f\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074f"+
		"\5\u00caf\2\u074e\u0745\3\2\2\2\u074e\u074d\3\2\2\2\u074f\u0750\3\2\2"+
		"\2\u0750\u0755\7\26\2\2\u0751\u0753\7\65\2\2\u0752\u0751\3\2\2\2\u0752"+
		"\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\5\u0104\u0083\2\u0755\u0752"+
		"\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0761\3\2\2\2\u0757\u0758\7\25\2\2"+
		"\u0758\u0759\5\u0092J\2\u0759\u075e\7\26\2\2\u075a\u075c\7\65\2\2\u075b"+
		"\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075f\5\u0104"+
		"\u0083\2\u075e\u075b\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760"+
		"\u0734\3\2\2\2\u0760\u0744\3\2\2\2\u0760\u0757\3\2\2\2\u0761\u00c9\3\2"+
		"\2\2\u0762\u0769\5\u00c8e\2\u0763\u0764\5\u00ccg\2\u0764\u0765\5\u00c8"+
		"e\2\u0765\u0766\5\u00ceh\2\u0766\u0768\3\2\2\2\u0767\u0763\3\2\2\2\u0768"+
		"\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u00cb\3\2"+
		"\2\2\u076b\u0769\3\2\2\2\u076c\u0776\7\27\2\2\u076d\u076f\7w\2\2\u076e"+
		"\u0770\7\u0087\2\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0773"+
		"\3\2\2\2\u0771\u0773\7n\2\2\u0772\u076d\3\2\2\2\u0772\u0771\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\7u\2\2\u0775\u076c\3\2"+
		"\2\2\u0775\u0772\3\2\2\2\u0776\u00cd\3\2\2\2\u0777\u0778\7\u0083\2\2\u0778"+
		"\u077a\5\u00aaV\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u00cf"+
		"\3\2\2\2\u077b\u077d\7\u0099\2\2\u077c\u077e\t\f\2\2\u077d\u077c\3\2\2"+
		"\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0784\5\u00c6d\2\u0780"+
		"\u0781\7\27\2\2\u0781\u0783\5\u00c6d\2\u0782\u0780\3\2\2\2\u0783\u0786"+
		"\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0793\3\2\2\2\u0786"+
		"\u0784\3\2\2\2\u0787\u0791\7`\2\2\u0788\u078d\5\u00c8e\2\u0789\u078a\7"+
		"\27\2\2\u078a\u078c\5\u00c8e\2\u078b\u0789\3\2\2\2\u078c\u078f\3\2\2\2"+
		"\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0792\3\2\2\2\u078f\u078d"+
		"\3\2\2\2\u0790\u0792\5\u00caf\2\u0791\u0788\3\2\2\2\u0791\u0790\3\2\2"+
		"\2\u0792\u0794\3\2\2\2\u0793\u0787\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0797"+
		"\3\2\2\2\u0795\u0796\7\u00ab\2\2\u0796\u0798\5\u00aaV\2\u0797\u0795\3"+
		"\2\2\2\u0797\u0798\3\2\2\2\u0798\u07a7\3\2\2\2\u0799\u079a\7c\2\2\u079a"+
		"\u079b\7<\2\2\u079b\u07a0\5\u00aaV\2\u079c\u079d\7\27\2\2\u079d\u079f"+
		"\5\u00aaV\2\u079e\u079c\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2"+
		"\2\u07a0\u07a1\3\2\2\2\u07a1\u07a5\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a4"+
		"\7d\2\2\u07a4\u07a6\5\u00aaV\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2\2\2"+
		"\u07a6\u07a8\3\2\2\2\u07a7\u0799\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07c6"+
		"\3\2\2\2\u07a9\u07aa\7\u00a7\2\2\u07aa\u07ab\7\25\2\2\u07ab\u07b0\5\u00aa"+
		"V\2\u07ac\u07ad\7\27\2\2\u07ad\u07af\5\u00aaV\2\u07ae\u07ac\3\2\2\2\u07af"+
		"\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\3\2"+
		"\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07c2\7\26\2\2\u07b4\u07b5\7\27\2\2\u07b5"+
		"\u07b6\7\25\2\2\u07b6\u07bb\5\u00aaV\2\u07b7\u07b8\7\27\2\2\u07b8\u07ba"+
		"\5\u00aaV\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2"+
		"\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07bf"+
		"\7\26\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07b4\3\2\2\2\u07c1\u07c4\3\2\2\2"+
		"\u07c2\u07c0\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2"+
		"\3\2\2\2\u07c5\u077b\3\2\2\2\u07c5\u07a9\3\2\2\2\u07c6\u00d1\3\2\2\2\u07c7"+
		"\u07d3\5\u00ecw\2\u07c8\u07c9\7\25\2\2\u07c9\u07ce\5\u00f2z\2\u07ca\u07cb"+
		"\7\27\2\2\u07cb\u07cd\5\u00f2z\2\u07cc\u07ca\3\2\2\2\u07cd\u07d0\3\2\2"+
		"\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07ce"+
		"\3\2\2\2\u07d1\u07d2\7\26\2\2\u07d2\u07d4\3\2\2\2\u07d3\u07c8\3\2\2\2"+
		"\u07d3\u07d4\3\2\2\2\u07d4\u00d3\3\2\2\2\u07d5\u07d7\t\5\2\2\u07d6\u07d5"+
		"\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07db\7\u00b6\2"+
		"\2\u07d9\u07db\7\31\2\2\u07da\u07d6\3\2\2\2\u07da\u07d9\3\2\2\2\u07db"+
		"\u00d5\3\2\2\2\u07dc\u07dd\t\20\2\2\u07dd\u00d7\3\2\2\2\u07de\u07df\t"+
		"\21\2\2\u07df\u00d9\3\2\2\2\u07e0\u07e1\7\u00b8\2\2\u07e1\u00db\3\2\2"+
		"\2\u07e2\u07e5\5\u00aaV\2\u07e3\u07e5\5\u0098M\2\u07e4\u07e2\3\2\2\2\u07e4"+
		"\u07e3\3\2\2\2\u07e5\u00dd\3\2\2\2\u07e6\u07e7\t\22\2\2\u07e7\u00df\3"+
		"\2\2\2\u07e8\u07e9\t\23\2\2\u07e9\u00e1\3\2\2\2\u07ea\u07ec\13\2\2\2\u07eb"+
		"\u07ea\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed\u07ee\3\2"+
		"\2\2\u07ee\u00e3\3\2\2\2\u07ef\u07f0\5\u0108\u0085\2\u07f0\u00e5\3\2\2"+
		"\2\u07f1\u07f2\5\u0108\u0085\2\u07f2\u00e7\3\2\2\2\u07f3\u07f4\5\u0108"+
		"\u0085\2\u07f4\u00e9\3\2\2\2\u07f5\u07f6\5\u0108\u0085\2\u07f6\u00eb\3"+
		"\2\2\2\u07f7\u07f8\5\u0108\u0085\2\u07f8\u00ed\3\2\2\2\u07f9\u07fa\5\u0108"+
		"\u0085\2\u07fa\u00ef\3\2\2\2\u07fb\u07fc\5\u0108\u0085\2\u07fc\u00f1\3"+
		"\2\2\2\u07fd\u07fe\5\u0108\u0085\2\u07fe\u00f3\3\2\2\2\u07ff\u0800\5\u0108"+
		"\u0085\2\u0800\u00f5\3\2\2\2\u0801\u0802\5\u0108\u0085\2\u0802\u00f7\3"+
		"\2\2\2\u0803\u0804\5\u0108\u0085\2\u0804\u00f9\3\2\2\2\u0805\u0806\5\u0108"+
		"\u0085\2\u0806\u00fb\3\2\2\2\u0807\u0808\5\u0108\u0085\2\u0808\u00fd\3"+
		"\2\2\2\u0809\u080a\5\u0108\u0085\2\u080a\u00ff\3\2\2\2\u080b\u080c\5\u0108"+
		"\u0085\2\u080c\u0101\3\2\2\2\u080d\u080e\5\u0108\u0085\2\u080e\u0103\3"+
		"\2\2\2\u080f\u0810\5\u0108\u0085\2\u0810\u0105\3\2\2\2\u0811\u0812\5\u0108"+
		"\u0085\2\u0812\u0107\3\2\2\2\u0813\u081a\7\u00b5\2\2\u0814\u081a\7\u00b8"+
		"\2\2\u0815\u0816\7\25\2\2\u0816\u0817\5\u0108\u0085\2\u0817\u0818\7\26"+
		"\2\2\u0818\u081a\3\2\2\2\u0819\u0813\3\2\2\2\u0819\u0814\3\2\2\2\u0819"+
		"\u0815\3\2\2\2\u081a\u0109\3\2\2\2\u00fb\u010c\u010e\u0119\u0120\u0125"+
		"\u012b\u0136\u0148\u014c\u0151\u0155\u015b\u0161\u0165\u0179\u017d\u0182"+
		"\u0187\u018d\u0193\u0197\u01a5\u01aa\u01b8\u01bd\u01c1\u01cf\u01d9\u01ea"+
		"\u01ef\u01f1\u01fc\u01fe\u0201\u020c\u020e\u0211\u0215\u0223\u022b\u022f"+
		"\u0234\u023c\u0242\u0247\u024b\u0253\u025a\u025e\u0265\u026f\u0279\u0283"+
		"\u028e\u029d\u02a0\u02a9\u02ad\u02b4\u02bf\u02ca\u02de\u02ea\u02f7\u0300"+
		"\u030b\u030d\u0316\u0322\u0324\u0331\u033b\u033d\u034a\u0354\u0356\u0362"+
		"\u0369\u0370\u0377\u037b\u0384\u0386\u038a\u0395\u03a0\u03a7\u03ad\u03b5"+
		"\u03b9\u03cd\u03d4\u03da\u03f0\u03fe\u0408\u0413\u041a\u0424\u0428\u042d"+
		"\u0437\u043f\u0444\u044b\u0453\u0457\u045c\u045f\u0469\u0470\u047a\u047e"+
		"\u0489\u0490\u04a0\u04a4\u04ab\u04b2\u04bc\u04bf\u04ce\u04d3\u04dc\u04de"+
		"\u04e5\u04ec\u04f2\u04f7\u0503\u0506\u050c\u050e\u0515\u051e\u0523\u052c"+
		"\u0537\u053e\u0544\u054e\u0551\u0557\u0559\u055d\u0564\u056d\u0571\u0573"+
		"\u0577\u0580\u0585\u0587\u0590\u059b\u05a2\u05a5\u05b4\u05b9\u05be\u05c0"+
		"\u05c7\u05ce\u05d3\u05d7\u05db\u05e9\u05ee\u05f1\u0606\u060c\u060e\u0612"+
		"\u061a\u061f\u0628\u062f\u0633\u063b\u0659\u0662\u0664\u066b\u0674\u0679"+
		"\u0685\u0689\u068d\u0691\u0698\u069b\u069d\u06a4\u06a7\u06ab\u06b6\u06c0"+
		"\u06cd\u06d5\u06d8\u06e0\u06e7\u06ef\u06f9\u0701\u0706\u0709\u070e\u0717"+
		"\u071c\u072a\u072d\u072f\u0734\u0738\u073b\u0742\u074a\u074e\u0752\u0755"+
		"\u075b\u075e\u0760\u0769\u076f\u0772\u0775\u0779\u077d\u0784\u078d\u0791"+
		"\u0793\u0797\u07a0\u07a5\u07a7\u07b0\u07bb\u07c2\u07c5\u07ce\u07d3\u07d6"+
		"\u07da\u07e4\u07ed\u0819";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}