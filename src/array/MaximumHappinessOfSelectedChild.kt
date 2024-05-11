package array

class MaximumHappinessOfSelectedChild {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        happiness.sortDescending()
        var sum = 0L
        val n =  happiness.size
        for(i in 0 until k) {
            if((happiness[i]-i) > 0) {
                sum += (happiness[i] - i)
            }
        }
        println(sum)
        return sum
    }
}


fun main() {
    val maximumHappinessOfSelectedChild = MaximumHappinessOfSelectedChild()
    maximumHappinessOfSelectedChild.maximumHappinessSum(intArrayOf(12,1,42) , 3)
}