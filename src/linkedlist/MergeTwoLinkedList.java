package linkedlist;

public class MergeTwoLinkedList {

    public static void main(String[] args) {
        MergeTwoLinkedList ll = new MergeTwoLinkedList();
        ListNode l1 = convertArrarToLL(new int[]{1,2,4});
        ListNode l2 = convertArrarToLL(new int[]{1,3,4});
        ListNode res = ll.mergeTwoLists(l1,l2);
        while (res != null) {
            System.out.println(""+res.val);
            res = res.next;
        }
    }

    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1!=null) {
            temp.next = list1;
        }else {
            temp.next = list2;
        }


        return dummy.next;

    }

    public static ListNode convertArrarToLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i=1;i < arr.length ; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;


    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
