package LinkedList;
class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {

        this.val = val;
    }
}

public class RemoveVal {

    public static ListNode removeElements(
            ListNode head,
            int val
    ) {

        if (head == null) {
            return null;
        }

        ListNode dummy =
                new ListNode(0);

        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null) {

            if (temp.next.val == val) {

                temp.next =
                        temp.next.next;
            }

            else {

                temp = temp.next;
            }
        }

        return dummy.next;
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
                new ListNode(6);

        ListNode n4 =
                new ListNode(3);

        ListNode n5 =
                new ListNode(4);

        ListNode n6 =
                new ListNode(5);

        ListNode n7 =
                new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        ListNode head = n1;

        System.out.println(
                "Original List:"
        );

        printList(head);

        head = removeElements(head, 6);

        System.out.println();

        System.out.println(
                "After Removing 6:"
        );

        printList(head);
    }
} 
  

