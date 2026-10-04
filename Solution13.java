class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution13 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {

       
        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);

        common1.next = common2;
        common2.next = common3;

       
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common1;

       
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common1;

       
        Solution13 obj = new Solution13();

      
        ListNode result = obj.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}