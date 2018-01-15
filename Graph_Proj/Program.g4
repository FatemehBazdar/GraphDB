grammar Program;


program: 
//match | create ;
create;

create: CREATE node_relation (VIRGUL node_relation)*;
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

type: (COL variable);

relation: relation_right | relation_left;
relation_right:node DASH LBRAC node_variable node_type RBRAC RARROW node;
relation_left: node LARROW LBRAC node_variable node_type RBRAC DASH node;



variable: VARIABLE;

VARIABLE: [a-zA-Z_]+;
WS     : [ \n\t]+ -> skip;