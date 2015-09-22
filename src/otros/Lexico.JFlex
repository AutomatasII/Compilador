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
/*Identificador = [:jletter:][:jletterdigit:]*/
Booleano = true | false
%state STRING
NewLine = \n\r
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f] 
%%





<YYINITIAL>[\n] { yychar=0;}
<YYINITIAL>[ \t\r\n\f] { /* ignore white space. */ }
<YYINITIAL>\' { /* ignore apostrofos. */ }
<YYINITIAL> {WhiteSpace}  {/*no hace nada, aumenta una columna*/yychar++; }
<YYINITIAL> {NewLine}     {yychar=0; yyline=0;}
/* Identificadores y numeros */
<YYINITIAL> {Entero} {return new Symbol(sym.ENTERO, yyline, yycolumn, yytext());}
<YYINITIAL> {Decimal} {return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());}
/*<YYINITIAL> {Identificador} {return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());}*/
<YYINITIAL> {Booleano} {return new Symbol (sym.BOOLEANO, yyline, yycolumn, yytext());}
<YYINITIAL>\" { string.setLength(0); yybegin(STRING); }

/* COMPARACION, ASIGNACION, ARITMETICAS */
<YYINITIAL>"#"      {return new Symbol (sym.GATO, yyline, yycolumn, yytext());}
<YYINITIAL>"+"      {return new Symbol (sym.SUMA, yyline, yycolumn, yytext());}
<YYINITIAL>"-"      {return new Symbol (sym.RESTA, yyline, yycolumn, yytext());}
<YYINITIAL>"*"      {return new Symbol (sym.MULTIPLICACION, yyline, yycolumn, yytext());}
<YYINITIAL>"/"      {return new Symbol (sym.DIVISION, yyline, yycolumn, yytext());}
<YYINITIAL>"=="     {return new Symbol (sym.EQUALS_EQUALS,    yyline, yycolumn, yytext());}
<YYINITIAL>"!=>"    {return new Symbol (sym.DIFERENTE, yyline, yycolumn, yytext());}
<YYINITIAL>">="     {return new Symbol (sym.MAYORIGUAL,yyline, yycolumn, yytext());}
<YYINITIAL>"<="     {return new Symbol (sym.MENORIGUAL,yyline, yycolumn, yytext());}
<YYINITIAL>"-="     {return new Symbol (sym.MENOSNUM,yyline, yycolumn, yytext());}
<YYINITIAL>"--"     {return new Symbol (sym.MENOSUNO,yyline, yycolumn, yytext());}
<YYINITIAL>"+="     {return new Symbol (sym.MASNUM,yyline, yycolumn, yytext());}
<YYINITIAL>"++"     {return new Symbol (sym.MASUNO,    yyline, yycolumn, yytext());}
<YYINITIAL>">"      {return new Symbol (sym.MAYOR,     yyline, yycolumn, yytext());}
<YYINITIAL>"<"      {return new Symbol (sym.MENOR,     yyline, yycolumn, yytext());}
<YYINITIAL>"="      {return new Symbol (sym.EQUALS,    yyline, yycolumn, yytext());}

 /* PALABRAS RESERVADAS */
<YYINITIAL>"main" {return new Symbol(sym.MAIN, yyline, yycolumn, yytext());}
<YYINITIAL>"cmath" {return new Symbol(sym.CMATH, yyline, yycolumn,yytext() );}
<YYINITIAL>"iostream" {return new Symbol(sym.IOSTREAM, yyline, yycolumn, yytext());}
<YYINITIAL>"cstring" {return new Symbol(sym.CSTRING, yyline, yycolumn, yytext());}    
<YYINITIAL>"cin"    {return new Symbol(sym.CIN,     yyline, yycolumn, yytext());}
<YYINITIAL>"cout"   {return new Symbol(sym.COUT,    yyline, yycolumn, yytext());}
<YYINITIAL>"if"     {return new Symbol(sym.IF,        yyline, yycolumn, yytext());}
<YYINITIAL>"else"   {return new Symbol(sym.ELSE,      yyline, yycolumn, yytext());}
<YYINITIAL>"for"    {return new Symbol(sym.FOR,       yyline, yycolumn, yytext());}
<YYINITIAL>"while"  {return new Symbol(sym.WHILE,         yyline, yycolumn, yytext());}
<YYINITIAL>"cstdio" {return new Symbol(sym.CSTDIO,     yyline, yycolumn, yytext());}
<YYINITIAL>"cstdlib" {return new Symbol(sym.CSTDLIB,     yyline, yycolumn, yytext());}
<YYINITIAL>"int"    {return new Symbol(sym.INT,       yyline, yycolumn, yytext());}
<YYINITIAL>"char"   {return new Symbol(sym.CHAR,       yyline, yycolumn, yytext());}
<YYINITIAL>"double" {return new Symbol(sym.DOUBLE,       yyline, yycolumn, yytext());}
<YYINITIAL>"boolean" {return new Symbol(sym.BOOLEAN,       yyline, yycolumn, yytext());}
<YYINITIAL>"float" {return new Symbol(sym.FLOAT, yyline, yycolumn, yytext());}
<YYINITIAL>"string" {return new Symbol(sym.STRING, yyline, yycolumn, yytext());}
<YYINITIAL>"include" {return new Symbol(sym.INCLUDE, yyline, yycolumn, yytext());}

/* AGRUPADORES */
<YYINITIAL>"("      {return new Symbol(sym.OPEN,      yyline, yycolumn, yytext());}
<YYINITIAL>")"      {return new Symbol(sym.CLOSE,     yyline, yycolumn, yytext());}
<YYINITIAL>"{"      {return new Symbol(sym.LLAVEIZQ,  yyline, yycolumn, yytext());}
<YYINITIAL>"}"      {return new Symbol(sym.LLAVEDER,  yyline, yycolumn, yytext());}
/* PUNTUACION */		
<YYINITIAL>";"      {return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext());}

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
. {errores += "error lexico en la fila "+yyline +" y en la columna " + yycolumn + "\n";}