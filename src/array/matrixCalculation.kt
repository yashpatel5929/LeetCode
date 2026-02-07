package array

fun main() {
    val d = Solution().countUnguarded(6, 10 , arrayOf(intArrayOf(0,6) , intArrayOf(2,2), intArrayOf(2,5), intArrayOf(1,2) , intArrayOf(4,9)
    ,intArrayOf(2,9), intArrayOf(5,6),
        intArrayOf(4,6)
    ) ,
        arrayOf(intArrayOf(1,5)))
print(d)
}

class Solution {
    var resultMatrix: Array<IntArray> = arrayOf()
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        resultMatrix = Array(m) { IntArray(n) { 0 } }

        for(g in guards) {
            val i = g[0]
            val j = g[1]
            resultMatrix[i][j] = -1
        }
        print(resultMatrix.contentDeepToString())

        for(w in walls) {
            val i = w[0]
            val j = w[1]
            resultMatrix[i][j] = 1
        }
        for(i in 0 until m) {
            for(j in 0 until n) {
                if(resultMatrix[i][j] == -1) {
                    markColum(j+1 , j-1 , i ,n)
                    markRow(i +1,i-1, j , m)
                }
            }
        }

        print(resultMatrix.contentDeepToString())

        return resultMatrix.sumOf { it.count { it == 0 } }
    }

    fun markColum(jth : Int , neg : Int , i : Int, n : Int) {
        var j = jth
        var ne = neg
        while (ne >=0 && resultMatrix[i][ne] != 1 && resultMatrix[i][ne] != -1 || (ne >= 0 && resultMatrix[i][ne] == 3)) {
            resultMatrix[i][ne] = 3
            ne--
        }
        while(j < n &&  resultMatrix[i][j] != 1 && resultMatrix[i][j] != -1) {
            resultMatrix[i][j] = 3
            j++
        }
    }

    fun markRow(ith : Int ,neg : Int , j : Int, m : Int) {
        var i = ith
        var ne = neg
        while ((ne >= 0 && resultMatrix[ne][j] != 1 && resultMatrix[ne][j] != -1) || (ne >= 0 && resultMatrix[ne][j] == 3 && resultMatrix[ne][j] != -1)) {
            resultMatrix[ne][j] = 3
            ne--
        }
        while (i < m && resultMatrix[i][j] != 1 && resultMatrix[i][j] != -1) {
            resultMatrix[i][j] = 3
            i++
        }
    }
}

/*
*[[3, 3, 3, 3, 3, 3, -1, 3, 3, 3],
* [3, 3, -1, 3, 3, 1, 3, 0, 0, 3],
* [3, 3, 3, 3, 3, -1, 3, 3, 3, 3],
* [0, 0, 3, 0, 0, 3, 3, 0, 0, 3],
* [3, 3, 3, 3, 3, 3, 3, 3, 3, -1],
* [0, 0, 3, 0, 0, 3, 3, 0, 0, 3]]
* */