package string

class MinimumStringLengthAfterRemovingSubString {
    fun minLength(s: String): Int {
        var ip = s
        while (ip.contains("AB") || ip.contains("CD")) {
            ip =  ip.replace("AB" , "")
            ip =  ip.replace("CD" , "")
        }


        return ip.length

    }
}

fun main() {
    val d = MinimumStringLengthAfterRemovingSubString().minLength("ABFCACDB")
}