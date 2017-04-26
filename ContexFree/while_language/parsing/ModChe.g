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
    : StateID ':=' e=arith_expr            { $str = new AssignStatement($StateID.getText(), e); }
    ;
  
arith_expr returns [ArithExpr str]
    : e=base_arith_expr       { $str = e; }
      '+' e=base_arith_expr   { $str = new addExpr($str,e); } 
    ;

base_arith_expr returns [ArithExpr str]
    : P { $str = new PExpr($P.getText()); }
      StateID  { $str = new IdExpr($StateID.getText()); }
    ;
  	
P : 'p' | 'qr' | ' ';            
StateID : '1'..'3' ; 

/* We're going to ignore all white space characters */
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;




