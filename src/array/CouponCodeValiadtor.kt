package array

class CouponCodeValidator {
    fun validateCoupons(code: Array<String>, businessLine: Array<String>, isActive: BooleanArray): List<String> {
        val result = mutableListOf<Pair<String, String>>()
        val category =
            arrayOf("electronics", "grocery", "pharmacy", "restaurant").withIndex().associate { it.value to it.index }
        for (i in 0 until code.size) {
            if (isActive[i] && businessLine[i] in category && code[i].matches(Regex("^[a-zA-Z0-9_]+$"))) {
                result.add(Pair(code[i], businessLine[i]))
            }
        }


        val sortedCodes = result
            .sortedWith(
                compareBy<Pair<String, String>> { category[it.second] }
                    .thenBy { it.first }
            )
            .map { it.first }
            .toList()




            return sortedCodes
    }
}


fun main() {
    val obj = CouponCodeValidator()
    val d = obj.validateCoupons(
        arrayOf("SAVE20", "", "PHARMA5", "SAVE@20"), arrayOf("restaurant", "grocery", "pharmacy", "restaurant"),
        booleanArrayOf(true, true, true, true)
    )
    print(d)
}