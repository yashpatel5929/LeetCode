package binarysearch

class KthMissingPositiveInteger {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var res = k
       for(i in 0 until arr.size) {
           if(arr[i] <= res) {
               res ++
           }
       }

        return res
    }
}

fun main() {
    val d = KthMissingPositiveInteger().findKthPositive(intArrayOf(1,2) , 1)
    print(d)
}