/*
package stack

import java.util.Stack
import kotlin.math.abs

class MinimumAddToMakeParanthesesValid {

    fun minAddToMakeValid(s: String): Int {
        var count = 0
        val arr = s.toCharArray()
        val st = Stack<Char>()

        arr.forEach {
            if(it == '(') {
                st.push(it)
            }else {
                if ((it == ')' && st.isEmpty())) {
                    count++
                    return@forEach
                }
                val top = st.pop()
                if(top == '(' && it != ')') count++
            }
        }

        while (st.isNotEmpty()){
            if(st.pop() == '(') count++
        }

        return count

    }
}

fun main() {
    val d = MinimumAddToMakeParanthesesValid().minAddToMakeValid("()))((")
    print(d)
}*/
