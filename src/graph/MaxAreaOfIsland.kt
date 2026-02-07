package graph

import java.util.LinkedList
import java.util.Queue

class MaxAreaOfIsland {

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var noOfIsland = 0
        var maxArea = 0
        val direction = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,-1),
            intArrayOf(0,1),)
        fun bfs(row : Int , col : Int) {
            var area = 0
            val q : Queue<IntArray> = LinkedList()
            q.add(intArrayOf(row,col))
            area++
            grid[row][col] = 0

            while (q.isNotEmpty()){
                val (r,c) = q.poll()
                for(dir in direction){
                    val nr = r+dir[0]
                    val nc = c+dir[1]

                    if(nr < 0 || nc < 0 || nr >= rows || nc >= cols || grid[nr][nc] == 0)
                        continue

                    q.add(intArrayOf(nr,nc))
                    area++
                    grid[nr][nc] = 0
                }
            }

            maxArea = maxOf(maxArea , area)
        }


        for(i in 0 until rows) {
            for(j in 0 until cols) {
                if(grid[i][j] == 1) {noOfIsland+=1

                    bfs(i,j)

                }
            }
        }

       print(maxArea)
        return maxArea

    }
}


fun main() {
    val obj = MaxAreaOfIsland()
    obj.maxAreaOfIsland(
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),

            )
    )
}