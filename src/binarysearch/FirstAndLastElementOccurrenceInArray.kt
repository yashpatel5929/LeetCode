package binarysearch

import kotlin.math.sign

class FirstAndLastElementOccurrenceInArray {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if(nums.isEmpty()) return intArrayOf(-1,-1)
        val lb = lowerBound(nums , target)
        if(lb == nums.size || target != nums[lb]) return intArrayOf(-1,-1)
        return intArrayOf(lb,uperBound(nums,target)-1)
    }

    fun lowerBound (nums : IntArray , target: Int)  :Int {
        var low = 0
        var high = nums.size -1
        var ans = nums.size
        while (low <= high) {
            val mid = (low + high) /2
            if(nums[mid] >= target){
                ans = mid
                high = mid -1
            }else low = mid+1
        }
        return ans
    }

    fun uperBound (nums : IntArray , target: Int)  :Int {
        var low = 0
        var high = nums.size -1
        var ans = nums.size
        while (low <= high) {
            val mid = (low + high) /2
            if(nums[mid] > target){
                ans = mid
                high = mid -1
            }else low = mid+1
        }
        return ans
    }
}

fun main() {
    val arr = FirstAndLastElementOccurrenceInArray().searchRange(intArrayOf(1) , 1)
    arr.forEach {
        print(it)
    }
}