package stack;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< tokens.length ; i++) {
            int result = 0;
            if(tokens[i].equals("+") || tokens[i].equals("*") ||tokens[i].equals("/") || tokens[i].equals("-")) {
                if(stack.isEmpty() || stack.size() ==1) return stack.peek();
                else {
                    int firstValue = stack.pop();
                    int secondValue = stack.pop();
                    switch (tokens[i]) {
                        case "+" : result = secondValue + firstValue;
                                    break;

                        case "-" : result = secondValue - firstValue;
                                    break;

                        case "*" : result = secondValue * firstValue;
                                    break;

                        case "/" : result = secondValue / firstValue;
                                    break;
                    }
                    stack.push(result);
                }
            }else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.peek();
    }


}
