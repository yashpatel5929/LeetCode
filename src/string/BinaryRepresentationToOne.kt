package string

import java.math.BigInteger

class BinaryRepresentationToOne {

    fun numSteps(s: String): Int {
        var dec = BigInteger(s , 2)
        var count = 0
        while (dec > BigInteger.ONE) {
            count++
            if((dec.mod(BigInteger.valueOf(2))) == BigInteger.ZERO) {
               dec = dec.divide(BigInteger.TWO)
            }else {
               dec = dec.add(BigInteger.ONE)
            }
        }
        return count
    }
}


fun main() {
    val d = BinaryRepresentationToOne().numSteps("1111110011101010110011100100101110010100101110111010111110110010")
    print(d)
}