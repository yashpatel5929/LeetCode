package stack

import java.util.Stack

class ReverseStringInEachPairParanthesis {

    fun reverseParentheses(s: String): String {
        val st = Stack<Char>()
        var revSubString = StringBuilder()
        s.toCharArray().forEach {
           st.push(it)
            if(st.peek() == ')') {
                st.pop()
                revSubString.clear()
                while(st.peek() != '('){
                    revSubString.append(st.pop())
                }
                st.pop()

                revSubString.forEach {
                    st.push(it)
                }
            }
        }

        revSubString.clear()
        st.forEach {
            revSubString.append(it)
        }


        return revSubString.toString()
    }
}



fun main() {
    //(u(love)i)
    val d = ReverseStringInEachPairParanthesis().reverseParentheses("(ed(et(oc))el)")
    print(d)
}