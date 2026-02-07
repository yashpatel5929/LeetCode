package math

class CalculateMoney {
    fun totalMoney(n: Int): Int {

        var div = n / 7
        val day = n % 7
        var week = 1
        var result = 0
        while (div > 0) {
            result += calculateWeeklySum(week, 7)
            week++
            div--
        }
        if(day > 0) {
            result +=calculateWeeklySum(week , day)
        }

        return result

    }


    private fun calculateWeeklySum(week : Int, days : Int ) : Int {
        var sum = 0

        for(i in 0 until days) {
            sum += (week + i)
            println(sum)
        }
        println(sum)
        return sum


    }
}

fun main() {
    val d = CalculateMoney().totalMoney(20)
    print(d)
}