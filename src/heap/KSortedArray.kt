package heap

import java.util.PriorityQueue

class KSortedArray {
    fun nearlySortedrray(nums : IntArray , k : Int) {

        val result = mutableListOf<Int>()
        val priorityQueue = PriorityQueue<Int>()
        nums.forEach {
            if(priorityQueue.size > k) {
                result.add(priorityQueue.poll())
                priorityQueue.offer(it)
            }else {
                priorityQueue.offer(it)
            }
        }
        while (priorityQueue.isNotEmpty()) {
            result.add(priorityQueue.poll())
        }

        print(result)
    }
}


fun main() {
    val d = KSortedArray().nearlySortedrray(intArrayOf(3,1,4,2,5) , 2)
}