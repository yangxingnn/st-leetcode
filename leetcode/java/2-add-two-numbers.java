/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /**
 * 数值小时还可以，大了就有溢出情况
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int x=0,y=0;
        
        long val1 = 0;
        long val2 = 0;
        while (l1!=null){
            val1 += (l1.val * Math.pow(10,x));
            x+=1;
            l1 = l1.next;
        }
        while (l2!=null){
            val2 +=(l2.val * Math.pow(10,y));
            y+=1;
            l2 = l2.next;
        }
        long sum = val1+val2;
        
        ListNode result   = new ListNode(0);
        ListNode pointerNode  = result;
        do{
            pointerNode.next = new ListNode((int)sum % 10);
            pointerNode = pointerNode.next;
            sum = sum/10;    
        }while (sum >0);
        return result.next;
    }
}

/**
 * 
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int addCarry = 0;
        int sum = 0;
        int x = 0;
        int y = 0;
        while(l1!=null || l2!=null || addCarry !=0){        // addCarry !=0 是因为会遇到 [5] [5]的情况，没有则输出[0],正确应为[0,1]
             x = (l1 == null)? 0 : l1.val;
            y = (l2 == null)? 0 : l2.val;
            sum = (x+y+addCarry)%10;
            addCarry = (x+y)/10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
            l1 = (l1 == null)?null:l1.next;
            l2 = (l2 == null)?null:l2.next;
        }
        return result.next;
      
    }
}