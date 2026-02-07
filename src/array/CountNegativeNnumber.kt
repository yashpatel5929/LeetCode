package array

class CountNegativeNnumber {

    fun countNegatives(grid: Array<IntArray>): Int {
        val row = grid.size
        val col = grid[0].size
        var count = 0
        for(i in 0 until row) {
            count += grid[i].count { it < 0 }
        }

        return count
    }
}


fun main() {
    val d = CountNegativeNnumber().countNegatives(arrayOf(
        intArrayOf(4,3,2,1),
        intArrayOf(3,2,1,-1),
        intArrayOf(1,1,-1,-2),
        intArrayOf(-1,-1,-2,-3),
    ))
    print(d)
}