
/**
 * Definition for singly-linked list.
 **/
class ListNode2 {
     int val;
     ListNode2 next;
     ListNode2(int x) {
        val = x;
        next = null;
     }

 }



public class LinkedListCycle {

    public boolean hasCycle(ListNode2 head) {

        ListNode2 slow = head;
        ListNode2 fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }

        return false;
    }
}
