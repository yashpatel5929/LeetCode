package heap

import java.util.*

class KthLargetElementInAnArray {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val len = nums.size
        val priorityQueue = PriorityQueue<Int>()
        for (i in 0 until len) {
            priorityQueue.offer(nums[i])
            if(priorityQueue.isNotEmpty() && priorityQueue.size > k) {
                priorityQueue.poll()
            }

        }


        return priorityQueue.poll()
    }
}

fun main() {
    val d = KthLargetElementInAnArray().findKthLargest(intArrayOf(3,2,3,1,2,4,5,5,6) , 4)
    print(d)
}