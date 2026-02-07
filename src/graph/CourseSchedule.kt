package graph

class CourseSchedule {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        /*if(prerequisites.isEmpty()) return true
        val completeCourse = mutableListOf<Int>()
        var numOfCourse = numCourses
        val rows = prerequisites.size
        val cols = prerequisites[0].size

        for(i in 0 until rows) {
            for(j in cols-1 downTo  0) {
                if(numOfCourse != 0 ) {
                    if(prerequisites[i][j] !in completeCourse)
                    {
                        completeCourse.add(prerequisites[i][j])
                        numOfCourse--
                    }
                }else {
                    return false
                }
            }

        }
        return true*/


        val adjMap = HashMap<Int , MutableList<Int>>()

        val visited = HashSet<Int>()
        for (i in 0 until numCourses) {
            adjMap[i] = mutableListOf()
        }
        for (prereq in prerequisites) {
            val (crs, pre) = prereq
            adjMap[crs]!!.add(pre)
        }

        val result = hashSetOf<Int>()

        fun dfs(crs : Int) : Boolean {
            if(crs in visited) return false

            if(adjMap[crs]?.isEmpty() == true) {
                result.add(crs)
                return true
            }

            visited.add(crs)

            for (pre in adjMap.getValue(crs)) {
                if (!dfs(pre)) return false
            }


            visited.remove(crs)
            adjMap[crs] = mutableListOf()
            result.add(crs)
            return true
        }

        for(i in 0 until numCourses){
            if(!dfs(i)) return false
        }

        print(result)
        return true

    }
}

fun main() {
    val obj = CourseSchedule().canFinish(4, arrayOf(
        intArrayOf()
    ))
    print(obj)
}