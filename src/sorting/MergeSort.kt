package sorting

class MergeSort {

    fun mergeSort(arr :IntArray) {
        divideAndConquer(arr , 0 , arr.size-1)

    }


    fun divideAndConquer(arr:IntArray , low : Int , high : Int) {
        if(low >= high)
            return

        val mid = (low+high)/2
        divideAndConquer(arr, low , mid)
        divideAndConquer(arr , mid +1 , high)
        merger(arr , low , high , mid)

    }

    fun merger(arr :IntArray , low : Int , high: Int , mid : Int) {
        val tempArr = mutableListOf<Int>()
        var left = low
        var right = mid+1

        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                tempArr.add(arr[left++])

            }else {
                tempArr.add(arr[right++])
            }
        }


        while (left <= mid){
            tempArr.add(arr[left++])
        }

        while (right <= high) {
            tempArr.add(arr[right++])
        }

        for(i in low until high+1) {
            arr[i] = tempArr[i-low]
        }
    }
}


fun main() {
    val arr = intArrayOf(10, 1, 66, 4, 100)
    val d = MergeSort().mergeSort(arr)
    print(arr.contentToString())
}