package array

import javax.swing.text.html.HTML.Attribute.N


class FourDivisor {
    fun sumFourDivisors(nums: IntArray): Int {
        val res = HashMap<Int , List<Int>>()
        var sum = 0
        
        for(i in nums) {
           if(res.containsKey(i) && res.get(i)?.size == 4) {
               sum += res.get(i)!!.sum()
           }else {
               val item = mutableListOf<Int>()

                   var j = 1
                   while (j * j <= i) {


                       if (i % j == 0) {
                           // Add i to result
                           item.add(j)

                           // If N / i is different from i, add N / i too
                           if (j != i / j) {
                               item.add(i/ j)
                           }
                       }
                       j++
                   }


               if(item.size == 4){
                   res.put(i , item)
                   sum += item.sum()
               }
           }
        }

        return sum

    }
}

fun main() {
    val d = FourDivisor().sumFourDivisors(intArrayOf(1,2,3,4,5))
    print(d)
}