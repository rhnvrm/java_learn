import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static private String expression;
    private Stack<Character> stack = new Stack<Character>();

    public InfixToPostfix(String infixExpression) {
        expression = infixExpression;
    }

    public String infixToPostfix() {
        String postfixString = "";

        for (int index = 0; index < expression.length(); ++index) {
            char value = expression.charAt(index);
            if (value == '(') {
                stack.push('('); 
            } else if (value == ')') {
                Character oper = stack.peek();

                while (!(oper.equals('(')) && !(stack.isEmpty())) {
                    stack.pop();
                    postfixString += oper.charValue();
                    if (!stack.isEmpty()) 
                        oper = stack.peek(); 
                }
                stack.pop(); 
            } else if (value == '+' || value == '-') {
                if (stack.isEmpty()) {
                    stack.push(value);
                } else {
                    Character oper = stack.peek();
                    while (!(stack.isEmpty() || oper.equals(('(')) || oper.equals((')')))) {
                        oper = stack.pop(); 
                        postfixString += oper.charValue();
                    }
                    stack.push(value);
                }
            } else if (value == '*' || value == '/') {
                if (stack.isEmpty()) {
                    stack.push(value);
                } else {
                    Character oper = stack.peek();
                    
                    while (!oper.equals(('(')) && !oper.equals(('+')) && !oper.equals(('-')) && !stack.isEmpty()) {
                        oper = stack.pop(); 
                        postfixString += oper.charValue();
                    }
                    stack.push(value);
                }
            } else {
                postfixString += value;
            }
        }

        while (!stack.isEmpty()) {
            Character oper = stack.peek();
            if (!oper.equals(('('))) {
                stack.pop();
                postfixString += oper.charValue();
            }
        }
        return postfixString;
    }

    public static void main(String[] args) {
        System.out.println("Type an expression written in Infix notation: ");
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        InfixToPostfix convert = new InfixToPostfix(expression);
        System.out.println("This expression writtien in Postfix notation is: \n" + convert.infixToPostfix());
    }
}