package array

class PlusOne {
    fun main() {
        val res = PlusOne().plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0))
        res.forEach {
            print(it)
        }
    }

    fun plusOne(digits: IntArray): IntArray {
       for(n in digits.size-1 downTo 0) {
           digits[n] +=1
           if(digits[n] <= 9) return digits
           digits[n] = 0
       }
        val res = IntArray(digits.size+1)
        res[0] = 1
        return res
    }
}