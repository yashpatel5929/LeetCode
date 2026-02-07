package array

import java.util.Stack
import kotlin.math.pow

class SumOfSubArrayMiinimum {
    fun sumSubarrayMins(arr: IntArray): Int {
       /* var sum =0
        if (arr.size == 1) return arr[0]
        for(i in 0 until arr.size) {
            sum += arr[i]
            for(j in i+1 until  arr.size) {
                println(arr.sliceArray(i until j).min())
                sum += arr.sliceArray(i .. j).min()

            }
        }*/

        var sum = 0
        val MOD = (10.0.pow(9.0) +7).toInt()
        val st = Stack<Pair<Int,Int>>()
        for (i in 0 until arr.size) {
            while (st.isNotEmpty() && arr[i] <= st.peek().second){
                val ( index , num) = st.pop()
                val left = if(st.isNotEmpty()) index - st.peek().first else index+1
                val right = i -index
                sum += (num * left * right) % MOD
            }

            st.add(Pair(i , arr[i]))
        }

        for(i in 0 until  st.size) {
            val (j , n) = st[i]
            val left = if(i>0) st[i-1].first else j+1
            val right = arr.size - j
            sum += (n * left * right) % MOD
        }

        return sum

    }
}

fun main() {
    val d = SumOfSubArrayMiinimum().sumSubarrayMins(intArrayOf(11,81,94,43,3))
    print(d)
}