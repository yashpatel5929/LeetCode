package array

class RankTransormofAnArray {

    fun arrayRankTransform(arr: IntArray): IntArray {
        val sortedArray = arr.toSet().sorted()
        val hash = HashMap<Int,Int>()
        for(i in 0 until sortedArray.size){
            hash.put(sortedArray[i] , hash.getOrDefault(sortedArray[i] , i+1))
        }
        print(hash)
        val result = mutableListOf<Int>()
        arr.map {
            hash.get(it)?.let { it1 -> result.add(it1) }
        }


        return result.toIntArray()

    }
}

fun main() {
    val d = RankTransormofAnArray().arrayRankTransform(intArrayOf(37,12,28,9,100,56,80,5,12))
    print(d.toList())
}