package array

class ThreeConsecutiveOdds() {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var i =0
        var j = 2
        while (j < arr.size) {
            if(arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i+1] %2 != 0) {
                return true
            }else {
                i++
                j++
            }
        }

        return false
    }

}


fun main() {
    val d = ThreeConsecutiveOdds().threeConsecutiveOdds(intArrayOf(1,2,34,3,4,5,7,23,12))
    print(d)
}
