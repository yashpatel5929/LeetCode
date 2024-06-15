package array

class ContagiousSubArray {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val len = nums.size
        val hm = HashMap<Int , Int>()
        var sum = 0
        if(len == 1) {
            return false
        }
        hm[0] = -1
        for(i in 0 until len) {
            sum += nums[i]
            val rem = sum % k
            if(rem !in hm) {
                hm[rem] = i
            }else  if((i - hm[rem]!!)> 1) {
                return true
            }
        }



        return false

    }
}

fun main() {
    val d = ContagiousSubArray().checkSubarraySum(intArrayOf(1,2,3) , 5)
    print(d)
}