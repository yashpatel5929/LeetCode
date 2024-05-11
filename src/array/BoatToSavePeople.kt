package array

class BoatToSavePeople {

    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        val len = people.size-1
        var i  = 0
        var j = len
        var count = 0
        while (i <= j) {
            val weight = people[i] + people[j]
            if (weight <= limit) {
                count++
                i++
                j--
            }else {
                count++
                j--
            }
        }
        return count
    }
}

fun main() {
    val boatToSavePeople = BoatToSavePeople()
    val and = boatToSavePeople.numRescueBoats(intArrayOf(1,2) ,3)
    println(and)
}