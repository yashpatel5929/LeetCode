package array

import kotlin.math.abs

class PassThePillow {
    fun passThePillow(n: Int, time: Int): Int {
        val rem = time /(n-1)
        if(rem % 2 == 0) {
            return (1+time%(n-1))
        }else{
            return (n-time%(n-1))
        }

    }
}

fun main() {

    val d = PassThePillow().passThePillow(18,38  )
    print(d)

}