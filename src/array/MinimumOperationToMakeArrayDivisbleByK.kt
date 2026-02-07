package array

class MinimumOperationToMakeArrayDivisbleByK {

    fun minOperations(nums: IntArray, k: Int): Int {
        val s = nums.sum()
        return if(s % k == 0) {
            0
        }else if(s < k){
            s
        }else {
            s%k
        }
    }
}


fun main() {
    val d = MinimumOperationToMakeArrayDivisbleByK().minOperations(intArrayOf(4,1,3) , 4)
    print(d)
}