package stack;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0; i< arr.length;i++){
            char character = arr[i];
            if(character == '(' || character == '{' || character == '[') {
                st.push(character);
            }else {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if((arr[i] == ')' && top == '(') ||
                  (arr[i] == '}' && top == '{') ||
                        (arr[i] == ']' && top == '[')) {

                }else {
                    return false;
                }
            }
        }

        if(st.isEmpty()) return true;
        else return false;

    }
}
