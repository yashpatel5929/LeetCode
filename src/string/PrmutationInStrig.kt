package string

class PrmutationInStrig {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val list = getPermutationList(s1)
        return list.any { s2.contains(it) }

    }

    fun getPermutationList(input: String) : List<String> {
        val perm = mutableListOf<String>()
        generatePermutation(input.toCharArray() , 0 , perm)
        return perm
    }

    fun generatePermutation(input : CharArray , index : Int , permutaton : MutableList<String>) {
        if(index == input.size) {
            permutaton.add(String(input))
            return
        }

        for (i in index until input.size) {
            swap(input,index,i)
            generatePermutation(input , index+1 , permutaton)
            swap(input,index,i)
        }
    }

    fun swap(input: CharArray,index: Int,j:Int){
        val temp = input[index]
        input[index] = input[j]
        input[j] = temp
    }
}


fun main() {
    val d = PrmutationInStrig().checkInclusion("prosperity","properties")
    print(d)
}