package array

class KthElementSmallestPrimeFraction {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        val hm : HashMap<List<Int> , Float> = hashMapOf()
        val len = arr.size
        if(len == 2)
            return arr
        for(i in 0 until len) {
            for(j in i+1 until len) {
                val fraction  =( arr[i]/arr[j].toDouble())
                hm[listOf(arr[i],arr[j])] = fraction.toFloat()
            }
        }

        val list = hm.toList().sortedBy {
            it.second
        }

        return list[k-1].first.toIntArray()
    }
}

fun main() {
    val d = KthElementSmallestPrimeFraction()
   val ans  = d.kthSmallestPrimeFraction(intArrayOf(1,7) , 1)
    print(ans.toList())
}