package slidingWindow

import kotlin.math.max
import kotlin.math.min

class MaximumFrequencyOfEmlementAfterPerformingOps {


    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {

        val mini = nums.min()
        val maxi = nums.max()
        var ans = 0
        val frequencyArray = IntArray(size = maxi+1 )
        for(i in nums.indices) {
            frequencyArray[nums[i]]++
        }

        for(i in 1..maxi) {
            frequencyArray[i]+= frequencyArray[i-1]
        }

        for(curr in mini .. maxi) {
            val l = max(mini , curr - k)
            val r = min(maxi , curr+k)
            val freq = frequencyArray[curr] - frequencyArray[curr-1]

            val extra = min(numOperations, frequencyArray[r] - frequencyArray[l-1] - freq)

            ans = max(ans , extra+freq)
        }

        return ans

    }
}

fun main() {
    val d = MaximumFrequencyOfEmlementAfterPerformingOps().maxFrequency(intArrayOf(5,11,20,20) , 5,1)
    print(d)
}