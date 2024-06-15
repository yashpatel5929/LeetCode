package array

import kotlin.math.absoluteValue
import kotlin.random.Random

class SingleNumber3 {
    fun singleNumber(nums: IntArray): IntArray {
       var xorAll = 0
        for(i in nums) {
            xorAll  =xorAll.xor(i)
        }

        val setBit = xorAll.and(-xorAll)
        var a = 0
        var b = 0
        for (i in nums) {
            if(i and setBit != 0) {
                a = a.xor(i)
            }else {
                b = b.xor(i)
            }
        }
        return intArrayOf(a,b)
    }
}

fun main() {
    val d = SingleNumber3().singleNumber(intArrayOf(0,1,2,2))
    print(d)
}