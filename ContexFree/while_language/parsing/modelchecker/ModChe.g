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

program returns [Note note]
    : s=note EOF { $note = s; }
    ;

note returns [Note note]
    : s=base_note       { $note = s; }
      ( ';' s=base_note { $note = new Note($note,s); } )*
    ;

base_note returns [Note note]
    : StateID ':=' e=arith_expr       { $note = new Note($StateID.getText(), e); }
    ;
  
arith_expr returns [ArithExpr note]
    : e=base_arith_expr       { $note = e; }
      '+' e=base_arith_expr   { $note = new addExpr($note,e); } 
    ;

base_arith_expr returns [ArithExpr note]
    : P { $note = new PExpr($P.getText()); }
      StateID  { $note = new IdExpr($StateID.getText()); }
    ;
  	
P : 'p' | 'qr' | ' ';            
StateID : '1'..'3' ; 

/* We're going to ignore all white space characters */
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;




