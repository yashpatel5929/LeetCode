package array

class MakeTwoArrayEqualbyReversing {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        if(target.size != arr.size)
            return false

        target.sort()
        arr.sort()
        for(i in 0 until target.size) {
            if(target[i] != arr[i])
                return false
        }
        return true
    }
}

fun main(){
    val s = MakeTwoArrayEqualbyReversing().canBeEqual(intArrayOf(3,7,9) , intArrayOf(3,7,11))
    print(s)
}