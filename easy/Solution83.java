package easy;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode = head;
        while(curNode != null && curNode.next != null) {
            if (curNode.val == curNode.next.val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}