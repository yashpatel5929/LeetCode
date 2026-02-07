package array

class NumberOfSeniorCitizen {
    fun countSeniors(details: Array<String>): Int {
        var count = 0
        details.forEach {
            if(it.substring(11,13).toInt() > 60){
                count++
            }
        }
        return count
    }
}

fun main() {
    val d = NumberOfSeniorCitizen().countSeniors(arrayOf("7868190130M7522","5303914400F9211","9273338290F4010"))
    print(d)
}