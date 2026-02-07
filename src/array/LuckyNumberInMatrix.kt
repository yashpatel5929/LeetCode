package array

import kotlin.math.max

class LuckyNumberInMatrix {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        val minArray = mutableListOf<Int>()

        val row = matrix.size
        var result = mutableListOf<Int>()
        for (i in 0 until row) {
            minArray.add(matrix[i].min())
        }
        print(minArray)
        for(i in 0 until row){
            var max = Int.MIN_VALUE
            var itr = 0
            for(j in 0 until matrix[0].size) {
                if(matrix[j][i] > max) {
                    max = matrix[j][i]
                    itr = j
                }
            }
            if(minArray[itr] == max) {
                result.add(max)
            }
        }

          return result
    }
}

fun main() {
   val d = LuckyNumberInMatrix().luckyNumbers(arrayOf(intArrayOf(3,7,8), intArrayOf(9,11,13), intArrayOf(15,16,17)))

/*
    val d = LuckyNumberInMatrix().luckyNumbers(arrayOf(intArrayOf(7,8), intArrayOf(1,2)))
    val d = LuckyNumberInMatrix().luckyNumbers(arrayOf(intArrayOf(3,6), intArrayOf(7,1) , intArrayOf(5,2), intArrayOf(4,8)))
*/


    print(d)

}