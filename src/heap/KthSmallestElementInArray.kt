package heap

import java.util.PriorityQueue

class KthSmallestElementInArray {

    fun findKthSmallest(nums: IntArray, k: Int): Int {
       val len = nums.size
        val maxHeapComparatr = Comparator<Int> { a,b -> b-a }
        val priorityQueue = PriorityQueue<Int>(maxHeapComparatr)
        for (i in 0 until len) {
            priorityQueue.offer(nums[i])
           /* if(priorityQueue.isNotEmpty() && priorityQueue.size > k) {
                priorityQueue.poll()
            }*/

        }
        print(priorityQueue)


        return priorityQueue.poll()
    }
}

fun main() {
    val d = KthSmallestElementInArray().findKthSmallest(intArrayOf(1,2,4) , 1)
    print(d)
}