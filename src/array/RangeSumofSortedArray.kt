package array

class RangeSumofSortedArray {
    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        var sum = 0
        val MOD = 1000000007
        var sumArray = mutableListOf<Int>()
        for(i in 0 until nums.size) {
            sum  = 0
            for(j in i until nums.size) {
                sum += nums[j]
                sumArray.add(sum)
            }
        }

        sumArray.sort()

        var rangeSum = 0
        for (i in (left - 1) until right) {
            rangeSum = (rangeSum + sumArray[i]) % MOD
        }

        return rangeSum


    }
}

fun main() {
    val d = RangeSumofSortedArray().rangeSum(intArrayOf(1,2,3,4) , 4,1,5)
    print(d)
}