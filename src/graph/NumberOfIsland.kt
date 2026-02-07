package graph

import java.util.LinkedList
import java.util.Queue

class NumberOfIsland {

    fun numIslands(grid: Array<CharArray>): Int {
        val row = grid.size
        val col = grid[0].size
        val direction = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,-1),
            intArrayOf(0,1),)
        var isLands = 0

        fun bfs(r : Int , c : Int) {
            val queue : Queue<IntArray> = LinkedList()
            grid[r][c] = '0'
            queue.add(intArrayOf(r,c))

            while (queue.isNotEmpty()) {
                val (row1,col1) = queue.poll()
                for(dir in direction) {
                    val nr = row1 + dir[0]
                    val nc = col1 + dir[1]
                    if(nr < 0 || nc < 0 || nr >= row || nc >= col || grid[nr][nc] == '0') {
                        continue
                    }

                    queue.add(intArrayOf(nr,nc))
                    grid[nr][nc] = '0'
                }
            }


        }
        for(i in 0 until  row){
            for(j in 0 until col) {
                if(grid[i][j] == '1'){
                    bfs(i,j)
                    isLands +=1
                }
            }
        }

        return isLands


    }

}


fun main() {
    val obj = NumberOfIsland()
   /* val ans = obj.numIslands(arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0'),
    ))*/
    val ans = obj.numIslands(
        arrayOf(
            charArrayOf('0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'),
            charArrayOf('0', '1', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0'),
            charArrayOf('0', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '0'),
            charArrayOf('0', '1', '0', '0', '1', '1', '0', '0', '1', '1', '1', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0'),

            )
    )
    print(ans)
}