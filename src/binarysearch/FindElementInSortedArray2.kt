package binarysearch

class FindElementInSortedArray2 {

    fun search(nums: IntArray, target: Int): Boolean {
        val n = nums.size
        var low = 0
        var high = n -1
        while (low <=  high) {
            val mid = (low + high) /2
            if(target == nums[mid]) return  true
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++
                high--
                continue
            }

            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid -1
                }else {
                    low = mid+1
                }
            }else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1
                }else {
                    high = mid -1
                }
            }
        }
        return false
    }
}
