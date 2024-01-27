package linkedlist;

import java.util.Stack;

public class LinkedListPalindromeOrNot {
    public static void main(String[] args) {
        LinkedListPalindromeOrNot ls = new LinkedListPalindromeOrNot();
        ListNode input = convertArrarToLL(new int[]{1,1,2,5});
        Boolean ans = ls.isPalindrome(input);
        System.out.println(""+ans);
    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if(temp.val != st.peek().val)
                return false;
            st.pop();
            temp = temp.next;
        }

        return true;
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
