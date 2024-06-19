package heap

import java.util.PriorityQueue

class TaskScheduler {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val queue : ArrayDeque<Pair<Int, Int>> = ArrayDeque()
        val hm : HashMap<Char , Int> = HashMap()
        val maComparator = Comparator<Int> {a ,b -> b -a}
        val maxHep = PriorityQueue<Int>(maComparator)
        var time = 0
        for (i in 0 until  tasks.size) {
            hm.put(tasks[i] , hm.getOrDefault(tasks[i], 0)+1)
        }
        hm.forEach {
            maxHep.offer(it.value)
        }

        while (queue.isNotEmpty() || maxHep.isNotEmpty()) {
            time ++

             if(maxHep.isNotEmpty()) {
                val count = maxHep.poll() - 1
                 if(count !=0) {
                     queue.add(Pair(count , time+n))
                 }
             }

            if(queue.isNotEmpty() && queue.firstOrNull()?.second == time) {
                maxHep.offer(queue.removeFirst().first)
            }
        }

        return time
    }
}

fun main() {
    val d = TaskScheduler().leastInterval(charArrayOf('A','C','A','B','D','B') , 1)
    print(d)
}