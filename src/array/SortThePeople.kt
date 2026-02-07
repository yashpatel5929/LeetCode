package array

import com.sun.jdi.Value
import java.util.PriorityQueue

class SortThePeople {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val maxComparator =  Comparator<Int> { a,b -> b-a }
        val priorityQueue = PriorityQueue(maxComparator)
        val hm = HashMap<Int , String>()
        for(i in 0 until names.size) {
            hm.put(heights[i],names[i])
            priorityQueue.offer(heights[i])
        }

        var result = mutableListOf<String>()
        while (priorityQueue.isNotEmpty()) {
            result.add(hm.getValue(priorityQueue.poll()))
        }
        print(result)
        return result.toTypedArray()

    }


    }

fun main() {
    val d = SortThePeople().sortPeople(arrayOf("Mary","John","Emma") , intArrayOf(180,165,170))
}