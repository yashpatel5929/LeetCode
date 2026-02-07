package array

class DeleteColumnMakeSorted {

    fun minDeletionSize(strs: Array<String>): Int {
        if(strs.isEmpty()) return 0
        val row = strs.size
        val col = strs[0].length
        var colCount = 0

        for(j in 0 until  col) {
            for(i in 0 until row-1) {

                if(strs[i][j] > strs[i+1][j]){
                    colCount++
                    break
                }
            }
        }


        return colCount

    }

    fun checkLexi(a : Char , b : Char) : Int {
        return a- b
    }
}



fun main() {
    val d = DeleteColumnMakeSorted().minDeletionSize(arrayOf("xc","yb","za"))
    print(d)
}