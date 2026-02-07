package string

import java.lang.Integer.min
import java.util.Stack

class MinimumDeletionToMakeStringBalanced () {
    fun minimumDeletions(s: String): Int {
       var a_count_digit = s.toCharArray().count { it == 'a' }
        var res = s.length -1
        var d_count_digit = 0
        s.forEach {
            if (it == 'a')
                a_count_digit -=1
            res = min(res , a_count_digit+d_count_digit)
            if(it == 'b')
                d_count_digit +=1

        }
        return res
    }
}



fun main() {
    val d = MinimumDeletionToMakeStringBalanced().minimumDeletions("bbaaaaabb")
    print(d)
}