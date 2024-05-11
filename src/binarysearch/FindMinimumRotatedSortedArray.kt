package binarysearch

class FindMinimumRotatedSortedArray {
    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size-1
        var mid = 0
        while (low <= high) {
            mid = (low + high) / 2
            if(nums[high] < nums[mid]) {
                low = mid +1
            }else if (nums[low] < nums[mid]){
                high = mid-1
            }else {
                low ++
                high --
            }
        }

        return nums[mid]

    }
}

fun main() {
    val findMinimumRotatedSortedArray = FindMinimumRotatedSortedArray()
    val ans = findMinimumRotatedSortedArray.findMin(intArrayOf(5,1,2,3,4))
    print(ans)
}