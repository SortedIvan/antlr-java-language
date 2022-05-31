// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Example2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFTCURL=1, RIGHTCURL=2, OPAR=3, CPAR=4, MUL=5, DIV=6, ADD=7, SUB=8, POW=9, 
		FACT=10, NOT=11, AND=12, OR=13, INT_INIT=14, STRING_INIT=15, BOOL_INIT=16, 
		CHAR_INIT=17, PRINT=18, IF=19, FI=20, WHILE=21, THEN=22, DO=23, DOT=24, 
		ELSE=25, FOR=26, EQUAL=27, NEQUAL=28, EQUALCHECK=29, COMMA=30, NUMBER=31, 
		WS=32, BOOL=33, STRING=34, ID=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFTCURL", "RIGHTCURL", "OPAR", "CPAR", "MUL", "DIV", "ADD", "SUB", 
			"POW", "FACT", "NOT", "AND", "OR", "INT_INIT", "STRING_INIT", "BOOL_INIT", 
			"CHAR_INIT", "PRINT", "IF", "FI", "WHILE", "THEN", "DO", "DOT", "ELSE", 
			"FOR", "EQUAL", "NEQUAL", "EQUALCHECK", "COMMA", "NUMBER", "WS", "BOOL", 
			"STRING", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", 
			"'!'", "'not'", "'&&'", "'||'", "'int_var'", "'string_var'", "'bool_var'", 
			"'char_var'", "'print'", "'if'", "'fi'", "'while'", "'then'", "'do'", 
			"'.'", "'else'", "'for'", "'='", "'!='", "'=='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFTCURL", "RIGHTCURL", "OPAR", "CPAR", "MUL", "DIV", "ADD", "SUB", 
			"POW", "FACT", "NOT", "AND", "OR", "INT_INIT", "STRING_INIT", "BOOL_INIT", 
			"CHAR_INIT", "PRINT", "IF", "FI", "WHILE", "THEN", "DO", "DOT", "ELSE", 
			"FOR", "EQUAL", "NEQUAL", "EQUALCHECK", "COMMA", "NUMBER", "WS", "BOOL", 
			"STRING", "ID"
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


	public Example2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u00df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u00bb\b\u001e\u000b\u001e\f"+
		"\u001e\u00bc\u0001\u001f\u0004\u001f\u00c0\b\u001f\u000b\u001f\f\u001f"+
		"\u00c1\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u00cf\b \u0001!\u0001!\u0004!\u00d3\b!\u000b"+
		"!\f!\u00d4\u0001!\u0001!\u0001\"\u0001\"\u0005\"\u00db\b\"\n\"\f\"\u00de"+
		"\t\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#\u0001\u0000\u0005\u0001\u000009\u0003\u0000\t\n\r\r  \u0001"+
		"\u0000\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u00e3\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000"+
		"\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005K\u0001\u0000\u0000\u0000"+
		"\u0007M\u0001\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001"+
		"\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000"+
		"\u0000\u0011W\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015"+
		"[\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019b\u0001"+
		"\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000"+
		"\u0000\u001fx\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#"+
		"\u008a\u0001\u0000\u0000\u0000%\u0090\u0001\u0000\u0000\u0000\'\u0093"+
		"\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000+\u009c\u0001\u0000"+
		"\u0000\u0000-\u00a1\u0001\u0000\u0000\u0000/\u00a4\u0001\u0000\u0000\u0000"+
		"1\u00a6\u0001\u0000\u0000\u00003\u00ab\u0001\u0000\u0000\u00005\u00af"+
		"\u0001\u0000\u0000\u00007\u00b1\u0001\u0000\u0000\u00009\u00b4\u0001\u0000"+
		"\u0000\u0000;\u00b7\u0001\u0000\u0000\u0000=\u00ba\u0001\u0000\u0000\u0000"+
		"?\u00bf\u0001\u0000\u0000\u0000A\u00ce\u0001\u0000\u0000\u0000C\u00d0"+
		"\u0001\u0000\u0000\u0000E\u00d8\u0001\u0000\u0000\u0000GH\u0005{\u0000"+
		"\u0000H\u0002\u0001\u0000\u0000\u0000IJ\u0005}\u0000\u0000J\u0004\u0001"+
		"\u0000\u0000\u0000KL\u0005(\u0000\u0000L\u0006\u0001\u0000\u0000\u0000"+
		"MN\u0005)\u0000\u0000N\b\u0001\u0000\u0000\u0000OP\u0005*\u0000\u0000"+
		"P\n\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000R\f\u0001\u0000\u0000"+
		"\u0000ST\u0005+\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005-\u0000"+
		"\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005^\u0000\u0000X\u0012\u0001"+
		"\u0000\u0000\u0000YZ\u0005!\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000"+
		"[\\\u0005n\u0000\u0000\\]\u0005o\u0000\u0000]^\u0005t\u0000\u0000^\u0016"+
		"\u0001\u0000\u0000\u0000_`\u0005&\u0000\u0000`a\u0005&\u0000\u0000a\u0018"+
		"\u0001\u0000\u0000\u0000bc\u0005|\u0000\u0000cd\u0005|\u0000\u0000d\u001a"+
		"\u0001\u0000\u0000\u0000ef\u0005i\u0000\u0000fg\u0005n\u0000\u0000gh\u0005"+
		"t\u0000\u0000hi\u0005_\u0000\u0000ij\u0005v\u0000\u0000jk\u0005a\u0000"+
		"\u0000kl\u0005r\u0000\u0000l\u001c\u0001\u0000\u0000\u0000mn\u0005s\u0000"+
		"\u0000no\u0005t\u0000\u0000op\u0005r\u0000\u0000pq\u0005i\u0000\u0000"+
		"qr\u0005n\u0000\u0000rs\u0005g\u0000\u0000st\u0005_\u0000\u0000tu\u0005"+
		"v\u0000\u0000uv\u0005a\u0000\u0000vw\u0005r\u0000\u0000w\u001e\u0001\u0000"+
		"\u0000\u0000xy\u0005b\u0000\u0000yz\u0005o\u0000\u0000z{\u0005o\u0000"+
		"\u0000{|\u0005l\u0000\u0000|}\u0005_\u0000\u0000}~\u0005v\u0000\u0000"+
		"~\u007f\u0005a\u0000\u0000\u007f\u0080\u0005r\u0000\u0000\u0080 \u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005c\u0000\u0000\u0082\u0083\u0005h\u0000"+
		"\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085"+
		"\u0086\u0005_\u0000\u0000\u0086\u0087\u0005v\u0000\u0000\u0087\u0088\u0005"+
		"a\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089\"\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005p\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c"+
		"\u008d\u0005i\u0000\u0000\u008d\u008e\u0005n\u0000\u0000\u008e\u008f\u0005"+
		"t\u0000\u0000\u008f$\u0001\u0000\u0000\u0000\u0090\u0091\u0005i\u0000"+
		"\u0000\u0091\u0092\u0005f\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005f\u0000\u0000\u0094\u0095\u0005i\u0000\u0000\u0095(\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005w\u0000\u0000\u0097\u0098\u0005h\u0000"+
		"\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005l\u0000\u0000\u009a"+
		"\u009b\u0005e\u0000\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"t\u0000\u0000\u009d\u009e\u0005h\u0000\u0000\u009e\u009f\u0005e\u0000"+
		"\u0000\u009f\u00a0\u0005n\u0000\u0000\u00a0,\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005d\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3.\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005.\u0000\u0000\u00a50\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005l\u0000\u0000\u00a8"+
		"\u00a9\u0005s\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa2\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005f\u0000\u0000\u00ac\u00ad\u0005o\u0000"+
		"\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae4\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005=\u0000\u0000\u00b06\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"!\u0000\u0000\u00b2\u00b3\u0005=\u0000\u0000\u00b38\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b5\u00b6\u0005=\u0000\u0000\u00b6"+
		":\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005,\u0000\u0000\u00b8<\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0007\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd>\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0007\u0001\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0006\u001f\u0000\u0000\u00c4@\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005t\u0000\u0000\u00c6\u00c7\u0005r\u0000\u0000\u00c7"+
		"\u00c8\u0005u\u0000\u0000\u00c8\u00cf\u0005e\u0000\u0000\u00c9\u00ca\u0005"+
		"f\u0000\u0000\u00ca\u00cb\u0005a\u0000\u0000\u00cb\u00cc\u0005l\u0000"+
		"\u0000\u00cc\u00cd\u0005s\u0000\u0000\u00cd\u00cf\u0005e\u0000\u0000\u00ce"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00cf"+
		"B\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\"\u0000\u0000\u00d1\u00d3"+
		"\b\u0002\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\"\u0000\u0000\u00d7D\u0001\u0000\u0000\u0000\u00d8\u00dc\u0007\u0003"+
		"\u0000\u0000\u00d9\u00db\u0007\u0004\u0000\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00ddF\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u0006\u0000\u00bc\u00c1\u00ce"+
		"\u00d4\u00dc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}