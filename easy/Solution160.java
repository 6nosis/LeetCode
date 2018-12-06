package easy;

public class Solution160 {
    // 思路：长度相减后，先让长的走那么多，两个链表就剩相同长度，若相交一起前进的话必从某个点开始相等，那个点就是第一个交点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p = headA;
        int aLeng = 0, bLeng = 0;
        while (p != null) {
            aLeng++;
            p = p.next;
        }
        p = headB;
        while (p != null) {
            bLeng++;
            p = p.next;
        }
        while (aLeng > bLeng) {
            headA = headA.next;
            aLeng--;
        }
        while (aLeng < bLeng) {
            headB = headB.next;
            bLeng--;
        }
        while (headA != null){
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
