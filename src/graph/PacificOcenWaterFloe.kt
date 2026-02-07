package graph

class PacificOceanWaterFlow {

    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {

        val row = heights.size
        val col = heights[0].size

        val pac = HashSet<Pair<Int, Int>>()
        val atl = HashSet<Pair<Int, Int>>()


        fun dfs(r: Int, c: Int, visited : HashSet<Pair<Int,Int>>, prevHeight: Int) {

            val coord = r to c
            if (coord in visited ||
                r < 0 || c < 0 ||
                r == row || c == col ||
                heights[r][c] < prevHeight
            ) {
                return
            }
            visited.add(coord)
            dfs(r+1,c,visited,heights[r][c])
            dfs(r-1,c,visited,heights[r][c])
            dfs(r,c+1,visited,heights[r][c])
            dfs(r,c-1,visited,heights[r][c])

        }
        for(c in 0 until col) {
            dfs(0 , c , pac , heights[0][c])
            dfs(row-1 , c , atl , heights[row-1][c])
        }

        for(r in 0 until  row) {
            dfs(r,0, pac , heights[r][0])
            dfs(r,col-1 , atl , heights[r][col-1])
        }

        val result = mutableListOf<List<Int>>()
        for (i in 0 until row) {
            for(j in 0 until col) {
                if(Pair(i,j) in pac && Pair(i,j) in atl) {
                    result.add(listOf(i,j))
                }
            }
        }
        return result
    }
}


fun main() {
    val obj = PacificOceanWaterFlow().pacificAtlantic(arrayOf(
        intArrayOf(1,2,2,3,5),
        intArrayOf(3,2,3,4,4),
        intArrayOf(2,4,5,3,1),
        intArrayOf(6,7,1,4,5),
        intArrayOf(5,1,1,2,4),
    ))
    print(obj)
}