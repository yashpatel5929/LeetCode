package array

class SumOfAllSubsetXor {
    var result = 0
    fun subsetXORSum(nums: IntArray): Int {
        subset(nums , 0 , 0)
        return result
    }

    fun subset(nums : IntArray , start : Int , prev : Int) {
        for(i in start until nums.size) {
            val temp = prev xor nums[i]
            result = result + temp

            subset(nums,i+1 , temp)
        }
    }
}
fun main() {
     val b = SumOfAllSubsetXor().subsetXORSum(intArrayOf(3,4,5,6,7,8))

    print(b)
}