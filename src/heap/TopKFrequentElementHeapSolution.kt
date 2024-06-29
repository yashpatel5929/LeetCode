package heap

import java.util.PriorityQueue
import kotlin.math.min

class TopKFrequentElementHeapSolution {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val minHeapComparator = Comparator<Pair<Int,Int>> { p1 ,p2 ->
            when {
                p1.first != p2.first -> p1.first.compareTo(p2.first)
                else -> p1.second.compareTo(p2.second)
            }


        }
        if(nums.size == k)
            return nums

        val hm = HashMap<Int,Int>()
        nums.forEach {
            hm.put(it,hm.getOrDefault(it,0)+1)
        }

        val minHeap = PriorityQueue(minHeapComparator)
        hm.forEach {
            minHeap.offer(Pair(it.value,it.key))
            if(minHeap.size >k) {
                minHeap.poll()
            }
        }
        val res = mutableListOf<Int>()
        while (minHeap.isNotEmpty()) {
            res.add(minHeap.poll().second)
        }
       res.sort()
//        print(res)
        return res.toIntArray()
    }
}

fun main() {
    val d = TopKFrequentElementHeapSolution().topKFrequent(intArrayOf(5,2,5,3,5,3,1,1,3) , 2)
    print(d)
}