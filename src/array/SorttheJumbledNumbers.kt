package array

class SorttheJumbledNumbers {
    val stdMap = mutableListOf<Pair<Int,Int>>()
    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
        for(i in nums) {
          mapperToDigit(i, mapping )
        }
        print(stdMap)
        val sorted = stdMap.sortedBy { it.second }
        val sortedKeys = sorted.map { it.first }.toIntArray()
       return sortedKeys
    }

    fun mapperToDigit(n : Int ,mapping: IntArray) : Int {
        val st = n.toString().toCharArray()
        var sum =0
        for(i in st.indices){
            sum = sum * 10 + mapping[st[i].digitToInt()]
        }
        stdMap.add(Pair(n , sum))
        return sum
    }
}


fun main() {
    val obj  =  SorttheJumbledNumbers().sortJumbled( intArrayOf(8,2,9,5,3,7,1,0,6,4),intArrayOf(418,4191,916,948,629641556,574,
        111171937,28250,42775632,6086,85796326,696292542,186,
        67559,2167,366,854,2441,78176,621,4257,2250097,509847,
        7506,77,50,4135258,4036,59934,59474,3646243,9049356,
        85852,90298188,2448206,30401413,33190382,968234660,7973,
        668786,
        992777977,77,355766,221,246409664,216290476,45,87,836414,40952) )
    obj.forEach { println(it) }
}