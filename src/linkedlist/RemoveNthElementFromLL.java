package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthElementFromLL {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ListNode headd = convertToLL(arr);
        ListNode ll = removeNthFromEnd(headd,2);
        while (ll!= null) {
            System.out.println(""+ll.data);
            ll = ll.next;
        }
        System.out.println("done" );
    }
    static ListNode convertToLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i=1;i < arr.length ; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;


    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if(count == n) {
            ListNode newHead = head.next;
            return newHead;
        }

        int res = count - n;
        ListNode temp2 = head;
        while (temp2 != null) {
             res--;
             if(res == 0) {
                 break;
             }
             temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;

    }
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int item) {
            this.data = item;
            this.next = null;
        }
    }
}
