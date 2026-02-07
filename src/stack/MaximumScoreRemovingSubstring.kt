package stack

import java.util.Stack

class MaximumScoreRemovingSubstring {

    fun maximumGain(s: String, x: Int, y: Int): Int {
        val priority = if (x>y) 1 else 0
        val st = Stack<Char>()
        val st2 = Stack<Char>()
        var result = 0
        s.toCharArray().forEach {
            if(st.isNotEmpty()){
                if(priority == 1){
                    if(st.peek() == 'a' && it == 'b'){
                        st.pop()
                        result+=x
                    }else {
                        st.push(it)
                    }
                }else {
                    if(st.peek() == 'b' && it == 'a'){
                        st.pop()
                        result+=y
                    }else {
                        st.push(it)
                    }
                }
            }else {

                st.push(it)

            }
        }

        st.forEach {
            if(st2.isNotEmpty()){
                if(priority != 1){
                    if(st2.peek() == 'a' && it == 'b'){
                        st2.pop()
                        result+=x
                    }else {
                        st2.push(it)
                    }
                }else {
                    if(st2.peek() == 'b' && it == 'a'){
                        st2.pop()
                        result+=y
                    }else {
                        st2.push(it)
                    }
                }
            }else {

                st2.push(it)

            }
        }
        return result
    }
}


fun main() {
    val d = MaximumScoreRemovingSubstring().maximumGain("aabbaaxybbaabb" , 5,4)
    print(d)
}