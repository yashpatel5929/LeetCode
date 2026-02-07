package stack

import kotlin.math.abs
import kotlin.math.max

class MaximumRamp {
    fun maxWidthRamp(nums: IntArray): Int {
       /* val result = mutableListOf<Int>()
        val len = nums.size
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] <= len && nums[j] <= len) {
                    if (nums[i] <= nums[j]) {
                        result.add(j - i)
                    }
                }
            }
        }
        return result.max()*/

        var i =0
        var j = 1
        var maxi = 0
        while (j <= nums.size) {
//            if(i == nums.size-2 && nums.size > 2) break
            if(j > nums.size-1) {
                if(i > nums.size) break
                i++
                j = i+1
                continue
            }else {

                if (nums[i] <= nums[j]) {
                    maxi = max(maxi, j - i)
                }
                j++
            }
        }
        return maxi
    }
}

fun main() {
    val d = MaximumRamp().maxWidthRamp(intArrayOf(3,1,2))
    print(d)
}