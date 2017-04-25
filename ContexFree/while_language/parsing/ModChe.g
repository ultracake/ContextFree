grammar ModChe;

options {
  language = Java;
}

@header {
package while_language.parsing;

import while_language.ast.*;

}

@lexer::header {
package while_language.parsing;

}


program returns [Statement value]
    : s=statement EOF { $value = s; }
    ;

statement returns [Statement value]
    : s=base_statement       { $value = s; }
      ( ';' s=base_statement { $value = new SeqStatement($value,s); } )*
    ;

base_statement returns [Statement value]
    : e=arith_expr
    ;

  
arith_expr returns [ArithExpr value]
    : e=mult_arith_expr       { $value = e; }
       '+' e=mult_arith_expr 
    ;

mult_arith_expr returns [ArithExpr value]
    : e=base_arith_expr       { $value = e; }
    ;

base_arith_expr returns [ArithExpr value]
    : P 
    ;

  	
P : 'p' | 'qr' | ' ';            


/* We're going to ignore all white space characters */
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;




