package linkedlist

import java.math.BigInteger
import kotlin.math.absoluteValue

class DoubleLinkedList {
    fun doubleIt(head: ListNode?): ListNode? {
        var num = BigInteger.ZERO
        var temp = head
        while(temp != null) {
            num = num.times(BigInteger.TEN).plus(temp.`val`.toBigInteger())
            temp = temp.next
        }
        num = num*BigInteger.TWO
        val tem = num.toString().map {
            it.toString().toInt()
        }
//        print("lol"+converArrarToLL(tem.toIntArray()))
        return converArrarToLL(tem.toIntArray())
    }

    fun converArrarToLL(arr: IntArray): ListNode {
        val head = ListNode(arr[0])
        var mover = head
        for (i in 1 until arr.size) {
            val temp = ListNode(arr[i])
            mover.next = temp
            mover = temp
        }
        return head
    }
}

class ListNode(var `val`: Int) {
         var next: ListNode? = null
}



fun main() {
    val db = DoubleLinkedList()

    val ans1 = db.doubleIt(db.converArrarToLL(intArrayOf(9,1,9,5,0,5,1,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9)))
    var ans = ans1
    while (ans != null){
        print(ans.`val`)
        ans =ans.next
    }
}