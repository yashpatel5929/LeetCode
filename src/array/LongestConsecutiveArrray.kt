package array

import kotlin.math.max

class LongestConsecutiveArrray {
    fun longestConsecutive(nums: IntArray): Int {
       /* if(nums.isEmpty())
            return 0
        val hashTable = HashMap<Int , Int>()
        var min = nums[0]
        var count = 0
        var result = 0
        var j =0
        for(i in nums.indices) {
            if(nums[i] < min)
                min = nums[i]
            hashTable.put(nums[i] , hashTable.getOrDefault(nums[i] , 0)+1)
        }

        while(j <= hashTable.size) {
            if(hashTable.containsKey(min)){
                count++
                min++
                j++
            }else {

                if(count > result)
                    result = count
                if(j >= hashTable.size)
                    break
                count = 0
                min++
            }
        }

        return result*/


        var longest = 0
        val setOfNum = nums.toSet()
        for (n in setOfNum){
            if((n-1) !in setOfNum){
                var maxi = 0
                while ((n+maxi) in setOfNum)
                    maxi++
                longest = max(maxi , longest)
            }
        }

        return longest


    }
}



fun main() {
    val d = LongestConsecutiveArrray().longestConsecutive(intArrayOf(-8,-4,9,9,4,6,1,-4,-1,6,8))
    print(d)
}