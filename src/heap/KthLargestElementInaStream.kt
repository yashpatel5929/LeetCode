package heap

import java.util.PriorityQueue

class KthLargest(k: Int, nums: IntArray) {
    var k : Int = 0
    var nums : MutableList<Int> = mutableListOf()
    init {
        this.k = k
        this.nums = nums.toMutableList()
    }


    val priorityQueue = PriorityQueue<Int>()
    fun add(input: Int): Int {

        nums.add(input)
        priorityQueue.clear()
        nums.forEach { priorityQueue.offer(it) }
        print("prio $priorityQueue")
        while (priorityQueue.isNotEmpty() && priorityQueue.size > k) {
                priorityQueue.poll()
        }




        return priorityQueue.poll()
    }

}

fun main() {
    val  kthLargest = KthLargest(1, intArrayOf())
    print(kthLargest.add(-3))   // return 4
    print(kthLargest.add(-2))  // return 5
    print(kthLargest.add(-4))  // return 5
    print(kthLargest.add(0))  // return 8
    print(kthLargest.add(4))   // return 8
}