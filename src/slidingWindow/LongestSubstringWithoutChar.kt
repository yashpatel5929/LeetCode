package slidingWindow

class LongestSubstringWithout {

    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var i = 0
         var j = 0
        val map = HashMap<Char , Int>()

        while ( j < s.length) {
            map.put(s[j] , map.getOrDefault(s[j] , 0) +1)

            if(map.size ==  j-i+1) {
                max = maxOf(max , j-i+1)
                j++
            }
            else if( map.size < j-i+1) {
                while (map.size < j-i+1) {
                    map[s[i]] = map.getOrDefault(s[i] , 0) -1
                    if(map[s[i]] == 0)
                        map.remove(s[i])

                    i++
                }
                j++
            }
        }
        print(max)
        return max
     /*   val finalString = StringBuilder()
        var max = 0
        for(i in 0 until s.length) {
            if (finalString.toString().contains(s[i])) {
                max = maxOf(max, finalString.length)
                finalString.deleteCharAt(i)
                break
            } else {
                finalString.append(s[i])
                for (j in i + 1 until s.length) {
                    if (finalString.toString().contains(s[j])) {
                        max = maxOf(max, finalString.length)
                        finalString.deleteCharAt(i)
                        break
                    }else {
                        finalString.append(s[j])
                    }
                }
            }
        }
        print("$finalString  jui $max")
        return max*/

    }
}


fun main() {
    val d = LongestSubstringWithout()
    d.lengthOfLongestSubstring("aab")
}