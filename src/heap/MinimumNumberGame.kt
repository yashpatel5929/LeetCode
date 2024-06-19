package heap

import java.util.PriorityQueue

class MinimumNumberGame {
    fun numberGame(nums: IntArray): IntArray {

        val queue = PriorityQueue<Int>()
        val result = mutableListOf<Int>()
        for(i in 0 until nums.size) {
            queue.offer(nums[i])
        }

        while (queue.isNotEmpty()) {
            val alice = queue.poll()
            val bob = queue.poll()
            result.add(bob)
            result.add(alice)
        }

       return result.toIntArray()
    }
}

fun main() {
    val d = MinimumNumberGame().numberGame(intArrayOf(5,4,2,3))
}