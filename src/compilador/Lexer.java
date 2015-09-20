/* The following code was generated by JFlex 1.6.1 */

package compilador;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/compilador/Lexico.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  2, 49,  4,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4, 12,  5, 19,  0, 20, 18,  6, 38, 39, 17, 16, 47, 15, 46, 48, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 45, 44, 14, 11, 13,  0, 
     0, 23, 10, 21, 36, 30, 33, 31, 24, 26,  1,  1, 34, 22,  8, 27, 
     1,  1,  9, 29,  7, 32, 37, 35,  1,  1,  1, 42,  0, 43,  0,  1, 
     0, 23, 10, 21, 36, 30, 33, 31, 24, 26,  1,  1, 34, 22,  8, 27, 
     1,  1,  9, 29,  7, 32, 37, 35,  1,  1,  1, 40,  0, 41,  0,  0, 
     0,  0,  0,  0,  0, 49,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\6\1\2"+
    "\1\7\1\1\1\10\1\11\3\1\1\12\1\13\1\14"+
    "\1\2\1\1\1\2\1\1\6\2\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\2\1\32\1\0\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\2\2\1\0\2\2\1\0"+
    "\1\2\2\0\1\42\2\2\1\42\1\0\10\2\1\43"+
    "\2\2\2\44\1\2\1\0\1\2\1\45\2\0\1\45"+
    "\2\2\1\0\1\2\1\0\1\2\1\46\1\2\1\0"+
    "\2\2\1\0\3\2\1\47\1\50\1\0\1\2\2\0"+
    "\2\2\1\0\1\2\2\51\1\2\1\0\2\2\2\52"+
    "\1\2\1\41\2\0\2\2\2\0\2\2\1\0\1\2"+
    "\2\53\2\2\1\54\1\0\1\54\1\2\2\0\2\2"+
    "\1\55\1\56\2\57\1\0\1\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\62\0\62\0\62"+
    "\0\372\0\u012c\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258"+
    "\0\62\0\62\0\62\0\u028a\0\u02bc\0\u02ee\0\u0320\0\u0352"+
    "\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\62\0\u047e\0\62\0\u04b0\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\u04e2\0\u0514\0\u0546\0\u0578"+
    "\0\u05aa\0\u05dc\0\u060e\0\u0640\0\u0672\0\62\0\u06a4\0\u06d6"+
    "\0\144\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834"+
    "\0\u0866\0\u0898\0\62\0\u08ca\0\u08fc\0\62\0\144\0\u092e"+
    "\0\u0960\0\u0992\0\62\0\u09c4\0\u09f6\0\144\0\u0a28\0\u0a5a"+
    "\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\144\0\u0b54\0\u0b86\0\u0bb8"+
    "\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\144\0\144\0\u0ce4"+
    "\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\62"+
    "\0\144\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\62\0\144\0\u0f3c"+
    "\0\144\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a"+
    "\0\u10cc\0\u10fe\0\u1130\0\62\0\144\0\u1162\0\u1194\0\62"+
    "\0\u11c6\0\144\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\144"+
    "\0\144\0\62\0\144\0\u12f2\0\u1324";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\3"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\3\3\1\25\1\26\1\3"+
    "\1\27\1\30\1\31\2\3\1\32\1\3\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\64\0\1\3\5\0\4\3"+
    "\12\0\4\3\1\0\2\3\1\0\11\3\17\0\1\51"+
    "\60\0\1\52\60\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\0\1\3\1\53\1\0\11\3\27\0\1\54\61\0"+
    "\1\55\61\0\1\56\61\0\1\57\61\0\1\60\3\0"+
    "\1\61\55\0\1\62\4\0\1\63\54\0\1\64\47\0"+
    "\1\3\5\0\4\3\12\0\1\3\1\65\1\3\1\66"+
    "\1\67\1\70\1\71\1\72\1\73\10\3\24\0\1\74"+
    "\22\0\1\75\5\0\1\76\21\0\1\3\5\0\1\3"+
    "\1\77\2\3\12\0\4\3\1\0\1\3\1\100\1\0"+
    "\4\3\1\101\4\3\23\0\1\102\53\0\1\3\5\0"+
    "\1\103\3\3\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\15\0\1\3\5\0\4\3\12\0\4\3\1\0\2\3"+
    "\1\0\5\3\1\104\3\3\15\0\1\3\5\0\4\3"+
    "\12\0\4\3\1\0\1\3\1\105\1\0\5\3\1\106"+
    "\3\3\15\0\1\3\5\0\4\3\12\0\3\3\1\107"+
    "\1\0\2\3\1\0\11\3\15\0\1\3\5\0\4\3"+
    "\12\0\4\3\1\0\1\3\1\110\1\0\11\3\15\0"+
    "\1\3\5\0\4\3\12\0\4\3\1\0\1\3\1\111"+
    "\1\0\11\3\15\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\0\1\3\1\112\1\0\11\3\31\0\1\113\45\0"+
    "\1\3\5\0\4\3\12\0\2\3\1\114\1\3\1\0"+
    "\2\3\1\0\11\3\15\0\1\3\5\0\4\3\12\0"+
    "\2\3\1\115\1\3\1\0\2\3\1\0\11\3\24\0"+
    "\1\116\52\0\1\3\5\0\1\3\1\117\2\3\12\0"+
    "\4\3\1\0\2\3\1\0\11\3\15\0\1\3\5\0"+
    "\4\3\12\0\4\3\1\0\2\3\1\0\3\3\1\120"+
    "\5\3\23\0\1\121\53\0\1\3\5\0\1\122\3\3"+
    "\12\0\4\3\1\0\2\3\1\0\11\3\23\0\1\123"+
    "\15\0\1\124\70\0\2\125\25\0\1\3\5\0\1\126"+
    "\3\3\12\0\1\127\3\3\1\0\2\3\1\0\11\3"+
    "\15\0\1\3\5\0\4\3\12\0\4\3\1\0\2\3"+
    "\1\125\1\130\10\3\25\0\1\131\51\0\1\3\5\0"+
    "\2\3\1\132\1\3\12\0\4\3\1\0\2\3\1\0"+
    "\11\3\15\0\1\3\5\0\4\3\12\0\4\3\1\0"+
    "\2\3\1\133\1\134\10\3\15\0\1\3\5\0\2\3"+
    "\1\135\1\3\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\15\0\1\3\5\0\4\3\12\0\4\3\1\0\1\3"+
    "\1\136\1\0\11\3\15\0\1\3\5\0\4\3\12\0"+
    "\4\3\1\137\1\140\1\3\1\0\11\3\15\0\1\3"+
    "\5\0\4\3\12\0\4\3\1\0\2\3\1\0\3\3"+
    "\1\141\5\3\15\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\142\1\143\1\3\1\0\11\3\15\0\1\3\5\0"+
    "\4\3\12\0\4\3\1\0\2\3\1\0\5\3\1\144"+
    "\3\3\15\0\1\3\5\0\1\145\3\3\12\0\4\3"+
    "\1\0\2\3\1\0\11\3\15\0\1\3\5\0\2\3"+
    "\1\146\1\3\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\15\0\1\3\5\0\1\147\3\3\12\0\4\3\1\0"+
    "\2\3\1\0\11\3\25\0\1\131\32\0\1\150\16\0"+
    "\1\3\5\0\2\3\1\132\1\3\12\0\4\3\1\0"+
    "\2\3\1\0\7\3\1\151\1\3\56\0\1\152\26\0"+
    "\1\153\53\0\1\3\5\0\4\3\12\0\4\3\1\0"+
    "\2\3\1\0\5\3\1\154\3\3\15\0\1\3\5\0"+
    "\1\155\3\3\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\45\0\2\156\30\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\156\1\157\1\3\1\0\11\3\52\0\1\160\24\0"+
    "\1\3\5\0\4\3\12\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\161\7\3\15\0\1\3\5\0\4\3\12\0"+
    "\2\3\1\162\1\3\1\0\2\3\1\0\11\3\56\0"+
    "\1\163\20\0\1\3\5\0\4\3\12\0\4\3\1\0"+
    "\2\3\1\0\5\3\1\164\3\3\15\0\1\3\5\0"+
    "\3\3\1\165\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\60\0\1\166\16\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\0\2\3\1\0\7\3\1\167\1\3\15\0\1\3"+
    "\5\0\4\3\12\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\170\7\3\15\0\1\3\5\0\4\3\12\0\3\3"+
    "\1\171\1\0\2\3\1\0\11\3\45\0\2\172\7\0"+
    "\1\173\20\0\1\3\5\0\4\3\12\0\4\3\1\172"+
    "\1\174\1\3\1\0\5\3\1\175\3\3\54\0\1\176"+
    "\32\0\1\177\51\0\1\3\5\0\4\3\12\0\4\3"+
    "\1\0\2\3\1\0\3\3\1\200\5\3\15\0\1\3"+
    "\5\0\2\3\1\201\1\3\12\0\4\3\1\0\2\3"+
    "\1\0\11\3\24\0\1\202\52\0\1\3\5\0\1\3"+
    "\1\203\2\3\12\0\4\3\1\0\2\3\1\0\11\3"+
    "\15\0\1\3\5\0\1\171\3\3\12\0\4\3\1\0"+
    "\2\3\1\0\11\3\52\0\1\204\24\0\1\3\5\0"+
    "\4\3\12\0\4\3\1\0\2\3\1\0\1\3\1\205"+
    "\7\3\15\0\1\3\5\0\4\3\12\0\4\3\1\0"+
    "\2\3\1\0\5\3\1\206\3\3\15\0\1\3\5\0"+
    "\4\3\12\0\2\3\1\207\1\3\1\0\2\3\1\0"+
    "\11\3\47\0\1\210\57\0\2\211\30\0\1\3\5\0"+
    "\4\3\12\0\4\3\1\0\1\3\1\212\1\0\11\3"+
    "\15\0\1\3\5\0\4\3\12\0\4\3\1\211\1\213"+
    "\1\3\1\0\11\3\60\0\1\214\53\0\1\215\24\0"+
    "\1\3\5\0\4\3\12\0\4\3\1\0\2\3\1\0"+
    "\7\3\1\216\1\3\15\0\1\3\5\0\4\3\12\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\217\7\3\53\0"+
    "\1\64\23\0\1\3\5\0\4\3\12\0\4\3\1\0"+
    "\2\3\1\0\2\3\1\171\6\3\15\0\1\3\5\0"+
    "\4\3\12\0\4\3\1\0\2\3\1\0\1\3\1\220"+
    "\7\3\15\0\1\3\5\0\1\3\1\221\2\3\12\0"+
    "\4\3\1\0\2\3\1\0\11\3\26\0\1\222\50\0"+
    "\1\3\5\0\3\3\1\223\12\0\4\3\1\0\2\3"+
    "\1\0\11\3\52\0\1\64\52\0\1\224\33\0\1\3"+
    "\5\0\4\3\12\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\171\7\3\15\0\1\3\5\0\4\3\12\0\2\3"+
    "\1\225\1\3\1\0\2\3\1\0\11\3\42\0\1\64"+
    "\34\0\1\3\5\0\4\3\12\0\1\3\1\171\2\3"+
    "\1\0\2\3\1\0\11\3\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4950];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\3\11\10\1\3\11\12\1\15\11"+
    "\1\1\1\11\1\0\7\11\2\1\1\0\2\1\1\0"+
    "\1\1\2\0\1\11\3\1\1\0\10\1\1\11\2\1"+
    "\1\11\2\1\1\0\1\1\1\11\2\0\3\1\1\0"+
    "\1\1\1\0\3\1\1\0\2\1\1\0\5\1\1\0"+
    "\1\1\2\0\2\1\1\0\1\1\1\11\2\1\1\0"+
    "\2\1\1\11\3\1\2\0\2\1\2\0\2\1\1\0"+
    "\1\1\1\11\3\1\1\11\1\0\2\1\2\0\4\1"+
    "\1\11\1\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
      StringBuffer string = new StringBuffer();
      String errores = "";
      


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { {return new symbol(sym.EOF,null); }
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { errores += "error lexico en la fila "+yyline +" y en la columna " + yychar + "\n";
            }
          case 48: break;
          case 2: 
            { return new Symbol(sym.FRASE,     yyline, yychar, yytext());
            }
          case 49: break;
          case 3: 
            { yychar=0;
            }
          case 50: break;
          case 4: 
            { /* ignore white space. */
            }
          case 51: break;
          case 5: 
            { return new Symbol(sym.COMILLAS,  yyline, yychar, yytext());
            }
          case 52: break;
          case 6: 
            { /* ignore apostrofos. */
            }
          case 53: break;
          case 7: 
            { return new Symbol(sym.EQUALS,    yyline, yychar, yytext());
            }
          case 54: break;
          case 8: 
            { return new Symbol(sym.MAYOR,     yyline, yychar, yytext());
            }
          case 55: break;
          case 9: 
            { return new Symbol(sym.MENOR,     yyline, yychar, yytext());
            }
          case 56: break;
          case 10: 
            { return new Symbol(sym.AMPERSAND, yyline, yychar, yytext());
            }
          case 57: break;
          case 11: 
            { return new Symbol(sym.NUMERAL,   yyline, yychar, yytext());
            }
          case 58: break;
          case 12: 
            { return new Symbol(sym.PORCIENTO, yyline, yychar, yytext());
            }
          case 59: break;
          case 13: 
            { return new Symbol(sym.OPEN,      yyline, yychar, yytext());
            }
          case 60: break;
          case 14: 
            { return new Symbol(sym.CLOSE,     yyline, yychar, yytext());
            }
          case 61: break;
          case 15: 
            { return new Symbol(sym.LLAVEIZQ,  yyline, yychar, yytext());
            }
          case 62: break;
          case 16: 
            { return new Symbol(sym.LLAVEDER,  yyline, yychar, yytext());
            }
          case 63: break;
          case 17: 
            { return new Symbol(sym.CORCHETEIZQ,  yyline, yychar, yytext());
            }
          case 64: break;
          case 18: 
            { return new Symbol(sym.CORCHETEDER,  yyline, yychar, yytext());
            }
          case 65: break;
          case 19: 
            { return new Symbol(sym.PUNTOCOMA, yyline, yychar, yytext());
            }
          case 66: break;
          case 20: 
            { return new Symbol(sym.DOSPUNTOS, yyline, yychar, yytext());
            }
          case 67: break;
          case 21: 
            { return new Symbol(sym.PUNTO,     yyline, yychar, yytext());
            }
          case 68: break;
          case 22: 
            { return new Symbol(sym.COMA,      yyline, yychar, yytext());
            }
          case 69: break;
          case 23: 
            { return new Symbol(sym.DIAGONAL,  yyline, yychar, yytext());
            }
          case 70: break;
          case 24: 
            { yychar=0; yyline=0
            }
          case 71: break;
          case 25: 
            { /*no hace nada, aumenta una columna*/yychar++;
            }
          case 72: break;
          case 26: 
            { return new Symbol(sym.EQUALS_EQUALS,    yyline, yychar, yytext());
            }
          case 73: break;
          case 27: 
            { return new Symbol(sym.MAYORIGUAL,yyline, yychar, yytext());
            }
          case 74: break;
          case 28: 
            { return new Symbol(sym.MENORIGUAL,yyline, yychar, yytext());
            }
          case 75: break;
          case 29: 
            { return new Symbol(sym.MENOSNUM,  yyline, yychar, yytext());
            }
          case 76: break;
          case 30: 
            { return new Symbol(sym.MENOSUNO,  yyline, yychar, yytext());
            }
          case 77: break;
          case 31: 
            { return new Symbol(sym.MASNUM,    yyline, yychar, yytext());
            }
          case 78: break;
          case 32: 
            { return new Symbol(sym.MASUNO,    yyline, yychar, yytext());
            }
          case 79: break;
          case 33: 
            { sym., yyline, yychar, yytext()):
            }
          case 80: break;
          case 34: 
            { return new Symbol(sym.IF,        yyline, yychar, yytext());
            }
          case 81: break;
          case 35: 
            { return new Symbol(sym.DIFERENTE, yyline, yychar, yytext());
            }
          case 82: break;
          case 36: 
            { return new Symbol(sym.CIN,     yyline, yychar, yytext());
            }
          case 83: break;
          case 37: 
            { return new Symbol(sym.INT,       yyline, yychar, yytext());
            }
          case 84: break;
          case 38: 
            { return new Symbol(sym.FOR,       yyline, yychar, yytext());
            }
          case 85: break;
          case 39: 
            { return new Symbol(sym.CHAR,       yyline, yychar, yytext());
            }
          case 86: break;
          case 40: 
            { return new Symbol(sym.COUNT,    yyline, yychar, yytext());
            }
          case 87: break;
          case 41: 
            { return new Symbol(sym.ELSE,      yyline, yychar, yytext());
            }
          case 88: break;
          case 42: 
            { return new Symbol(sym.VOID,      yyline, yychar, yytext());
            }
          case 89: break;
          case 43: 
            { return new Symbol(sym.WHILE,         yyline, yychar, yytext());
            }
          case 90: break;
          case 44: 
            { return new Symbol(sym.CSTDIO,     yyline, yychar, yytext());
            }
          case 91: break;
          case 45: 
            { return new Symbol(sym.DOUBLE,       yyline, yychar, yytext());
            }
          case 92: break;
          case 46: 
            { return new Symbol(sym.BOOLEAN,       yyline, yychar, yytext());
            }
          case 93: break;
          case 47: 
            { return new Symbol(sym.CSTDLIB,     yyline, yychar, yytext());
            }
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
