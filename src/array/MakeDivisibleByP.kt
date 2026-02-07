package array

class MakeDivisibleByP {

    fun minSubarray(nums: IntArray, p: Int): Int {

        val sumOfNum = nums.fold(0L) { acc, v -> acc + v }
        val rem = (sumOfNum % p).toInt()
        if(sumOfNum < p) {
            return -1
        }else if(rem  == 0)
            return  0
        else if(rem in nums){
            return 1
        }else {
            var sum = 0
            var i =0
            var j = 1
            while (j < nums.size){
                if(nums[i]+nums[j] > rem){
                    i++
                    j=i+1
                }else if(nums[i]+nums[j] < rem) {
                    j++
                }else if(nums[i]+nums[j] == rem)
                    return (j+1)-i
            }

            return -1
        }


    }
}
fun main() {
    val obj = MakeDivisibleByP()
    val ans =obj.minSubarray(intArrayOf(1000000000,1000000000,1000000000) , 3)
    print(ans)
}