package array

class IntersectionOfTwoArray {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

        val largeArray = if (nums1.size > nums2.size) nums1 else nums2
        val smallArray = if (nums1.size > nums2.size) nums2 else nums1
        var result = mutableListOf<Int>()
        smallArray.forEach { find ->
            largeArray.indexOfFirst { it == find }.also {
                if (it != -1) {
                    result.add(find)
                    largeArray[it] = -1
                }
            }
        }


        return result.toIntArray()


    }
}

fun main() {

    val d = IntersectionOfTwoArray().intersect(intArrayOf(8,0,3), intArrayOf(0,0))
    print(d.toList())

}