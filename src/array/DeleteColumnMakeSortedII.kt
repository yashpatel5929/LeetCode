package array

class DeleteColumnMakeSortedII {

    fun minDeletionSize(strs: Array<String>): Int {
        for(i in 0 until strs.size-1) {
            if((compareLex(strs[i] , strs[i+1]))) {
                return minDeletionSize1(strs)
             }
        }

        return 0
    }

    fun minDeletionSize1(strs: Array<String>): Int {
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


    fun compareLex(a: String, b: String): Boolean {
        val len = minOf(a.length, b.length)

        for (i in 0 until len) {
            if (a[i] != b[i] && a[i] > b[i]) {
                    return true   // ASCII comparison
            }
        }

        return false
    }
}


fun main() {
    val d = DeleteColumnMakeSortedII().minDeletionSize(arrayOf("xb", "ya"))
    print(d)
}