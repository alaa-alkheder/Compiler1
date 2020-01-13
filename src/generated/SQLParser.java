// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, OPEN_BRACKETS = 5, CLOSE_BRACKETS = 6, OPEN_BLOCK = 7,
            CLOSE_BLOCK = 8, SCOL = 9, DOT = 10, OPEN_PAR = 11, CLOSE_PAR = 12, COMMA = 13, ASSIGN = 14,
            STAR = 15, PLUS = 16, MINUS = 17, STAREQ = 18, PLUSEQ = 19, MINUSEQ = 20, PLUSPLUS = 21,
            MINUSMINUS = 22, DIVEQ = 23, MODEQ = 24, TILDE = 25, PIPE2 = 26, DIV = 27, MOD = 28,
            LT2 = 29, GT2 = 30, AMP = 31, PIPE = 32, LT = 33, LT_EQ = 34, GT = 35, GT_EQ = 36, EQ = 37,
            NOT_EQ1 = 38, NOT_EQ2 = 39, K_FUNCTION = 40, K_RETURN = 41, K_ABORT = 42, K_ACTION = 43,
            K_ADD = 44, K_AFTER = 45, K_ALL = 46, K_ALTER = 47, K_ANALYZE = 48, K_AND = 49, K_AS = 50,
            K_ASC = 51, K_ATTACH = 52, K_AUTOINCREMENT = 53, K_BEFORE = 54, K_BEGIN = 55, K_BETWEEN = 56,
            K_BY = 57, K_CASCADE = 58, K_CASE = 59, K_CAST = 60, K_CHECK = 61, K_COLLATE = 62,
            K_COLUMN = 63, K_COMMIT = 64, K_CONFLICT = 65, K_CONSTRAINT = 66, K_CREATE = 67,
            K_CROSS = 68, K_CURRENT_DATE = 69, K_CURRENT_TIME = 70, K_CURRENT_TIMESTAMP = 71,
            K_DATABASE = 72, K_DEFAULT = 73, K_DEFERRABLE = 74, K_DEFERRED = 75, K_DELETE = 76,
            K_DESC = 77, K_DETACH = 78, K_DISTINCT = 79, K_DROP = 80, K_EACH = 81, K_ELSE = 82,
            K_END = 83, K_ENABLE = 84, K_ESCAPE = 85, K_EXCEPT = 86, K_EXCLUSIVE = 87, K_EXISTS = 88,
            K_EXPLAIN = 89, K_FAIL = 90, K_FOR = 91, K_FOREIGN = 92, K_FROM = 93, K_FULL = 94,
            K_GLOB = 95, K_GROUP = 96, K_HAVING = 97, K_IF = 98, K_WHILE = 99, K_DO = 100, K_IGNORE = 101,
            K_IMMEDIATE = 102, K_IN = 103, K_INDEX = 104, K_INDEXED = 105, K_INITIALLY = 106,
            K_INNER = 107, K_INSERT = 108, K_INSTEAD = 109, K_INTERSECT = 110, K_INTO = 111,
            K_IS = 112, K_ISNULL = 113, K_JOIN = 114, K_KEY = 115, K_LEFT = 116, K_LIKE = 117,
            K_LIMIT = 118, K_MATCH = 119, K_NATURAL = 120, K_NEXTVAL = 121, K_NO = 122, K_NOT = 123,
            K_NOTNULL = 124, K_NULL = 125, K_OF = 126, K_OFFSET = 127, K_ON = 128, K_ONLY = 129,
            K_OR = 130, K_ORDER = 131, K_OUTER = 132, K_PLAN = 133, K_PRAGMA = 134, K_PRIMARY = 135,
            K_QUERY = 136, K_RAISE = 137, K_RECURSIVE = 138, K_REFERENCES = 139, K_REGEXP = 140,
            K_REINDEX = 141, K_RELEASE = 142, K_RENAME = 143, K_REPLACE = 144, K_RESTRICT = 145,
            K_RIGHT = 146, K_ROLLBACK = 147, K_ROW = 148, K_SAVEPOINT = 149, K_SELECT = 150,
            K_SET = 151, K_TABLE = 152, K_TEMP = 153, K_TEMPORARY = 154, K_THEN = 155, K_TO = 156,
            K_TRANSACTION = 157, K_TRIGGER = 158, K_UNION = 159, K_UNIQUE = 160, K_UPDATE = 161,
            K_USING = 162, K_VACUUM = 163, K_VALUES = 164, K_VIEW = 165, K_VIRTUAL = 166, K_WHEN = 167,
            K_WHERE = 168, K_WITH = 169, K_WITHOUT = 170, K_VAR = 171, K_TRUE = 172, K_FALSE = 173,
            K_SWITCH = 174, K_BREAK = 175, K_PRINT = 176, K_CONTINUE = 177, IDENTIFIER = 178,
            NUMERIC_LITERAL = 179, BIND_PARAMETER = 180, STRING_LITERAL = 181, BLOB_LITERAL = 182,
            MULTILINE_COMMENT = 183, SPACES = 184, UNEXPECTED_CHAR = 185;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3,
            RULE_stat_forloop = 4, RULE_json_st = 5, RULE_json_atmt = 6, RULE_higer_order_function_stmt_head = 7,
            RULE_higer_order_function_stmt = 8, RULE_x = 9, RULE_arr_stmt = 10, RULE_var_stmt = 11,
            RULE_var_body = 12, RULE_print_stmt = 13, RULE_call_array = 14, RULE_call_json = 15,
            RULE_print_body = 16, RULE_function_head = 17, RULE_function_body = 18,
            RULE_function_stmt = 19, RULE_function_call_stmt = 20, RULE_params_stmt = 21,
            RULE_arguments_body_defult_paremeter = 22, RULE_arguments_body = 23, RULE_arguments_stmt = 24,
            RULE_loop_Bady = 25, RULE_increment = 26, RULE_for_stmt = 27, RULE_do_while_stmt = 28,
            RULE_while_stmt = 29, RULE_condition_block = 30, RULE_if_body = 31, RULE_if_else_if = 32,
            RULE_if_else = 33, RULE_if_stmt = 34, RULE_if_stmt_short = 35, RULE_if_stmt_short_head = 36,
            RULE_if_stmt_short_body = 37, RULE_switch_stmt = 38, RULE_case_stmt = 39,
            RULE_return_stmt = 40, RULE_array1 = 41, RULE_one_line_instruction = 42,
            RULE_math_op0 = 43, RULE_identifier = 44, RULE_math_expr_Add_one = 45,
            RULE_math_expr_Add_one_increment = 46, RULE_math_expr_Add_one_dencrement = 47,
            RULE_alter_table_stmt = 48, RULE_alter_table_add_constraint = 49, RULE_alter_table_add = 50,
            RULE_create_table_stmt = 51, RULE_delete_stmt = 52, RULE_drop_table_stmt = 53,
            RULE_factored_select_stmt = 54, RULE_insert_stmt = 55, RULE_select_stmt = 56,
            RULE_select_or_values = 57, RULE_call_expr = 58, RULE_update_stmt = 59,
            RULE_column_def = 60, RULE_type_name = 61, RULE_type_name_value = 62,
            RULE_column_constraint = 63, RULE_column_constraint_primary_key = 64,
            RULE_column_constraint_foreign_key = 65, RULE_column_constraint_not_null = 66,
            RULE_column_constraint_null = 67, RULE_column_default = 68, RULE_column_default_value = 69,
            RULE_array_json = 70, RULE_expr_condition = 71, RULE_math_expr_EQ = 72,
            RULE_math_expr = 73, RULE_math_expr_logic = 74, RULE_expr = 75, RULE_foreign_key_clause_value = 76,
            RULE_foreign_key_clause = 77, RULE_fk_target_column_name = 78, RULE_indexed_column = 79,
            RULE_table_constraint = 80, RULE_table_constraint_primary_key = 81, RULE_table_constraint_foreign_key = 82,
            RULE_table_constraint_unique = 83, RULE_table_constraint_key = 84, RULE_fk_origin_column_name = 85,
            RULE_qualified_table_name = 86, RULE_ordering_term = 87, RULE_pragma_value = 88,
            RULE_common_table_expression = 89, RULE_result_column = 90, RULE_table_or_subquery = 91,
            RULE_join_clause = 92, RULE_join_operator = 93, RULE_join_constraint = 94,
            RULE_select_core = 95, RULE_group_expr = 96, RULE_values_selectCore = 97,
            RULE_cte_table_name = 98, RULE_signed_number = 99, RULE_literal_value = 100,
            RULE_unary_operator = 101, RULE_error_message = 102, RULE_module_argument = 103,
            RULE_column_alias = 104, RULE_keyword = 105, RULE_name = 106, RULE_function_name = 107,
            RULE_database_name = 108, RULE_source_table_name = 109, RULE_table_name = 110,
            RULE_table_or_index_name = 111, RULE_new_table_name = 112, RULE_column_name = 113,
            RULE_collation_name = 114, RULE_foreign_table = 115, RULE_index_name = 116,
            RULE_trigger_name = 117, RULE_view_name = 118, RULE_module_name = 119,
            RULE_pragma_name = 120, RULE_savepoint_name = 121, RULE_table_alias = 122,
            RULE_transaction_name = 123, RULE_any_name = 124;
	private static String[] makeRuleNames() {
		return new String[] {
                "parse", "error", "sql_stmt_list", "sql_stmt", "stat_forloop", "json_st",
                "json_atmt", "higer_order_function_stmt_head", "higer_order_function_stmt",
                "x", "arr_stmt", "var_stmt", "var_body", "print_stmt", "call_array",
                "call_json", "print_body", "function_head", "function_body", "function_stmt",
                "function_call_stmt", "params_stmt", "arguments_body_defult_paremeter",
                "arguments_body", "arguments_stmt", "loop_Bady", "increment", "for_stmt",
                "do_while_stmt", "while_stmt", "condition_block", "if_body", "if_else_if",
                "if_else", "if_stmt", "if_stmt_short", "if_stmt_short_head", "if_stmt_short_body",
                "switch_stmt", "case_stmt", "return_stmt", "array1", "one_line_instruction",
                "math_op0", "identifier", "math_expr_Add_one", "math_expr_Add_one_increment",
                "math_expr_Add_one_dencrement", "alter_table_stmt", "alter_table_add_constraint",
                "alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt",
                "factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values",
                "call_expr", "update_stmt", "column_def", "type_name", "type_name_value",
                "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key",
			"column_constraint_not_null", "column_constraint_null", "column_default",
                "column_default_value", "array_json", "expr_condition", "math_expr_EQ",
                "math_expr", "math_expr_logic", "expr", "foreign_key_clause_value", "foreign_key_clause",
                "fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key",
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key",
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value",
			"common_table_expression", "result_column", "table_or_subquery", "join_clause",
                "join_operator", "join_constraint", "select_core", "group_expr", "values_selectCore",
                "cte_table_name", "signed_number", "literal_value", "unary_operator",
                "error_message", "module_argument", "column_alias", "keyword", "name",
                "function_name", "database_name", "source_table_name", "table_name",
                "table_or_index_name", "new_table_name", "column_name", "collation_name",
                "foreign_table", "index_name", "trigger_name", "view_name", "module_name",
                "pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
                null, "':'", "'?'", "'[]'", "'::'", "'['", "']'", "'{'", "'}'", "';'",
                "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'*='", "'+='",
                "'-='", "'++'", "'--'", "'/='", "'%='", "'~'", "'||'", "'/'", "'%'",
			"'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='",
			"'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
                null, null, null, null, null, "OPEN_BRACKETS", "CLOSE_BRACKETS", "OPEN_BLOCK",
                "CLOSE_BLOCK", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN",
                "STAR", "PLUS", "MINUS", "STAREQ", "PLUSEQ", "MINUSEQ", "PLUSPLUS", "MINUSMINUS",
                "DIVEQ", "MODEQ", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP",
                "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_FUNCTION",
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
                "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
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
                setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ALTER))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CREATE - 67)) | (1L << (K_DELETE - 67)) | (1L << (K_DROP - 67)) | (1L << (K_INSERT - 67)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_SELECT - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_VALUES - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (STRING_LITERAL - 150)) | (1L << (UNEXPECTED_CHAR - 150)))) != 0)) {
				{
                    setState(252);
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
                        setState(250);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
                        setState(251);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
                    setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(257);
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
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(259);
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
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
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
                setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
                    setState(262);
				match(SCOL);
				}
				}
                setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(268);
			sql_stmt();
                setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
                            setState(269);
						match(SCOL);
						}
						}
                        setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
                        setState(274);
					sql_stmt();
					}
					}
				}
                setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
                setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(280);
					match(SCOL);
					}
					}
				}
                setState(285);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
                    setState(286);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
                    setState(287);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
                    setState(288);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
                    setState(289);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
                    setState(290);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
                    setState(291);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
                    setState(292);
				update_stmt();
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
                    setState(293);
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

	public static class Stat_forloopContext extends ParserRuleContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}

        public If_stmtContext if_stmt() {
            return getRuleContext(If_stmtContext.class, 0);
        }
		public Function_call_stmtContext function_call_stmt() {
			return getRuleContext(Function_call_stmtContext.class,0);
		}

        public TerminalNode SCOL() {
            return getToken(SQLParser.SCOL, 0);
        }

        public Var_stmtContext var_stmt() {
            return getRuleContext(Var_stmtContext.class, 0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public One_line_instructionContext one_line_instruction() {
			return getRuleContext(One_line_instructionContext.class,0);
		}
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}

        public TerminalNode K_BREAK() {
            return getToken(SQLParser.K_BREAK, 0);
        }

        public Return_stmtContext return_stmt() {
            return getRuleContext(Return_stmtContext.class, 0);
        }
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStat_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStat_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitStat_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_forloopContext stat_forloop() throws RecognitionException {
		Stat_forloopContext _localctx = new Stat_forloopContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_stat_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(322);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
			case 1:
				{
                    setState(296);
                    print_stmt();
				}
				break;
			case 2:
				{
                    setState(297);
                    if_stmt();
				}
				break;
			case 3:
				{
                    setState(298);
                    function_call_stmt();
                    setState(299);
                    match(SCOL);
				}
				break;
			case 4:
				{
                    setState(301);
                    var_stmt();
				}
				break;
			case 5:
				{
                    setState(302);
                    while_stmt();
				}
				break;
			case 6:
				{
                    setState(303);
                    one_line_instruction();
				}
				break;
			case 7:
				{
                    setState(304);
                    match(K_CONTINUE);
                    setState(305);
                    match(SCOL);
				}
				break;
			case 8:
				{
                    setState(306);
                    do_while_stmt();
				}
				break;
			case 9:
				{
                    setState(307);
                    switch_stmt();
				}
				break;
			case 10:
				{
                    setState(308);
                    for_stmt();
				}
				break;
			case 11:
				{
                    setState(309);
                    match(K_BREAK);
                    setState(310);
                    match(SCOL);
				}
				break;
			case 12:
				{
                    setState(311);
                    return_stmt();
                }
            break;
                    case 13: {
                        setState(312);
				match(OPEN_BLOCK);
                        setState(313);
				match(CLOSE_BLOCK);
				}
				break;
                    case 14:
				{
                    setState(314);
				match(OPEN_BLOCK);
                    setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
					{
					{
                        setState(315);
					stat_forloop();
					}
					}
                        setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(321);
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

	public static class Json_stContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Json_atmtContext json_atmt() {
			return getRuleContext(Json_atmtContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(SQLParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(SQLParser.CLOSE_BRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_stContext json_st() throws RecognitionException {
		Json_stContext _localctx = new Json_stContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_json_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
                setState(324);
			any_name();
                setState(325);
			match(T__0);
                setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
                    setState(326);
				match(NUMERIC_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
                    setState(327);
				match(IDENTIFIER);
				}
				break;
			case OPEN_BLOCK:
				{
                    setState(328);
				json_atmt();
				}
				break;
			case OPEN_BRACKETS:
				{
				{
                    setState(329);
				match(OPEN_BRACKETS);
                    setState(330);
				any_name();
                    setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(331);
					match(COMMA);
                        setState(332);
					any_name();
					}
					}
                    setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(338);
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
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public List<Json_stContext> json_st() {
			return getRuleContexts(Json_stContext.class);
		}
		public Json_stContext json_st(int i) {
			return getRuleContext(Json_stContext.class,i);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_atmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_atmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_atmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_atmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_atmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_atmtContext json_atmt() throws RecognitionException {
		Json_atmtContext _localctx = new Json_atmtContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_json_atmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(342);
			match(OPEN_BLOCK);
                setState(343);
			json_st();
                setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(344);
				match(COMMA);
                    setState(345);
				json_st();
				}
				}
                setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(351);
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

    public static class Higer_order_function_stmt_headContext extends ParserRuleContext {
        public List<Any_nameContext> any_name() {
            return getRuleContexts(Any_nameContext.class);
        }

        public Any_nameContext any_name(int i) {
            return getRuleContext(Any_nameContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SQLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SQLParser.COMMA, i);
        }

        public Higer_order_function_stmt_headContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_higer_order_function_stmt_head;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterHiger_order_function_stmt_head(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitHiger_order_function_stmt_head(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitHiger_order_function_stmt_head(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Higer_order_function_stmt_headContext higer_order_function_stmt_head() throws RecognitionException {
        Higer_order_function_stmt_headContext _localctx = new Higer_order_function_stmt_headContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_higer_order_function_stmt_head);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(353);
                any_name();
                setState(358);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(354);
                                match(COMMA);
                                setState(355);
                                any_name();
                            }
                        }
                    }
                    setState(360);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}

        public Higer_order_function_stmt_headContext higer_order_function_stmt_head() {
            return getRuleContext(Higer_order_function_stmt_headContext.class, 0);
        }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHiger_order_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHiger_order_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHiger_order_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higer_order_function_stmtContext higer_order_function_stmt() throws RecognitionException {
		Higer_order_function_stmtContext _localctx = new Higer_order_function_stmtContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_higer_order_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(361);
			any_name();
                setState(362);
			match(OPEN_PAR);
                setState(363);
                higer_order_function_stmt_head();
                setState(364);
                match(COMMA);
                setState(365);
			match(K_FUNCTION);
                setState(366);
			match(OPEN_PAR);
                setState(367);
			any_name();
                setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(368);
				match(COMMA);
                    setState(369);
				any_name();
				}
				}
                setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(375);
			match(CLOSE_PAR);
                setState(376);
			function_body();
                setState(377);
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

    public static class XContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}

        public List<TerminalNode> OPEN_BRACKETS() {
            return getTokens(SQLParser.OPEN_BRACKETS);
        }

        public TerminalNode OPEN_BRACKETS(int i) {
            return getToken(SQLParser.OPEN_BRACKETS, i);
        }

        public List<TerminalNode> CLOSE_BRACKETS() {
            return getTokens(SQLParser.CLOSE_BRACKETS);
        }

        public TerminalNode CLOSE_BRACKETS(int i) {
            return getToken(SQLParser.CLOSE_BRACKETS, i);
        }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}

        public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_x;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

    public final XContext x() throws RecognitionException {
        XContext _localctx = new XContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(379);
			any_name();
                setState(380);
			match(OPEN_BRACKETS);
                setState(381);
			match(CLOSE_BRACKETS);
                setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
                    setState(382);
				match(ASSIGN);
                    setState(394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
                    case OPEN_BRACKETS:
					{
					{
                        setState(383);
                        match(OPEN_BRACKETS);
                        setState(384);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
                        setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
                            setState(385);
						match(COMMA);
                            setState(386);
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
                        setState(391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
                        setState(392);
                        match(CLOSE_BRACKETS);
					}
					}
					break;
				case K_SELECT:
				case K_VALUES:
					{
                        setState(393);
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

    public static class Arr_stmtContext extends ParserRuleContext {
        public Array1Context array1() {
            return getRuleContext(Array1Context.class, 0);
        }

        public Arr_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arr_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArr_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArr_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitArr_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Arr_stmtContext arr_stmt() throws RecognitionException {
        Arr_stmtContext _localctx = new Arr_stmtContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_arr_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(398);
                array1();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public static class Var_stmtContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }

        public TerminalNode SCOL() {
            return getToken(SQLParser.SCOL, 0);
        }

        public List<XContext> x() {
            return getRuleContexts(XContext.class);
        }

        public XContext x(int i) {
            return getRuleContext(XContext.class, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}

        public List<Var_bodyContext> var_body() {
            return getRuleContexts(Var_bodyContext.class);
        }

        public Var_bodyContext var_body(int i) {
            return getRuleContext(Var_bodyContext.class, i);
		}
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_var_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(400);
			match(K_VAR);
                setState(407);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
			case 1:
				{
				{
                    setState(401);
				any_name();
                    setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
                        setState(402);
					match(ASSIGN);
                        setState(403);
                        var_body();
                    }
                }

                }
                }
            break;
                    case 2: {
                        setState(406);
                        x();
                    }
                    break;
                }
                setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(409);
				match(COMMA);
                    setState(416);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
				case 1:
					{
					{
                        setState(410);
					any_name();
                        setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
                            setState(411);
						match(ASSIGN);
                            setState(412);
                            var_body();
                        }
                    }

                    }
                    }
                break;
                        case 2: {
                            setState(415);
                            x();
					}
					break;
				}
				}
				}
                setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(423);
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

    public static class Var_bodyContext extends ParserRuleContext {
        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public Json_atmtContext json_atmt() {
            return getRuleContext(Json_atmtContext.class, 0);
        }

        public If_stmt_shortContext if_stmt_short() {
            return getRuleContext(If_stmt_shortContext.class, 0);
        }

        public Higer_order_function_stmtContext higer_order_function_stmt() {
            return getRuleContext(Higer_order_function_stmtContext.class, 0);
        }

        public Select_coreContext select_core() {
            return getRuleContext(Select_coreContext.class, 0);
        }

        public Function_call_stmtContext function_call_stmt() {
            return getRuleContext(Function_call_stmtContext.class, 0);
        }

        public Var_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_var_body;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterVar_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitVar_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitVar_body(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Var_bodyContext var_body() throws RecognitionException {
        Var_bodyContext _localctx = new Var_bodyContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_var_body);
		try {
            setState(432);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(425);
                    math_expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(426);
                    expr_condition(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(427);
                    json_atmt();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(428);
                    if_stmt_short();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(429);
                    higer_order_function_stmt();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(430);
                    select_core();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(431);
                    function_call_stmt();
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public List<Print_bodyContext> print_body() {
            return getRuleContexts(Print_bodyContext.class);
        }

        public Print_bodyContext print_body(int i) {
            return getRuleContext(Print_bodyContext.class, i);
        }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(434);
			match(K_PRINT);
                setState(435);
			match(OPEN_PAR);
                setState(436);
                print_body();
                setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
                while (_la == PLUS) {
				{
				{
                    setState(437);
                    match(PLUS);
                    setState(438);
                    print_body();
                }
                }
                    setState(443);
				_errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(444);
                match(CLOSE_PAR);
                setState(445);
                match(SCOL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Call_arrayContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public TerminalNode OPEN_BRACKETS() {
            return getToken(SQLParser.OPEN_BRACKETS, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public TerminalNode CLOSE_BRACKETS() {
            return getToken(SQLParser.CLOSE_BRACKETS, 0);
        }

        public Call_arrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call_array;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterCall_array(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitCall_array(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitCall_array(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Call_arrayContext call_array() throws RecognitionException {
        Call_arrayContext _localctx = new Call_arrayContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_call_array);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(447);
                any_name();
                setState(448);
                match(OPEN_BRACKETS);
                setState(449);
                math_expr(0);
                setState(450);
                match(CLOSE_BRACKETS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Call_jsonContext extends ParserRuleContext {
        public List<Any_nameContext> any_name() {
            return getRuleContexts(Any_nameContext.class);
        }

        public Any_nameContext any_name(int i) {
            return getRuleContext(Any_nameContext.class, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(SQLParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(SQLParser.DOT, i);
        }

        public Call_jsonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call_json;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterCall_json(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitCall_json(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitCall_json(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Call_jsonContext call_json() throws RecognitionException {
        Call_jsonContext _localctx = new Call_jsonContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_call_json);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                any_name();
                setState(457);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
					{
					{
                        setState(453);
                        match(DOT);
                        setState(454);
                        any_name();
                    }
                    }
                    }
                    setState(459);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Print_bodyContext extends ParserRuleContext {
        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public If_stmt_shortContext if_stmt_short() {
            return getRuleContext(If_stmt_shortContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public Call_jsonContext call_json() {
            return getRuleContext(Call_jsonContext.class, 0);
        }

        public Call_arrayContext call_array() {
            return getRuleContext(Call_arrayContext.class, 0);
        }

        public Print_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterPrint_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitPrint_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitPrint_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Print_bodyContext print_body() throws RecognitionException {
        Print_bodyContext _localctx = new Print_bodyContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_print_body);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(465);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                    case 1: {
                        setState(460);
                        math_expr(0);
                    }
                    break;
                    case 2: {
                        setState(461);
                        if_stmt_short();
                    }
                    break;
                    case 3: {
                        setState(462);
                        expr_condition(0);
                    }
                    break;
                    case 4: {
                        setState(463);
                        call_json();
				}
                    break;
                    case 5: {
                        setState(464);
                        call_array();
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

	public static class Function_headContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Arguments_stmtContext arguments_stmt() {
			return getRuleContext(Arguments_stmtContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_head(this);
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
                setState(467);
			match(OPEN_PAR);
                setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
                    setState(468);
				arguments_stmt();
				}
			}

                setState(471);
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
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }
		public List<Function_stmtContext> function_stmt() {
			return getRuleContexts(Function_stmtContext.class);
		}
		public Function_stmtContext function_stmt(int i) {
			return getRuleContext(Function_stmtContext.class,i);
		}

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_body(this);
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
                setState(473);
			match(OPEN_BLOCK);
                setState(475);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
			case 1:
				{
                    setState(474);
				function_stmt();
				}
				break;
			}
                setState(480);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(477);
                        stat_forloop();
					}
					}
				}
                setState(482);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
			}
                setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
                    setState(483);
				function_stmt();
				}
			}

                setState(486);
			return_stmt();
                setState(487);
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
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }
		public Arguments_stmtContext arguments_stmt() {
			return getRuleContext(Arguments_stmtContext.class,0);
		}

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_stmt(this);
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
                setState(489);
			any_name();
                setState(490);
			match(OPEN_PAR);
                setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
                    setState(491);
				arguments_stmt();
				}
			}

                setState(494);
			match(CLOSE_PAR);
                setState(495);
			match(OPEN_BLOCK);
                setState(499);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(496);
                        stat_forloop();
					}
					}
				}
                setState(501);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
			}
                setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
                if (_la == K_RETURN) {
				{
                    setState(502);
				return_stmt();
				}
			}

                setState(505);
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
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public List<Params_stmtContext> params_stmt() {
            return getRuleContexts(Params_stmtContext.class);
        }

        public Params_stmtContext params_stmt(int i) {
            return getRuleContext(Params_stmtContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SQLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SQLParser.COMMA, i);
		}
		public Function_call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_call_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_call_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_call_stmt(this);
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
                setState(507);
			any_name();
                setState(508);
			match(OPEN_PAR);
                setState(517);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (K_NULL - 125)) | (1L << (K_TRUE - 125)) | (1L << (K_FALSE - 125)) | (1L << (IDENTIFIER - 125)) | (1L << (NUMERIC_LITERAL - 125)) | (1L << (STRING_LITERAL - 125)))) != 0)) {
                    {
                        setState(509);
                        params_stmt();
                        setState(514);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(510);
                                    match(COMMA);
                                    setState(511);
                                    params_stmt();
                                }
                            }
                            setState(516);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
				}
			}

                setState(519);
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

	public static class Params_stmtContext extends ParserRuleContext {
        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public TerminalNode K_NULL() {
            return getToken(SQLParser.K_NULL, 0);
        }
		public Params_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParams_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParams_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParams_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_stmtContext params_stmt() throws RecognitionException {
		Params_stmtContext _localctx = new Params_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params_stmt);
		try {
            setState(524);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(521);
                    math_expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(522);
                    expr_condition(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(523);
                    match(K_NULL);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Arguments_body_defult_paremeterContext extends ParserRuleContext {
        public TerminalNode K_VAR() {
            return getToken(SQLParser.K_VAR, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public TerminalNode K_NULL() {
            return getToken(SQLParser.K_NULL, 0);
        }

        public Arguments_body_defult_paremeterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments_body_defult_paremeter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArguments_body_defult_paremeter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArguments_body_defult_paremeter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitArguments_body_defult_paremeter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Arguments_body_defult_paremeterContext arguments_body_defult_paremeter() throws RecognitionException {
        Arguments_body_defult_paremeterContext _localctx = new Arguments_body_defult_paremeterContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_arguments_body_defult_paremeter);
        try {
            setState(536);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(526);
                    match(K_VAR);
                    setState(527);
                    any_name();
                    setState(528);
                    match(ASSIGN);
                    setState(529);
                    math_expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
				{
                    setState(531);
                    match(K_VAR);
                    setState(532);
				any_name();
                    setState(533);
				match(ASSIGN);
                    setState(534);
                    match(K_NULL);
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

    public static class Arguments_bodyContext extends ParserRuleContext {
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}

        public List<Arguments_body_defult_paremeterContext> arguments_body_defult_paremeter() {
            return getRuleContexts(Arguments_body_defult_paremeterContext.class);
        }

        public Arguments_body_defult_paremeterContext arguments_body_defult_paremeter(int i) {
            return getRuleContext(Arguments_body_defult_paremeterContext.class, i);
        }

        public Arguments_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_arguments_body;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArguments_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArguments_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitArguments_body(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Arguments_bodyContext arguments_body() throws RecognitionException {
        Arguments_bodyContext _localctx = new Arguments_bodyContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_arguments_body);
		int _la;
		try {
			int _alt;
            setState(574);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(538);
                    match(K_VAR);
                    setState(539);
                    any_name();
                    setState(545);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(540);
                                match(COMMA);
                                setState(541);
                                match(K_VAR);
                                setState(542);
                                any_name();
                            }
                        }
                        setState(547);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
            break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        setState(548);
				match(K_VAR);
                        setState(549);
				any_name();
                    }
                    setState(556);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(551);
						match(COMMA);
                            setState(552);
						match(K_VAR);
                            setState(553);
						any_name();
						}
						}
					}
                    setState(558);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
				}
                    setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(559);
					match(COMMA);
                        setState(560);
                        arguments_body_defult_paremeter();
					}
					}
                    setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
                case 3:
                    enterOuterAlt(_localctx, 3);
				{
                    setState(566);
                    arguments_body_defult_paremeter();
                    setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(567);
					match(COMMA);
                        setState(568);
                        arguments_body_defult_paremeter();
                    }
                    }
                    setState(573);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Arguments_stmtContext extends ParserRuleContext {
        public Arguments_bodyContext arguments_body() {
            return getRuleContext(Arguments_bodyContext.class, 0);
        }

        public Arguments_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArguments_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArguments_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitArguments_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Arguments_stmtContext arguments_stmt() throws RecognitionException {
        Arguments_stmtContext _localctx = new Arguments_stmtContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_arguments_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(576);
                arguments_body();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Loop_BadyContext extends ParserRuleContext {
        public TerminalNode OPEN_BLOCK() {
            return getToken(SQLParser.OPEN_BLOCK, 0);
        }

        public TerminalNode CLOSE_BLOCK() {
            return getToken(SQLParser.CLOSE_BLOCK, 0);
        }

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
        }

        public Loop_BadyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loop_Bady;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterLoop_Bady(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitLoop_Bady(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitLoop_Bady(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Loop_BadyContext loop_Bady() throws RecognitionException {
        Loop_BadyContext _localctx = new Loop_BadyContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_loop_Bady);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(587);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                    case 1: {
                        setState(578);
                        match(OPEN_BLOCK);
                        setState(582);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
                            {
                                {
                                    setState(579);
                                    stat_forloop();
                                }
                            }
                            setState(584);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(585);
                        match(CLOSE_BLOCK);
                    }
                    break;
                    case 2: {
                        setState(586);
                        stat_forloop();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IncrementContext extends ParserRuleContext {
        public Math_expr_EQContext math_expr_EQ() {
            return getRuleContext(Math_expr_EQContext.class, 0);
        }

        public IncrementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_increment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIncrement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIncrement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIncrement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IncrementContext increment() throws RecognitionException {
        IncrementContext _localctx = new IncrementContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_increment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(589);
                math_expr_EQ();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public Loop_BadyContext loop_Bady() {
            return getRuleContext(Loop_BadyContext.class, 0);
        }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}

        public TerminalNode K_VAR() {
            return getToken(SQLParser.K_VAR, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public Math_expr_EQContext math_expr_EQ() {
            return getRuleContext(Math_expr_EQContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public IncrementContext increment() {
            return getRuleContext(IncrementContext.class, 0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(591);
			match(K_FOR);
                setState(592);
			match(OPEN_PAR);
                {
                    setState(599);
			_errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case K_VAR:
				{
                    setState(593);
                    match(K_VAR);
                    setState(594);
                    any_name();
                    setState(595);
                    match(ASSIGN);
                    setState(596);
                    math_expr(0);
				}
				break;
                        case OPEN_PAR:
                        case PLUSPLUS:
                        case MINUSMINUS:
                        case IDENTIFIER:
                        case STRING_LITERAL:
				{
                    setState(598);
                    math_expr_EQ();
				}
				break;
                        case SCOL:
				break;
                        default:
				break;
			}
                    setState(601);
			match(SCOL);
                    setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_TRUE - 172)) | (1L << (K_FALSE - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)))) != 0)) {
				{
                    setState(602);
                    expr_condition(0);
				}
			}

                    setState(605);
			match(SCOL);
                    setState(607);
			_errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS))) != 0) || _la == IDENTIFIER || _la == STRING_LITERAL) {
				{
                    setState(606);
                    increment();
				}
                    }

                }
                setState(609);
			match(CLOSE_PAR);
                setState(610);
                loop_Bady();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }

        public TerminalNode OPEN_BLOCK() {
            return getToken(SQLParser.OPEN_BLOCK, 0);
        }

        public TerminalNode CLOSE_BLOCK() {
            return getToken(SQLParser.CLOSE_BLOCK, 0);
        }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
		}
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_do_while_stmt);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(612);
			match(K_DO);
                setState(613);
                match(OPEN_BLOCK);
                setState(617);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
                    {
                        {
                            setState(614);
                            stat_forloop();
                        }
                    }
                    setState(619);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(620);
                match(CLOSE_BLOCK);
                setState(621);
			match(K_WHILE);
			{
                setState(622);
                expr_condition(0);
			}
                setState(623);
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
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }

        public Loop_BadyContext loop_Bady() {
            return getRuleContext(Loop_BadyContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(625);
			match(K_WHILE);
                {
                    setState(626);
                    expr_condition(0);
                }
                setState(627);
                loop_Bady();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(629);
			match(OPEN_PAR);
			{
                setState(630);
                expr_condition(0);
			}
                setState(631);
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

    public static class If_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
        }

        public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_if_body;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

    public final If_bodyContext if_body() throws RecognitionException {
        If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_if_body);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(642);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
			case 1:
				{
                    setState(633);
				match(OPEN_BLOCK);
                    setState(637);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
                        {
                            {
                                setState(634);
                                stat_forloop();
                            }
                        }
                        setState(639);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(640);
				match(CLOSE_BLOCK);
				}
				break;
                    case 2:
				{
                    setState(641);
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

    public static class If_else_ifContext extends ParserRuleContext {
        public TerminalNode K_ELSE() {
            return getToken(SQLParser.K_ELSE, 0);
        }

        public If_stmtContext if_stmt() {
            return getRuleContext(If_stmtContext.class, 0);
        }

        public If_else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_if_else_if;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_else_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_else_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_else_if(this);
			else return visitor.visitChildren(this);
		}
	}

    public final If_else_ifContext if_else_if() throws RecognitionException {
        If_else_ifContext _localctx = new If_else_ifContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_if_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(644);
                match(K_ELSE);
                setState(645);
                if_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class If_elseContext extends ParserRuleContext {
        public TerminalNode K_ELSE() {
            return getToken(SQLParser.K_ELSE, 0);
        }

        public If_bodyContext if_body() {
            return getRuleContext(If_bodyContext.class, 0);
        }

        public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_if_else;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

    public final If_elseContext if_else() throws RecognitionException {
        If_elseContext _localctx = new If_elseContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(647);
                match(K_ELSE);
                setState(648);
                if_body();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class If_stmtContext extends ParserRuleContext {
        public TerminalNode K_IF() {
            return getToken(SQLParser.K_IF, 0);
        }

        public Condition_blockContext condition_block() {
            return getRuleContext(Condition_blockContext.class, 0);
        }

        public If_bodyContext if_body() {
            return getRuleContext(If_bodyContext.class, 0);
        }

        public If_elseContext if_else() {
            return getRuleContext(If_elseContext.class, 0);
        }

        public If_else_ifContext if_else_if() {
            return getRuleContext(If_else_ifContext.class, 0);
        }

        public If_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_stmtContext if_stmt() throws RecognitionException {
        If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_if_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(650);
                match(K_IF);
                setState(651);
                condition_block();
                setState(652);
                if_body();
                setState(655);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                    case 1: {
                        setState(653);
                        if_else();
                    }
                    break;
                    case 2: {
                        setState(654);
                        if_else_if();
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
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public If_stmt_shortContext if_stmt_short() {
            return getRuleContext(If_stmt_shortContext.class, 0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public List<If_stmt_short_bodyContext> if_stmt_short_body() {
            return getRuleContexts(If_stmt_short_bodyContext.class);
        }

        public If_stmt_short_bodyContext if_stmt_short_body(int i) {
            return getRuleContext(If_stmt_short_bodyContext.class, i);
		}
		public If_stmt_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stmt_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stmt_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stmt_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_shortContext if_stmt_short() throws RecognitionException {
		If_stmt_shortContext _localctx = new If_stmt_shortContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_if_stmt_short);
		try {
            setState(668);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(657);
                    match(OPEN_PAR);
                    setState(658);
                    if_stmt_short();
                    setState(659);
                    match(CLOSE_PAR);
				}
				break;
			case 2:
                enterOuterAlt(_localctx, 2);
				{
                    setState(661);
                    expr_condition(0);
                    setState(662);
                    match(T__1);
                    setState(663);
                    if_stmt_short_body();
                    setState(666);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 51, _ctx)) {
                        case 1: {
                            setState(664);
                            match(T__0);
                            setState(665);
                            if_stmt_short_body();
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

    public static class If_stmt_short_headContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public If_stmt_short_headContext if_stmt_short_head() {
            return getRuleContext(If_stmt_short_headContext.class, 0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public If_stmt_short_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_if_stmt_short_head;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_stmt_short_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_stmt_short_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_stmt_short_head(this);
			else return visitor.visitChildren(this);
		}
	}

    public final If_stmt_short_headContext if_stmt_short_head() throws RecognitionException {
        If_stmt_short_headContext _localctx = new If_stmt_short_headContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_if_stmt_short_head);
		try {
            setState(675);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(670);
                    match(OPEN_PAR);
                    setState(671);
                    if_stmt_short_head();
                    setState(672);
                    match(CLOSE_PAR);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
				{
                    setState(674);
                    expr_condition(0);
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

    public static class If_stmt_short_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public If_stmt_short_bodyContext if_stmt_short_body() {
            return getRuleContext(If_stmt_short_bodyContext.class, 0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public If_stmt_shortContext if_stmt_short() {
            return getRuleContext(If_stmt_shortContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
        }

        public If_stmt_short_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_if_stmt_short_body;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterIf_stmt_short_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitIf_stmt_short_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitIf_stmt_short_body(this);
			else return visitor.visitChildren(this);
		}
	}

    public final If_stmt_short_bodyContext if_stmt_short_body() throws RecognitionException {
        If_stmt_short_bodyContext _localctx = new If_stmt_short_bodyContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_if_stmt_short_body);
		try {
            setState(684);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(677);
                    match(OPEN_PAR);
                    setState(678);
                    if_stmt_short_body();
                    setState(679);
                    match(CLOSE_PAR);
				}
				break;
			case 2:
                enterOuterAlt(_localctx, 2);
				{
                    setState(681);
                    math_expr(0);
				}
				break;
			case 3:
                enterOuterAlt(_localctx, 3);
				{
                    setState(682);
                    if_stmt_short();
				}
				break;
			case 4:
                enterOuterAlt(_localctx, 4);
				{
                    setState(683);
                    expr_condition(0);
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(SQLParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SQLParser.CLOSE_BLOCK, 0); }

        public Math_expr_EQContext math_expr_EQ() {
            return getRuleContext(Math_expr_EQContext.class, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public TerminalNode K_DEFAULT() {
            return getToken(SQLParser.K_DEFAULT, 0);
        }

        public List<Case_stmtContext> case_stmt() {
            return getRuleContexts(Case_stmtContext.class);
        }

        public Case_stmtContext case_stmt(int i) {
            return getRuleContext(Case_stmtContext.class, i);
        }

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(686);
			match(K_SWITCH);
                setState(687);
			match(OPEN_PAR);
                setState(690);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                    case 1: {
                        setState(688);
                        math_expr_EQ();
                    }
                    break;
                    case 2: {
                        setState(689);
                        math_expr(0);
                    }
                    break;
                }
                setState(692);
                match(CLOSE_PAR);
                setState(693);
                match(OPEN_BLOCK);
                setState(700);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
                    case 1: {
                        setState(697);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == K_CASE) {
                            {
                                {
                                    setState(694);
                                    case_stmt();
                                }
                            }
                            setState(699);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                }
                setState(710);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_DEFAULT) {
                    {
                        setState(702);
                        match(K_DEFAULT);
                        setState(703);
                        match(T__0);
                        {
                            setState(707);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
                                {
                                    {
                                        setState(704);
                                        stat_forloop();
                                    }
                                }
                                setState(709);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }
                }

                setState(712);
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

    public static class Case_stmtContext extends ParserRuleContext {
        public TerminalNode K_CASE() {
            return getToken(SQLParser.K_CASE, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public List<Stat_forloopContext> stat_forloop() {
            return getRuleContexts(Stat_forloopContext.class);
        }

        public Stat_forloopContext stat_forloop(int i) {
            return getRuleContext(Stat_forloopContext.class, i);
        }

        public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_case_stmt;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitCase_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Case_stmtContext case_stmt() throws RecognitionException {
        Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_case_stmt);
        int _la;
		try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(714);
                    match(K_CASE);
                    {
                        setState(715);
                        math_expr(0);
                    }
                    setState(716);
                    match(T__0);
                    {
                        setState(720);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BLOCK) | (1L << OPEN_PAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << K_RETURN))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_WHILE - 91)) | (1L << (K_DO - 91)))) != 0) || ((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (K_VAR - 171)) | (1L << (K_SWITCH - 171)) | (1L << (K_BREAK - 171)) | (1L << (K_PRINT - 171)) | (1L << (K_CONTINUE - 171)) | (1L << (IDENTIFIER - 171)) | (1L << (STRING_LITERAL - 171)))) != 0)) {
                            {
				{
                    setState(717);
                    stat_forloop();
                }
                            }
                            setState(722);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }

        public If_stmt_shortContext if_stmt_short() {
            return getRuleContext(If_stmt_shortContext.class, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public Expr_conditionContext expr_condition() {
            return getRuleContext(Expr_conditionContext.class, 0);
		}
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_return_stmt);
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(723);
                match(K_RETURN);
                setState(728);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                    case 1: {
                        setState(724);
                        if_stmt_short();
                    }
                    break;
                    case 2: {
                        setState(725);
                        math_expr(0);
                    }
                    break;
                    case 3: {
                        setState(726);
                        expr_condition(0);
                    }
                    break;
                    case 4: {
                        setState(727);
                        match(K_NULL);
                    }
                    break;
                }
                setState(730);
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

    public static class Array1Context extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public TerminalNode OPEN_BRACKETS() {
            return getToken(SQLParser.OPEN_BRACKETS, 0);
        }

        public List<Math_exprContext> math_expr() {
            return getRuleContexts(Math_exprContext.class);
        }

        public Math_exprContext math_expr(int i) {
            return getRuleContext(Math_exprContext.class, i);
        }

        public TerminalNode CLOSE_BRACKETS() {
            return getToken(SQLParser.CLOSE_BRACKETS, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SQLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SQLParser.COMMA, i);
        }

        public Array1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_array1;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArray1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArray1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitArray1(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Array1Context array1() throws RecognitionException {
        Array1Context _localctx = new Array1Context(_ctx, getState());
        enterRule(_localctx, 82, RULE_array1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(732);
                any_name();
                setState(733);
                match(T__2);
                setState(734);
                match(ASSIGN);
                setState(735);
                match(OPEN_BRACKETS);
                setState(736);
                math_expr(0);
                setState(741);
                _errHandler.sync(this);
			_la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(737);
                            match(COMMA);
                            setState(738);
                            math_expr(0);
                        }
                    }
                    setState(743);
                    _errHandler.sync(this);
				_la = _input.LA(1);
                }
                setState(744);
                match(CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
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
        public TerminalNode SCOL() {
            return getToken(SQLParser.SCOL, 0);
        }

        public Array1Context array1() {
            return getRuleContext(Array1Context.class, 0);
        }

        public Math_expr_EQContext math_expr_EQ() {
            return getRuleContext(Math_expr_EQContext.class, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public Var_bodyContext var_body() {
            return getRuleContext(Var_bodyContext.class, 0);
        }

        public One_line_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_one_line_instruction;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterOne_line_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitOne_line_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitOne_line_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

    public final One_line_instructionContext one_line_instruction() throws RecognitionException {
        One_line_instructionContext _localctx = new One_line_instructionContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_one_line_instruction);
		int _la;
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(755);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
                    case 1: {
                        setState(752);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                            case 1: {
                                {
                                    setState(746);
                                    any_name();
                                    setState(749);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == ASSIGN) {
                                        {
                                            setState(747);
                                            match(ASSIGN);
                                            setState(748);
                                            var_body();
                                        }
                                    }

                                }
                            }
                            break;
                            case 2: {
                                setState(751);
                                array1();
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        {
                            setState(754);
                            math_expr_EQ();
                        }
                    }
                    break;
                }
                setState(757);
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

    public static class Math_op0Context extends ParserRuleContext {
        public TerminalNode PLUSPLUS() {
            return getToken(SQLParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS() {
            return getToken(SQLParser.MINUSMINUS, 0);
        }

        public Math_op0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_math_op0;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_op0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_op0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitMath_op0(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Math_op0Context math_op0() throws RecognitionException {
        Math_op0Context _localctx = new Math_op0Context(_ctx, getState());
        enterRule(_localctx, 86, RULE_math_op0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(759);
			_la = _input.LA(1);
                if (!(_la == PLUSPLUS || _la == MINUSMINUS)) {
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

	public static class IdentifierContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public Math_expr_logicContext math_expr_logic() {
            return getRuleContext(Math_expr_logicContext.class, 0);
        }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_identifier);
		try {
            setState(766);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(761);
                    any_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(762);
				match(OPEN_PAR);
                    setState(763);
                    math_expr_logic(0);
                    setState(764);
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

    public static class Math_expr_Add_oneContext extends ParserRuleContext {
        public Math_expr_Add_one_dencrementContext math_expr_Add_one_dencrement() {
            return getRuleContext(Math_expr_Add_one_dencrementContext.class, 0);
        }

        public Math_expr_Add_one_incrementContext math_expr_Add_one_increment() {
            return getRuleContext(Math_expr_Add_one_incrementContext.class, 0);
        }

        public Math_expr_Add_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_math_expr_Add_one;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr_Add_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr_Add_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitMath_expr_Add_one(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Math_expr_Add_oneContext math_expr_Add_one() throws RecognitionException {
        Math_expr_Add_oneContext _localctx = new Math_expr_Add_oneContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_math_expr_Add_one);
		try {
            setState(770);
			_errHandler.sync(this);
            switch (_input.LA(1)) {
                case PLUSPLUS:
                case MINUSMINUS:
				enterOuterAlt(_localctx, 1);
				{
                    setState(768);
                    math_expr_Add_one_dencrement();
				}
				break;
                case OPEN_PAR:
                case IDENTIFIER:
                case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
                    setState(769);
                    math_expr_Add_one_increment();
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

    public static class Math_expr_Add_one_incrementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}

        public Math_op0Context math_op0() {
            return getRuleContext(Math_op0Context.class, 0);
        }

        public Math_expr_Add_one_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_math_expr_Add_one_increment;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr_Add_one_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr_Add_one_increment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitMath_expr_Add_one_increment(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Math_expr_Add_one_incrementContext math_expr_Add_one_increment() throws RecognitionException {
        Math_expr_Add_one_incrementContext _localctx = new Math_expr_Add_one_incrementContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_math_expr_Add_one_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(772);
			identifier();
                setState(773);
                math_op0();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class Math_expr_Add_one_dencrementContext extends ParserRuleContext {
        public Math_op0Context math_op0() {
            return getRuleContext(Math_op0Context.class, 0);
        }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}

        public Math_expr_Add_one_dencrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_math_expr_Add_one_dencrement;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr_Add_one_dencrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr_Add_one_dencrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitMath_expr_Add_one_dencrement(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Math_expr_Add_one_dencrementContext math_expr_Add_one_dencrement() throws RecognitionException {
        Math_expr_Add_one_dencrementContext _localctx = new Math_expr_Add_one_dencrementContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_math_expr_Add_one_dencrement);
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(775);
                math_op0();
                setState(776);
                identifier();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(778);
			match(K_ALTER);
                setState(779);
			match(K_TABLE);
                setState(783);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
			case 1:
				{
                    setState(780);
				database_name();
                    setState(781);
				match(DOT);
				}
				break;
			}
                setState(785);
			source_table_name();
                setState(796);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
			case 1:
				{
                    setState(786);
				match(K_RENAME);
                    setState(787);
				match(K_TO);
                    setState(788);
				new_table_name();
				}
				break;
			case 2:
				{
                    setState(789);
				alter_table_add();
				}
				break;
			case 3:
				{
                    setState(790);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
                    setState(791);
				match(K_ADD);
                    setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
                        setState(792);
					match(K_COLUMN);
					}
				}

                    setState(795);
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
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(798);
			match(K_ADD);
                setState(799);
			match(K_CONSTRAINT);
                setState(800);
			any_name();
                setState(801);
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
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(803);
			match(K_ADD);
                setState(804);
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
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }

        public Factored_select_stmtContext factored_select_stmt() {
            return getRuleContext(Factored_select_stmtContext.class, 0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(806);
			match(K_CREATE);
                setState(807);
			match(K_TABLE);
                setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
                    setState(808);
				match(K_IF);
                    setState(809);
				match(K_NOT);
                    setState(810);
				match(K_EXISTS);
				}
			}

                setState(816);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
			case 1:
				{
                    setState(813);
				database_name();
                    setState(814);
				match(DOT);
				}
				break;
			}
                setState(818);
			table_name();
                setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
                    setState(819);
				match(OPEN_PAR);
                    setState(820);
				column_def();
                    setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
                        setState(825);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
					case 1:
						{
                            setState(821);
						match(COMMA);
                            setState(822);
						table_constraint();
						}
						break;
					case 2:
						{
                            setState(823);
						match(COMMA);
                            setState(824);
						column_def();
						}
						break;
					}
					}
                    setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(830);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
                    setState(832);
				match(K_AS);
                    setState(833);
                    factored_select_stmt();
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
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(836);
			match(K_DELETE);
                setState(837);
			match(K_FROM);
                setState(838);
			qualified_table_name();
                setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
                    setState(839);
				match(K_WHERE);
                    setState(840);
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
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(843);
			match(K_DROP);
                setState(844);
			match(K_TABLE);
                setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
                    setState(845);
				match(K_IF);
                    setState(846);
				match(K_EXISTS);
				}
			}

                setState(852);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
			case 1:
				{
                    setState(849);
				database_name();
                    setState(850);
				match(DOT);
				}
				break;
			}
                setState(854);
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
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(856);
			select_core();
                setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
                    setState(857);
				match(K_ORDER);
                    setState(858);
				match(K_BY);
                    setState(859);
				ordering_term();
                    setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(860);
					match(COMMA);
                        setState(861);
					ordering_term();
					}
					}
                    setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

                setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
                    setState(869);
				match(K_LIMIT);
                    setState(870);
				expr(0);
                    setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
                        setState(871);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
                        setState(872);
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
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}

        public Factored_select_stmtContext factored_select_stmt() {
            return getRuleContext(Factored_select_stmtContext.class, 0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(877);
			match(K_INSERT);
                setState(878);
			match(K_INTO);
                setState(882);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 83, _ctx)) {
			case 1:
				{
                    setState(879);
				database_name();
                    setState(880);
				match(DOT);
				}
				break;
			}
                setState(884);
			table_name();
                setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
                    setState(885);
				match(OPEN_PAR);
                    setState(886);
				column_name();
                    setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(887);
					match(COMMA);
                        setState(888);
					column_name();
					}
					}
                    setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(894);
				match(CLOSE_PAR);
				}
			}

                setState(929);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
			case 1:
				{
                    setState(898);
				match(K_VALUES);
                    setState(899);
				match(OPEN_PAR);
                    setState(900);
				expr(0);
                    setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(901);
					match(COMMA);
                        setState(902);
					expr(0);
					}
					}
                    setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(908);
				match(CLOSE_PAR);
                    setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(909);
					match(COMMA);
                        setState(910);
					match(OPEN_PAR);
                        setState(911);
					expr(0);
                        setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
                            setState(912);
						match(COMMA);
                            setState(913);
						expr(0);
						}
						}
                        setState(918);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
                        setState(919);
					match(CLOSE_PAR);
					}
					}
                    setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
                    setState(926);
                    factored_select_stmt();
				}
				break;
			case 3:
				{
                    setState(927);
				match(K_DEFAULT);
                    setState(928);
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
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(931);
			select_or_values();
                setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
                    setState(932);
				match(K_ORDER);
                    setState(933);
				match(K_BY);
                    setState(934);
				ordering_term();
                    setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(935);
					match(COMMA);
                        setState(936);
					ordering_term();
					}
					}
                    setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

                setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
                    setState(944);
				match(K_LIMIT);
                    setState(945);
				expr(0);
                    setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
                        setState(946);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
                        setState(947);
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
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_select_or_values);
		int _la;
		try {
			int _alt;
            setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(952);
				match(K_SELECT);
                    setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
                        setState(953);
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

                    setState(956);
				result_column();
                    setState(961);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 95, _ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(957);
						match(COMMA);
                            setState(958);
						result_column();
						}
						}
					}
                    setState(963);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 95, _ctx);
				}
                    setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
                        setState(964);
					match(K_FROM);
                        setState(974);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 97, _ctx)) {
					case 1:
						{
                            setState(965);
						table_or_subquery();
                            setState(970);
						_errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 96, _ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
                                    setState(966);
								match(COMMA);
                                    setState(967);
								table_or_subquery();
								}
								}
							}
                            setState(972);
							_errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 96, _ctx);
						}
						}
						break;
					case 2:
						{
                            setState(973);
						join_clause();
						}
						break;
					}
					}
				}

                    setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
                        setState(978);
					match(K_WHERE);
                        setState(979);
					expr(0);
					}
				}

                    setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
                        setState(982);
					match(K_GROUP);
                        setState(983);
					match(K_BY);
                        setState(984);
					expr(0);
                        setState(989);
					_errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 100, _ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
                                setState(985);
							match(COMMA);
                                setState(986);
							expr(0);
							}
							}
						}
                        setState(991);
						_errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 100, _ctx);
					}
                        setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
                            setState(992);
						match(K_HAVING);
                            setState(993);
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
                    setState(998);
				match(K_VALUES);
                    setState(999);
				match(OPEN_PAR);
                    setState(1000);
				expr(0);
                    setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(1001);
					match(COMMA);
                        setState(1002);
					expr(0);
					}
					}
                    setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1008);
				match(CLOSE_PAR);
                    setState(1023);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 105, _ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(1009);
						match(COMMA);
                            setState(1010);
						match(OPEN_PAR);
                            setState(1011);
						expr(0);
                            setState(1016);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
                                setState(1012);
							match(COMMA);
                                setState(1013);
							expr(0);
							}
							}
                            setState(1018);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
                            setState(1019);
						match(CLOSE_PAR);
						}
						}
					}
                    setState(1025);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 105, _ctx);
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

    public static class Call_exprContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Call_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterCall_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitCall_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitCall_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Call_exprContext call_expr() throws RecognitionException {
        Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_call_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1028);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1030);
			match(K_UPDATE);
                setState(1031);
			qualified_table_name();
                setState(1032);
			match(K_SET);
                setState(1033);
			column_name();
                setState(1034);
			match(ASSIGN);
                setState(1035);
			expr(0);
                setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(1036);
				match(COMMA);
                    setState(1037);
				column_name();
                    setState(1038);
				match(ASSIGN);
                    setState(1039);
				expr(0);
				}
				}
                setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
                    setState(1046);
				match(K_WHERE);
                    setState(1047);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(1050);
			column_name();
                setState(1055);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 110, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        setState(1053);
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
                            setState(1051);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
                            setState(1052);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
                setState(1057);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 110, _ctx);
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
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }

        public List<Type_name_valueContext> type_name_value() {
            return getRuleContexts(Type_name_valueContext.class);
        }

        public Type_name_valueContext type_name_value(int i) {
            return getRuleContext(Type_name_valueContext.class, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1058);
                any_name();
                setState(1069);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
			case 1:
				{
                    setState(1059);
				match(OPEN_PAR);
                    setState(1060);
                    type_name_value();
                    setState(1061);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
                    setState(1063);
				match(OPEN_PAR);
                    setState(1064);
                    type_name_value();
                    setState(1065);
				match(COMMA);
                    setState(1066);
                    type_name_value();
                    setState(1067);
                    match(CLOSE_PAR);
                }
            break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_name_valueContext extends ParserRuleContext {
        public Signed_numberContext signed_number() {
            return getRuleContext(Signed_numberContext.class, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Type_name_valueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_name_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterType_name_value(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitType_name_value(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitType_name_value(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Type_name_valueContext type_name_value() throws RecognitionException {
        Type_name_valueContext _localctx = new Type_name_valueContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_type_name_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1071);
                signed_number();
                setState(1073);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR || _la == IDENTIFIER || _la == STRING_LITERAL) {
                    {
                        setState(1072);
                        any_name();
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
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
                    setState(1075);
				match(K_CONSTRAINT);
                    setState(1076);
				name();
				}
			}

                setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
                    setState(1079);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
                    setState(1080);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
                    setState(1081);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
                    setState(1082);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
                    setState(1083);
				match(K_CHECK);
                    setState(1084);
				match(OPEN_PAR);
                    setState(1085);
				expr(0);
                    setState(1086);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
                    setState(1088);
				column_default();
				}
				break;
			case K_COLLATE:
				{
                    setState(1089);
				match(K_COLLATE);
                    setState(1090);
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
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1093);
			match(K_PRIMARY);
                setState(1094);
			match(K_KEY);
                setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
                    setState(1095);
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

                setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
                    setState(1098);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1101);
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
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1103);
			match(K_NOT);
                setState(1104);
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
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1106);
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
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(1108);
			match(K_DEFAULT);
                setState(1120);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 117, _ctx)) {
			case 1:
				{
                    setState(1109);
				column_default_value();
				}
				break;
			case 2:
				{
                    setState(1110);
				match(OPEN_PAR);
                    setState(1111);
				expr(0);
                    setState(1112);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
                    setState(1114);
				match(K_NEXTVAL);
                    setState(1115);
				match(OPEN_PAR);
                    setState(1116);
				expr(0);
                    setState(1117);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
                    setState(1119);
				any_name();
				}
				break;
			}
                setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
                if (_la == T__3) {
				{
                    setState(1122);
                    match(T__3);
                    setState(1124);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
                            setState(1123);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
                    setState(1126);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 118, _ctx);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

    public final Column_default_valueContext column_default_value() throws RecognitionException {
        Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_column_default_value);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1132);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                    case 1: {
                        setState(1130);
                        signed_number();
                    }
                    break;
                    case 2: {
                        setState(1131);
                        literal_value();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_jsonContext extends ParserRuleContext {
        public Call_jsonContext call_json() {
            return getRuleContext(Call_jsonContext.class, 0);
        }

        public Call_arrayContext call_array() {
            return getRuleContext(Call_arrayContext.class, 0);
        }

        public Array_jsonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_json;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterArray_json(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitArray_json(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitArray_json(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Array_jsonContext array_json() throws RecognitionException {
        Array_jsonContext _localctx = new Array_jsonContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_array_json);
        try {
            setState(1136);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1134);
                    call_json();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1135);
                    call_array();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Expr_conditionContext extends ParserRuleContext {
        public List<Math_expr_logicContext> math_expr_logic() {
            return getRuleContexts(Math_expr_logicContext.class);
        }

        public Math_expr_logicContext math_expr_logic(int i) {
            return getRuleContext(Math_expr_logicContext.class, i);
        }

        public TerminalNode LT2() {
            return getToken(SQLParser.LT2, 0);
        }

        public TerminalNode GT2() {
            return getToken(SQLParser.GT2, 0);
        }

        public TerminalNode LT() {
            return getToken(SQLParser.LT, 0);
        }

        public TerminalNode LT_EQ() {
            return getToken(SQLParser.LT_EQ, 0);
        }

        public TerminalNode GT() {
            return getToken(SQLParser.GT, 0);
        }

        public TerminalNode GT_EQ() {
            return getToken(SQLParser.GT_EQ, 0);
        }

        public TerminalNode EQ() {
            return getToken(SQLParser.EQ, 0);
        }

        public TerminalNode NOT_EQ1() {
            return getToken(SQLParser.NOT_EQ1, 0);
        }

        public TerminalNode NOT_EQ2() {
            return getToken(SQLParser.NOT_EQ2, 0);
        }

        public TerminalNode OPEN_PAR() {
            return getToken(SQLParser.OPEN_PAR, 0);
        }

        public List<Expr_conditionContext> expr_condition() {
            return getRuleContexts(Expr_conditionContext.class);
        }

        public Expr_conditionContext expr_condition(int i) {
            return getRuleContext(Expr_conditionContext.class, i);
        }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Call_arrayContext call_array() {
            return getRuleContext(Call_arrayContext.class, 0);
        }

        public Call_jsonContext call_json() {
            return getRuleContext(Call_jsonContext.class, 0);
        }

        public TerminalNode K_TRUE() {
            return getToken(SQLParser.K_TRUE, 0);
        }

        public TerminalNode K_FALSE() {
            return getToken(SQLParser.K_FALSE, 0);
        }

        public TerminalNode AMP() {
            return getToken(SQLParser.AMP, 0);
        }

        public TerminalNode PIPE() {
            return getToken(SQLParser.PIPE, 0);
        }

        public TerminalNode K_AND() {
            return getToken(SQLParser.K_AND, 0);
        }

        public TerminalNode K_OR() {
            return getToken(SQLParser.K_OR, 0);
        }

        public Expr_conditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_condition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterExpr_condition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitExpr_condition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitExpr_condition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Expr_conditionContext expr_condition() throws RecognitionException {
        return expr_condition(0);
    }

    private Expr_conditionContext expr_condition(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Expr_conditionContext _localctx = new Expr_conditionContext(_ctx, _parentState);
        Expr_conditionContext _prevctx = _localctx;
        int _startState = 142;
        enterRecursionRule(_localctx, 142, RULE_expr_condition, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1161);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 122, _ctx)) {
                    case 1: {
                        setState(1139);
                        math_expr_logic(0);
                        setState(1140);
                        _la = _input.LA(1);
                        if (!(_la == LT2 || _la == GT2)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1141);
                        math_expr_logic(0);
                    }
                    break;
                    case 2: {
                        setState(1143);
                        math_expr_logic(0);
                        setState(1144);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1145);
                        math_expr_logic(0);
                    }
                    break;
                    case 3: {
                        setState(1147);
                        math_expr_logic(0);
                        setState(1148);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1149);
                        math_expr_logic(0);
                    }
                    break;
                    case 4: {
                        setState(1151);
                        match(OPEN_PAR);
                        setState(1152);
                        expr_condition(0);
                        setState(1153);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 5: {
                        setState(1155);
                        any_name();
                        setState(1156);
                        call_array();
                    }
                    break;
                    case 6: {
                        setState(1158);
                        call_json();
                    }
                    break;
                    case 7: {
                        setState(1159);
                        match(K_TRUE);
                    }
                    break;
                    case 8: {
                        setState(1160);
                        match(K_FALSE);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1171);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1169);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 123, _ctx)) {
                                case 1: {
                                    _localctx = new Expr_conditionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr_condition);
                                    setState(1163);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1164);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMP) | (1L << PIPE) | (1L << K_AND))) != 0) || _la == K_OR)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1165);
                                    expr_condition(11);
                                }
                                break;
                                case 2: {
                                    _localctx = new Expr_conditionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr_condition);
                                    setState(1166);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1167);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1168);
                                    expr_condition(8);
                                }
                                break;
                            }
                        }
                    }
                    setState(1173);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Math_expr_EQContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Math_exprContext math_expr() {
            return getRuleContext(Math_exprContext.class, 0);
        }

        public TerminalNode STAREQ() {
            return getToken(SQLParser.STAREQ, 0);
        }

        public TerminalNode DIVEQ() {
            return getToken(SQLParser.DIVEQ, 0);
        }

        public TerminalNode MODEQ() {
            return getToken(SQLParser.MODEQ, 0);
        }

        public TerminalNode PLUSEQ() {
            return getToken(SQLParser.PLUSEQ, 0);
        }

        public TerminalNode MINUSEQ() {
            return getToken(SQLParser.MINUSEQ, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public Math_expr_Add_oneContext math_expr_Add_one() {
            return getRuleContext(Math_expr_Add_oneContext.class, 0);
        }

        public TerminalNode OPEN_PAR() {
            return getToken(SQLParser.OPEN_PAR, 0);
        }

        public Math_expr_EQContext math_expr_EQ() {
            return getRuleContext(Math_expr_EQContext.class, 0);
        }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public Math_expr_EQContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_math_expr_EQ;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr_EQ(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr_EQ(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitMath_expr_EQ(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Math_expr_EQContext math_expr_EQ() throws RecognitionException {
        Math_expr_EQContext _localctx = new Math_expr_EQContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_math_expr_EQ);
        int _la;
        try {
            setState(1187);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1174);
                    any_name();
                    setState(1175);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAREQ) | (1L << DIVEQ) | (1L << MODEQ))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1176);
                    math_expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1178);
                    any_name();
                    setState(1179);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PLUSEQ) | (1L << MINUSEQ))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1180);
                    math_expr(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1182);
                    math_expr_Add_one();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1183);
                    match(OPEN_PAR);
                    setState(1184);
                    math_expr_EQ();
                    setState(1185);
                    match(CLOSE_PAR);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Math_exprContext extends ParserRuleContext {
        public TerminalNode NUMERIC_LITERAL() {
            return getToken(SQLParser.NUMERIC_LITERAL, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Call_jsonContext call_json() {
            return getRuleContext(Call_jsonContext.class, 0);
        }

        public Call_arrayContext call_array() {
            return getRuleContext(Call_arrayContext.class, 0);
        }

        public TerminalNode OPEN_PAR() {
            return getToken(SQLParser.OPEN_PAR, 0);
        }

        public List<Math_exprContext> math_expr() {
            return getRuleContexts(Math_exprContext.class);
        }

        public Math_exprContext math_expr(int i) {
            return getRuleContext(Math_exprContext.class, i);
        }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public Math_expr_Add_oneContext math_expr_Add_one() {
            return getRuleContext(Math_expr_Add_oneContext.class, 0);
        }

        public TerminalNode STAR() {
            return getToken(SQLParser.STAR, 0);
        }

        public TerminalNode DIV() {
            return getToken(SQLParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(SQLParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SQLParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SQLParser.MINUS, 0);
        }

        public Math_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_math_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitMath_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Math_exprContext math_expr() throws RecognitionException {
        return math_expr(0);
    }

    private Math_exprContext math_expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
        Math_exprContext _prevctx = _localctx;
        int _startState = 146;
        enterRecursionRule(_localctx, 146, RULE_math_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1199);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                    case 1: {
                        setState(1190);
                        match(NUMERIC_LITERAL);
                    }
                    break;
                    case 2: {
                        setState(1191);
                        any_name();
                    }
                    break;
                    case 3: {
                        setState(1192);
                        call_json();
                    }
                    break;
                    case 4: {
                        setState(1193);
                        call_array();
                    }
                    break;
                    case 5: {
                        setState(1194);
                        match(OPEN_PAR);
                        setState(1195);
                        math_expr(0);
                        setState(1196);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 6: {
                        setState(1198);
                        math_expr_Add_one();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1209);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 128, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1207);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 127, _ctx)) {
                                case 1: {
                                    _localctx = new Math_exprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
                                    setState(1201);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1202);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1203);
                                    math_expr(5);
                                }
                                break;
                                case 2: {
                                    _localctx = new Math_exprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
                                    setState(1204);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1205);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1206);
                                    math_expr(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(1211);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 128, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Math_expr_logicContext extends ParserRuleContext {
        public TerminalNode NUMERIC_LITERAL() {
            return getToken(SQLParser.NUMERIC_LITERAL, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Call_jsonContext call_json() {
            return getRuleContext(Call_jsonContext.class, 0);
        }

        public Call_arrayContext call_array() {
            return getRuleContext(Call_arrayContext.class, 0);
        }

        public List<Math_expr_logicContext> math_expr_logic() {
            return getRuleContexts(Math_expr_logicContext.class);
        }

        public Math_expr_logicContext math_expr_logic(int i) {
            return getRuleContext(Math_expr_logicContext.class, i);
        }

        public TerminalNode STAREQ() {
            return getToken(SQLParser.STAREQ, 0);
        }

        public TerminalNode DIVEQ() {
            return getToken(SQLParser.DIVEQ, 0);
        }

        public TerminalNode MODEQ() {
            return getToken(SQLParser.MODEQ, 0);
        }

        public TerminalNode PLUSEQ() {
            return getToken(SQLParser.PLUSEQ, 0);
        }

        public TerminalNode MINUSEQ() {
            return getToken(SQLParser.MINUSEQ, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(SQLParser.ASSIGN, 0);
        }

        public Math_expr_Add_oneContext math_expr_Add_one() {
            return getRuleContext(Math_expr_Add_oneContext.class, 0);
        }

        public TerminalNode OPEN_PAR() {
            return getToken(SQLParser.OPEN_PAR, 0);
        }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public TerminalNode STAR() {
            return getToken(SQLParser.STAR, 0);
        }

        public TerminalNode DIV() {
            return getToken(SQLParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(SQLParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SQLParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SQLParser.MINUS, 0);
        }

        public Math_expr_logicContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_math_expr_logic;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterMath_expr_logic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitMath_expr_logic(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitMath_expr_logic(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Math_expr_logicContext math_expr_logic() throws RecognitionException {
        return math_expr_logic(0);
    }

    private Math_expr_logicContext math_expr_logic(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Math_expr_logicContext _localctx = new Math_expr_logicContext(_ctx, _parentState);
        Math_expr_logicContext _prevctx = _localctx;
        int _startState = 148;
        enterRecursionRule(_localctx, 148, RULE_math_expr_logic, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1226);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 129, _ctx)) {
                    case 1: {
                        setState(1213);
                        match(NUMERIC_LITERAL);
                    }
                    break;
                    case 2: {
                        setState(1214);
                        any_name();
                    }
                    break;
                    case 3: {
                        setState(1215);
                        call_json();
                    }
                    break;
                    case 4: {
                        setState(1216);
                        call_array();
                    }
                    break;
                    case 5: {
                        setState(1217);
                        any_name();
                        setState(1218);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << STAREQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << DIVEQ) | (1L << MODEQ))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1219);
                        math_expr_logic(3);
                    }
                    break;
                    case 6: {
                        setState(1221);
                        math_expr_Add_one();
                    }
                    break;
                    case 7: {
                        setState(1222);
                        match(OPEN_PAR);
                        setState(1223);
                        math_expr_logic(0);
                        setState(1224);
                        match(CLOSE_PAR);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1236);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 131, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1234);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 130, _ctx)) {
                                case 1: {
                                    _localctx = new Math_expr_logicContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_math_expr_logic);
                                    setState(1228);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1229);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1230);
                                    math_expr_logic(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new Math_expr_logicContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_math_expr_logic);
                                    setState(1231);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1232);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1233);
                                    math_expr_logic(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(1238);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 131, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
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
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}

        public Factored_select_stmtContext factored_select_stmt() {
            return getRuleContext(Factored_select_stmtContext.class, 0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
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
        int _startState = 150;
        enterRecursionRule(_localctx, 150, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(1287);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 139, _ctx)) {
			case 1:
				{
                    setState(1240);
				literal_value();
				}
				break;
			case 2:
				{
                    setState(1249);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 133, _ctx)) {
				case 1:
					{
                        setState(1244);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 132, _ctx)) {
					case 1:
						{
                            setState(1241);
						database_name();
                            setState(1242);
						match(DOT);
						}
						break;
					}
                        setState(1246);
					table_name();
                        setState(1247);
					match(DOT);
					}
					break;
				}
                    setState(1251);
				column_name();
				}
				break;
                    case 3:
				{
                    setState(1252);
				unary_operator();
                    setState(1253);
                    expr(13);
				}
				break;
                    case 4:
				{
                    setState(1255);
				function_name();
                    setState(1256);
				match(OPEN_PAR);
                    setState(1269);
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
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
                        setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
                            setState(1257);
						match(K_DISTINCT);
						}
					}

                        setState(1260);
					expr(0);
                        setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
                            setState(1261);
						match(COMMA);
                            setState(1262);
						expr(0);
						}
						}
                        setState(1267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
                        setState(1268);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
                    setState(1271);
				match(CLOSE_PAR);
				}
				break;
                    case 5:
				{
                    setState(1273);
				match(OPEN_PAR);
                    setState(1274);
				expr(0);
                    setState(1275);
				match(CLOSE_PAR);
				}
				break;
                    case 6:
				{
                    setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
                        setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
                            setState(1277);
						match(K_NOT);
						}
					}

                        setState(1280);
					match(K_EXISTS);
					}
				}

                    setState(1283);
				match(OPEN_PAR);
                    setState(1284);
                    factored_select_stmt();
                    setState(1285);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(1354);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 147, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(1352);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1289);
                            if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                            setState(1290);
						match(PIPE2);
                            setState(1291);
                            expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1292);
                            if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                            setState(1293);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(1294);
                            expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1295);
                            if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                            setState(1296);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(1297);
                            expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1298);
                            if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                            setState(1299);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(1300);
                            expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1301);
                            if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                            setState(1302);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(1303);
                            expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1304);
                            if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                            setState(1317);
						_errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 140, _ctx)) {
						case 1:
							{
                                setState(1305);
							match(ASSIGN);
							}
							break;
						case 2:
							{
                                setState(1306);
							match(EQ);
							}
							break;
						case 3:
							{
                                setState(1307);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
                                setState(1308);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
                                setState(1309);
							match(K_IS);
                                setState(1310);
                                match(K_NOT);
							}
							break;
						case 6:
							{
                                setState(1311);
							match(K_IS);
							}
							break;
						case 7:
							{
                                setState(1312);
							match(K_IN);
							}
							break;
						case 8:
							{
                                setState(1313);
							match(K_LIKE);
							}
							break;
						case 9:
							{
                                setState(1314);
							match(K_GLOB);
							}
							break;
						case 10:
							{
                                setState(1315);
							match(K_MATCH);
							}
							break;
						case 11:
							{
                                setState(1316);
							match(K_REGEXP);
							}
							break;
						}
                            setState(1319);
                            expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1320);
                            if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                            setState(1321);
						match(K_AND);
                            setState(1322);
                            expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(1323);
                            if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                            setState(1324);
						match(K_OR);
                            setState(1325);
                            expr(6);
                        }
                    break;
                            case 9: {
                                _localctx = new ExprContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                setState(1326);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(1328);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == K_NOT) {
                                    {
                                        setState(1327);
                                        match(K_NOT);
                                    }
                                }

                                setState(1330);
                                match(K_IN);
                                setState(1350);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
                                    case 1: {
                                        setState(1331);
                                        match(OPEN_PAR);
                                        setState(1341);
                                        _errHandler.sync(this);
                                        switch (_input.LA(1)) {
                                            case K_SELECT:
                                            case K_VALUES: {
                                                setState(1332);
                                                factored_select_stmt();
                                            }
                                            break;
                                            case OPEN_PAR:
                                            case PLUS:
                                            case MINUS:
                                            case TILDE:
                                            case K_CURRENT_DATE:
                                            case K_CURRENT_TIME:
                                            case K_CURRENT_TIMESTAMP:
                                            case K_EXISTS:
                                            case K_NOT:
                                            case K_NULL:
                                            case IDENTIFIER:
                                            case NUMERIC_LITERAL:
                                            case STRING_LITERAL:
                                            case BLOB_LITERAL: {
                                                setState(1333);
                                                expr(0);
                                                setState(1338);
                                                _errHandler.sync(this);
                                                _la = _input.LA(1);
                                                while (_la == COMMA) {
                                                    {
                                                        {
                                                            setState(1334);
                                                            match(COMMA);
                                                            setState(1335);
                                                            expr(0);
                                                        }
                                                    }
                                                    setState(1340);
                                                    _errHandler.sync(this);
                                                    _la = _input.LA(1);
                                                }
                                            }
                                            break;
                                            case CLOSE_PAR:
                                                break;
                                            default:
                                                break;
                                        }
                                        setState(1343);
                                        match(CLOSE_PAR);
                                    }
                                    break;
                                    case 2: {
                                        setState(1347);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 144, _ctx)) {
                                            case 1: {
                                                setState(1344);
                                                database_name();
                                                setState(1345);
                                                match(DOT);
                                            }
                                            break;
                                        }
                                        setState(1349);
                                        table_name();
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                setState(1356);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 147, _ctx);
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

    public static class Foreign_key_clause_valueContext extends ParserRuleContext {
        public TerminalNode K_ON() {
            return getToken(SQLParser.K_ON, 0);
        }

        public TerminalNode K_MATCH() {
            return getToken(SQLParser.K_MATCH, 0);
        }

        public NameContext name() {
            return getRuleContext(NameContext.class, 0);
        }

        public TerminalNode K_DELETE() {
            return getToken(SQLParser.K_DELETE, 0);
        }

        public TerminalNode K_UPDATE() {
            return getToken(SQLParser.K_UPDATE, 0);
        }

        public TerminalNode K_SET() {
            return getToken(SQLParser.K_SET, 0);
        }

        public TerminalNode K_NULL() {
            return getToken(SQLParser.K_NULL, 0);
        }

        public TerminalNode K_DEFAULT() {
            return getToken(SQLParser.K_DEFAULT, 0);
        }

        public TerminalNode K_CASCADE() {
            return getToken(SQLParser.K_CASCADE, 0);
        }

        public TerminalNode K_RESTRICT() {
            return getToken(SQLParser.K_RESTRICT, 0);
        }

        public TerminalNode K_NO() {
            return getToken(SQLParser.K_NO, 0);
        }

        public TerminalNode K_ACTION() {
            return getToken(SQLParser.K_ACTION, 0);
        }

        public Foreign_key_clause_valueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_foreign_key_clause_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterForeign_key_clause_value(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitForeign_key_clause_value(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor)
                return ((SQLVisitor<? extends T>) visitor).visitForeign_key_clause_value(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Foreign_key_clause_valueContext foreign_key_clause_value() throws RecognitionException {
        Foreign_key_clause_valueContext _localctx = new Foreign_key_clause_valueContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_foreign_key_clause_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1371);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case K_ON: {
                        setState(1357);
                        match(K_ON);
                        setState(1358);
                        _la = _input.LA(1);
                        if (!(_la == K_DELETE || _la == K_UPDATE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1367);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 148, _ctx)) {
                            case 1: {
                                setState(1359);
                                match(K_SET);
                                setState(1360);
                                match(K_NULL);
                            }
                            break;
                            case 2: {
                                setState(1361);
                                match(K_SET);
                                setState(1362);
                                match(K_DEFAULT);
                            }
                            break;
                            case 3: {
                                setState(1363);
                                match(K_CASCADE);
                            }
                            break;
                            case 4: {
                                setState(1364);
                                match(K_RESTRICT);
                            }
                            break;
                            case 5: {
                                setState(1365);
                                match(K_NO);
                                setState(1366);
                                match(K_ACTION);
                            }
                            break;
                        }
                    }
                    break;
                    case K_MATCH: {
                        setState(1369);
                        match(K_MATCH);
                        setState(1370);
                        name();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }

        public List<Foreign_key_clause_valueContext> foreign_key_clause_value() {
            return getRuleContexts(Foreign_key_clause_valueContext.class);
        }

        public Foreign_key_clause_valueContext foreign_key_clause_value(int i) {
            return getRuleContext(Foreign_key_clause_valueContext.class, i);
        }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1373);
			match(K_REFERENCES);
                setState(1377);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 150, _ctx)) {
			case 1:
				{
                    setState(1374);
				database_name();
                    setState(1375);
				match(DOT);
				}
				break;
			}
                setState(1379);
			foreign_table();
                setState(1391);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 152, _ctx)) {
			case 1:
				{
                    setState(1380);
				match(OPEN_PAR);
                    setState(1381);
				fk_target_column_name();
                    setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(1382);
					match(COMMA);
                        setState(1383);
					fk_target_column_name();
					}
					}
                    setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1389);
				match(CLOSE_PAR);
				}
				break;
			}
                setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
                    setState(1393);
                    foreign_key_clause_value();
                }
                }
                setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1412);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 157, _ctx)) {
			case 1:
				{
                    setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
                        setState(1399);
					match(K_NOT);
					}
				}

                    setState(1402);
				match(K_DEFERRABLE);
                    setState(1407);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 155, _ctx)) {
				case 1:
					{
                        setState(1403);
					match(K_INITIALLY);
                        setState(1404);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
                        setState(1405);
					match(K_INITIALLY);
                        setState(1406);
					match(K_IMMEDIATE);
					}
					break;
				}
                    setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
                        setState(1409);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1414);
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
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1416);
			column_name();
                setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
                    setState(1417);
				match(K_COLLATE);
                    setState(1418);
				collation_name();
				}
			}

                setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
                    setState(1421);
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
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
                    setState(1424);
				match(K_CONSTRAINT);
                    setState(1425);
				name();
				}
			}

                setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
                    setState(1428);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
                    setState(1429);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
                    setState(1430);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
                    setState(1431);
				match(K_CHECK);
                    setState(1432);
				match(OPEN_PAR);
                    setState(1433);
				expr(0);
                    setState(1434);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
                    setState(1436);
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
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1439);
			match(K_PRIMARY);
                setState(1440);
			match(K_KEY);
                setState(1441);
			match(OPEN_PAR);
                setState(1442);
			indexed_column();
                setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(1443);
				match(COMMA);
                    setState(1444);
				indexed_column();
				}
				}
                setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1450);
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
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1452);
			match(K_FOREIGN);
                setState(1453);
			match(K_KEY);
                setState(1454);
			match(OPEN_PAR);
                setState(1455);
			fk_origin_column_name();
                setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(1456);
				match(COMMA);
                    setState(1457);
				fk_origin_column_name();
				}
				}
                setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1463);
			match(CLOSE_PAR);
                setState(1464);
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
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1466);
			match(K_UNIQUE);
                setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
                    setState(1467);
				match(K_KEY);
				}
			}

                setState(1471);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
			case 1:
				{
                    setState(1470);
				name();
				}
				break;
			}
                setState(1473);
			match(OPEN_PAR);
                setState(1474);
			indexed_column();
                setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(1475);
				match(COMMA);
                    setState(1476);
				indexed_column();
				}
				}
                setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1482);
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
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1484);
			match(K_KEY);
                setState(1486);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 167, _ctx)) {
			case 1:
				{
                    setState(1485);
				name();
				}
				break;
			}
                setState(1488);
			match(OPEN_PAR);
                setState(1489);
			indexed_column();
                setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(1490);
				match(COMMA);
                    setState(1491);
				indexed_column();
				}
				}
                setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1497);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1499);
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
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1504);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 169, _ctx)) {
			case 1:
				{
                    setState(1501);
				database_name();
                    setState(1502);
				match(DOT);
				}
				break;
			}
                setState(1506);
			table_name();
                setState(1512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
                    setState(1507);
				match(K_INDEXED);
                    setState(1508);
				match(K_BY);
                    setState(1509);
				index_name();
				}
				break;
			case K_NOT:
				{
                    setState(1510);
				match(K_NOT);
                    setState(1511);
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
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1514);
			expr(0);
                setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
                    setState(1515);
				match(K_COLLATE);
                    setState(1516);
				collation_name();
				}
			}

                setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
                    setState(1519);
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
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_pragma_value);
		try {
            setState(1525);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 173, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1522);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1523);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1524);
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
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1527);
			table_name();
                setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
                    setState(1528);
				match(OPEN_PAR);
                    setState(1529);
				column_name();
                    setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(1530);
					match(COMMA);
                        setState(1531);
					column_name();
					}
					}
                    setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1537);
				match(CLOSE_PAR);
				}
			}

                setState(1541);
			match(K_AS);
                setState(1542);
			match(OPEN_PAR);
                setState(1543);
			select_stmt();
                setState(1544);
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
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_result_column);
		int _la;
		try {
            setState(1558);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 178, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1546);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1547);
				table_name();
                    setState(1548);
				match(DOT);
                    setState(1549);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1551);
				expr(0);
                    setState(1556);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 177, _ctx)) {
				case 1:
					{
                        setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
                            setState(1552);
						match(K_AS);
						}
					}

                        setState(1555);
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
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}

        public Factored_select_stmtContext factored_select_stmt() {
            return getRuleContext(Factored_select_stmtContext.class, 0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_table_or_subquery);
		int _la;
		try {
            setState(1607);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 189, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1563);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 179, _ctx)) {
				case 1:
					{
                        setState(1560);
					database_name();
                        setState(1561);
					match(DOT);
					}
					break;
				}
                    setState(1565);
				table_name();
                    setState(1570);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 181, _ctx)) {
				case 1:
					{
                        setState(1567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
                            setState(1566);
						match(K_AS);
						}
					}

                        setState(1569);
					table_alias();
					}
					break;
				}
                    setState(1577);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
                        setState(1572);
					match(K_INDEXED);
                        setState(1573);
					match(K_BY);
                        setState(1574);
					index_name();
					}
					break;
				case K_NOT:
					{
                        setState(1575);
					match(K_NOT);
                        setState(1576);
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
                    setState(1579);
				match(OPEN_PAR);
                    setState(1589);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
				case 1:
					{
                        setState(1580);
					table_or_subquery();
                        setState(1585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
                            setState(1581);
						match(COMMA);
                            setState(1582);
						table_or_subquery();
						}
						}
                        setState(1587);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
                        setState(1588);
					join_clause();
					}
					break;
				}
                    setState(1591);
				match(CLOSE_PAR);
                    setState(1596);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 186, _ctx)) {
				case 1:
					{
                        setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
                            setState(1592);
						match(K_AS);
						}
					}

                        setState(1595);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1598);
				match(OPEN_PAR);
                    setState(1599);
                    factored_select_stmt();
                    setState(1600);
				match(CLOSE_PAR);
                    setState(1605);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 188, _ctx)) {
				case 1:
					{
                        setState(1602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
                            setState(1601);
						match(K_AS);
						}
					}

                        setState(1604);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(1609);
			table_or_subquery();
                setState(1616);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 190, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(1610);
					join_operator();
                        setState(1611);
					table_or_subquery();
                        setState(1612);
					join_constraint();
					}
					}
				}
                setState(1618);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 190, _ctx);
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
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_join_operator);
		int _la;
		try {
            setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1619);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1625);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
                        setState(1620);
					match(K_LEFT);
                        setState(1622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
                            setState(1621);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
                        setState(1624);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
                    setState(1627);
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
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
                    setState(1630);
				match(K_ON);
                    setState(1631);
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
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }

        public Group_exprContext group_expr() {
            return getRuleContext(Group_exprContext.class, 0);
        }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }

        public List<Values_selectCoreContext> values_selectCore() {
            return getRuleContexts(Values_selectCoreContext.class);
        }

        public Values_selectCoreContext values_selectCore(int i) {
            return getRuleContext(Values_selectCoreContext.class, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_select_core);
		int _la;
		try {
            int _alt;
            setState(1682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1634);
				match(K_SELECT);
                    setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
                        setState(1635);
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

                    setState(1638);
				result_column();
                    setState(1643);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 196, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(1639);
                                    match(COMMA);
                                    setState(1640);
                                    result_column();
                                }
                            }
                        }
                        setState(1645);
					_errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 196, _ctx);
				}
                    setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
                        setState(1646);
					match(K_FROM);
                        setState(1656);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 198, _ctx)) {
					case 1:
						{
                            setState(1647);
						table_or_subquery();
                            setState(1652);
						_errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 197, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(1648);
                                            match(COMMA);
                                            setState(1649);
                                            table_or_subquery();
                                        }
                                    }
                                }
                                setState(1654);
							_errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 197, _ctx);
						}
						}
						break;
					case 2:
						{
                            setState(1655);
						join_clause();
						}
						break;
					}
					}
				}

                    setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
                        setState(1660);
					match(K_WHERE);
                        setState(1661);
					expr(0);
					}
				}

                    setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
                        setState(1664);
					match(K_GROUP);
                        setState(1665);
					match(K_BY);
                        setState(1666);
                        group_expr();
                        setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
                            setState(1667);
						match(K_HAVING);
                            setState(1668);
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
                    setState(1673);
				match(K_VALUES);
                    setState(1674);
                    values_selectCore();
                    setState(1679);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 203, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(1675);
                                    match(COMMA);
                                    setState(1676);
                                    values_selectCore();
                                }
                            }
                        }
                        setState(1681);
					_errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 203, _ctx);
                    }
                }
            break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Group_exprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SQLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SQLParser.COMMA, i);
        }

        public Group_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_group_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterGroup_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitGroup_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitGroup_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Group_exprContext group_expr() throws RecognitionException {
        Group_exprContext _localctx = new Group_exprContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_group_expr);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1684);
                expr(0);
                setState(1689);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 205, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
					{
					{
                        setState(1685);
					match(COMMA);
                        setState(1686);
                        expr(0);
                    }
                    }
                    }
                    setState(1691);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 205, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Values_selectCoreContext extends ParserRuleContext {
        public TerminalNode OPEN_PAR() {
            return getToken(SQLParser.OPEN_PAR, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode CLOSE_PAR() {
            return getToken(SQLParser.CLOSE_PAR, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SQLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SQLParser.COMMA, i);
        }

        public Values_selectCoreContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_values_selectCore;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).enterValues_selectCore(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLListener) ((SQLListener) listener).exitValues_selectCore(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLVisitor) return ((SQLVisitor<? extends T>) visitor).visitValues_selectCore(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Values_selectCoreContext values_selectCore() throws RecognitionException {
        Values_selectCoreContext _localctx = new Values_selectCoreContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_values_selectCore);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1692);
                match(OPEN_PAR);
                setState(1693);
                expr(0);
                setState(1698);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1694);
                            match(COMMA);
                            setState(1695);
                            expr(0);
                        }
                    }
                    setState(1700);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1701);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1703);
			table_name();
                setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
                    setState(1704);
				match(OPEN_PAR);
                    setState(1705);
				column_name();
                    setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
                        setState(1706);
					match(COMMA);
                        setState(1707);
					column_name();
					}
					}
                    setState(1712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1713);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
                    setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
                        setState(1717);
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

                    setState(1720);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
                    setState(1721);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1724);
			_la = _input.LA(1);
                if (!(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NUMERIC_LITERAL - 179)) | (1L << (STRING_LITERAL - 179)) | (1L << (BLOB_LITERAL - 179)))) != 0))) {
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
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1726);
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
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1728);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_module_argument);
		try {
            setState(1732);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 211, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1730);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1731);
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
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1734);
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
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1736);
			_la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_CONTINUE - 128)))) != 0))) {
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1738);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1740);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1742);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1744);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1746);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
        enterRule(_localctx, 222, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1748);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1750);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1752);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1754);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1756);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1758);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1760);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1762);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1764);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1766);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
        enterRule(_localctx, 242, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1768);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
        enterRule(_localctx, 244, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1770);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
        enterRule(_localctx, 246, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1772);
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
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
        enterRule(_localctx, 248, RULE_any_name);
		try {
            setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1774);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1775);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1776);
				match(OPEN_PAR);
                    setState(1777);
				any_name();
                    setState(1778);
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
            case 71:
                return expr_condition_sempred((Expr_conditionContext) _localctx, predIndex);
            case 73:
                return math_expr_sempred((Math_exprContext) _localctx, predIndex);
            case 74:
                return math_expr_logic_sempred((Math_expr_logicContext) _localctx, predIndex);
            case 75:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}

    private boolean expr_condition_sempred(Expr_conditionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 10);
            case 1:
                return precpred(_ctx, 7);
        }
        return true;
    }

    private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 4);
            case 3:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean math_expr_logic_sempred(Math_expr_logicContext _localctx, int predIndex) {
        switch (predIndex) {
            case 4:
                return precpred(_ctx, 5);
            case 5:
                return precpred(_ctx, 4);
        }
        return true;
    }
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
            case 6:
                return precpred(_ctx, 12);
            case 7:
			return precpred(_ctx, 11);
            case 8:
			return precpred(_ctx, 10);
            case 9:
			return precpred(_ctx, 9);
            case 10:
			return precpred(_ctx, 8);
            case 11:
			return precpred(_ctx, 7);
            case 12:
			return precpred(_ctx, 6);
            case 13:
			return precpred(_ctx, 5);
            case 14:
                return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bb\u06f9\4\2\t" +
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
                    "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\7\2\u00ff\n\2\f" +
                    "\2\16\2\u0102\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u010a\n\4\f\4\16\4\u010d" +
                    "\13\4\3\4\3\4\6\4\u0111\n\4\r\4\16\4\u0112\3\4\7\4\u0116\n\4\f\4\16\4" +
                    "\u0119\13\4\3\4\7\4\u011c\n\4\f\4\16\4\u011f\13\4\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\5\5\u0129\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u013f\n\6\f\6\16\6\u0142\13\6" +
                    "\3\6\5\6\u0145\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0150\n\7\f" +
                    "\7\16\7\u0153\13\7\3\7\3\7\5\7\u0157\n\7\3\b\3\b\3\b\3\b\7\b\u015d\n\b" +
                    "\f\b\16\b\u0160\13\b\3\b\3\b\3\t\3\t\3\t\7\t\u0167\n\t\f\t\16\t\u016a" +
                    "\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0175\n\n\f\n\16\n\u0178" +
                    "\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0186" +
                    "\n\13\f\13\16\13\u0189\13\13\3\13\3\13\5\13\u018d\n\13\5\13\u018f\n\13" +
                    "\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0197\n\r\3\r\5\r\u019a\n\r\3\r\3\r\3\r\3" +
                    "\r\5\r\u01a0\n\r\3\r\5\r\u01a3\n\r\7\r\u01a5\n\r\f\r\16\r\u01a8\13\r\3" +
                    "\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b3\n\16\3\17\3\17\3" +
                    "\17\3\17\3\17\7\17\u01ba\n\17\f\17\16\17\u01bd\13\17\3\17\3\17\3\17\3" +
                    "\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u01ca\n\21\f\21\16\21\u01cd" +
                    "\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u01d4\n\22\3\23\3\23\5\23\u01d8\n" +
                    "\23\3\23\3\23\3\24\3\24\5\24\u01de\n\24\3\24\7\24\u01e1\n\24\f\24\16\24" +
                    "\u01e4\13\24\3\24\5\24\u01e7\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u01ef" +
                    "\n\25\3\25\3\25\3\25\7\25\u01f4\n\25\f\25\16\25\u01f7\13\25\3\25\5\25" +
                    "\u01fa\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0203\n\26\f\26\16" +
                    "\26\u0206\13\26\5\26\u0208\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u020f\n" +
                    "\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u021b\n\30" +
                    "\3\31\3\31\3\31\3\31\3\31\7\31\u0222\n\31\f\31\16\31\u0225\13\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\7\31\u022d\n\31\f\31\16\31\u0230\13\31\3\31" +
                    "\3\31\7\31\u0234\n\31\f\31\16\31\u0237\13\31\3\31\3\31\3\31\7\31\u023c" +
                    "\n\31\f\31\16\31\u023f\13\31\5\31\u0241\n\31\3\32\3\32\3\33\3\33\7\33" +
                    "\u0247\n\33\f\33\16\33\u024a\13\33\3\33\3\33\5\33\u024e\n\33\3\34\3\34" +
                    "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u025a\n\35\3\35\3\35\5\35" +
                    "\u025e\n\35\3\35\3\35\5\35\u0262\n\35\3\35\3\35\3\35\3\36\3\36\3\36\7" +
                    "\36\u026a\n\36\f\36\16\36\u026d\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3" +
                    "\37\3\37\3\37\3 \3 \3 \3 \3!\3!\7!\u027e\n!\f!\16!\u0281\13!\3!\3!\5!" +
                    "\u0285\n!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0292\n$\3%\3%\3%\3%" +
                    "\3%\3%\3%\3%\3%\5%\u029d\n%\5%\u029f\n%\3&\3&\3&\3&\3&\5&\u02a6\n&\3\'" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02af\n\'\3(\3(\3(\3(\5(\u02b5\n(\3(\3(\3" +
                    "(\7(\u02ba\n(\f(\16(\u02bd\13(\5(\u02bf\n(\3(\3(\3(\7(\u02c4\n(\f(\16" +
                    "(\u02c7\13(\5(\u02c9\n(\3(\3(\3)\3)\3)\3)\7)\u02d1\n)\f)\16)\u02d4\13" +
                    ")\3*\3*\3*\3*\3*\5*\u02db\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u02e6\n+\f" +
                    "+\16+\u02e9\13+\3+\3+\3,\3,\3,\5,\u02f0\n,\3,\5,\u02f3\n,\3,\5,\u02f6" +
                    "\n,\3,\3,\3-\3-\3.\3.\3.\3.\3.\5.\u0301\n.\3/\3/\5/\u0305\n/\3\60\3\60" +
                    "\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0312\n\62\3\62\3\62" +
                    "\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u031c\n\62\3\62\5\62\u031f\n\62\3" +
                    "\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u032e" +
                    "\n\65\3\65\3\65\3\65\5\65\u0333\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65" +
                    "\7\65\u033c\n\65\f\65\16\65\u033f\13\65\3\65\3\65\3\65\3\65\5\65\u0345" +
                    "\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u034c\n\66\3\67\3\67\3\67\3\67\5\67" +
                    "\u0352\n\67\3\67\3\67\3\67\5\67\u0357\n\67\3\67\3\67\38\38\38\38\38\3" +
                    "8\78\u0361\n8\f8\168\u0364\138\58\u0366\n8\38\38\38\38\58\u036c\n8\58" +
                    "\u036e\n8\39\39\39\39\39\59\u0375\n9\39\39\39\39\39\79\u037c\n9\f9\16" +
                    "9\u037f\139\39\39\59\u0383\n9\39\39\39\39\39\79\u038a\n9\f9\169\u038d" +
                    "\139\39\39\39\39\39\39\79\u0395\n9\f9\169\u0398\139\39\39\79\u039c\n9" +
                    "\f9\169\u039f\139\39\39\39\59\u03a4\n9\3:\3:\3:\3:\3:\3:\7:\u03ac\n:\f" +
                    ":\16:\u03af\13:\5:\u03b1\n:\3:\3:\3:\3:\5:\u03b7\n:\5:\u03b9\n:\3;\3;" +
                    "\5;\u03bd\n;\3;\3;\3;\7;\u03c2\n;\f;\16;\u03c5\13;\3;\3;\3;\3;\7;\u03cb" +
                    "\n;\f;\16;\u03ce\13;\3;\5;\u03d1\n;\5;\u03d3\n;\3;\3;\5;\u03d7\n;\3;\3" +
                    ";\3;\3;\3;\7;\u03de\n;\f;\16;\u03e1\13;\3;\3;\5;\u03e5\n;\5;\u03e7\n;" +
                    "\3;\3;\3;\3;\3;\7;\u03ee\n;\f;\16;\u03f1\13;\3;\3;\3;\3;\3;\3;\7;\u03f9" +
                    "\n;\f;\16;\u03fc\13;\3;\3;\7;\u0400\n;\f;\16;\u0403\13;\5;\u0405\n;\3" +
                    "<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u0414\n=\f=\16=\u0417\13=\3=" +
                    "\3=\5=\u041b\n=\3>\3>\3>\7>\u0420\n>\f>\16>\u0423\13>\3?\3?\3?\3?\3?\3" +
                    "?\3?\3?\3?\3?\3?\5?\u0430\n?\3@\3@\5@\u0434\n@\3A\3A\5A\u0438\nA\3A\3" +
                    "A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0446\nA\3B\3B\3B\5B\u044b\nB\3B\5" +
                    "B\u044e\nB\3C\3C\3D\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5" +
                    "F\u0463\nF\3F\3F\6F\u0467\nF\rF\16F\u0468\5F\u046b\nF\3G\3G\5G\u046f\n" +
                    "G\3H\3H\5H\u0473\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3" +
                    "I\3I\3I\3I\3I\3I\3I\5I\u048c\nI\3I\3I\3I\3I\3I\3I\7I\u0494\nI\fI\16I\u0497" +
                    "\13I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u04a6\nJ\3K\3K\3K\3K\3" +
                    "K\3K\3K\3K\3K\3K\5K\u04b2\nK\3K\3K\3K\3K\3K\3K\7K\u04ba\nK\fK\16K\u04bd" +
                    "\13K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04cd\nL\3L\3L\3L\3" +
                    "L\3L\3L\7L\u04d5\nL\fL\16L\u04d8\13L\3M\3M\3M\3M\3M\5M\u04df\nM\3M\3M" +
                    "\3M\5M\u04e4\nM\3M\3M\3M\3M\3M\3M\3M\5M\u04ed\nM\3M\3M\3M\7M\u04f2\nM" +
                    "\fM\16M\u04f5\13M\3M\5M\u04f8\nM\3M\3M\3M\3M\3M\3M\3M\5M\u0501\nM\3M\5" +
                    "M\u0504\nM\3M\3M\3M\3M\5M\u050a\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3" +
                    "M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0528\nM\3M\3M\3" +
                    "M\3M\3M\3M\3M\3M\3M\5M\u0533\nM\3M\3M\3M\3M\3M\3M\7M\u053b\nM\fM\16M\u053e" +
                    "\13M\5M\u0540\nM\3M\3M\3M\3M\5M\u0546\nM\3M\5M\u0549\nM\7M\u054b\nM\f" +
                    "M\16M\u054e\13M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u055a\nN\3N\3N\5N\u055e" +
                    "\nN\3O\3O\3O\3O\5O\u0564\nO\3O\3O\3O\3O\3O\7O\u056b\nO\fO\16O\u056e\13" +
                    "O\3O\3O\5O\u0572\nO\3O\7O\u0575\nO\fO\16O\u0578\13O\3O\5O\u057b\nO\3O" +
                    "\3O\3O\3O\3O\5O\u0582\nO\3O\5O\u0585\nO\5O\u0587\nO\3P\3P\3Q\3Q\3Q\5Q" +
                    "\u058e\nQ\3Q\5Q\u0591\nQ\3R\3R\5R\u0595\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R" +
                    "\5R\u05a0\nR\3S\3S\3S\3S\3S\3S\7S\u05a8\nS\fS\16S\u05ab\13S\3S\3S\3T\3" +
                    "T\3T\3T\3T\3T\7T\u05b5\nT\fT\16T\u05b8\13T\3T\3T\3T\3U\3U\5U\u05bf\nU" +
                    "\3U\5U\u05c2\nU\3U\3U\3U\3U\7U\u05c8\nU\fU\16U\u05cb\13U\3U\3U\3V\3V\5" +
                    "V\u05d1\nV\3V\3V\3V\3V\7V\u05d7\nV\fV\16V\u05da\13V\3V\3V\3W\3W\3X\3X" +
                    "\3X\5X\u05e3\nX\3X\3X\3X\3X\3X\3X\5X\u05eb\nX\3Y\3Y\3Y\5Y\u05f0\nY\3Y" +
                    "\5Y\u05f3\nY\3Z\3Z\3Z\5Z\u05f8\nZ\3[\3[\3[\3[\3[\7[\u05ff\n[\f[\16[\u0602" +
                    "\13[\3[\3[\5[\u0606\n[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\" +
                    "\u0614\n\\\3\\\5\\\u0617\n\\\5\\\u0619\n\\\3]\3]\3]\5]\u061e\n]\3]\3]" +
                    "\5]\u0622\n]\3]\5]\u0625\n]\3]\3]\3]\3]\3]\5]\u062c\n]\3]\3]\3]\3]\7]" +
                    "\u0632\n]\f]\16]\u0635\13]\3]\5]\u0638\n]\3]\3]\5]\u063c\n]\3]\5]\u063f" +
                    "\n]\3]\3]\3]\3]\5]\u0645\n]\3]\5]\u0648\n]\5]\u064a\n]\3^\3^\3^\3^\3^" +
                    "\7^\u0651\n^\f^\16^\u0654\13^\3_\3_\3_\5_\u0659\n_\3_\5_\u065c\n_\3_\5" +
                    "_\u065f\n_\3`\3`\5`\u0663\n`\3a\3a\5a\u0667\na\3a\3a\3a\7a\u066c\na\f" +
                    "a\16a\u066f\13a\3a\3a\3a\3a\7a\u0675\na\fa\16a\u0678\13a\3a\5a\u067b\n" +
                    "a\5a\u067d\na\3a\3a\5a\u0681\na\3a\3a\3a\3a\3a\5a\u0688\na\5a\u068a\n" +
                    "a\3a\3a\3a\3a\7a\u0690\na\fa\16a\u0693\13a\5a\u0695\na\3b\3b\3b\7b\u069a" +
                    "\nb\fb\16b\u069d\13b\3c\3c\3c\3c\7c\u06a3\nc\fc\16c\u06a6\13c\3c\3c\3" +
                    "d\3d\3d\3d\3d\7d\u06af\nd\fd\16d\u06b2\13d\3d\3d\5d\u06b6\nd\3e\5e\u06b9" +
                    "\ne\3e\3e\5e\u06bd\ne\3f\3f\3g\3g\3h\3h\3i\3i\5i\u06c7\ni\3j\3j\3k\3k" +
                    "\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w" +
                    "\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\3~\3~\5~\u06f7\n~" +
                    "\3~\2\6\u0090\u0094\u0096\u0098\177\2\4\6\b\n\f\16\20\22\24\26\30\32\34" +
                    "\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
                    "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" +
                    "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" +
                    "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca" +
                    "\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2" +
                    "\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa" +
                    "\2\26\3\2\u00b4\u00b5\3\2\27\30\4\2\17\17\u0081\u0081\4\2\60\60QQ\4\2" +
                    "\65\65OO\3\2\37 \3\2#&\3\2\')\5\2!\"\63\63\u0084\u0084\4\2\24\24\31\32" +
                    "\4\2\20\20\25\26\4\2\21\21\35\36\3\2\22\23\5\2\20\20\24\26\31\32\3\2\37" +
                    "\"\4\2NN\u00a3\u00a3\6\2GI\177\177\u00b5\u00b5\u00b7\u00b8\5\2\22\23\33" +
                    "\33}}\4\2\u00b4\u00b4\u00b7\u00b7\6\2,dg\u0082\u0084\u00ad\u00b2\u00b3" +
                    "\2\u07b4\2\u0100\3\2\2\2\4\u0105\3\2\2\2\6\u010b\3\2\2\2\b\u0128\3\2\2" +
                    "\2\n\u0144\3\2\2\2\f\u0146\3\2\2\2\16\u0158\3\2\2\2\20\u0163\3\2\2\2\22" +
                    "\u016b\3\2\2\2\24\u017d\3\2\2\2\26\u0190\3\2\2\2\30\u0192\3\2\2\2\32\u01b2" +
                    "\3\2\2\2\34\u01b4\3\2\2\2\36\u01c1\3\2\2\2 \u01c6\3\2\2\2\"\u01d3\3\2" +
                    "\2\2$\u01d5\3\2\2\2&\u01db\3\2\2\2(\u01eb\3\2\2\2*\u01fd\3\2\2\2,\u020e" +
                    "\3\2\2\2.\u021a\3\2\2\2\60\u0240\3\2\2\2\62\u0242\3\2\2\2\64\u024d\3\2" +
                    "\2\2\66\u024f\3\2\2\28\u0251\3\2\2\2:\u0266\3\2\2\2<\u0273\3\2\2\2>\u0277" +
                    "\3\2\2\2@\u0284\3\2\2\2B\u0286\3\2\2\2D\u0289\3\2\2\2F\u028c\3\2\2\2H" +
                    "\u029e\3\2\2\2J\u02a5\3\2\2\2L\u02ae\3\2\2\2N\u02b0\3\2\2\2P\u02cc\3\2" +
                    "\2\2R\u02d5\3\2\2\2T\u02de\3\2\2\2V\u02f5\3\2\2\2X\u02f9\3\2\2\2Z\u0300" +
                    "\3\2\2\2\\\u0304\3\2\2\2^\u0306\3\2\2\2`\u0309\3\2\2\2b\u030c\3\2\2\2" +
                    "d\u0320\3\2\2\2f\u0325\3\2\2\2h\u0328\3\2\2\2j\u0346\3\2\2\2l\u034d\3" +
                    "\2\2\2n\u035a\3\2\2\2p\u036f\3\2\2\2r\u03a5\3\2\2\2t\u0404\3\2\2\2v\u0406" +
                    "\3\2\2\2x\u0408\3\2\2\2z\u041c\3\2\2\2|\u0424\3\2\2\2~\u0431\3\2\2\2\u0080" +
                    "\u0437\3\2\2\2\u0082\u0447\3\2\2\2\u0084\u044f\3\2\2\2\u0086\u0451\3\2" +
                    "\2\2\u0088\u0454\3\2\2\2\u008a\u0456\3\2\2\2\u008c\u046e\3\2\2\2\u008e" +
                    "\u0472\3\2\2\2\u0090\u048b\3\2\2\2\u0092\u04a5\3\2\2\2\u0094\u04b1\3\2" +
                    "\2\2\u0096\u04cc\3\2\2\2\u0098\u0509\3\2\2\2\u009a\u055d\3\2\2\2\u009c" +
                    "\u055f\3\2\2\2\u009e\u0588\3\2\2\2\u00a0\u058a\3\2\2\2\u00a2\u0594\3\2" +
                    "\2\2\u00a4\u05a1\3\2\2\2\u00a6\u05ae\3\2\2\2\u00a8\u05bc\3\2\2\2\u00aa" +
                    "\u05ce\3\2\2\2\u00ac\u05dd\3\2\2\2\u00ae\u05e2\3\2\2\2\u00b0\u05ec\3\2" +
                    "\2\2\u00b2\u05f7\3\2\2\2\u00b4\u05f9\3\2\2\2\u00b6\u0618\3\2\2\2\u00b8" +
                    "\u0649\3\2\2\2\u00ba\u064b\3\2\2\2\u00bc\u065e\3\2\2\2\u00be\u0662\3\2" +
                    "\2\2\u00c0\u0694\3\2\2\2\u00c2\u0696\3\2\2\2\u00c4\u069e\3\2\2\2\u00c6" +
                    "\u06a9\3\2\2\2\u00c8\u06bc\3\2\2\2\u00ca\u06be\3\2\2\2\u00cc\u06c0\3\2" +
                    "\2\2\u00ce\u06c2\3\2\2\2\u00d0\u06c6\3\2\2\2\u00d2\u06c8\3\2\2\2\u00d4" +
                    "\u06ca\3\2\2\2\u00d6\u06cc\3\2\2\2\u00d8\u06ce\3\2\2\2\u00da\u06d0\3\2" +
                    "\2\2\u00dc\u06d2\3\2\2\2\u00de\u06d4\3\2\2\2\u00e0\u06d6\3\2\2\2\u00e2" +
                    "\u06d8\3\2\2\2\u00e4\u06da\3\2\2\2\u00e6\u06dc\3\2\2\2\u00e8\u06de\3\2" +
                    "\2\2\u00ea\u06e0\3\2\2\2\u00ec\u06e2\3\2\2\2\u00ee\u06e4\3\2\2\2\u00f0" +
                    "\u06e6\3\2\2\2\u00f2\u06e8\3\2\2\2\u00f4\u06ea\3\2\2\2\u00f6\u06ec\3\2" +
                    "\2\2\u00f8\u06ee\3\2\2\2\u00fa\u06f6\3\2\2\2\u00fc\u00ff\5\6\4\2\u00fd" +
                    "\u00ff\5\4\3\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2" +
                    "\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102" +
                    "\u0100\3\2\2\2\u0103\u0104\7\2\2\3\u0104\3\3\2\2\2\u0105\u0106\7\u00bb" +
                    "\2\2\u0106\u0107\b\3\1\2\u0107\5\3\2\2\2\u0108\u010a\7\13\2\2\u0109\u0108" +
                    "\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c" +
                    "\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0117\5\b\5\2\u010f\u0111\7\13" +
                    "\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112" +
                    "\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5\b\5\2\u0115\u0110\3\2" +
                    "\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118" +
                    "\u011d\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7\13\2\2\u011b\u011a\3" +
                    "\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e" +
                    "\7\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0129\5b\62\2\u0121\u0129\5h\65\2" +
                    "\u0122\u0129\5j\66\2\u0123\u0129\5l\67\2\u0124\u0129\5n8\2\u0125\u0129" +
                    "\5p9\2\u0126\u0129\5x=\2\u0127\u0129\5(\25\2\u0128\u0120\3\2\2\2\u0128" +
                    "\u0121\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2" +
                    "\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129" +
                    "\t\3\2\2\2\u012a\u0145\5\34\17\2\u012b\u0145\5F$\2\u012c\u012d\5*\26\2" +
                    "\u012d\u012e\7\13\2\2\u012e\u0145\3\2\2\2\u012f\u0145\5\30\r\2\u0130\u0145" +
                    "\5<\37\2\u0131\u0145\5V,\2\u0132\u0133\7\u00b3\2\2\u0133\u0145\7\13\2" +
                    "\2\u0134\u0145\5:\36\2\u0135\u0145\5N(\2\u0136\u0145\58\35\2\u0137\u0138" +
                    "\7\u00b1\2\2\u0138\u0145\7\13\2\2\u0139\u0145\5R*\2\u013a\u013b\7\t\2" +
                    "\2\u013b\u0145\7\n\2\2\u013c\u0140\7\t\2\2\u013d\u013f\5\n\6\2\u013e\u013d" +
                    "\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141" +
                    "\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7\n\2\2\u0144\u012a\3\2" +
                    "\2\2\u0144\u012b\3\2\2\2\u0144\u012c\3\2\2\2\u0144\u012f\3\2\2\2\u0144" +
                    "\u0130\3\2\2\2\u0144\u0131\3\2\2\2\u0144\u0132\3\2\2\2\u0144\u0134\3\2" +
                    "\2\2\u0144\u0135\3\2\2\2\u0144\u0136\3\2\2\2\u0144\u0137\3\2\2\2\u0144" +
                    "\u0139\3\2\2\2\u0144\u013a\3\2\2\2\u0144\u013c\3\2\2\2\u0145\13\3\2\2" +
                    "\2\u0146\u0147\5\u00fa~\2\u0147\u0156\7\3\2\2\u0148\u0157\7\u00b5\2\2" +
                    "\u0149\u0157\7\u00b4\2\2\u014a\u0157\5\16\b\2\u014b\u014c\7\7\2\2\u014c" +
                    "\u0151\5\u00fa~\2\u014d\u014e\7\17\2\2\u014e\u0150\5\u00fa~\2\u014f\u014d" +
                    "\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152" +
                    "\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\b\2\2\u0155\u0157\3\2" +
                    "\2\2\u0156\u0148\3\2\2\2\u0156\u0149\3\2\2\2\u0156\u014a\3\2\2\2\u0156" +
                    "\u014b\3\2\2\2\u0157\r\3\2\2\2\u0158\u0159\7\t\2\2\u0159\u015e\5\f\7\2" +
                    "\u015a\u015b\7\17\2\2\u015b\u015d\5\f\7\2\u015c\u015a\3\2\2\2\u015d\u0160" +
                    "\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160" +
                    "\u015e\3\2\2\2\u0161\u0162\7\n\2\2\u0162\17\3\2\2\2\u0163\u0168\5\u00fa" +
                    "~\2\u0164\u0165\7\17\2\2\u0165\u0167\5\u00fa~\2\u0166\u0164\3\2\2\2\u0167" +
                    "\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\21\3\2\2" +
                    "\2\u016a\u0168\3\2\2\2\u016b\u016c\5\u00fa~\2\u016c\u016d\7\r\2\2\u016d" +
                    "\u016e\5\20\t\2\u016e\u016f\7\17\2\2\u016f\u0170\7*\2\2\u0170\u0171\7" +
                    "\r\2\2\u0171\u0176\5\u00fa~\2\u0172\u0173\7\17\2\2\u0173\u0175\5\u00fa" +
                    "~\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176" +
                    "\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\16" +
                    "\2\2\u017a\u017b\5&\24\2\u017b\u017c\7\16\2\2\u017c\23\3\2\2\2\u017d\u017e" +
                    "\5\u00fa~\2\u017e\u017f\7\7\2\2\u017f\u018e\7\b\2\2\u0180\u018c\7\20\2" +
                    "\2\u0181\u0182\7\7\2\2\u0182\u0187\t\2\2\2\u0183\u0184\7\17\2\2\u0184" +
                    "\u0186\t\2\2\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2" +
                    "\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a" +
                    "\u018d\7\b\2\2\u018b\u018d\5t;\2\u018c\u0181\3\2\2\2\u018c\u018b\3\2\2" +
                    "\2\u018d\u018f\3\2\2\2\u018e\u0180\3\2\2\2\u018e\u018f\3\2\2\2\u018f\25" +
                    "\3\2\2\2\u0190\u0191\5T+\2\u0191\27\3\2\2\2\u0192\u0199\7\u00ad\2\2\u0193" +
                    "\u0196\5\u00fa~\2\u0194\u0195\7\20\2\2\u0195\u0197\5\32\16\2\u0196\u0194" +
                    "\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u019a\5\24\13\2" +
                    "\u0199\u0193\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u01a6\3\2\2\2\u019b\u01a2" +
                    "\7\17\2\2\u019c\u019f\5\u00fa~\2\u019d\u019e\7\20\2\2\u019e\u01a0\5\32" +
                    "\16\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1" +
                    "\u01a3\5\24\13\2\u01a2\u019c\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a5\3" +
                    "\2\2\2\u01a4\u019b\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6" +
                    "\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\13" +
                    "\2\2\u01aa\31\3\2\2\2\u01ab\u01b3\5\u0094K\2\u01ac\u01b3\5\u0090I\2\u01ad" +
                    "\u01b3\5\16\b\2\u01ae\u01b3\5H%\2\u01af\u01b3\5\22\n\2\u01b0\u01b3\5\u00c0" +
                    "a\2\u01b1\u01b3\5*\26\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2" +
                    "\u01ad\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2" +
                    "\2\2\u01b2\u01b1\3\2\2\2\u01b3\33\3\2\2\2\u01b4\u01b5\7\u00b2\2\2\u01b5" +
                    "\u01b6\7\r\2\2\u01b6\u01bb\5\"\22\2\u01b7\u01b8\7\22\2\2\u01b8\u01ba\5" +
                    "\"\22\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb" +
                    "\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\16" +
                    "\2\2\u01bf\u01c0\7\13\2\2\u01c0\35\3\2\2\2\u01c1\u01c2\5\u00fa~\2\u01c2" +
                    "\u01c3\7\7\2\2\u01c3\u01c4\5\u0094K\2\u01c4\u01c5\7\b\2\2\u01c5\37\3\2" +
                    "\2\2\u01c6\u01cb\5\u00fa~\2\u01c7\u01c8\7\f\2\2\u01c8\u01ca\5\u00fa~\2" +
                    "\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc" +
                    "\3\2\2\2\u01cc!\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d4\5\u0094K\2\u01cf" +
                    "\u01d4\5H%\2\u01d0\u01d4\5\u0090I\2\u01d1\u01d4\5 \21\2\u01d2\u01d4\5" +
                    "\36\20\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3" +
                    "\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4#\3\2\2\2\u01d5\u01d7\7\r\2\2" +
                    "\u01d6\u01d8\5\62\32\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9" +
                    "\3\2\2\2\u01d9\u01da\7\16\2\2\u01da%\3\2\2\2\u01db\u01dd\7\t\2\2\u01dc" +
                    "\u01de\5(\25\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\3\2" +
                    "\2\2\u01df\u01e1\5\n\6\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2" +
                    "\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2" +
                    "\2\2\u01e5\u01e7\5(\25\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7" +
                    "\u01e8\3\2\2\2\u01e8\u01e9\5R*\2\u01e9\u01ea\7\n\2\2\u01ea\'\3\2\2\2\u01eb" +
                    "\u01ec\5\u00fa~\2\u01ec\u01ee\7\r\2\2\u01ed\u01ef\5\62\32\2\u01ee\u01ed" +
                    "\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\16\2\2" +
                    "\u01f1\u01f5\7\t\2\2\u01f2\u01f4\5\n\6\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7" +
                    "\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7" +
                    "\u01f5\3\2\2\2\u01f8\u01fa\5R*\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2" +
                    "\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\n\2\2\u01fc)\3\2\2\2\u01fd\u01fe" +
                    "\5\u00fa~\2\u01fe\u0207\7\r\2\2\u01ff\u0204\5,\27\2\u0200\u0201\7\17\2" +
                    "\2\u0201\u0203\5,\27\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202" +
                    "\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207" +
                    "\u01ff\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\7\16" +
                    "\2\2\u020a+\3\2\2\2\u020b\u020f\5\u0094K\2\u020c\u020f\5\u0090I\2\u020d" +
                    "\u020f\7\177\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3" +
                    "\2\2\2\u020f-\3\2\2\2\u0210\u0211\7\u00ad\2\2\u0211\u0212\5\u00fa~\2\u0212" +
                    "\u0213\7\20\2\2\u0213\u0214\5\u0094K\2\u0214\u021b\3\2\2\2\u0215\u0216" +
                    "\7\u00ad\2\2\u0216\u0217\5\u00fa~\2\u0217\u0218\7\20\2\2\u0218\u0219\7" +
                    "\177\2\2\u0219\u021b\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0215\3\2\2\2\u021b" +
                    "/\3\2\2\2\u021c\u021d\7\u00ad\2\2\u021d\u0223\5\u00fa~\2\u021e\u021f\7" +
                    "\17\2\2\u021f\u0220\7\u00ad\2\2\u0220\u0222\5\u00fa~\2\u0221\u021e\3\2" +
                    "\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224" +
                    "\u0241\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7\u00ad\2\2\u0227\u0228" +
                    "\5\u00fa~\2\u0228\u022e\3\2\2\2\u0229\u022a\7\17\2\2\u022a\u022b\7\u00ad" +
                    "\2\2\u022b\u022d\5\u00fa~\2\u022c\u0229\3\2\2\2\u022d\u0230\3\2\2\2\u022e" +
                    "\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0235\3\2\2\2\u0230\u022e\3\2" +
                    "\2\2\u0231\u0232\7\17\2\2\u0232\u0234\5.\30\2\u0233\u0231\3\2\2\2\u0234" +
                    "\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0241\3\2" +
                    "\2\2\u0237\u0235\3\2\2\2\u0238\u023d\5.\30\2\u0239\u023a\7\17\2\2\u023a" +
                    "\u023c\5.\30\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2" +
                    "\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u0240" +
                    "\u021c\3\2\2\2\u0240\u0226\3\2\2\2\u0240\u0238\3\2\2\2\u0241\61\3\2\2" +
                    "\2\u0242\u0243\5\60\31\2\u0243\63\3\2\2\2\u0244\u0248\7\t\2\2\u0245\u0247" +
                    "\5\n\6\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248" +
                    "\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024e\7\n" +
                    "\2\2\u024c\u024e\5\n\6\2\u024d\u0244\3\2\2\2\u024d\u024c\3\2\2\2\u024e" +
                    "\65\3\2\2\2\u024f\u0250\5\u0092J\2\u0250\67\3\2\2\2\u0251\u0252\7]\2\2" +
                    "\u0252\u0259\7\r\2\2\u0253\u0254\7\u00ad\2\2\u0254\u0255\5\u00fa~\2\u0255" +
                    "\u0256\7\20\2\2\u0256\u0257\5\u0094K\2\u0257\u025a\3\2\2\2\u0258\u025a" +
                    "\5\u0092J\2\u0259\u0253\3\2\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2" +
                    "\2\u025a\u025b\3\2\2\2\u025b\u025d\7\13\2\2\u025c\u025e\5\u0090I\2\u025d" +
                    "\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\7\13" +
                    "\2\2\u0260\u0262\5\66\34\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262" +
                    "\u0263\3\2\2\2\u0263\u0264\7\16\2\2\u0264\u0265\5\64\33\2\u02659\3\2\2" +
                    "\2\u0266\u0267\7f\2\2\u0267\u026b\7\t\2\2\u0268\u026a\5\n\6\2\u0269\u0268" +
                    "\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c" +
                    "\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\n\2\2\u026f\u0270\7e" +
                    "\2\2\u0270\u0271\5\u0090I\2\u0271\u0272\7\13\2\2\u0272;\3\2\2\2\u0273" +
                    "\u0274\7e\2\2\u0274\u0275\5\u0090I\2\u0275\u0276\5\64\33\2\u0276=\3\2" +
                    "\2\2\u0277\u0278\7\r\2\2\u0278\u0279\5\u0090I\2\u0279\u027a\7\16\2\2\u027a" +
                    "?\3\2\2\2\u027b\u027f\7\t\2\2\u027c\u027e\5\n\6\2\u027d\u027c\3\2\2\2" +
                    "\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282" +
                    "\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0285\7\n\2\2\u0283\u0285\5\n\6\2\u0284" +
                    "\u027b\3\2\2\2\u0284\u0283\3\2\2\2\u0285A\3\2\2\2\u0286\u0287\7T\2\2\u0287" +
                    "\u0288\5F$\2\u0288C\3\2\2\2\u0289\u028a\7T\2\2\u028a\u028b\5@!\2\u028b" +
                    "E\3\2\2\2\u028c\u028d\7d\2\2\u028d\u028e\5> \2\u028e\u0291\5@!\2\u028f" +
                    "\u0292\5D#\2\u0290\u0292\5B\"\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2" +
                    "\2\u0291\u0292\3\2\2\2\u0292G\3\2\2\2\u0293\u0294\7\r\2\2\u0294\u0295" +
                    "\5H%\2\u0295\u0296\7\16\2\2\u0296\u029f\3\2\2\2\u0297\u0298\5\u0090I\2" +
                    "\u0298\u0299\7\4\2\2\u0299\u029c\5L\'\2\u029a\u029b\7\3\2\2\u029b\u029d" +
                    "\5L\'\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e" +
                    "\u0293\3\2\2\2\u029e\u0297\3\2\2\2\u029fI\3\2\2\2\u02a0\u02a1\7\r\2\2" +
                    "\u02a1\u02a2\5J&\2\u02a2\u02a3\7\16\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a6" +
                    "\5\u0090I\2\u02a5\u02a0\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6K\3\2\2\2\u02a7" +
                    "\u02a8\7\r\2\2\u02a8\u02a9\5L\'\2\u02a9\u02aa\7\16\2\2\u02aa\u02af\3\2" +
                    "\2\2\u02ab\u02af\5\u0094K\2\u02ac\u02af\5H%\2\u02ad\u02af\5\u0090I\2\u02ae" +
                    "\u02a7\3\2\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2" +
                    "\2\2\u02afM\3\2\2\2\u02b0\u02b1\7\u00b0\2\2\u02b1\u02b4\7\r\2\2\u02b2" +
                    "\u02b5\5\u0092J\2\u02b3\u02b5\5\u0094K\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3" +
                    "\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7\16\2\2\u02b7\u02be\7\t\2\2" +
                    "\u02b8\u02ba\5P)\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9" +
                    "\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be" +
                    "\u02bb\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c8\3\2\2\2\u02c0\u02c1\7K" +
                    "\2\2\u02c1\u02c5\7\3\2\2\u02c2\u02c4\5\n\6\2\u02c3\u02c2\3\2\2\2\u02c4" +
                    "\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c9\3\2" +
                    "\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9" +
                    "\u02ca\3\2\2\2\u02ca\u02cb\7\n\2\2\u02cbO\3\2\2\2\u02cc\u02cd\7=\2\2\u02cd" +
                    "\u02ce\5\u0094K\2\u02ce\u02d2\7\3\2\2\u02cf\u02d1\5\n\6\2\u02d0\u02cf" +
                    "\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3" +
                    "Q\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02da\7+\2\2\u02d6\u02db\5H%\2\u02d7" +
                    "\u02db\5\u0094K\2\u02d8\u02db\5\u0090I\2\u02d9\u02db\7\177\2\2\u02da\u02d6" +
                    "\3\2\2\2\u02da\u02d7\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02db" +
                    "\u02dc\3\2\2\2\u02dc\u02dd\7\13\2\2\u02ddS\3\2\2\2\u02de\u02df\5\u00fa" +
                    "~\2\u02df\u02e0\7\5\2\2\u02e0\u02e1\7\20\2\2\u02e1\u02e2\7\7\2\2\u02e2" +
                    "\u02e7\5\u0094K\2\u02e3\u02e4\7\17\2\2\u02e4\u02e6\5\u0094K\2\u02e5\u02e3" +
                    "\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8" +
                    "\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\7\b\2\2\u02ebU\3\2\2\2" +
                    "\u02ec\u02ef\5\u00fa~\2\u02ed\u02ee\7\20\2\2\u02ee\u02f0\5\32\16\2\u02ef" +
                    "\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02f3\5T" +
                    "+\2\u02f2\u02ec\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4" +
                    "\u02f6\5\u0092J\2\u02f5\u02f2\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f7" +
                    "\3\2\2\2\u02f7\u02f8\7\13\2\2\u02f8W\3\2\2\2\u02f9\u02fa\t\3\2\2\u02fa" +
                    "Y\3\2\2\2\u02fb\u0301\5\u00fa~\2\u02fc\u02fd\7\r\2\2\u02fd\u02fe\5\u0096" +
                    "L\2\u02fe\u02ff\7\16\2\2\u02ff\u0301\3\2\2\2\u0300\u02fb\3\2\2\2\u0300" +
                    "\u02fc\3\2\2\2\u0301[\3\2\2\2\u0302\u0305\5`\61\2\u0303\u0305\5^\60\2" +
                    "\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305]\3\2\2\2\u0306\u0307\5" +
                    "Z.\2\u0307\u0308\5X-\2\u0308_\3\2\2\2\u0309\u030a\5X-\2\u030a\u030b\5" +
                    "Z.\2\u030ba\3\2\2\2\u030c\u030d\7\61\2\2\u030d\u0311\7\u009a\2\2\u030e" +
                    "\u030f\5\u00dan\2\u030f\u0310\7\f\2\2\u0310\u0312\3\2\2\2\u0311\u030e" +
                    "\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u031e\5\u00dco" +
                    "\2\u0314\u0315\7\u0091\2\2\u0315\u0316\7\u009e\2\2\u0316\u031f\5\u00e2" +
                    "r\2\u0317\u031f\5f\64\2\u0318\u031f\5d\63\2\u0319\u031b\7.\2\2\u031a\u031c" +
                    "\7A\2\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d" +
                    "\u031f\5z>\2\u031e\u0314\3\2\2\2\u031e\u0317\3\2\2\2\u031e\u0318\3\2\2" +
                    "\2\u031e\u0319\3\2\2\2\u031fc\3\2\2\2\u0320\u0321\7.\2\2\u0321\u0322\7" +
                    "D\2\2\u0322\u0323\5\u00fa~\2\u0323\u0324\5\u00a2R\2\u0324e\3\2\2\2\u0325" +
                    "\u0326\7.\2\2\u0326\u0327\5\u00a2R\2\u0327g\3\2\2\2\u0328\u0329\7E\2\2" +
                    "\u0329\u032d\7\u009a\2\2\u032a\u032b\7d\2\2\u032b\u032c\7}\2\2\u032c\u032e" +
                    "\7Z\2\2\u032d\u032a\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0332\3\2\2\2\u032f" +
                    "\u0330\5\u00dan\2\u0330\u0331\7\f\2\2\u0331\u0333\3\2\2\2\u0332\u032f" +
                    "\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0344\5\u00dep" +
                    "\2\u0335\u0336\7\r\2\2\u0336\u033d\5z>\2\u0337\u0338\7\17\2\2\u0338\u033c" +
                    "\5\u00a2R\2\u0339\u033a\7\17\2\2\u033a\u033c\5z>\2\u033b\u0337\3\2\2\2" +
                    "\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e" +
                    "\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341\7\16\2\2" +
                    "\u0341\u0345\3\2\2\2\u0342\u0343\7\64\2\2\u0343\u0345\5n8\2\u0344\u0335" +
                    "\3\2\2\2\u0344\u0342\3\2\2\2\u0345i\3\2\2\2\u0346\u0347\7N\2\2\u0347\u0348" +
                    "\7_\2\2\u0348\u034b\5\u00aeX\2\u0349\u034a\7\u00aa\2\2\u034a\u034c\5\u0098" +
                    "M\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034ck\3\2\2\2\u034d\u034e" +
                    "\7R\2\2\u034e\u0351\7\u009a\2\2\u034f\u0350\7d\2\2\u0350\u0352\7Z\2\2" +
                    "\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0356\3\2\2\2\u0353\u0354" +
                    "\5\u00dan\2\u0354\u0355\7\f\2\2\u0355\u0357\3\2\2\2\u0356\u0353\3\2\2" +
                    "\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5\u00dep\2\u0359" +
                    "m\3\2\2\2\u035a\u0365\5\u00c0a\2\u035b\u035c\7\u0085\2\2\u035c\u035d\7" +
                    ";\2\2\u035d\u0362\5\u00b0Y\2\u035e\u035f\7\17\2\2\u035f\u0361\5\u00b0" +
                    "Y\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362" +
                    "\u0363\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u035b\3\2" +
                    "\2\2\u0365\u0366\3\2\2\2\u0366\u036d\3\2\2\2\u0367\u0368\7x\2\2\u0368" +
                    "\u036b\5\u0098M\2\u0369\u036a\t\4\2\2\u036a\u036c\5\u0098M\2\u036b\u0369" +
                    "\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u0367\3\2\2\2\u036d" +
                    "\u036e\3\2\2\2\u036eo\3\2\2\2\u036f\u0370\7n\2\2\u0370\u0374\7q\2\2\u0371" +
                    "\u0372\5\u00dan\2\u0372\u0373\7\f\2\2\u0373\u0375\3\2\2\2\u0374\u0371" +
                    "\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0382\5\u00dep" +
                    "\2\u0377\u0378\7\r\2\2\u0378\u037d\5\u00e4s\2\u0379\u037a\7\17\2\2\u037a" +
                    "\u037c\5\u00e4s\2\u037b\u0379\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b" +
                    "\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380" +
                    "\u0381\7\16\2\2\u0381\u0383\3\2\2\2\u0382\u0377\3\2\2\2\u0382\u0383\3" +
                    "\2\2\2\u0383\u03a3\3\2\2\2\u0384\u0385\7\u00a6\2\2\u0385\u0386\7\r\2\2" +
                    "\u0386\u038b\5\u0098M\2\u0387\u0388\7\17\2\2\u0388\u038a\5\u0098M\2\u0389" +
                    "\u0387\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2" +
                    "\2\2\u038c\u038e\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u039d\7\16\2\2\u038f" +
                    "\u0390\7\17\2\2\u0390\u0391\7\r\2\2\u0391\u0396\5\u0098M\2\u0392\u0393" +
                    "\7\17\2\2\u0393\u0395\5\u0098M\2\u0394\u0392\3\2\2\2\u0395\u0398\3\2\2" +
                    "\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u0396" +
                    "\3\2\2\2\u0399\u039a\7\16\2\2\u039a\u039c\3\2\2\2\u039b\u038f\3\2\2\2" +
                    "\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a4" +
                    "\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a4\5n8\2\u03a1\u03a2\7K\2\2\u03a2" +
                    "\u03a4\7\u00a6\2\2\u03a3\u0384\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1" +
                    "\3\2\2\2\u03a4q\3\2\2\2\u03a5\u03b0\5t;\2\u03a6\u03a7\7\u0085\2\2\u03a7" +
                    "\u03a8\7;\2\2\u03a8\u03ad\5\u00b0Y\2\u03a9\u03aa\7\17\2\2\u03aa\u03ac" +
                    "\5\u00b0Y\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2" +
                    "\2\u03ad\u03ae\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03a6" +
                    "\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b8\3\2\2\2\u03b2\u03b3\7x\2\2\u03b3" +
                    "\u03b6\5\u0098M\2\u03b4\u03b5\t\4\2\2\u03b5\u03b7\5\u0098M\2\u03b6\u03b4" +
                    "\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b2\3\2\2\2\u03b8" +
                    "\u03b9\3\2\2\2\u03b9s\3\2\2\2\u03ba\u03bc\7\u0098\2\2\u03bb\u03bd\t\5" +
                    "\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be" +
                    "\u03c3\5\u00b6\\\2\u03bf\u03c0\7\17\2\2\u03c0\u03c2\5\u00b6\\\2\u03c1" +
                    "\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2" +
                    "\2\2\u03c4\u03d2\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03d0\7_\2\2\u03c7" +
                    "\u03cc\5\u00b8]\2\u03c8\u03c9\7\17\2\2\u03c9\u03cb\5\u00b8]\2\u03ca\u03c8" +
                    "\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd" +
                    "\u03d1\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d1\5\u00ba^\2\u03d0\u03c7" +
                    "\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03c6\3\2\2\2\u03d2" +
                    "\u03d3\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d5\7\u00aa\2\2\u03d5\u03d7" +
                    "\5\u0098M\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03e6\3\2\2" +
                    "\2\u03d8\u03d9\7b\2\2\u03d9\u03da\7;\2\2\u03da\u03df\5\u0098M\2\u03db" +
                    "\u03dc\7\17\2\2\u03dc\u03de\5\u0098M\2\u03dd\u03db\3\2\2\2\u03de\u03e1" +
                    "\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e4\3\2\2\2\u03e1" +
                    "\u03df\3\2\2\2\u03e2\u03e3\7c\2\2\u03e3\u03e5\5\u0098M\2\u03e4\u03e2\3" +
                    "\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03d8\3\2\2\2\u03e6" +
                    "\u03e7\3\2\2\2\u03e7\u0405\3\2\2\2\u03e8\u03e9\7\u00a6\2\2\u03e9\u03ea" +
                    "\7\r\2\2\u03ea\u03ef\5\u0098M\2\u03eb\u03ec\7\17\2\2\u03ec\u03ee\5\u0098" +
                    "M\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef" +
                    "\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u0401\7\16" +
                    "\2\2\u03f3\u03f4\7\17\2\2\u03f4\u03f5\7\r\2\2\u03f5\u03fa\5\u0098M\2\u03f6" +
                    "\u03f7\7\17\2\2\u03f7\u03f9\5\u0098M\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc" +
                    "\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc" +
                    "\u03fa\3\2\2\2\u03fd\u03fe\7\16\2\2\u03fe\u0400\3\2\2\2\u03ff\u03f3\3" +
                    "\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402" +
                    "\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u03ba\3\2\2\2\u0404\u03e8\3\2" +
                    "\2\2\u0405u\3\2\2\2\u0406\u0407\5\u0098M\2\u0407w\3\2\2\2\u0408\u0409" +
                    "\7\u00a3\2\2\u0409\u040a\5\u00aeX\2\u040a\u040b\7\u0099\2\2\u040b\u040c" +
                    "\5\u00e4s\2\u040c\u040d\7\20\2\2\u040d\u0415\5\u0098M\2\u040e\u040f\7" +
                    "\17\2\2\u040f\u0410\5\u00e4s\2\u0410\u0411\7\20\2\2\u0411\u0412\5\u0098" +
                    "M\2\u0412\u0414\3\2\2\2\u0413\u040e\3\2\2\2\u0414\u0417\3\2\2\2\u0415" +
                    "\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u041a\3\2\2\2\u0417\u0415\3\2" +
                    "\2\2\u0418\u0419\7\u00aa\2\2\u0419\u041b\5\u0098M\2\u041a\u0418\3\2\2" +
                    "\2\u041a\u041b\3\2\2\2\u041by\3\2\2\2\u041c\u0421\5\u00e4s\2\u041d\u0420" +
                    "\5\u0080A\2\u041e\u0420\5|?\2\u041f\u041d\3\2\2\2\u041f\u041e\3\2\2\2" +
                    "\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422{\3" +
                    "\2\2\2\u0423\u0421\3\2\2\2\u0424\u042f\5\u00fa~\2\u0425\u0426\7\r\2\2" +
                    "\u0426\u0427\5~@\2\u0427\u0428\7\16\2\2\u0428\u0430\3\2\2\2\u0429\u042a" +
                    "\7\r\2\2\u042a\u042b\5~@\2\u042b\u042c\7\17\2\2\u042c\u042d\5~@\2\u042d" +
                    "\u042e\7\16\2\2\u042e\u0430\3\2\2\2\u042f\u0425\3\2\2\2\u042f\u0429\3" +
                    "\2\2\2\u042f\u0430\3\2\2\2\u0430}\3\2\2\2\u0431\u0433\5\u00c8e\2\u0432" +
                    "\u0434\5\u00fa~\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\177\3" +
                    "\2\2\2\u0435\u0436\7D\2\2\u0436\u0438\5\u00d6l\2\u0437\u0435\3\2\2\2\u0437" +
                    "\u0438\3\2\2\2\u0438\u0445\3\2\2\2\u0439\u0446\5\u0082B\2\u043a\u0446" +
                    "\5\u0084C\2\u043b\u0446\5\u0086D\2\u043c\u0446\5\u0088E\2\u043d\u043e" +
                    "\7?\2\2\u043e\u043f\7\r\2\2\u043f\u0440\5\u0098M\2\u0440\u0441\7\16\2" +
                    "\2\u0441\u0446\3\2\2\2\u0442\u0446\5\u008aF\2\u0443\u0444\7@\2\2\u0444" +
                    "\u0446\5\u00e6t\2\u0445\u0439\3\2\2\2\u0445\u043a\3\2\2\2\u0445\u043b" +
                    "\3\2\2\2\u0445\u043c\3\2\2\2\u0445\u043d\3\2\2\2\u0445\u0442\3\2\2\2\u0445" +
                    "\u0443\3\2\2\2\u0446\u0081\3\2\2\2\u0447\u0448\7\u0089\2\2\u0448\u044a" +
                    "\7u\2\2\u0449\u044b\t\6\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b" +
                    "\u044d\3\2\2\2\u044c\u044e\7\67\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3" +
                    "\2\2\2\u044e\u0083\3\2\2\2\u044f\u0450\5\u009cO\2\u0450\u0085\3\2\2\2" +
                    "\u0451\u0452\7}\2\2\u0452\u0453\7\177\2\2\u0453\u0087\3\2\2\2\u0454\u0455" +
                    "\7\177\2\2\u0455\u0089\3\2\2\2\u0456\u0462\7K\2\2\u0457\u0463\5\u008c" +
                    "G\2\u0458\u0459\7\r\2\2\u0459\u045a\5\u0098M\2\u045a\u045b\7\16\2\2\u045b" +
                    "\u0463\3\2\2\2\u045c\u045d\7{\2\2\u045d\u045e\7\r\2\2\u045e\u045f\5\u0098" +
                    "M\2\u045f\u0460\7\16\2\2\u0460\u0463\3\2\2\2\u0461\u0463\5\u00fa~\2\u0462" +
                    "\u0457\3\2\2\2\u0462\u0458\3\2\2\2\u0462\u045c\3\2\2\2\u0462\u0461\3\2" +
                    "\2\2\u0463\u046a\3\2\2\2\u0464\u0466\7\6\2\2\u0465\u0467\5\u00fa~\2\u0466" +
                    "\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2" +
                    "\2\2\u0469\u046b\3\2\2\2\u046a\u0464\3\2\2\2\u046a\u046b\3\2\2\2\u046b" +
                    "\u008b\3\2\2\2\u046c\u046f\5\u00c8e\2\u046d\u046f\5\u00caf\2\u046e\u046c" +
                    "\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u008d\3\2\2\2\u0470\u0473\5 \21\2\u0471" +
                    "\u0473\5\36\20\2\u0472\u0470\3\2\2\2\u0472\u0471\3\2\2\2\u0473\u008f\3" +
                    "\2\2\2\u0474\u0475\bI\1\2\u0475\u0476\5\u0096L\2\u0476\u0477\t\7\2\2\u0477" +
                    "\u0478\5\u0096L\2\u0478\u048c\3\2\2\2\u0479\u047a\5\u0096L\2\u047a\u047b" +
                    "\t\b\2\2\u047b\u047c\5\u0096L\2\u047c\u048c\3\2\2\2\u047d\u047e\5\u0096" +
                    "L\2\u047e\u047f\t\t\2\2\u047f\u0480\5\u0096L\2\u0480\u048c\3\2\2\2\u0481" +
                    "\u0482\7\r\2\2\u0482\u0483\5\u0090I\2\u0483\u0484\7\16\2\2\u0484\u048c" +
                    "\3\2\2\2\u0485\u0486\5\u00fa~\2\u0486\u0487\5\36\20\2\u0487\u048c\3\2" +
                    "\2\2\u0488\u048c\5 \21\2\u0489\u048c\7\u00ae\2\2\u048a\u048c\7\u00af\2" +
                    "\2\u048b\u0474\3\2\2\2\u048b\u0479\3\2\2\2\u048b\u047d\3\2\2\2\u048b\u0481" +
                    "\3\2\2\2\u048b\u0485\3\2\2\2\u048b\u0488\3\2\2\2\u048b\u0489\3\2\2\2\u048b" +
                    "\u048a\3\2\2\2\u048c\u0495\3\2\2\2\u048d\u048e\f\f\2\2\u048e\u048f\t\n" +
                    "\2\2\u048f\u0494\5\u0090I\r\u0490\u0491\f\t\2\2\u0491\u0492\t\t\2\2\u0492" +
                    "\u0494\5\u0090I\n\u0493\u048d\3\2\2\2\u0493\u0490\3\2\2\2\u0494\u0497" +
                    "\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0091\3\2\2\2\u0497" +
                    "\u0495\3\2\2\2\u0498\u0499\5\u00fa~\2\u0499\u049a\t\13\2\2\u049a\u049b" +
                    "\5\u0094K\2\u049b\u04a6\3\2\2\2\u049c\u049d\5\u00fa~\2\u049d\u049e\t\f" +
                    "\2\2\u049e\u049f\5\u0094K\2\u049f\u04a6\3\2\2\2\u04a0\u04a6\5\\/\2\u04a1" +
                    "\u04a2\7\r\2\2\u04a2\u04a3\5\u0092J\2\u04a3\u04a4\7\16\2\2\u04a4\u04a6" +
                    "\3\2\2\2\u04a5\u0498\3\2\2\2\u04a5\u049c\3\2\2\2\u04a5\u04a0\3\2\2\2\u04a5" +
                    "\u04a1\3\2\2\2\u04a6\u0093\3\2\2\2\u04a7\u04a8\bK\1\2\u04a8\u04b2\7\u00b5" +
                    "\2\2\u04a9\u04b2\5\u00fa~\2\u04aa\u04b2\5 \21\2\u04ab\u04b2\5\36\20\2" +
                    "\u04ac\u04ad\7\r\2\2\u04ad\u04ae\5\u0094K\2\u04ae\u04af\7\16\2\2\u04af" +
                    "\u04b2\3\2\2\2\u04b0\u04b2\5\\/\2\u04b1\u04a7\3\2\2\2\u04b1\u04a9\3\2" +
                    "\2\2\u04b1\u04aa\3\2\2\2\u04b1\u04ab\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b1" +
                    "\u04b0\3\2\2\2\u04b2\u04bb\3\2\2\2\u04b3\u04b4\f\6\2\2\u04b4\u04b5\t\r" +
                    "\2\2\u04b5\u04ba\5\u0094K\7\u04b6\u04b7\f\5\2\2\u04b7\u04b8\t\16\2\2\u04b8" +
                    "\u04ba\5\u0094K\6\u04b9\u04b3\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u04bd" +
                    "\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u0095\3\2\2\2\u04bd" +
                    "\u04bb\3\2\2\2\u04be\u04bf\bL\1\2\u04bf\u04cd\7\u00b5\2\2\u04c0\u04cd" +
                    "\5\u00fa~\2\u04c1\u04cd\5 \21\2\u04c2\u04cd\5\36\20\2\u04c3\u04c4\5\u00fa" +
                    "~\2\u04c4\u04c5\t\17\2\2\u04c5\u04c6\5\u0096L\5\u04c6\u04cd\3\2\2\2\u04c7" +
                    "\u04cd\5\\/\2\u04c8\u04c9\7\r\2\2\u04c9\u04ca\5\u0096L\2\u04ca\u04cb\7" +
                    "\16\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04be\3\2\2\2\u04cc\u04c0\3\2\2\2\u04cc" +
                    "\u04c1\3\2\2\2\u04cc\u04c2\3\2\2\2\u04cc\u04c3\3\2\2\2\u04cc\u04c7\3\2" +
                    "\2\2\u04cc\u04c8\3\2\2\2\u04cd\u04d6\3\2\2\2\u04ce\u04cf\f\7\2\2\u04cf" +
                    "\u04d0\t\r\2\2\u04d0\u04d5\5\u0096L\b\u04d1\u04d2\f\6\2\2\u04d2\u04d3" +
                    "\t\16\2\2\u04d3\u04d5\5\u0096L\7\u04d4\u04ce\3\2\2\2\u04d4\u04d1\3\2\2" +
                    "\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u0097" +
                    "\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04da\bM\1\2\u04da\u050a\5\u00caf\2" +
                    "\u04db\u04dc\5\u00dan\2\u04dc\u04dd\7\f\2\2\u04dd\u04df\3\2\2\2\u04de" +
                    "\u04db\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\5\u00de" +
                    "p\2\u04e1\u04e2\7\f\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04de\3\2\2\2\u04e3" +
                    "\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u050a\5\u00e4s\2\u04e6\u04e7" +
                    "\5\u00ccg\2\u04e7\u04e8\5\u0098M\17\u04e8\u050a\3\2\2\2\u04e9\u04ea\5" +
                    "\u00d8m\2\u04ea\u04f7\7\r\2\2\u04eb\u04ed\7Q\2\2\u04ec\u04eb\3\2\2\2\u04ec" +
                    "\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f3\5\u0098M\2\u04ef\u04f0" +
                    "\7\17\2\2\u04f0\u04f2\5\u0098M\2\u04f1\u04ef\3\2\2\2\u04f2\u04f5\3\2\2" +
                    "\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f8\3\2\2\2\u04f5\u04f3" +
                    "\3\2\2\2\u04f6\u04f8\7\21\2\2\u04f7\u04ec\3\2\2\2\u04f7\u04f6\3\2\2\2" +
                    "\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\16\2\2\u04fa\u050a" +
                    "\3\2\2\2\u04fb\u04fc\7\r\2\2\u04fc\u04fd\5\u0098M\2\u04fd\u04fe\7\16\2" +
                    "\2\u04fe\u050a\3\2\2\2\u04ff\u0501\7}\2\2\u0500\u04ff\3\2\2\2\u0500\u0501" +
                    "\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\7Z\2\2\u0503\u0500\3\2\2\2\u0503" +
                    "\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7\r\2\2\u0506\u0507\5n" +
                    "8\2\u0507\u0508\7\16\2\2\u0508\u050a\3\2\2\2\u0509\u04d9\3\2\2\2\u0509" +
                    "\u04e3\3\2\2\2\u0509\u04e6\3\2\2\2\u0509\u04e9\3\2\2\2\u0509\u04fb\3\2" +
                    "\2\2\u0509\u0503\3\2\2\2\u050a\u054c\3\2\2\2\u050b\u050c\f\16\2\2\u050c" +
                    "\u050d\7\34\2\2\u050d\u054b\5\u0098M\17\u050e\u050f\f\r\2\2\u050f\u0510" +
                    "\t\r\2\2\u0510\u054b\5\u0098M\16\u0511\u0512\f\f\2\2\u0512\u0513\t\16" +
                    "\2\2\u0513\u054b\5\u0098M\r\u0514\u0515\f\13\2\2\u0515\u0516\t\20\2\2" +
                    "\u0516\u054b\5\u0098M\f\u0517\u0518\f\n\2\2\u0518\u0519\t\b\2\2\u0519" +
                    "\u054b\5\u0098M\13\u051a\u0527\f\t\2\2\u051b\u0528\7\20\2\2\u051c\u0528" +
                    "\7\'\2\2\u051d\u0528\7(\2\2\u051e\u0528\7)\2\2\u051f\u0520\7r\2\2\u0520" +
                    "\u0528\7}\2\2\u0521\u0528\7r\2\2\u0522\u0528\7i\2\2\u0523\u0528\7w\2\2" +
                    "\u0524\u0528\7a\2\2\u0525\u0528\7y\2\2\u0526\u0528\7\u008e\2\2\u0527\u051b" +
                    "\3\2\2\2\u0527\u051c\3\2\2\2\u0527\u051d\3\2\2\2\u0527\u051e\3\2\2\2\u0527" +
                    "\u051f\3\2\2\2\u0527\u0521\3\2\2\2\u0527\u0522\3\2\2\2\u0527\u0523\3\2" +
                    "\2\2\u0527\u0524\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0526\3\2\2\2\u0528" +
                    "\u0529\3\2\2\2\u0529\u054b\5\u0098M\n\u052a\u052b\f\b\2\2\u052b\u052c" +
                    "\7\63\2\2\u052c\u054b\5\u0098M\t\u052d\u052e\f\7\2\2\u052e\u052f\7\u0084" +
                    "\2\2\u052f\u054b\5\u0098M\b\u0530\u0532\f\3\2\2\u0531\u0533\7}\2\2\u0532" +
                    "\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0548\7i" +
                    "\2\2\u0535\u053f\7\r\2\2\u0536\u0540\5n8\2\u0537\u053c\5\u0098M\2\u0538" +
                    "\u0539\7\17\2\2\u0539\u053b\5\u0098M\2\u053a\u0538\3\2\2\2\u053b\u053e" +
                    "\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0540\3\2\2\2\u053e" +
                    "\u053c\3\2\2\2\u053f\u0536\3\2\2\2\u053f\u0537\3\2\2\2\u053f\u0540\3\2" +
                    "\2\2\u0540\u0541\3\2\2\2\u0541\u0549\7\16\2\2\u0542\u0543\5\u00dan\2\u0543" +
                    "\u0544\7\f\2\2\u0544\u0546\3\2\2\2\u0545\u0542\3\2\2\2\u0545\u0546\3\2" +
                    "\2\2\u0546\u0547\3\2\2\2\u0547\u0549\5\u00dep\2\u0548\u0535\3\2\2\2\u0548" +
                    "\u0545\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u050b\3\2\2\2\u054a\u050e\3\2" +
                    "\2\2\u054a\u0511\3\2\2\2\u054a\u0514\3\2\2\2\u054a\u0517\3\2\2\2\u054a" +
                    "\u051a\3\2\2\2\u054a\u052a\3\2\2\2\u054a\u052d\3\2\2\2\u054a\u0530\3\2" +
                    "\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d" +
                    "\u0099\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0550\7\u0082\2\2\u0550\u0559" +
                    "\t\21\2\2\u0551\u0552\7\u0099\2\2\u0552\u055a\7\177\2\2\u0553\u0554\7" +
                    "\u0099\2\2\u0554\u055a\7K\2\2\u0555\u055a\7<\2\2\u0556\u055a\7\u0093\2" +
                    "\2\u0557\u0558\7|\2\2\u0558\u055a\7-\2\2\u0559\u0551\3\2\2\2\u0559\u0553" +
                    "\3\2\2\2\u0559\u0555\3\2\2\2\u0559\u0556\3\2\2\2\u0559\u0557\3\2\2\2\u055a" +
                    "\u055e\3\2\2\2\u055b\u055c\7y\2\2\u055c\u055e\5\u00d6l\2\u055d\u054f\3" +
                    "\2\2\2\u055d\u055b\3\2\2\2\u055e\u009b\3\2\2\2\u055f\u0563\7\u008d\2\2" +
                    "\u0560\u0561\5\u00dan\2\u0561\u0562\7\f\2\2\u0562\u0564\3\2\2\2\u0563" +
                    "\u0560\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0571\5\u00e8" +
                    "u\2\u0566\u0567\7\r\2\2\u0567\u056c\5\u009eP\2\u0568\u0569\7\17\2\2\u0569" +
                    "\u056b\5\u009eP\2\u056a\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a" +
                    "\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u056c\3\2\2\2\u056f" +
                    "\u0570\7\16\2\2\u0570\u0572\3\2\2\2\u0571\u0566\3\2\2\2\u0571\u0572\3" +
                    "\2\2\2\u0572\u0576\3\2\2\2\u0573\u0575\5\u009aN\2\u0574\u0573\3\2\2\2" +
                    "\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0586" +
                    "\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057b\7}\2\2\u057a\u0579\3\2\2\2\u057a" +
                    "\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u0581\7L\2\2\u057d\u057e\7l\2" +
                    "\2\u057e\u0582\7M\2\2\u057f\u0580\7l\2\2\u0580\u0582\7h\2\2\u0581\u057d" +
                    "\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583" +
                    "\u0585\7V\2\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2" +
                    "\2\2\u0586\u057a\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u009d\3\2\2\2\u0588" +
                    "\u0589\5\u00d6l\2\u0589\u009f\3\2\2\2\u058a\u058d\5\u00e4s\2\u058b\u058c" +
                    "\7@\2\2\u058c\u058e\5\u00e6t\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2" +
                    "\u058e\u0590\3\2\2\2\u058f\u0591\t\6\2\2\u0590\u058f\3\2\2\2\u0590\u0591" +
                    "\3\2\2\2\u0591\u00a1\3\2\2\2\u0592\u0593\7D\2\2\u0593\u0595\5\u00d6l\2" +
                    "\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u059f\3\2\2\2\u0596\u05a0" +
                    "\5\u00a4S\2\u0597\u05a0\5\u00aaV\2\u0598\u05a0\5\u00a8U\2\u0599\u059a" +
                    "\7?\2\2\u059a\u059b\7\r\2\2\u059b\u059c\5\u0098M\2\u059c\u059d\7\16\2" +
                    "\2\u059d\u05a0\3\2\2\2\u059e\u05a0\5\u00a6T\2\u059f\u0596\3\2\2\2\u059f" +
                    "\u0597\3\2\2\2\u059f\u0598\3\2\2\2\u059f\u0599\3\2\2\2\u059f\u059e\3\2" +
                    "\2\2\u05a0\u00a3\3\2\2\2\u05a1\u05a2\7\u0089\2\2\u05a2\u05a3\7u\2\2\u05a3" +
                    "\u05a4\7\r\2\2\u05a4\u05a9\5\u00a0Q\2\u05a5\u05a6\7\17\2\2\u05a6\u05a8" +
                    "\5\u00a0Q\2\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2" +
                    "\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad" +
                    "\7\16\2\2\u05ad\u00a5\3\2\2\2\u05ae\u05af\7^\2\2\u05af\u05b0\7u\2\2\u05b0" +
                    "\u05b1\7\r\2\2\u05b1\u05b6\5\u00acW\2\u05b2\u05b3\7\17\2\2\u05b3\u05b5" +
                    "\5\u00acW\2\u05b4\u05b2\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2" +
                    "\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05ba" +
                    "\7\16\2\2\u05ba\u05bb\5\u009cO\2\u05bb\u00a7\3\2\2\2\u05bc\u05be\7\u00a2" +
                    "\2\2\u05bd\u05bf\7u\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf" +
                    "\u05c1\3\2\2\2\u05c0\u05c2\5\u00d6l\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2" +
                    "\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7\r\2\2\u05c4\u05c9\5\u00a0Q" +
                    "\2\u05c5\u05c6\7\17\2\2\u05c6\u05c8\5\u00a0Q\2\u05c7\u05c5\3\2\2\2\u05c8" +
                    "\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2" +
                    "\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05cd\7\16\2\2\u05cd\u00a9\3\2\2\2\u05ce" +
                    "\u05d0\7u\2\2\u05cf\u05d1\5\u00d6l\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3" +
                    "\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\7\r\2\2\u05d3\u05d8\5\u00a0Q\2" +
                    "\u05d4\u05d5\7\17\2\2\u05d5\u05d7\5\u00a0Q\2\u05d6\u05d4\3\2\2\2\u05d7" +
                    "\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2" +
                    "\2\2\u05da\u05d8\3\2\2\2\u05db\u05dc\7\16\2\2\u05dc\u00ab\3\2\2\2\u05dd" +
                    "\u05de\5\u00e4s\2\u05de\u00ad\3\2\2\2\u05df\u05e0\5\u00dan\2\u05e0\u05e1" +
                    "\7\f\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05df\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3" +
                    "\u05e4\3\2\2\2\u05e4\u05ea\5\u00dep\2\u05e5\u05e6\7k\2\2\u05e6\u05e7\7" +
                    ";\2\2\u05e7\u05eb\5\u00eav\2\u05e8\u05e9\7}\2\2\u05e9\u05eb\7k\2\2\u05ea" +
                    "\u05e5\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u00af\3\2" +
                    "\2\2\u05ec\u05ef\5\u0098M\2\u05ed\u05ee\7@\2\2\u05ee\u05f0\5\u00e6t\2" +
                    "\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\3\2\2\2\u05f1\u05f3" +
                    "\t\6\2\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u00b1\3\2\2\2\u05f4" +
                    "\u05f8\5\u00c8e\2\u05f5\u05f8\5\u00d6l\2\u05f6\u05f8\7\u00b7\2\2\u05f7" +
                    "\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8\u00b3\3\2" +
                    "\2\2\u05f9\u0605\5\u00dep\2\u05fa\u05fb\7\r\2\2\u05fb\u0600\5\u00e4s\2" +
                    "\u05fc\u05fd\7\17\2\2\u05fd\u05ff\5\u00e4s\2\u05fe\u05fc\3\2\2\2\u05ff" +
                    "\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2" +
                    "\2\2\u0602\u0600\3\2\2\2\u0603\u0604\7\16\2\2\u0604\u0606\3\2\2\2\u0605" +
                    "\u05fa\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\7\64" +
                    "\2\2\u0608\u0609\7\r\2\2\u0609\u060a\5r:\2\u060a\u060b\7\16\2\2\u060b" +
                    "\u00b5\3\2\2\2\u060c\u0619\7\21\2\2\u060d\u060e\5\u00dep\2\u060e\u060f" +
                    "\7\f\2\2\u060f\u0610\7\21\2\2\u0610\u0619\3\2\2\2\u0611\u0616\5\u0098" +
                    "M\2\u0612\u0614\7\64\2\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614" +
                    "\u0615\3\2\2\2\u0615\u0617\5\u00d2j\2\u0616\u0613\3\2\2\2\u0616\u0617" +
                    "\3\2\2\2\u0617\u0619\3\2\2\2\u0618\u060c\3\2\2\2\u0618\u060d\3\2\2\2\u0618" +
                    "\u0611\3\2\2\2\u0619\u00b7\3\2\2\2\u061a\u061b\5\u00dan\2\u061b\u061c" +
                    "\7\f\2\2\u061c\u061e\3\2\2\2\u061d\u061a\3\2\2\2\u061d\u061e\3\2\2\2\u061e" +
                    "\u061f\3\2\2\2\u061f\u0624\5\u00dep\2\u0620\u0622\7\64\2\2\u0621\u0620" +
                    "\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\5\u00f6|" +
                    "\2\u0624\u0621\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u062b\3\2\2\2\u0626\u0627" +
                    "\7k\2\2\u0627\u0628\7;\2\2\u0628\u062c\5\u00eav\2\u0629\u062a\7}\2\2\u062a" +
                    "\u062c\7k\2\2\u062b\u0626\3\2\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2" +
                    "\2\2\u062c\u064a\3\2\2\2\u062d\u0637\7\r\2\2\u062e\u0633\5\u00b8]\2\u062f" +
                    "\u0630\7\17\2\2\u0630\u0632\5\u00b8]\2\u0631\u062f\3\2\2\2\u0632\u0635" +
                    "\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0638\3\2\2\2\u0635" +
                    "\u0633\3\2\2\2\u0636\u0638\5\u00ba^\2\u0637\u062e\3\2\2\2\u0637\u0636" +
                    "\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063e\7\16\2\2\u063a\u063c\7\64\2\2" +
                    "\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f" +
                    "\5\u00f6|\2\u063e\u063b\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u064a\3\2\2" +
                    "\2\u0640\u0641\7\r\2\2\u0641\u0642\5n8\2\u0642\u0647\7\16\2\2\u0643\u0645" +
                    "\7\64\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2" +
                    "\u0646\u0648\5\u00f6|\2\u0647\u0644\3\2\2\2\u0647\u0648\3\2\2\2\u0648" +
                    "\u064a\3\2\2\2\u0649\u061d\3\2\2\2\u0649\u062d\3\2\2\2\u0649\u0640\3\2" +
                    "\2\2\u064a\u00b9\3\2\2\2\u064b\u0652\5\u00b8]\2\u064c\u064d\5\u00bc_\2" +
                    "\u064d\u064e\5\u00b8]\2\u064e\u064f\5\u00be`\2\u064f\u0651\3\2\2\2\u0650" +
                    "\u064c\3\2\2\2\u0651\u0654\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2" +
                    "\2\2\u0653\u00bb\3\2\2\2\u0654\u0652\3\2\2\2\u0655\u065f\7\17\2\2\u0656" +
                    "\u0658\7v\2\2\u0657\u0659\7\u0086\2\2\u0658\u0657\3\2\2\2\u0658\u0659" +
                    "\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u065c\7m\2\2\u065b\u0656\3\2\2\2\u065b" +
                    "\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\7t" +
                    "\2\2\u065e\u0655\3\2\2\2\u065e\u065b\3\2\2\2\u065f\u00bd\3\2\2\2\u0660" +
                    "\u0661\7\u0082\2\2\u0661\u0663\5\u0098M\2\u0662\u0660\3\2\2\2\u0662\u0663" +
                    "\3\2\2\2\u0663\u00bf\3\2\2\2\u0664\u0666\7\u0098\2\2\u0665\u0667\t\5\2" +
                    "\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066d" +
                    "\5\u00b6\\\2\u0669\u066a\7\17\2\2\u066a\u066c\5\u00b6\\\2\u066b\u0669" +
                    "\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e" +
                    "\u067c\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u067a\7_\2\2\u0671\u0676\5\u00b8" +
                    "]\2\u0672\u0673\7\17\2\2\u0673\u0675\5\u00b8]\2\u0674\u0672\3\2\2\2\u0675" +
                    "\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u067b\3\2" +
                    "\2\2\u0678\u0676\3\2\2\2\u0679\u067b\5\u00ba^\2\u067a\u0671\3\2\2\2\u067a" +
                    "\u0679\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u0670\3\2\2\2\u067c\u067d\3\2" +
                    "\2\2\u067d\u0680\3\2\2\2\u067e\u067f\7\u00aa\2\2\u067f\u0681\5\u0098M" +
                    "\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0689\3\2\2\2\u0682\u0683" +
                    "\7b\2\2\u0683\u0684\7;\2\2\u0684\u0687\5\u00c2b\2\u0685\u0686\7c\2\2\u0686" +
                    "\u0688\5\u0098M\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a" +
                    "\3\2\2\2\u0689\u0682\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u0695\3\2\2\2\u068b" +
                    "\u068c\7\u00a6\2\2\u068c\u0691\5\u00c4c\2\u068d\u068e\7\17\2\2\u068e\u0690" +
                    "\5\u00c4c\2\u068f\u068d\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2" +
                    "\2\u0691\u0692\3\2\2\2\u0692\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u0664" +
                    "\3\2\2\2\u0694\u068b\3\2\2\2\u0695\u00c1\3\2\2\2\u0696\u069b\5\u0098M" +
                    "\2\u0697\u0698\7\17\2\2\u0698\u069a\5\u0098M\2\u0699\u0697\3\2\2\2\u069a" +
                    "\u069d\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u00c3\3\2" +
                    "\2\2\u069d\u069b\3\2\2\2\u069e\u069f\7\r\2\2\u069f\u06a4\5\u0098M\2\u06a0" +
                    "\u06a1\7\17\2\2\u06a1\u06a3\5\u0098M\2\u06a2\u06a0\3\2\2\2\u06a3\u06a6" +
                    "\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\3\2\2\2\u06a6" +
                    "\u06a4\3\2\2\2\u06a7\u06a8\7\16\2\2\u06a8\u00c5\3\2\2\2\u06a9\u06b5\5" +
                    "\u00dep\2\u06aa\u06ab\7\r\2\2\u06ab\u06b0\5\u00e4s\2\u06ac\u06ad\7\17" +
                    "\2\2\u06ad\u06af\5\u00e4s\2\u06ae\u06ac\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0" +
                    "\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06b0\3\2" +
                    "\2\2\u06b3\u06b4\7\16\2\2\u06b4\u06b6\3\2\2\2\u06b5\u06aa\3\2\2\2\u06b5" +
                    "\u06b6\3\2\2\2\u06b6\u00c7\3\2\2\2\u06b7\u06b9\t\16\2\2\u06b8\u06b7\3" +
                    "\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bd\7\u00b5\2\2" +
                    "\u06bb\u06bd\7\21\2\2\u06bc\u06b8\3\2\2\2\u06bc\u06bb\3\2\2\2\u06bd\u00c9" +
                    "\3\2\2\2\u06be\u06bf\t\22\2\2\u06bf\u00cb\3\2\2\2\u06c0\u06c1\t\23\2\2" +
                    "\u06c1\u00cd\3\2\2\2\u06c2\u06c3\7\u00b7\2\2\u06c3\u00cf\3\2\2\2\u06c4" +
                    "\u06c7\5\u0098M\2\u06c5\u06c7\5z>\2\u06c6\u06c4\3\2\2\2\u06c6\u06c5\3" +
                    "\2\2\2\u06c7\u00d1\3\2\2\2\u06c8\u06c9\t\24\2\2\u06c9\u00d3\3\2\2\2\u06ca" +
                    "\u06cb\t\25\2\2\u06cb\u00d5\3\2\2\2\u06cc\u06cd\5\u00fa~\2\u06cd\u00d7" +
                    "\3\2\2\2\u06ce\u06cf\5\u00fa~\2\u06cf\u00d9\3\2\2\2\u06d0\u06d1\5\u00fa" +
                    "~\2\u06d1\u00db\3\2\2\2\u06d2\u06d3\5\u00fa~\2\u06d3\u00dd\3\2\2\2\u06d4" +
                    "\u06d5\5\u00fa~\2\u06d5\u00df\3\2\2\2\u06d6\u06d7\5\u00fa~\2\u06d7\u00e1" +
                    "\3\2\2\2\u06d8\u06d9\5\u00fa~\2\u06d9\u00e3\3\2\2\2\u06da\u06db\5\u00fa" +
                    "~\2\u06db\u00e5\3\2\2\2\u06dc\u06dd\5\u00fa~\2\u06dd\u00e7\3\2\2\2\u06de" +
                    "\u06df\5\u00fa~\2\u06df\u00e9\3\2\2\2\u06e0\u06e1\5\u00fa~\2\u06e1\u00eb" +
                    "\3\2\2\2\u06e2\u06e3\5\u00fa~\2\u06e3\u00ed\3\2\2\2\u06e4\u06e5\5\u00fa" +
                    "~\2\u06e5\u00ef\3\2\2\2\u06e6\u06e7\5\u00fa~\2\u06e7\u00f1\3\2\2\2\u06e8" +
                    "\u06e9\5\u00fa~\2\u06e9\u00f3\3\2\2\2\u06ea\u06eb\5\u00fa~\2\u06eb\u00f5" +
                    "\3\2\2\2\u06ec\u06ed\5\u00fa~\2\u06ed\u00f7\3\2\2\2\u06ee\u06ef\5\u00fa" +
                    "~\2\u06ef\u00f9\3\2\2\2\u06f0\u06f7\7\u00b4\2\2\u06f1\u06f7\7\u00b7\2" +
                    "\2\u06f2\u06f3\7\r\2\2\u06f3\u06f4\5\u00fa~\2\u06f4\u06f5\7\16\2\2\u06f5" +
                    "\u06f7\3\2\2\2\u06f6\u06f0\3\2\2\2\u06f6\u06f1\3\2\2\2\u06f6\u06f2\3\2" +
                    "\2\2\u06f7\u00fb\3\2\2\2\u00d7\u00fe\u0100\u010b\u0112\u0117\u011d\u0128" +
                    "\u0140\u0144\u0151\u0156\u015e\u0168\u0176\u0187\u018c\u018e\u0196\u0199" +
                    "\u019f\u01a2\u01a6\u01b2\u01bb\u01cb\u01d3\u01d7\u01dd\u01e2\u01e6\u01ee" +
                    "\u01f5\u01f9\u0204\u0207\u020e\u021a\u0223\u022e\u0235\u023d\u0240\u0248" +
                    "\u024d\u0259\u025d\u0261\u026b\u027f\u0284\u0291\u029c\u029e\u02a5\u02ae" +
                    "\u02b4\u02bb\u02be\u02c5\u02c8\u02d2\u02da\u02e7\u02ef\u02f2\u02f5\u0300" +
                    "\u0304\u0311\u031b\u031e\u032d\u0332\u033b\u033d\u0344\u034b\u0351\u0356" +
                    "\u0362\u0365\u036b\u036d\u0374\u037d\u0382\u038b\u0396\u039d\u03a3\u03ad" +
                    "\u03b0\u03b6\u03b8\u03bc\u03c3\u03cc\u03d0\u03d2\u03d6\u03df\u03e4\u03e6" +
                    "\u03ef\u03fa\u0401\u0404\u0415\u041a\u041f\u0421\u042f\u0433\u0437\u0445" +
                    "\u044a\u044d\u0462\u0468\u046a\u046e\u0472\u048b\u0493\u0495\u04a5\u04b1" +
                    "\u04b9\u04bb\u04cc\u04d4\u04d6\u04de\u04e3\u04ec\u04f3\u04f7\u0500\u0503" +
                    "\u0509\u0527\u0532\u053c\u053f\u0545\u0548\u054a\u054c\u0559\u055d\u0563" +
                    "\u056c\u0571\u0576\u057a\u0581\u0584\u0586\u058d\u0590\u0594\u059f\u05a9" +
                    "\u05b6\u05be\u05c1\u05c9\u05d0\u05d8\u05e2\u05ea\u05ef\u05f2\u05f7\u0600" +
                    "\u0605\u0613\u0616\u0618\u061d\u0621\u0624\u062b\u0633\u0637\u063b\u063e" +
                    "\u0644\u0647\u0649\u0652\u0658\u065b\u065e\u0662\u0666\u066d\u0676\u067a" +
                    "\u067c\u0680\u0687\u0689\u0691\u0694\u069b\u06a4\u06b0\u06b5\u06b8\u06bc" +
                    "\u06c6\u06f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}