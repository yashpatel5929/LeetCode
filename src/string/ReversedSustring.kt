package string

class ReversedSustring {
    fun reversePrefix(word: String, ch: Char): String {
        val charArray = word.toCharArray()
        var i = 0
        var j = 1
        var isFound = false
        if(charArray[0] == ch)
            return String(charArray)
        while (i < j) {
            if (j == charArray.size)
                return String(charArray)

            if (charArray[j] != ch && !isFound) {
                j += 1
            } else {
                isFound = true
                val temp = charArray[i]
                charArray[i] = charArray[j]
                charArray[j] = temp
                i++
                j--
            }
        }

        return String(charArray)
    }
}

fun main() {
    val rev = ReversedSustring()
    val res = rev.reversePrefix("abcd" , 'z')
    print("$res")
}