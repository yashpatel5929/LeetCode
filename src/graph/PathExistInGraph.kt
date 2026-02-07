package graph

import java.util.Deque
import java.util.LinkedList

class PathExistInGraph {

    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val adjList = HashMap<Int,MutableList<Int>>()
        for(i in 0 until n) {
            adjList[i] = mutableListOf()
        }

        for(i in edges) {
            val (src,des) = i
            adjList[src]!!.add(des)
            adjList[des]!!.add(src)
        }

        val queue : Deque<Int> = LinkedList<Int>()

        val visited = IntArray(n) { 0 }
        queue.add(source)
        visited[source] = 1

        while(queue.isNotEmpty()) {
            val peek = queue.pop()



            for(i in adjList.getValue(peek)) {
                if(visited[i] != 1) {
                    queue.add(i)
                    visited[i] = 1
                }
            }
        }

        return visited[source] == 1 && visited[destination]== 1

    }
}

fun main() {
    val d = PathExistInGraph().validPath(3, arrayOf(
        intArrayOf(0,1),
        intArrayOf(1,2),
        intArrayOf(2,0)
    ),0,2)
    print(d)
}