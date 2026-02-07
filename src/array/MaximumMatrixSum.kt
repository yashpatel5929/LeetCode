package array

import java.lang.Integer.min
import kotlin.math.abs

class MaximumMatrixSum {

    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        val row = matrix.size
        val col = matrix[0].size
        var sum = 0L
        var min_val = Int.MAX_VALUE
        var neg = 0
        for(i in 0 until row) {
            for(j in matrix[i]) {
                sum += abs(j)
                min_val = minOf(min_val , abs(j))
                if(j < 0) neg += 1
            }
        }

        if( neg % 2 != 0)
            sum -= 2 * min_val

        return sum
    }


}


fun main() {
    val d = MaximumMatrixSum().maxMatrixSum(arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(-1,-2,-3),
        intArrayOf(1,2,3)
    ))
    print(d)
}