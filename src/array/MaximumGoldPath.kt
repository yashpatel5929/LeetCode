package array

import kotlin.math.max
import kotlin.math.min

class MaximumGoldPath {
    lateinit var local : Array<IntArray>
    fun getMaximumGold(grid: Array<IntArray>): Int {
        local = grid
        val row = grid.size
        val col = grid[0].size
        var res = 0
        for(i in 0 until row){
            for (j in 0 until col) {
                res = max(res , maxi(i , j) )
            }
        }


        return res

    }

    fun maxi(r: Int, c: Int) : Int{
        if(min(r,c) < 0 || r == local.size || c == local[0].size || local[r][c] == 0 )
            return 0

        val temp  = local[r][c]
        local[r][c] = 0
        var res = 0
        val neighBourelement = arrayOf(intArrayOf(r+1,c), intArrayOf(r-1,c) , intArrayOf(r, c+1) , intArrayOf(r,c-1))
        for(e in  0 until neighBourelement.size){
            res = max(res , temp + maxi(neighBourelement[e][0],neighBourelement[e][1]))
        }
        local[r][c] = temp

        return res

    }


}

fun main() {
    val b = MaximumGoldPath()
    val an=b.getMaximumGold(arrayOf(intArrayOf(0,6,0), intArrayOf(5,8,7) , intArrayOf(0,9,0)))
    print(an)
}