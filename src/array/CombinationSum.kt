package array


class CombinationSum {

    val ans1 = mutableListOf(listOf<Int>())

 /*   fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf(listOf<Int>())


        val currentList = mutableListOf<Int>()
        backtrack(0, candidates , ans , currentList , target)
        return ans1
    }*/


    private fun backtrack(ind : Int, arr: IntArray, ans: MutableList<List<Int>>, ds: MutableList<Int>, target: Int) {
        if (ind == arr.size) {
            if (target == 0) {
                ans.add(ArrayList(ds))
            }
            return
        }
        if (arr[ind] <= target) {
            ds.add(arr[ind])
            backtrack(ind, arr,  ans, ds,target - arr[ind])
            ds.removeAt(ds.size - 1)
        }
        backtrack(ind + 1, arr, ans, ds , target)

  /*      if(index == candidates.size) {
            if ( target == 0) {
                ans1.add(ArrayList(currentList))
            }
            return
        }


        if(candidates[index] <= target) {
            currentList.add(candidates[index])
            backtrack(index ,   candidates , ans , currentList , target - candidates[index])
            currentList.removeLast()
        }

        backtrack(index+1 , candidates , ans , currentList , target)*/

    }

    /*private fun findCombinations(
        ind: Int,
        arr: IntArray,
        target: Int,
        ans: MutableList<List<Int>>,
        ds: MutableList<Int>
    ) {
        if (ind == arr.size) {
            if (target == 0) {
                ans.add(ArrayList(ds))
            }
            return
        }
        if (arr[ind] <= target) {
            ds.add(arr[ind])
            findCombinations(ind, arr, target - arr[ind], ans, ds)
            ds.removeAt(ds.size - 1)
        }
        findCombinations(ind + 1, arr, target, ans, ds)
    }*/

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans: MutableList<List<Int>> = ArrayList()
        backtrack(0, candidates, ans, ArrayList() , target)
        return ans
    }
}

fun main() {
    val d = CombinationSum().combinationSum(intArrayOf(2,3,6,7) , 7)
    print(d)

}