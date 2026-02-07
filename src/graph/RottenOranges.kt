package graph

import java.util.LinkedList
import java.util.Queue

class RottenOranges {

    fun orangesRotting(grid: Array<IntArray>): Int {

        var noOfMinutes = 0
        val direction = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,-1),
            intArrayOf(0,1),)
        val rows = grid.size
        val cols = grid[0].size
        var fresh = 0
        val q : Queue<IntArray> = LinkedList()



        for(i in 0 until rows){
            for(j in 0 until cols) {
                if(grid[i][j] == 1) fresh++
                if(grid[i][j] == 2){
                    q.add(intArrayOf(i,j))
                }
            }
        }

        while (fresh > 0 && q.isNotEmpty()) {
            val size = q.size
            repeat(size) {
                val (r, c) = q.poll()

                for (dir in direction) {
                    val nr = r + dir[0]
                    val nc = c + dir[1]

                    if (nr in 0 until rows && nc in 0 until cols && grid[nr][nc] == 1) {
                        q.add(intArrayOf(nr, nc))
                        fresh--
                        grid[nr][nc] = 2
                    }
                }
            }
            noOfMinutes++
        }

        print("no of minu : $noOfMinutes")
        println("grid list ${grid.toList()}")
        return if(fresh == 0) noOfMinutes else -1

    }
}


fun main() {
    val obj = RottenOranges()
    val ans = obj.orangesRotting(arrayOf(
        intArrayOf(1),
        intArrayOf(2),

        ))
}