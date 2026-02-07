package array

class MinimumCost {

    fun minimumCost(nums: IntArray): Int {
        var sum = 0
     nums.sort(1,nums.size)
        for(i in 0 until 3){
            sum += nums[i]
        }
        return sum
    }
}


fun main() {
    val d = MinimumCost().minimumCost(intArrayOf(1,5,1,6))
    print(d)
}