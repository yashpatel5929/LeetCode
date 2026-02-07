package array

import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.min

class MinCostToMoveChips {

    fun minCostToMoveChips(position: IntArray): Int {
       /* val map = HashMap<Int,Int>()
        for (i in position) {
            map.put(i , map.getOrDefault(i , 0)+1)
        }
        val pos = map.toList().sortedByDescending { it.first }.maxByOrNull { it.second }!!.first

        var cost = 0
        for(i in position) {
            if(i != pos && abs(pos - i) % 2 != 0){
                cost++
            }
        }
        return cost*/
        var even = 0
        var odd = 0
        for(i in position) {
            if( i %2 == 0) even++
            else odd++
        }
        return min(even,odd)
    }
}


fun main() {
    val d = MinCostToMoveChips().minCostToMoveChips(intArrayOf(3,3,1,2,2))
    print(d)
}