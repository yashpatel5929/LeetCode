package array

import java.lang.StringBuilder
import java.util.PriorityQueue

class SortTheJumbledNumber {
    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        val result = mutableListOf<Int>()
        nums.forEach {
            val d = mappedResult(mapping, it)
            hm.put(it, d)

        }

        val sortedKeys = hm.toList().sortedBy { (_, value) -> value }.map { (key, _) -> key }
        return sortedKeys.toIntArray()

    }

    fun mappedResult(mapping: IntArray, nums: Int): Int {
        var result = StringBuilder()
        nums.toString().toCharArray().forEach {
            result.append(mapping[it.toString().toInt()])
        }
        return result.toString().toInt()
    }
}

fun main() {
    val d = SortTheJumbledNumber().sortJumbled(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), intArrayOf(789, 456, 123))
    val d1 = SortTheJumbledNumber().sortJumbled(intArrayOf(8, 9, 4, 0, 2, 1, 3, 5, 7, 6), intArrayOf(991, 338, 38))

}