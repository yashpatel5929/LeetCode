package heap

import java.util.PriorityQueue
import kotlin.math.max

class DeleteGreatestElementFromEachRow {

    fun deleteGreatestValue(grid: Array<IntArray>): Int {
        val resultList : MutableList<PriorityQueue<Int>> = mutableListOf()

        val row = grid.size
        grid.forEach {
            resultList.add(calulateMax(it))
        }

        var ans  = 0
        var max = 0
        print(resultList)
        while (resultList[0].isNotEmpty()) {
            ans += max
            max =0
            resultList.forEach {
                if(it.peek() > max) {
                    max = it.poll()
                }
            }
        }


        print(ans)
        return ans

    }

    private fun calulateMax(tempList: IntArray): PriorityQueue<Int> {
        val comparator = Comparator<Int> { a,b -> b-a }
        val queue = PriorityQueue<Int>(comparator)
        tempList.forEach {
            queue.offer(it)
        }

        return queue
    }
}

fun main() {
    val d = DeleteGreatestElementFromEachRow().deleteGreatestValue(arrayOf(intArrayOf(1, 2,4 ), intArrayOf(3, 3, 1)))

}