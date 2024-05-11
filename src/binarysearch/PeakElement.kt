package binarysearch

class PeakElement {
    fun findPeakElement(nums: IntArray): Int {
        val len = nums.size
        if(len == 1) return 0
        if(nums[0] > nums[1]) return 1;
        if(nums[len -1] > nums[len-2]) return len-1
        var left = 1
        var right = len-2
        while (left <= right) {
            val mid = (left+right)/2

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid
            }else if(nums[mid] > nums[mid-1]){
                left = mid+1
            }else {
                right = mid -1
            }
        }

        return -1
    }
}

fun main() {
    val peakElement = PeakElement()
    println(peakElement.findPeakElement(intArrayOf(2,1)))
}