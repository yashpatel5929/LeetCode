package array

class AverageWaitingTime() {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var lastOrderTime = customers[0].sum()
        var waitingTime  = customers[0][1]
        for(i in 1 until customers.size){
            if(lastOrderTime > customers[i][0]) {
                lastOrderTime += customers[i][1]
                waitingTime += lastOrderTime - customers[i][0]
            }else {
                lastOrderTime = customers[i].sum()
                waitingTime += customers[i][1]
            }
        }

       /* var orderTime = 1
        var avgTime = 0L
        for ((arrival , time ) in customers) {
            if(arrival > orderTime) {
                orderTime = arrival + time
            }else {
                orderTime += time
            }

            avgTime = orderTime - arrival
        }*/

        return( waitingTime.toDouble() / customers.size.toDouble()).toDouble()


    }

}

fun main() {
    val d = AverageWaitingTime().averageWaitingTime(arrayOf(intArrayOf(5,2), intArrayOf(5,4) , intArrayOf(10,3) , intArrayOf(20,1)))
    print(d)
}