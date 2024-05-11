package string

import javax.xml.stream.events.Characters

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        val arr = s.trim().toCharArray()
        for(n in arr.size-1 downTo 0){
            if(arr[n] == ' ')
                return count
            else count++
        }

        return count
    }

    fun addBinary(a: String, b: String): String {
        var carry = 0
        var resultString = ""
        val revA = a.reversed()
        val revB = b.reversed()
        for (i in 0 until revA.length.coerceAtLeast(revB.length)){
            val valA = if(i < revA.length) Character.getNumericValue(a[i]) else 0
            val valB = if (i < revB.length) Character.getNumericValue(b[i]) else 0
            val sum = valA + valB + carry
            resultString += if(sum <= 1) {
                carry = 0
                sum.toString()
            }else if (sum == 2) {
                carry = 1
                0
            }else {
                carry = 1
                1
            }


        }
        if(carry > 0)
            resultString +=1
        return resultString
    }


    fun moveZeroes(nums: IntArray): Unit {
        var i =0
        var j = 1
        while (j < nums.size) {
            if(nums[i] == 0 && nums[j] != 0) {
                swap(nums[i] , nums[j] , nums)
                i++
                j++
            }else {
                j++
            }
        }

        nums.forEach {
            print(it)
        }
    }

    private fun swap(i: Int, j: Int, nums: IntArray) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}


fun main() {
    LengthOfLastWord().moveZeroes(intArrayOf(0,1,0,3,12))
//    print(LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"))
}