package array

class XorQueries {


    val result = mutableListOf<Int>()
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {

//give TLE
        /* for(i in queries.indices) {
            val subList = arr.toList().subList(queries[i][0] ,(queries[i][1])+1)
           val and =  subset(subList.toIntArray() , 0 , 0)
            result.add(and)


        }

        print(result)
        return result.toIntArray()

    }

    fun subset(nums : IntArray , start : Int , prev : Int) :Int {

        var prev = 0
        for (i in start until nums.size) {
            val temp = prev xor nums[i]
            prev = temp
        }
        return prev
    }*/

        //solution from other submission
        val result = IntArray(queries.size)
        for (i in 1 until arr.size) {
            arr[i] = arr[i - 1] xor arr[i]
        }

        print(arr.map { it })
        for (i in 0 until queries.size) {
            val (l, r) = queries[i]
            result[i] = if (l == 0) arr[r] else (arr[r] xor arr[l - 1])
        }
        print(result.map { it })
        return result
    }
}

fun main() {
    val d = XorQueries().xorQueries(intArrayOf(1,3,4,8) , arrayOf(intArrayOf(0,1), intArrayOf(1,2), intArrayOf(0,3),intArrayOf(3,3)))
}