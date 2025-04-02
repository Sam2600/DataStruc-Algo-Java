package problems.MergeSortList;

public class Solution {
   public static void main(String[] args) {
      
      ListNode listNode1 = new ListNode(1);

      ListNode listNode1_1 = new ListNode(2);

      ListNode listNode1_2 = new ListNode(5);

      ListNode listNode1_3 = new ListNode(7);

      ListNode listNode2 = new ListNode(2);

      ListNode listNode2_1 = new ListNode(4);

      listNode1.next = listNode1_1;
      listNode1_1.next = listNode1_2;
      listNode1_2.next = listNode1_3;

      listNode2.next = listNode2_1;

      mergeTwoLists(listNode1, listNode2);
   }
   
   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

      ListNode current1 = list1;
      ListNode current2 = list2;

      ListNode mergedListNode = new ListNode();
      ListNode currentMerged = mergedListNode;

      while (current1 != null && current2 != null) {

         if (current1.val < current2.val) {

            currentMerged.next = new ListNode(current1.val);

            current1 = current1.next;
            currentMerged = currentMerged.next;

         } else if (current1.val > current2.val) {

            currentMerged.next = new ListNode(current2.val);

            current2 = current2.next;
            currentMerged = currentMerged.next;

         } else {

            currentMerged.next = new ListNode(current1.val);
            currentMerged.next.next = new ListNode(current2.val);

            current1 = current1.next;
            current2 = current2.next;
            currentMerged = currentMerged.next.next;

         }

      }

      while (current1 != null) {
         currentMerged.next = new ListNode(current1.val);
         currentMerged = currentMerged.next;

         current1 = current1.next;
      }

      while (current2 != null) {
         currentMerged.next = new ListNode(current2.val);
         currentMerged = currentMerged.next;

         current2 = current2.next;
      }

      return mergedListNode.next;
   }
}

class ListNode {

   int val;
   ListNode next;
   
   ListNode() {
   }
   
   ListNode(int val) {
      this.val = val;
   }
   
   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}