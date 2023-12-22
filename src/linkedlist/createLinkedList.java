package linkedlist;

public class createLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Node head = convertArrarToLL(arr);
        Node temp = head;
        reverseList(head);

        /*while (temp.next != null) {
            System.out.println(""+temp.data);
            temp = temp.next;
        }
        System.out.println("item found :"+searcchElementInLl(head,10));*/
    }

    public static Node reverseList(Node head) {
        Node temp = head;
        Node prev = null;
        Node tempo = null;

        temp = temp.next;
        prev = head;
        prev.next = null;
        while(temp != null) {
            tempo = temp;
            temp = temp.next;
            tempo.next = prev;
            prev = tempo;

        }

        while (tempo != null) {
            System.out.println(""+tempo.data);
            tempo = tempo.next;
        }

        return tempo;

    }

    static Node middleOfLl(Node head) {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(temp.next == null) return head;
            count++;
            temp = temp.next;
        }

        temp = head;
        System.out.println(""+count);
        for(int i=0 ; i < count/2 ; i++){
            temp = temp.next;
        }
        return temp;
    }


    static int searcchElementInLl(Node head , int num) {
        Node temp = head;
        while (temp != null) {
            if(temp.data == num) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static Node convertArrarToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i < arr.length ; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;


    }

    static class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            this.next = null;
        }
    }
}
