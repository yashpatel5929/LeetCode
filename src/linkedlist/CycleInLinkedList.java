package linkedlist;

import java.util.HashMap;

public class CycleInLinkedList {


    public static void main(String[] args) {
        FindInterSection fd = new FindInterSection();
        int[] l1 = new int[]{3,2,0,-4};
        ListNode hed =  convertArrarToLL(l1);
        CycleInLinkedList cycleInLinkedList = new CycleInLinkedList();
        Boolean ans = cycleInLinkedList.hasCycle(hed);
        System.out.println(""+ans);
    }
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode ,Integer> hm = new HashMap<>();

        while (temp != null) {
            if(hm.containsKey(temp)){
                return true;
            }

            hm.put(temp , 1);
            temp = temp.next;
        }
        return false;
        
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
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
}
