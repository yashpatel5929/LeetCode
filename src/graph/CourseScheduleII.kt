package graph

class CourseScheduleII {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {



        val adjMap = HashMap<Int , MutableList<Int>>()

        val visited = HashSet<Int>()
        for (i in 0 until numCourses) {
            adjMap[i] = mutableListOf()
        }
        for (prereq in prerequisites) {
            val (crs, pre) = prereq
            adjMap[crs]!!.add(pre)
        }

        val result = mutableListOf<Int>()
        val cycle = hashSetOf<Int>()

        fun dfs(crs : Int) : Boolean {
            if(crs in cycle) return false
            if(crs in visited) return true

            cycle.add(crs)

            for (pre in adjMap.getValue(crs)) {
                if (!dfs(pre)) return false
            }
            cycle.remove(crs)


            visited.add(crs)
            adjMap[crs] = mutableListOf()
            result.add(crs)
            return true
        }

        for(i in 0 until numCourses){
            if(!dfs(i)) return intArrayOf()
        }

        // print(result)
        return result.toIntArray()

    }
}

fun main() {
    val obj = CourseScheduleII().findOrder(2, arrayOf(
intArrayOf(0,1)
    ))
    print(obj.contentToString())
}