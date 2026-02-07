package heap

import java.util.PriorityQueue

class MinimumCostToConnectRope {
    fun minCost(arr: LongArray?, n: Int): Long {
        val priorityQueue = PriorityQueue<Long>()
        var result = 0L
        arr?.forEach {
            priorityQueue.offer(it)
        }
        while (priorityQueue.size >= 2){
            val first = priorityQueue.poll()
            val second = priorityQueue.poll()
            result += first + second
            priorityQueue.offer(first+second)
        }
        return result
    }
}

fun main() {
    val d = MinimumCostToConnectRope().minCost(longArrayOf(4, 3, 2, 6) , 4)
    print(d)
}