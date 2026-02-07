package array

class MinimumPenalityAtShop {
    fun bestClosingTime(customers: String): Int {
        val n = customers.length
        val map = HashMap<Int,Int>()
        map.put(0 , customers.count { it == 'Y' })
        for(i in 1 until n) {
            var count = 0
            for(j in 0 until n){
               if(j != i-1 && customers[j] == 'Y' && i-1 < j) count++
                else if(i-1 == j && customers[j] == 'N') count++
                else if(j > i-1 && customers[j] == 'Y' ) count++

            }
            map.put(i , count )
        }
        map.put(n , customers.count { it == 'N'})
        print( map.toList() )
        return map.toList().sortedBy { it.second }.maxOf { it.first }
    }
}


fun main() {
    val d = MinimumPenalityAtShop().bestClosingTime("YNYY")
    print(d)
}