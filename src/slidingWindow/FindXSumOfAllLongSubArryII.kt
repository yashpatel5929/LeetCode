package slidingWindow
/*
You are given an array nums of n integers and two integers k and x.

The x-sum of an array is calculated by the following procedure:

Count the occurrences of all elements in the array.
Keep only the occurrences of the top x most frequent elements. If two elements have the same number of occurrences, the element with the bigger value is considered more frequent.
Calculate the sum of the resulting array.
Note that if an array has less than x distinct elements, its x-sum is the sum of the array.

Return an integer array answer of length n - k + 1 where answer[i] is the x-sum of the subarray nums[i..i + k - 1].

Input: nums = [1,1,2,2,3,4,2,3], k = 6, x = 2

Output: [6,10,12]
 */
class findXSumOfAllLongSubArrayII {

    fun findXSum(nums: IntArray, k: Int, x: Int): LongArray {
        val result = mutableListOf<Long>()
        val map = hashMapOf<Int, Int>()
        val ans = mutableListOf<Long>()
        var i = 0
        var j = k - 1

        while (j < nums.size) {
            map.clear()
            ans.clear()
            for (m in i..j) {
                map[nums[m]] = map.getOrDefault(nums[m], 0) + 1
            }

            val sortedMap = map.entries
                .sortedByDescending { it.value }
                .groupBy { it.value }

            for ((_, group) in sortedMap) {
                val sortedGroup = group.sortedByDescending { it.key }
                for (entry in sortedGroup) {
                    if (ans.size < x) {
                        ans.add(entry.key.toLong() * entry.value)
                    }
                }
            }

            // sum as long, then cast safely to int (if required)
            result.add(ans.sum())
            i++
            j++
        }
        return result.toLongArray()
    }

}

fun main () {
    val obj = findXSumOfAllLongSubArrayII()
    val mmf= obj.findXSum(intArrayOf(1000000000,1000000000,1000000000,1000000000,1000000000,1000000000) , 6 , 1)
    print(mmf[0])
}