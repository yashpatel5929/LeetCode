package linkedlist


class DeleteNodeFromLinkedListPresentInArray {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
       /* var prev = head
        for (i in nums) {
            var temp = head
            while (temp?.next != null) {
                if(temp.`val` == i) {
                    deleteNode(temp)
                }
                else {
                    prev = temp
                    temp = temp.next
                }


            }
            if(temp?.`val`== i) {
                prev?.next = null


            }


        }
        return head*/
            var temp = head
            val mpp = HashSet<Int>()
            for (x in nums) mpp.add(x)
            while (head != null && mpp.contains(head.`val`)) temp = temp?.next
            var curr: ListNode? = temp
            while (curr?.next != null) {
                while (curr.next != null && mpp.contains(curr.next!!.`val`)) {
                    curr.next = curr.next!!.next
                }
                curr = curr.next
            }
            return head
    }

    private fun deleteNode(t: ListNode?) {
        if (t == null) return
        t.`val` = t.next!!.`val`
        t.next = t.next!!.next
        return
    }

    fun convertArrarToLL(arr: IntArray): ListNode {
        val head = ListNode(arr[0])
        var mover = head
        for (i in 1 until arr.size) {
            val temp = ListNode(arr[i])
            mover.next = temp
            mover = temp
        }
        return head
    }

    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}



fun main() {
    val d = DeleteNodeFromLinkedListPresentInArray()
    val head = d.convertArrarToLL(intArrayOf(2,10,9))
    var ans = d.modifiedList(intArrayOf(9,2,5) , head)
    while(ans!!.next != null ){
        print(ans.`val`)
        ans = ans.next
    }
    

}