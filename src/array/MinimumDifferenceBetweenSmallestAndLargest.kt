package array

import java.util.PriorityQueue

class MinimumDifferenceBetweenSmallestAndLargest {

    fun minDifference(nums: IntArray): Int {
        nums.sort()

        val removeSmallest = nums.drop(3)
        print(nums.iterator().nextInt())
        /*val maxComparator = Comparator<Int> {
            a,b -> b - a
        }
        val min = nums.min()
        val res = mutableListOf<Int>()
        val priorityQueue = PriorityQueue(maxComparator)
        nums.forEach {
            priorityQueue.offer(it)
            if()
        }
        var i = 0
        while (i < 3) {
            priorityQueue.poll()
            res.add(min)
            i++
        }
        while (priorityQueue.isNotEmpty()) {
                res.add(priorityQueue.poll())
        }
        print(res)
        return res.max() - res.min()*/
    return -1
    }
}

fun main() {
    val d = MinimumDifferenceBetweenSmallestAndLargest().minDifference(intArrayOf(3,100,20))
    print(d)
}