package array

class MinTimeToVisitAllPoints {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var count = 0
        for (i in 0 until points.size-1){
            var x = points[i][0]
            var y = points[i][1]
            var x2 = points[i+1][0]
            var y2 = points[i+1][1]

            while (x != x2 || y != y2) {
                if(x2 > x) {
                    x++
                    y++
                }else {
                    x--
                    y--
                }
                count++
                println("x== ($x,$y) and y== ($x2,$y2)")
            }

        }

        return count
    }
}


fun main() {
    val d = MinTimeToVisitAllPoints().minTimeToVisitAllPoints(arrayOf(
        intArrayOf(3,2),
        intArrayOf(-2,2)
    ))
    print(d)
}