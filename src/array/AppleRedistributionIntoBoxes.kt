package array

class AppleRedistributionIntoBoxes {

    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        val sortedCap = capacity.sortedDescending()
        var sum = apple.sum()
        var count = 0
        for(i in sortedCap){
            sum -= i
            if(sum > 0 )
                count++
            else if(sum == 0) {
                count++
                break
            }
            else if(sum < 0) {
                count++
                break
            }
        }
        return count
    }
}

fun main() {
    val d = AppleRedistributionIntoBoxes().minimumBoxes(intArrayOf(9,8,8,2,3,1,6) , intArrayOf(10,1,4,10,8,5))
    print(d)
}