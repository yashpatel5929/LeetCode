package sorting

class InsertionSort {

    fun insertionSort(arr : IntArray) : IntArray {
        for(i in 1 until arr.size) {
            val key = arr[i]
            var j = i-1

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j]
                j--
            }
            arr[j+1] = key
        }
        print(arr.contentToString())
        return arr
    }
}

fun main() {
    val d= InsertionSort().insertionSort(intArrayOf(13, 46, 24, 52, 20, 9))

}