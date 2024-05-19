package binarysearch

import kotlin.math.ceil

class KokoEatBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var low = 1
        var high = piles.max()
        while (low <= high) {
            val mid = (low + high)/2
            val totalH = calculatTotalHout(piles,mid)
            if(totalH <= h) {
                high = mid-1
            }else {
                low = mid+1
            }
        }
        return low
    }

    fun calculatTotalHout(piles: IntArray,h :Int) : Int {
        var totalHour = 0.0
        for(element in piles) {
            val hr = element.toDouble() / h.toDouble()
            totalHour += ceil(hr)
        }
        return totalHour.toInt()
    }
}

fun main() {
    val k = KokoEatBananas()
    val ans = k.minEatingSpeed(intArrayOf(3,6,7,11) , 8)
    print(ans)
}