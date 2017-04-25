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


program returns [String str]
    : s=note EOF { $str = s; }
    ;

note returns [Statement str]
    : s=base_note       { $str = s; }
      ( ';' s=base_note { $str = new SeqStatement($str,s); } )*
    ;

base_note returns [Statement str]
    : e=arith_expr
    ;

  
arith_expr returns [ArithExpr str]
    : e=add_arith_expr       { $str = e; }
      '+' e=add_arith_expr 
    ;

add_arith_expr returns [ArithExpr str]
    : e=base_arith_expr       { $str = e; }
    ;

base_arith_expr returns [ArithExpr str]
    : P 
    ;

  	
P : 'p' | 'qr' | ' ';            


/* We're going to ignore all white space characters */
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;




