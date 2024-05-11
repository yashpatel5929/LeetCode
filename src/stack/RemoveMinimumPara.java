/*
package stack;

import java.util.Stack;

public class RemoveMinimumPara {
    public String minRemoveToMakeValid(String s) {

    }


    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = s.length()-1 ; i > 0 ; i--) {
            if(!Character.isLowerCase(s.charAt(i))){
                return "";
            }
            st.push(s.charAt(i));
        }

        if(st.isEmpty())
            return  "";

        char lastExpected = '1';
        StringBuilder res = new StringBuilder();
        for(int i=0 ; i<st.size() ; i++) {
            char pop = st.pop();
            if(pop == ')' || pop == '('){
                lastExpected = pop;
            }

            if(lastExpected)


        }
    }


}
*/
