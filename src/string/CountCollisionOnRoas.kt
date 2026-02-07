package string

import java.util.Stack

class CountCollisionOnRoad {


    fun countCollisions(directions: String): Int {
        val charArr = directions.toCharArray()
        var result = 0

        val st = Stack<Char>()
        st.add(charArr[0])
        for(i in 1 until charArr.size) {
            var current = charArr[i]
            if(st.peek() == 'R' && current == 'L'){
                result+=2
                st.pop()
                current = 'S'
            }else if(st.peek() == 'S' && current == 'L') {
                result++
                current = 'S'
            }

            while (st.isNotEmpty() && current == 'S' && st.peek() == 'R') {
                result++
                st.pop()
            }
            st.add(current)
            /*if (st.isEmpty()) {
                st.add(charArr[i])
            } else if (st.peek() != charArr[i]) {
                if (charArr[i] == 'L' && st.peek() == 'R' || charArr[i] == 'R' && st.peek() == 'L') {
                    result += 2
                    st.pop()
                    st.add('S')
                } else if (charArr[i] == 'L' && st.peek() == 'S') {
                    result++
                } else if (st.peek() == 'R' && charArr[i] == 'S') {
                    result++
                    st.add('S')
                } else {
                    st.add(charArr[i])
                }
            }else if(st.peek() == charArr[i]) {
                if(st.peek() != 'S')
                    st.pop()
            }*/
        }
        return result
        /*var i =0
        var j = 1
        var result =0
        while (j < charArr.size) {
            if(charArr[i] == 'L' && charArr[j] == 'R' || charArr[i] == 'R' &&   charArr[j] == 'L') {
                charArr[j] = 'S'
                result+=2
                i++
                j++
            }else if(((charArr[i] == 'R' || charArr[i] =='L') && charArr[j] =='S' )|| (charArr[i]=='S' && (charArr[j]=='R'|| charArr[i]=='L' ))) {
                charArr[j] = 'S'
                result++
                i++
                j++
            }else {
                i+=2
                j=i+1
            }
        }*/

    }
}


fun main() {
    val obj = CountCollisionOnRoad().countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR" +
            "")
    print(obj)
}