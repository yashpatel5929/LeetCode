package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    Stack<Character> st = new Stack<>();
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        return backtrack(0,0 , n);


    }

    private List<String> backtrack(int open , int close , int n) {
        StringBuilder res = new StringBuilder();
        if(close == n && open == n) {
            result.add(st.toString()
                    .replace(",", "")
                    .replace(" ", "")
                    .replace("[", "")
                    .replace("]", ""));

            //result.addAll(st);
            /*for(Character ch : st){
                res.append(ch);

//                System.out.println("reghgh"+ch);
            }
            result.add(String.valueOf(""+res));*/
            System.out.println("res" +result.toString());
            return result;
        }

        if(open < n) {
            st.push('(');
            backtrack(open+1 , close,n );
            st.pop();
        }

        if(close < open) {
            st.push(')');
            backtrack(open,close+1,n);
            st.pop();
        }

        return result;
    }
}
