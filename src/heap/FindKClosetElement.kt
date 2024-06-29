package heap

import java.util.PriorityQueue
import kotlin.math.abs

class FindKClosetElement {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        val maxHeapComparator = Comparator<Pair<Int,Int>> { p1 ,p2 ->
            when {
                p1.first != p2.first -> p2.first.compareTo(p1.first)
                else -> p2.second.compareTo(p1.second)
            }


        }
        val priorityQueue  = PriorityQueue(maxHeapComparator)
        arr.forEach {
            priorityQueue.add(Pair((abs(it-x)),it))
            if(priorityQueue.size > k){
                priorityQueue.poll()
            }
        }
        val res = mutableListOf<Int>()


//        print(priorityQueue)
        while (priorityQueue.isNotEmpty()) {
//            print(priorityQueue.poll().second)
            res.add(priorityQueue.poll().second)
        }

        res.sort()
        return res
    }
}

fun main() {
    val d = FindKClosetElement().findClosestElements(intArrayOf(1,2,3,4,5) , 4, 3)
    print(d)
}