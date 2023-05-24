package Lab07;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	
	public static boolean operand(char a) {
		return (a== '0' || a=='1' || a=='2' || a=='3' || a=='4' || a=='5' || a=='6' 
				|| a=='7'|| a=='8'|| a == '9');
	}
	
	public static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

	public static double evaluate (String pfx) throws OverflowException, UnderflowException {
		StackAsList<String> s = new StackAsList<String>();
		
		for(int i=0; i< pfx.length(); i++) {
			if(operand(pfx.charAt(i))) {
				s.push(pfx.charAt(i)+"");
			} else {
				String rhs = s.top();
				s.pop();
				String lhs = s.top();
				s.pop();
				
				double result = 0;
				switch(pfx.charAt(i)) {
				case '*':
					result = Double.valueOf(lhs) * Double.valueOf(rhs);
					break;
				case '+':
					result = Double.valueOf(lhs) + Double.valueOf(rhs);
					break;
				case '-':
					result = Double.valueOf(lhs) - Double.valueOf(rhs);
					break;
				case '/':
					result = Double.valueOf(lhs) / Double.valueOf(rhs);
					break;
				case '^':
					result =  Math.pow(Double.valueOf(lhs), Double.valueOf(rhs));
					break;
				}	
					
				s.push(result +"");
			}
		}
		return Double.valueOf(s.top());
	}

	public static String infixToPostfix(String infix) throws OverflowException, UnderflowException, NonSenseException {
	
		StringBuilder sb = new StringBuilder();
		StackAsList<Character> stack = new StackAsList<Character>();
		
		for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (operand(c)) {
            	sb.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.top() != '(') {
                    sb.append(stack.top());
                    stack.pop();
                }

                if (stack.isEmpty() || stack.top() != '(') {
                    throw new NonSenseException("Wrong input :(.");
                }

                stack.pop(); 
            } else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.top())) {
                    sb.append(stack.top());
                    stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.top() == '(') {
                throw new NonSenseException("Wrong input :(.");
            }
            sb.append(stack.top());
            stack.pop();
        }

        return sb.toString();
    }
	
	public static void calcInput() throws OverflowException, UnderflowException, NonSenseException {
		Scanner inputReader = new Scanner(System.in);
		String input = null;
		System.out.println("Enter an infix expression with no spaces: ");
		input = inputReader.next();
		String pfx;
		pfx = infixToPostfix(input);
		System.out.println(evaluate(pfx));
		
		
	}
	

	public static void main(String args[]) throws OverflowException, UnderflowException, NonSenseException {
	
//		calcInput();
		System.out.println(infixToPostfix("1*2+3"));
		System.out.println(infixToPostfix("1+2*3"));
		System.out.println(infixToPostfix("1+2-3^4"));
		System.out.println(infixToPostfix("1+2*3-4^5+6"));
		System.out.println(infixToPostfix("(1+2)*3+(4^(5-6))"));
		System.out.println(infixToPostfix("(1+2)*3+(4^(5-6))"));
		System.out.println(infixToPostfix("1+2+3/4+5+6*(7+8)"));
		System.out.println(infixToPostfix("9-1-2-3*2-1"));



	}
}
