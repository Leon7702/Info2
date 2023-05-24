//package Lab07;
//
//public class Postfix2 {
//	    
//	    public static boolean isOperand(char a) {
//	        return (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' 
//	                || a == '7' || a == '8' || a == '9');
//	    }
//
//	    public static int getPrecedence(char operator) {
//	        switch (operator) {
//	            case '+':
//	            case '-':
//	                return 1;
//	            case '*':
//	            case '/':
//	                return 2;
//	            case '^':
//	                return 3;
//	            default:
//	                return -1;
//	        }
//	    }
//
//	    public static String infixToPostfix(String ifx) throws NonSenseException, OverflowException, UnderflowException {
//	        StringBuilder pfx = new StringBuilder();
//	        StackAsList<Character> stack = new StackAsList<>();
//
//	        for (int i = 0; i < ifx.length(); i++) {
//	            char c = ifx.charAt(i);
//
//	            if (isOperand(c)) {
//	                pfx.append(c);
//	            } else if (c == '(') {
//	                stack.push(c);
//	            } else if (c == ')') {
//	                while (!stack.isEmpty() && stack.top() != '(') {
//	                    pfx.append(stack.top());
//	                    stack.pop();
//	                }
//
//	                if (stack.isEmpty() || stack.top() != '(') {
//	                    throw new NonSenseException("Invalid infix expression: Unbalanced parentheses.");
//	                }
//
//	                stack.pop(); // Discard the '('
//	            } else {
//	                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.top())) {
//	                    pfx.append(stack.top());
//	                    stack.pop();
//	                }
//	                stack.push(c);
//	            }
//	        }
//
//	        while (!stack.isEmpty()) {
//	            if (stack.top() == '(') {
//	                throw new NonSenseException("Invalid infix expression: Unbalanced parentheses.");
//	            }
//	            pfx.append(stack.top());
//	            stack.pop();
//	        }
//
//	        return pfx.toString();
//	    }
//
//	    public static void main(String args[]) throws OverflowException, UnderflowException {
//	        String ifx = "a+b^c*d^e ^ f - g - h / ( i + j )";
//	        try {
//	            String pfx = infixToPostfix(ifx);
//	            System.out.println("Infix: " + ifx);
//	            System.out.println("Postfix: " + pfx);
//	        } catch (NonSenseException e) {
//	            System.out.println("Invalid infix expression: " + e.getMessage());
//	        }
//	    }
//	}
