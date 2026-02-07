package graph

import java.util.LinkedList
import java.util.Queue

class SurroundedRegion {
    fun solve(board: Array<CharArray>): Unit {

        val rows = board.size
        val cols = board[0].size

        val direction = arrayOf(
            intArrayOf(1,0),
            intArrayOf(-1,0),
            intArrayOf(0,-1),
            intArrayOf(0,1),)

        fun bfs() {

            val q : Queue<IntArray> = LinkedList()

            for(i in 0 until rows){
                for(j in 0 until cols) {
                    if(i == 0 || i == rows-1 || j ==0 || j == cols-1){
                        if(board[i][j] == 'O') {
                            q.add(intArrayOf(i, j))
                        }
                    }
                }
            }

            while (q.isNotEmpty()) {
                val (r,c) = q.poll()
                if(board[r][c] == 'O'){
                    board[r][c] ='T'
                    for(dir in direction) {
                        val nr = r + dir[0]
                        val nc = c + dir[1]
                        if(nr in 0 until rows && nc in 0 until cols){
                            q.add(intArrayOf(nr,nc))
                        }


                    }

                }

            }

        }

        bfs()

        for(i in 0 until rows) {
            for(j in 0 until cols) {
                if(board[i][j] == 'O'){
                    board[i][j] = 'X'
                }else if(board[i][j] == 'T'){
                    board[i][j] = 'O'
                }
            }
        }

        print(board.contentDeepToString())

    }
}


fun main() {
    val obj = SurroundedRegion().solve(arrayOf(
        charArrayOf('X','X','X','X'),
        charArrayOf('X','O','O','X'),
        charArrayOf('X','X','O','X'),
        charArrayOf('X','O','X','X'),

    ))
}