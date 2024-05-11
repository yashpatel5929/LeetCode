package array

class RelativeRank {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val hm : HashMap<Int,Int> = hashMapOf()
        val ans : Array<String> = Array(score.size) {""}
        for(i in 0 until score.size){
            hm[score[i]] = i
        }
        val list =hm.toList().sortedByDescending {
            it.first
        }
        for(i in 0 until list.size) {
            if(i < 3) {
                when(i) {
                    0 -> ans[list[i].second] = "Gold Medal"
                    1 -> ans[list[i].second] = "Silver Medal"
                    2 -> ans[list[i].second] = "Bronze Medal"
                }
            }else {
                ans[list[i].second] = (i+1).toString()
            }
        }

        return ans
    }
}

fun main() {
    val fnd = RelativeRank()
    val and = fnd.findRelativeRanks(intArrayOf(10,3,8,9,4))
    and.forEach {
        print("$it")
    }
}