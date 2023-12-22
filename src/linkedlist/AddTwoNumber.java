package linkedlist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        AddTwoNumber add = new AddTwoNumber();

        createLinkedList ll = new createLinkedList();
        int[] arr1 = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] arr2 = new int[]{5,6,4};

        ListNode temp = add.addTwoNumbers(convertArrarToLL(arr1),convertArrarToLL(arr2));
        while (temp != null) {
            System.out.println("data anser" + temp.data);
            temp =temp.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<BigInteger> res = new ArrayList<>();
        BigInteger revDigit1 = new BigInteger(getLinkedListData(l1).toString());
        BigInteger revDigit2 = new BigInteger(getLinkedListData(l2).toString());
        BigInteger addUp = revDigit1.add(revDigit2);
        res.add(addUp);
        return getLL(addUp);
    }

    static StringBuilder getLinkedListData(ListNode head) {
        ListNode temp = head;
        StringBuilder str = new StringBuilder();
        long digit = 0L;
        while (temp !=null) {
            str.append(temp.data);
            temp = temp.next;
        }
        return str.reverse();
    }

    static Long reverseDigit(long digit) {
        Long rev = 0L;
        while (digit > 0) {
            int temp = Math.toIntExact(digit % 10);
            rev = rev * 10 + temp;
            digit = digit / 10;
        }

        return rev;
    }

    static ListNode getLL(BigInteger digit) {
        List<BigInteger> ll = new ArrayList<>();
        ll.add(digit);
        ListNode head = new ListNode(ll.get(0).intValue());
        ListNode mover = head;

        for (BigInteger num : ll) {
            ListNode temp = new ListNode(num.intValue());
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    static ListNode convertDigitToLL(int digit) {
        /*ListNode head = new ListNode(digit.get(0).intValue());
        ListNode mover = head;
        for (BigInteger bigInteger : digit) {
            ListNode temp = new ListNode(bigInteger.intValue());
            mover.next = temp;
            mover = temp;
        }*/
        long rand = digit % 10;
        ListNode head = new ListNode((int) rand);
        ListNode mover = head;
        digit = digit/10;
        while (digit>0) {
            int num = (int) (digit%10);
            ListNode temp = new ListNode(num);
            mover.next = temp;
            mover = temp;
            digit = digit/10;
        }

        return head;
    }

    static ListNode convertArrarToLL(int[] arr) {
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
        int data;
        ListNode next;

        ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }
}
