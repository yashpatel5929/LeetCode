package array

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size-1
        var maxArea = 0
        var result = 0

        while (i < j) {
            maxArea = min(height[i] , height[j])
            result = max(result , ((j-i) * maxArea))

            if(height[i] < height[j]) {
                i++
            }else j--
        }

        return result

    }
}


fun main() {
    val d = ContainerWithMostWater().maxArea(intArrayOf(1,8,6,2,5,4,8,3,7))
    print(d)
}