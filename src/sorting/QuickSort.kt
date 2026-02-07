package sorting

class QuickSort {

    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if(low < high) {
            val pivotIndex = sort(arr , low , high)
            quickSort(arr , low , pivotIndex-1)
            quickSort(arr , pivotIndex+1 , high)
        }

    }

    fun sort(arr : IntArray, low : Int, high: Int) : Int{
        val pivot = arr[low]
        var i = low
        var j = high

        while (i < j) {
            while (arr[i] <= pivot && i <= high-1){
                i++
            }
            while (arr[j] > pivot && j >= low) {
                j--
            }
            if(i < j) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[low]
        arr[low] = arr[j]
        arr[j] = temp

        return j

    }
}


fun main() {
    val arr = intArrayOf(10, 7, 8, 9, 1, 5)
    val d = QuickSort().quickSort(arr , 0 , arr.size-1)
    print(arr.contentToString())
}