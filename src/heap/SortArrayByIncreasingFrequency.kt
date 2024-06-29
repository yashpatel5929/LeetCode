package heap

import java.util.PriorityQueue

class SortArrayByIncreasingFrequency {
    fun frequencySort(nums: IntArray): IntArray {
        val maHeapComparator = Comparator<Pair<Int, Int>> { p1, p2 ->
            when {
                p1.first != p2.first -> p1.first.compareTo(p2.first)
                else -> p2.second.compareTo(p1.second)
            }
        }

        val hm = HashMap<Int, Int>()
        nums.forEach {
            hm.put(it, hm.getOrDefault(it, 0) + 1)
        }

        val maxHeap = PriorityQueue(maHeapComparator)
        hm.forEach {
            maxHeap.offer(Pair(it.value, it.key))
        }

        print(maxHeap)
        val res = mutableListOf<Int>()
        while (maxHeap.isNotEmpty()) {
            for(i in 0 until maxHeap.peek().first){
                res.add(maxHeap.peek().second)
            }
            maxHeap.poll()

        }

        print(res)
        return res.toIntArray()
    }
}

fun main() {
    val d = SortArrayByIncreasingFrequency().frequencySort(intArrayOf(2,3,1,3,2))
}