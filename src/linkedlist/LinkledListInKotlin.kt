package linkedlist

class LinkledListInKotlin {

    fun createLLFromArr(arr: IntArray) : Node {
        val head = Node(arr[0])
        var mover = head
        for(i in 1 until arr.size) {
            val temp = Node(arr[i])
            mover.next = temp
            mover  = temp
        }

        return head


    }

    inner class Node(val `val` : Int) {
        var next : Node ?= null
    }
}

fun main() {
    val arr = intArrayOf(1,2,3,4)
    var d = LinkledListInKotlin().createLLFromArr(arr)
    while (true){
        println(d.`val`)
        d = d.next!!
    }

}