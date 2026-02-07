package array

import java.lang.Integer.max

class TwoBestOverlappingEvent {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        /*val row = events.size
        val range = mutableListOf<Int>()
        var max = 0
        for(i in 0 until row) {
            if(range.isEmpty()) {
                range.add(events[i][0])
                range.add(events[i][1])
                max = events[i][2]
            }else {
                if(events[i][0] > range[1]  && events[i][2] >= max){
                    max += events[i][2]
                    range[1] = events[i][1]
                }else if(events[i][0] <= range[0] && events[i][1] >= range[1] && events[i][2] > max) {
                    range[1] =events[i][1]
                    max = events[i][2]
                 }else if(events[i][0] in range[0]..range[1] && events[i][1] in range[0]..range[1] && events[i][2] > max) {
                    max = events[i][2]
                }
            }
        }

        return max*/


        var max = 0
        var range = mutableListOf<Int>()
        var result = mutableListOf<Int>()
        val colMins = IntArray(events[0].size) { col ->
            events.minOf { it[col] }
        }
        range.add(colMins[0])
        range.add(events[0][1])
        result.add(events[0][2])
        val row = events.size
        for(i in 1 until row) {
            if(result.size == 2) {
                max = max(max ,result.sum() )
                result.clear()
            }
            if(events[i][0] in range[0]..range[1]) {
                if( events[i][2] > result.sum()) {
                    result.clear()
                    result.add(events[i][2])
                }
            }else {
                result.add(events[i][2])
                range[1] = events[i][1]
            }
        }

        max = max(max ,result.sum() )
        return max

    }
}


fun main() {
    //66,97,90],[98,98,68],[38,49,63],[91,100,42],[92,100,22],[1,77,50],[64,72,97
    val d = TwoBestOverlappingEvent().maxTwoEvents(arrayOf(
        intArrayOf(66,97,90),
        intArrayOf(98,98,68),
        intArrayOf(38,49,63),
        intArrayOf(91,100,42),
        intArrayOf(92,100,22) , intArrayOf(1,77,50) , intArrayOf(64,72,97)
    ))
    print(d)
}