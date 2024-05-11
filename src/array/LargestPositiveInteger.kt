package array

class LargestPositiveInteger {
    fun findMaxK(nums: IntArray): Int {
        var hasmap = HashMap<Int , Int>()
        for(i in 0 until nums.size) {
            val abs = Math.abs(nums[i])

            hasmap.put(abs,hasmap.getOrDefault(nums[i], 0)+1)
            println("some ${abs}" + hasmap.getOrDefault(nums[i] , 0))
        }
        var max = Int.MIN_VALUE
        hasmap.forEach { t, u ->
            if(u > 1 && t > max) {
                max = t
            }
        }

        return max
    }
}

fun main() {
    val largestPositiveInteger = LargestPositiveInteger()
    val ans = largestPositiveInteger.findMaxK(intArrayOf(-1,10,6,7,-7,1))
    print("ans dsdsd $ans")
}