package string

class DeleteCharacterToMakeFancyString {
    fun makeFancyString(s: String): String {
        val ss = s.toCharArray()
        for (i in 0 until s.length-2) {
            for(j in i until s.length-1){
                for (k in j until s.length){
                    if(ss[i] == ss[j] && ss[j] == ss[k]) {
                        ss[i] = '0'
                    }
                }
            }
        }

        return ss.toString().replace("0" , "")

    }
}


fun main() {
    val d = DeleteCharacterToMakeFancyString().makeFancyString("leeetcode")
    print(d)
}