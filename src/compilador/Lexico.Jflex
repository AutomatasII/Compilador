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
{return new symbol(sym.EOF,null); }
%eofval}

LETRAS=[A-Za-z]
DIGITOS=[0-9]
DIGITO_LETRAS={LETRAS}|{DIGITOS}

NewLine = \n\r
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]
st = [^\\\n\"]+ | [\\][\\] | "\\\"" | "\\\'" |"\\t"| "\\n" | "\\r" |"\\b" |"\n" 
FRASE=("_"|{DIGITO_LETRAS})("_"|{DIGITO_LETRAS})*

%%
[\n] { yychar=0;}
[ \t\r\n\f] { /* ignore white space. */ }
\' { /* ignore apostrofos. */ }
<YYINITIAL> {WhiteSpace}  {/*no hace nada, aumenta una columna*/yychar++; }
<YYINITIAL> {NewLine}     {yychar=0; yyline=0}
/* COMPARACION, ASIGNACION, ARITMETICAS */
<YYINITIAL>"=="      {return new Symbol(sym.EQUALS_EQUALS,    yyline, yychar, yytext());}
<YYINITIAL>"!=>"    {return new Symbol(sym.DIFERENTE, yyline, yychar, yytext());}
<YYINITIAL>">="     {return new Symbol(sym.MAYORIGUAL,yyline, yychar, yytext());}
<YYINITIAL>"<="     {return new Symbol(sym.MENORIGUAL,yyline, yychar, yytext());}
<YYINITIAL>"-="     {return new Symbol(sym.MENOSNUM,  yyline, yychar, yytext());}
<YYINITIAL>"--"     {return new Symbol(sym.MENOSUNO,  yyline, yychar, yytext());}
<YYINITIAL>"+="     {return new Symbol(sym.MASNUM,    yyline, yychar, yytext());}
<YYINITIAL>"*="     {sym., yyline, yychar, yytext()):}
<YYINITIAL>"++"     {return new Symbol(sym.MASUNO,    yyline, yychar, yytext());}
<YYINITIAL>">"      {return new Symbol(sym.MAYOR,     yyline, yychar, yytext());}
<YYINITIAL>"<"      {return new Symbol(sym.MENOR,     yyline, yychar, yytext());}
<YYINITIAL>"="      {return new Symbol(sym.EQUALS,    yyline, yychar, yytext());}


<YYINITIAL>"&"      {return new Symbol(sym.AMPERSAND, yyline, yychar, yytext());}
<YYINITIAL>"#"      {return new Symbol(sym.NUMERAL,   yyline, yychar, yytext());}
<YYINITIAL>"%"      {return new Symbol(sym.PORCIENTO, yyline, yychar, yytext());}

 /* PALABRAS RESERVADAS */
<YYINITIAL>"cmath" {sym., yyline, yychar, yytext()):}
<YYINITIAL>"iostream" {sym., yyline, yychar, yytext()):}
<YYINITIAL>"cstring" {sym., yyline, yychar, yytext()):}    
<YYINITIAL>"cin"    {return new Symbol(sym.CIN,     yyline, yychar, yytext());}
<YYINITIAL>"cout"   {return new Symbol(sym.COUNT,    yyline, yychar, yytext());}
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
<YYINITIAL>"float" {sym., yyline, yychar, yytext()):}
<YYINITIAL>"string" {sym., yyline, yychar, yytext()):}
<YYINITIAL>"void"   {return new Symbol(sym.VOID,      yyline, yychar, yytext());}
<YYINITIAL>"include" {sym., yyline, yychar, yytext()):}

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
<YYINITIAL>","      {return new Symbol(sym.COMA,      yyline, yychar, yytext());}
<YYINITIAL>"/"      {return new Symbol(sym.DIAGONAL,  yyline, yychar, yytext());}
<YYINITIAL>"\""     {return new Symbol(sym.COMILLAS,  yyline, yychar, yytext());} 

/* COMPARACION */


<YYINITIAL>{FRASE}  {return new Symbol(sym.FRASE,     yyline, yychar, yytext());}
. {errores += "error lexico en la fila "+yyline +" y en la columna " + yychar + "\n";}

	          	}