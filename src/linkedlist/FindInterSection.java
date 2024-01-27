package linkedlist;

public class FindInterSection {
    public static void main(String[] args) {
        ListNode l1 = convertArrarToLL(new int[]{4,1,8,4,5});
        ListNode l2 = convertArrarToLL(new int[]{5,6,1,8,4,5});
        FindInterSection findInterSection =new FindInterSection();
        ListNode res = findInterSection.getIntersectionNode(l1,l2);
        while (res != null){
            System.out.println(""+ res.val);
            res = res.next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        /*while(headB != null) {
            ListNode temp = headA;
            while (temp != null){
                if(temp == headB) return headB;
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;*/

        ListNode d1 = headA;
        ListNode d2 = headB;

        while (d1 != d2) {
            d1 = d1 == null ? headB : d1.next;
            d2 = d2 == null ? headA : d2.next;
        }

        return d1;
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
