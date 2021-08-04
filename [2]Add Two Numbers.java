//You are given two non-empty linked lists representing two non-negative integer
//s. The digits are stored in reverse order, and each of their nodes contains a si
//ngle digit. Add the two numbers and return the sum as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself. 
//
// 
// Example 1: 
//
// 
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// 
//
// Example 2: 
//
// 
//Input: l1 = [0], l2 = [0]
//Output: [0]
// 
//
// Example 3: 
//
// 
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each linked list is in the range [1, 100]. 
// 0 <= Node.val <= 9 
// It is guaranteed that the list represents a number that does not have leading
// zeros. 
// 
// Related Topics Linked List Math Recursion 
// 👍 13140 👎 2963


//leetcode submit region begin(Prohibit modification and deletion)

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode x = new ListNode ();
        String list1Fin = "";
        String list2Fin = "";

        while (l2 != null)
        {
            list2Fin = l2.val + list2Fin;
            l2 = l2.next;
        }

        while (l1 != null)
        {
            list1Fin = l1.val + list1Fin;
            l1 = l1.next;
        }

        System.out.println(list1Fin);
        BigInteger l1FinBig = new BigInteger(list1Fin);
        BigInteger l2FinBig = new BigInteger(list2Fin);
        BigInteger total = l1FinBig.add(l2FinBig);
        System.out.println(total);
        String[] finalArray = total.toString().split("");


        ArrayList<ListNode> nodes = new ArrayList<ListNode> ();

        for (int i = finalArray.length -1 ; i >= 0; i--) {
            ListNode temp = new ListNode (Integer.parseInt(finalArray[i]));
            System.out.println(temp.val);
            nodes.add(temp);
        }

       for (int q = 0, w = 1; q < nodes.size() - 1; q++, w++){
           nodes.get(q).next = nodes.get(w);
       }

        System.out.println(Arrays.toString(finalArray));
        return nodes.get(0);
  }

}
//leetcode submit region end(Prohibit modification and deletion)
