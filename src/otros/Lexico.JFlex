package compilador;
import java_cup.runtime.*;
%%

%public
%class Lexer 
%unicode
%cup
%ignorecase
%char
%line
%column
%full

%{
      StringBuffer string = new StringBuffer();
      String errores = "";
%}

%eofval{
{return new Symbol(sym.EOF,null); }
%eofval}

Caracter = [A-Za-z]
Digito = [0-9]
Alfa = {Caracter} | {Digito}
Entero = 0 | [1-9][0-9]*
Decimal = {Digito}+"."{Entero}
Identificador = ({Caracter}{Entero})*
Booleano = true | false
%state STRING
NewLine = \n\r
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]
st = [^\\\n\"]+ | [\\][\\] | "\\\"" | "\\\'" |"\\t"| "\\n" | "\\r" |"\\b" |"\n" 
%%





[\n] { yychar=0;}
[ \t\r\n\f] { /* ignore white space. */ }
\' { /* ignore apostrofos. */ }
<YYINITIAL> {WhiteSpace}  {/*no hace nada, aumenta una columna*/yychar++; }
<YYINITIAL> {NewLine}     {yychar=0; yyline=0;}

/* Identificadores y numeros */
<YYINITIAL> {Entero} {return new Symbol (sym.ENTERO, yyline, yychar, yytext());}
<YYINITIAL> {Decimal} {return new Symbol (sym.DECIMAL, yyline, yychar, yytext());}
<YYINITIAL> {Identificador} {return new Symbol (sym.IDENTIFICADOR, yyline, yychar, yytext());}
<YYINITIAL> {Booleano} {return new Symbol (sym.BOOLEANO, yyline, yychar, yytext());}
\" { string.setLength(0); yybegin(STRING); }

/* COMPARACION, ASIGNACION, ARITMETICAS */
<YYINITIAL>"+"      {return new Symbol (sym.SUMA, yyline, yychar, yytext());}
<YYINITIAL>"-"      {return new Symbol (sym.RESTA, yyline, yychar, yytext());}
<YYINITIAL>"*"      {return new Symbol (sym.MULTIPLICACION, yyline, yychar, yytext());}
<YYINITIAL>"/"      {return new Symbol (sym.DIVISION, yyline, yychar, yytext());}
<YYINITIAL>"=="     {return new Symbol(sym.EQUALS_EQUALS,    yyline, yychar, yytext());}
<YYINITIAL>"!=>"    {return new Symbol(sym.DIFERENTE, yyline, yychar, yytext());}
<YYINITIAL>">="     {return new Symbol(sym.MAYORIGUAL,yyline, yychar, yytext());}
<YYINITIAL>"<="     {return new Symbol(sym.MENORIGUAL,yyline, yychar, yytext());}
<YYINITIAL>"-="     {return new Symbol(sym.MENOSNUM,  yyline, yychar, yytext());}
<YYINITIAL>"--"     {return new Symbol(sym.MENOSUNO,  yyline, yychar, yytext());}
<YYINITIAL>"+="     {return new Symbol(sym.MASNUM,    yyline, yychar, yytext());}
<YYINITIAL>"*="     {return new Symbol(sym.MULNUM, yyline, yychar, yytext());}
<YYINITIAL>"++"     {return new Symbol(sym.MASUNO,    yyline, yychar, yytext());}
<YYINITIAL>">"      {return new Symbol(sym.MAYOR,     yyline, yychar, yytext());}
<YYINITIAL>"<"      {return new Symbol(sym.MENOR,     yyline, yychar, yytext());}
<YYINITIAL>"="      {return new Symbol(sym.EQUALS,    yyline, yychar, yytext());}


<YYINITIAL>"&"      {return new Symbol(sym.AMPERSAND, yyline, yychar, yytext());}
<YYINITIAL>"#"      {return new Symbol(sym.NUMERAL,   yyline, yychar, yytext());}
<YYINITIAL>"%"      {return new Symbol(sym.PORCIENTO, yyline, yychar, yytext());}

 /* PALABRAS RESERVADAS */
<YYINITIAL>"main" {return new Symbol(sym.MAIN, yyline, yychar, yytext());}
<YYINITIAL>"cmath" {return new Symbol(sym.CMATH, yyline, yychar,yytext() );}
<YYINITIAL>"iostream" {return new Symbol(sym.IOSTREAM, yyline, yychar, yytext());}
<YYINITIAL>"cstring" {return new Symbol(sym.CSTRING, yyline, yychar, yytext());}    
<YYINITIAL>"cin"    {return new Symbol(sym.CIN,     yyline, yychar, yytext());}
<YYINITIAL>"cout"   {return new Symbol(sym.COUT,    yyline, yychar, yytext());}
<YYINITIAL>"if"     {return new Symbol(sym.IF,        yyline, yychar, yytext());}
<YYINITIAL>"else"   {return new Symbol(sym.ELSE,      yyline, yychar, yytext());}
<YYINITIAL>"for"    {return new Symbol(sym.FOR,       yyline, yychar, yytext());}
<YYINITIAL>"while"  {return new Symbol(sym.WHILE,         yyline, yychar, yytext());}
<YYINITIAL>"cstdio" {return new Symbol(sym.CSTDIO,     yyline, yychar, yytext());}
<YYINITIAL>"cstdlib" {return new Symbol(sym.CSTDLIB,     yyline, yychar, yytext());}
<YYINITIAL>"int"    {return new Symbol(sym.INT,       yyline, yychar, yytext());}
<YYINITIAL>"char"   {return new Symbol(sym.CHAR,       yyline, yychar, yytext());}
<YYINITIAL>"double" {return new Symbol(sym.DOUBLE,       yyline, yychar, yytext());}
<YYINITIAL>"boolean" {return new Symbol(sym.BOOLEAN,       yyline, yychar, yytext());}
<YYINITIAL>"float" {return new Symbol(sym.FLOAT, yyline, yychar, yytext());}
<YYINITIAL>"string" {return new Symbol(sym.STRING, yyline, yychar, yytext());}
<YYINITIAL>"void"   {return new Symbol(sym.VOID,      yyline, yychar, yytext());}
<YYINITIAL>"include" {return new Symbol (sym.INCLUDE, yyline, yychar, yytext());}

/* AGRUPADORES */
<YYINITIAL>"("      {return new Symbol(sym.OPEN,      yyline, yychar, yytext());}
<YYINITIAL>")"      {return new Symbol(sym.CLOSE,     yyline, yychar, yytext());}
<YYINITIAL>"{"      {return new Symbol(sym.LLAVEIZQ,  yyline, yychar, yytext());}
<YYINITIAL>"}"      {return new Symbol(sym.LLAVEDER,  yyline, yychar, yytext());}
<YYINITIAL>"["      {return new Symbol(sym.CORCHETEIZQ,  yyline, yychar, yytext());}
<YYINITIAL>"]"      {return new Symbol(sym.CORCHETEDER,  yyline, yychar, yytext());}

/* PUNTUACION */		
<YYINITIAL>";"      {return new Symbol(sym.PUNTOCOMA, yyline, yychar, yytext());}
<YYINITIAL>":"      {return new Symbol(sym.DOSPUNTOS, yyline, yychar, yytext());}
<YYINITIAL>"."      {return new Symbol(sym.PUNTO,     yyline, yychar, yytext());}
<YYINITIAL>","      {return new Symbol(sym.COMA,      yyline, yychar, yytext()  );}

<STRING>{
\" { yybegin(YYINITIAL);
return new Symbol(sym.STRING_LITERAL,
string.toString()); }
/*[^\n\r\"\\]+ { string.append( yytext() ); }
\\t { string.append(’\t’); }
\\n { string.append(’\n’); }

\\r { string.append(’\r’); }
\\\" { string.append(’\\"’); }
\\ { string.append(’\\’); }*/
}
. {errores += "error lexico en la fila "+yyline +" y en la columna " + yychar + "\n";}