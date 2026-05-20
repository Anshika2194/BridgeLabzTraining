package LinkedList;
class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {

        this.val = val;
    }
}

public class Middle{

    public static ListNode middleNode(
            ListNode head
    ) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;

        ListNode fast = head;

        while (fast != null &&
                fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(
            ListNode head
    ) {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(
                    temp.val + " "
            );

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode n1 =
                new ListNode(1);

        ListNode n2 =
                new ListNode(2);

        ListNode n3 =
                new ListNode(3);

        ListNode n4 =
                new ListNode(4);

        ListNode n5 =
                new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode head = n1;

        System.out.println(
                "Linked List:"
        );

        printList(head);

        ListNode middle =
                middleNode(head);

        System.out.println();

        System.out.println(
                "Middle Node: " +
                        middle.val
        );
    }
}