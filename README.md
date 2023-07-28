# rpn-calculator
An RPN calculator computes expression written in Reverse Polish Notation.
An RPN expression or postfix expression is one of the following:
• a number X, in which case the value of the expression is that of X,
• a sequence of form E1 E2 OP where E1 and E2 are RPN expressions and OP is an
arithmetic operation.
Samples:
20 5 / => 20/5 = 4
4 2 + 3 - => (4+2) -3 = 3
3 5 8 * 7 + * => ((5*8) +7) *3 = 141
In Rest Example:
Input:
{
 "expression": "20 5 /"
}
Output:
{
 "result": 4
}
