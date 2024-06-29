package array

class TopKFrequentElement {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if(nums.size == 1 || nums.size == k)
            return nums
        val hm = HashMap<Int,Int>()
        nums.forEach {
            hm.put(it,hm.getOrDefault(it,0)+1)
        }
        hm.values.sortedBy { it }
        val res = mutableListOf<Int>()
        val temp = mutableListOf<Int>()
        hm.forEach {

            if(it.value > 1 && res.size < k) {
                res.add(it.key)
            }else {
                temp.add(it.key)
            }
        }
        if(res.size != k) {
            temp.forEach {
                res.add(it)
            }
        }
        print(res)
        return res.toIntArray()
    }

}

fun main() {
    val d = TopKFrequentElement().topKFrequent(intArrayOf(5,2,5,3,5,3,1,1,3) , 2)

    print(d)
}