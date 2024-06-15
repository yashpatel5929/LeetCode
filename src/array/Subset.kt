package array

class Subset {
    fun subsets(nums: IntArray): List<List<Int>> {
        val len = nums.size
        val result = mutableListOf(listOf<Int>())

        nums.forEach {n->
            result.map { it+ n  }.forEach { result.add(it) }
            println("jk $result")
        }
        return result

/*
        for (i in 0 until len) {

            result.add(listOf(nums[i]))
            for(j in i+1 until len) {
                result.removeIf {
                    it.containsAll(listOf(nums[i],nums[j]))
                }
                result.add(listOf(nums[i],nums[j]))
            }
        }
        result.removeIf {
            it.containsAll(nums.asList())
        }
        result.add(nums.asList())
        return result*/

    }
}

fun main() {
    val b = Subset().subsets(intArrayOf(3,2,4,1))
    print(b)
}