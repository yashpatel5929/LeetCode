package heap

import java.util.PriorityQueue
import kotlin.math.min
import kotlin.math.sqrt

class KClosetPointOfOrigin {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val minHeapComparator = Comparator<Pair<Double , IntArray>> {p1,p2 ->
            p2.first.compareTo(p1.first)
        }

        val minHeap = PriorityQueue(minHeapComparator)
        points.forEach {
           val distance = calculateDistance(it[0] , it[1])
            minHeap.offer(Pair(distance , it))
            if(minHeap.size > k) {
                minHeap.poll()
            }
        }
//        print(minHeap)
        val res = mutableListOf<IntArray>()
        while (minHeap.isNotEmpty()) {
            res.add(minHeap.poll().second)
        }

        return res.toTypedArray()
    }

    fun calculateDistance(x:Int , y : Int) : Double {
        val res = (x*x) + (y*y)
        return sqrt(res.toDouble())
    }
 }

fun main() {
    val d= KClosetPointOfOrigin().kClosest(arrayOf(intArrayOf(1,3) , intArrayOf(-2,2)) , 1)
    d.forEach {
        print(it[0])
    }
}