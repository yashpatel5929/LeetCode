package binarysearch

class CapacityToShipProductWithinDDays {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var low = weights.max()
        var high = weights.sum()
        while (low <= high) {
            val mid = (low + high) / 2
            if(calculateMinWeightOnDDay(weights , days , mid)) {
                high = mid -1
            }else {
                low = mid +1
            }
        }
        return low
    }

    private fun calculateMinWeightOnDDay(weights: IntArray, days: Int, capacity: Int): Boolean {
        var sum = weights[0]
        var count = 0
        for(i in 1 until weights.size) {
            if((sum + weights[i]) <= capacity) {
                sum += weights[i]
            }else {
                count++
                sum = weights[i]
            }
        }
        count++
        return count <= days
    }
}
fun main() {
    val cap = CapacityToShipProductWithinDDays().shipWithinDays(intArrayOf(1,2,3,1,1) ,4)
        print(cap)
}