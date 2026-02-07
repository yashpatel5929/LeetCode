package recusrssion

class WordSearch {
    fun exist(board: Array<CharArray>, word: String): Boolean {


        val row = board.size
        val col = board[0].size
        val visitedEle = Array(row) { BooleanArray(col) }


        fun backtrack(r: Int, c: Int, i: Int) : Boolean {
            if(i == word.length) return true
            if(r < 0 || c < 0 || r >= row || c >= col || word[i] != board[r][c] || visitedEle[r][c]){
                return false
            }

            visitedEle[r][c] = true
            val result = backtrack(r+1 , c ,i+1) ||
                    backtrack(r-1 , c, i+1) || backtrack(r , c+1, i+1) ||
                    backtrack(r , c-1 , i+1)
            visitedEle[r][c] = false

            return result


        }
        for(i in 0 until row) {
            for(j in 0 until col) {
                if(backtrack(i , j , 0)){
                    return true
                }

            }
        }

        return false



    }
}

fun main() {
    val d = WordSearch().exist(arrayOf(charArrayOf('A' , 'B' , 'C' , 'E') , charArrayOf('S','F','C','S') , charArrayOf('A','D','E','E')) , "SEE")
    print(d)
}