
 // Definition for singly-linked list.
 class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }


public class AddTwoNumbersList {

    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {

        ListNode1 dummyHead = new ListNode1(0); // Dummy node to build the result list
        ListNode1 current = dummyHead;
        int carry = 0;

        // Iterate through both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Update carry
            int digit = sum % 10;

            current.next = new ListNode1(digit); // Append new digit node
            current = current.next;
        }

        return dummyHead.next; // Skip the dummy node

    }
}
