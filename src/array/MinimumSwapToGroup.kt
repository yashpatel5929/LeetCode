package array

class MinimumSwapToGroup {
    fun minSwaps(nums: IntArray): Int {
        val indexList = mutableListOf<Int>()
        for(i in 0 until nums.size) {
            for(j in i+1 until nums.size) {
                if(nums[i] != nums[j] && indexList.isNotEmpty()) {
                    indexList.add(j)
                }
            }
        }


        return 0
    }
}

fun main() {
    val d = MinimumSwapToGroup().minSwaps(intArrayOf(0,1,0,1,1,0,0))
}