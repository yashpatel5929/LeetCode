package array

import kotlin.math.abs

class CountPartitionWithEvenSum {
    fun countPartitions(nums: IntArray): Int {
        var i =0
        val n = nums.size
        var count = 0
        while (i < n-1) {
            val diff = abs(nums.sliceArray(0..i).sum()-(nums.sliceArray(i+1..n-1).sum()))
            if(diff % 2 == 0){
                count++
            }
            i++
        }

        return  count
    }
}


fun main() {
    val obj = CountPartitionWithEvenSum()
    print(obj.countPartitions(intArrayOf(2,4,6,8)))
}