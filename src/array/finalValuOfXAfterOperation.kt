package array

class finalValuOfXAfterOperation {

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for(i in operations) {
            if(i.contains("+")){
                x++
            }else if(i.contains("-")){
                x--
            }
        }

        return x
    }
}

fun main() {
    val d = finalValuOfXAfterOperation().finalValueAfterOperations(arrayOf("X++","++X","--X","X--"))
    print(d)
}