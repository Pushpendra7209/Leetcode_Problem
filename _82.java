
public class _82 {
    public static ListNode deleteDuplicate(ListNode head){
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(head != null)
        {
            if(head.next != null && head.val == head.next.val)
            {
                while(head.next!= null && head.val == head.next.val)
                {
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummny.next;
    }
}
