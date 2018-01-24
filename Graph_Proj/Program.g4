grammar Program;


program: match | create ;

create: CREATE leftHand returnStatement?;
match: MATCH leftHand returnStatement;
leftHand: node_relation (VIRGUL node_relation)*;
returnStatement: RETURN property_variable (VIRGUL property_variable)*;
MATCH: 'MATCH';
RETURN: 'RETURN';
CREATE: 'CREATE';
VIRGUL: ',';

node_relation: relation | node;
node: LPAREN node_variable node_type RPAREN;
node_variable: variable|;
node_type: type|;

LPAREN: '(';
RPAREN: ')';
COL: ':';
DASH: '-';
LBRAC: '[';
RBRAC: ']';
LARROW: '<-';
RARROW: '->';
DOT: '.';

type: (COL variable);

relation: relation_right | relation_left;
relation_right:node DASH LBRAC node_variable node_type RBRAC RARROW node;
relation_left: node LARROW LBRAC node_variable node_type RBRAC DASH node;

property_variable: pvariable property_variable_;
property_variable_: DOT pvariable | ;

pvariable: variable;

variable: VARIABLE;

VARIABLE: [a-zA-Z_]+;
WS     : [ \n\t]+ -> skip;