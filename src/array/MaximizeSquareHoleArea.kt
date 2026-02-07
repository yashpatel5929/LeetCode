package array

import kotlin.math.max
import kotlin.math.min

class MaximizeSquareHoleArea {
    fun maximizeSquareHoleArea(n: Int, m: Int, hBars: IntArray, vBars: IntArray): Int {

        val x = getMaxArea(hBars)
        val y = getMaxArea(vBars)
        val areas = min(x,y)
        return areas*areas
        /*val row = n+2
        val col = m+2
        var area =0
        var len =0
        var breath = 0

        for (i in hBars) {
            for(j in vBars) {
                val limit = i .. i+1
                if(i in limit && j in limit) {
                    len = i+1 - 1
                    breath = j+1 -1
                    if(len == breath) {
                        area = max(area ,len * breath)
                    }
                }
            }
        }

        val minimaH = hBars.min()-1
        val minimabV = vBars.min() -1
        val maximiaH = hBars.max() + 1
        val maximaV = vBars.max() + 1
        val l = maximiaH - minimaH
        val b = maximaV - maximiaH
        if(minimaH >1 && maximiaH < row && minimabV > 1 && maximaV < col ) {
            if(l == b)
                area = max(area , l*b)
        }


        return  area*/



    }

    fun getMaxArea(bars : IntArray) : Int {

        var ans = 2
        var count = 1
        val sortedArr = bars.sorted()

        for(i in 1 until bars.size) {
            if(sortedArr[i] - sortedArr[i-1] ==1){
                count++
                ans = max(ans , count+1)
            }else {
                count = 1
            }
        }
        return ans

    }
}



fun main() {
    val d = MaximizeSquareHoleArea().maximizeSquareHoleArea(
        1,1, intArrayOf(2), intArrayOf(2)
    )
    print(d)
}