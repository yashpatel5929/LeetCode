package graph

import java.util.*
import kotlin.collections.ArrayDeque

class NumberOfProvince {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        var count = 0
        val visited = IntArray(n){0}


        fun bfs(i: Int) {
            val q = ArrayDeque<Int>()
            q.add(i)
            while (q.isNotEmpty()) {
                val node = q.removeFirst()
                for(j in 0 until n){
                    if(isConnected[node][j] == 1 && visited[j] == 0){
                        q.add(j)
                        visited[j] = 1
                    }
                }
            }
        }
        for(i in 0 until n) {
            if(visited[i] == 0) {
                count++
                bfs(i)
            }
        }
        print(visited.toList())
        return count
    }


}

fun main() {
    val obj = NumberOfProvince()
    val ans = obj.findCircleNum(arrayOf(
      intArrayOf(1,0,0),
        intArrayOf(0,1,0),
        intArrayOf(0,0,1)
    ))
    print(ans)
}

