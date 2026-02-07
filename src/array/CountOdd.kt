package array

class CountOdd {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0
        for(i in low until  high+1) {
            if(i % 2 != 0)
                count++
        }

        return count

    }
}

fun main() {
    val obj = CountOdd().countOdds(8,10)
    print(obj)
}