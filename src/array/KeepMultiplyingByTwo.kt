package array

class KeepMultiplyingByTwo {

    fun findFinalValue(nums: IntArray, original: Int): Int {
        val hash = HashMap<Int,Int>()
        for (i in nums) {
            hash.put(i , hash.getOrDefault(i , 0)+1)

        }
        var result = original
        while (result in hash) {
            result = result * 2
        }

        return result


    }

    fun minimumOperations(nums: IntArray): Int {
        var count =0
        for(i in nums) {
            if((i-1)%3 == 0 || (i + 1) % 3 == 0 )
                count++
        }

        return count
    }
}


fun main() {


/*    val d = KeepMultiplyingByTwo().findFinalValue(intArrayOf(5,3,6,1,12), 3)
    print(d)*/

    val d = KeepMultiplyingByTwo().minimumOperations(intArrayOf(3,6,9))
    print(d)

}