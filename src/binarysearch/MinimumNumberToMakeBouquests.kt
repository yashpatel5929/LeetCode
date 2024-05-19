package binarysearch

import kotlin.math.min

class MinimumNumberToMakeBouquests {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        val len = bloomDay.size
        val value = (m*k).toLong()
        if(value > len) return -1
        var low = bloomDay.min()
        var high = bloomDay.max()
        while (low <= high) {
            val mid = (low+high)/2
            if(possible(bloomDay , mid , m ,k)){

                high = mid-1
            }else {
                low = mid+1
            }
        }
        return low
        /*for(i in bloomDay.min() .. bloomDay.max()) {
            if(possible(bloomDay,i,m,k)) {
                return i
            }
        }

        return -1*/
    }

    private fun possible(bloomDay: IntArray, day: Int, m: Int, k: Int): Boolean {
        var count = 0
        var noOfBouquets = 0
        for(i in 0 until bloomDay.size){
            if(bloomDay[i] <= day) {
                count++
            }else {
                noOfBouquets += (count/k)
                count = 0
            }
        }
        noOfBouquets+= (count/k)
        return noOfBouquets >= m
    }


}

fun main(){
    val minimumNumberToMakeBouquests = MinimumNumberToMakeBouquests()
    print(minimumNumberToMakeBouquests.minDays(intArrayOf(7,7,7,7,12,7,7) , 2,3))
}

