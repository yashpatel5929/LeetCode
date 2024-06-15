package string

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var i =0
        var j = s.size-1
        while (i < j) {
            val temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
        }

        print(s)
    }
}

fun main() {
    val d = ReverseString().reverseString(charArrayOf('h','e','l','l','o'))

}