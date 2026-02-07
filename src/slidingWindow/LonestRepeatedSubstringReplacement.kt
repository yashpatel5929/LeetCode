package slidingWindow

import kotlin.math.max

class LonestRepeatedSubstringReplacement {

    fun characterReplacement(s: String, k: Int): Int {

        var i = 0
        var result = 0
        val map = HashMap<Char , Int>()
        var maxoff = 0
        for (j in 0 until s.length) {
            map.put(s[j] , map.getOrDefault(s[j] , 0 ) +1)

            maxoff = maxOf(maxoff , map.maxOf { it.value })

            while ((j-i+1) - maxoff > k) {
                map[s[i]] = map.getOrDefault(s[i] , 0) -1
                i++
            }
            result = maxOf(result , j-i+1)
print(result)
        }
        print(result)
        return result

    }

}


fun main() {
    val d = LonestRepeatedSubstringReplacement()
    d.characterReplacement("AABABBA" , 1)
}