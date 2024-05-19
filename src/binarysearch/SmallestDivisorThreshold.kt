package binarysearch

import kotlin.math.ceil
import kotlin.math.max

class SmallestDivisorThreshold {
    fun smallestDivisor(nums: IntArray, threshold: Int): Int {
        var low = 1
        var high = nums.max()
        var ans = -1
        while (low <= high) {
            val mid = (low + high)/2
            if(isMyDividorLessThanThreshold(nums , threshold , mid)){
                high = mid -1
            }else {
                low = mid +1
            }

        }
        return low

    }
    
    fun isMyDividorLessThanThreshold(array: IntArray , threshold: Int , div : Int) : Boolean{
        var sum = 0
        for(i in 0 until  array.size) {
            sum += ceil(array[i] / div.toDouble()).toInt()
        }
        return sum <= threshold
    }
}

fun main() {
    val sd = SmallestDivisorThreshold()
    val res = sd.smallestDivisor(intArrayOf(44,22,33,11,1),5)
    print(res)
}