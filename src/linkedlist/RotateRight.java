package linkedlist;

import java.util.List;

public class RotateRight {
    public static void main(String[] args) {
        RotateRight rotateRight = new RotateRight();
        ListNode in = convertArrarToLL(new int[]{1,2,3,4,5});
        ListNode result = rotateRight.rotateRight(in , 2);
        while (result != null) {
            System.out.println(""+result.val);
            result = result.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
       /* if (head == null || head.next == null) return head;
        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            while (temp.next.next != null) temp = temp.next;
            ListNode end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;*/

        //optimal approach
        /*
        * 1/ find length of linked list
        * 2. last node next point to head
        *
        * */

        if(head == null || head.next == null || k ==0) return head;
        ListNode temp = head;
        int n = 1;
        while (temp.next != null){
            n++;
            temp = temp.next;
        }

        temp.next = head;
        k = k%n;
        k = n - k;
        while (k-- > 0) temp = temp.next;

        head = temp.next;
        temp.next = null;
        return head;
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
