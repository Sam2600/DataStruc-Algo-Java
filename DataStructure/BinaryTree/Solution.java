package DataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

   public static void main(String[] args) {

      BinaryTree bTree = new BinaryTree();

      bTree.createBinaryTree();

      bTree.inOrder();

      System.out.println("================================");
      
      bTree.postOrder();
   }
}

class BinaryTree {

   TreeNode root;

   public void createBinaryTree() {

      TreeNode first = new TreeNode(30);
      TreeNode second = new TreeNode(20);
      TreeNode third = new TreeNode(45);
      TreeNode fourth = new TreeNode(15);
      TreeNode fifth = new TreeNode(35);
      TreeNode sixth = new TreeNode(40);
      TreeNode seventh = new TreeNode(50);

      first.left = second;
      first.right = third;
      second.left = fourth;
      second.right = fifth;
      third.left = sixth;
      third.right = seventh;

      this.root = first;
   }

   public void preOrder() {

      Stack<TreeNode> stack = new Stack<TreeNode>();

      TreeNode temp = this.root;

      stack.push(temp);

      while (!stack.isEmpty()) {

         TreeNode node = stack.pop();

         System.out.println(node.value);

         if (node.right != null) {
            stack.push(node.right);
         }

         if (node.left != null) {
            stack.push(node.left);
         }
      }
   }

   public void inOrder() {

      Stack<TreeNode> stack = new Stack<TreeNode>();

      TreeNode temp = this.root;

      while (!stack.isEmpty() || temp != null) {

         if (temp != null) {

            stack.push(temp);
            temp = temp.left;

         } else {

            TreeNode node = stack.pop();
            System.out.println(node.value);
            temp = node.right;
         }
      }
   }

   public void postOrder() {

      Stack<TreeNode> stack = new Stack<TreeNode>();

      TreeNode current = this.root;

      while (!stack.isEmpty() || current != null) {

         if (current != null) {

            stack.push(current);
            current = current.left;

         } else {

            TreeNode temp = stack.peek().right;

            if (temp == null) {

               temp = stack.pop();
               System.out.println(temp.value);

               while (!stack.isEmpty() && temp == stack.peek().right) {
                  temp = stack.pop();
                  System.out.println(temp.value);
               }

            } else {
               current = temp;
            }
         }
      }
   }

   public void levelOrderTraversal() {

      Queue<TreeNode> queue = new LinkedList<>();

      TreeNode temp = this.root;

      queue.offer(temp);

      while (!queue.isEmpty()) {

         TreeNode dump = queue.poll();

         System.out.println(dump.value);

         if (dump.left != null) {
            queue.offer(dump.left);
         }

         if (dump.right != null) {
            queue.offer(dump.right);
         }
      }
   }

   public int findMax(TreeNode root) {

      if (root == null) {
         return Integer.MIN_VALUE;
      }

      int result = root.value;

      int left = findMax(root.left);

      int right = findMax(root.right);

      if (left > result) {
         result = left;
      }

      if (right > result) {
         result = right;
      }

      return result;
   }

   private class TreeNode {

      public int value;
      TreeNode left;
      TreeNode right;

      public TreeNode(int value) {
         this.value = value;
      }
   }
}

class BinarySearchTree {

   TreeNode root;

   public void createBinarySearchTree() {

      TreeNode first = new TreeNode(30);
      TreeNode second = new TreeNode(20);
      TreeNode third = new TreeNode(45);
      TreeNode fourth = new TreeNode(15);
      TreeNode fifth = new TreeNode(35);
      TreeNode sixth = new TreeNode(40);
      TreeNode seventh = new TreeNode(50);

      first.left = second;
      first.right = third;
      second.left = fourth;
      second.right = fifth;
      third.left = sixth;
      third.right = seventh;

      this.root = first;
   }

   public boolean isValidBST(TreeNode root, int min, int max) // 2, -100, 8
   {
      if (root == null) {
         return true;
      }

      if (root.value <= min || root.value >= max) {
         return false;
      }

      boolean isLeftOk = isValidBST(root.left, min, root.value); // 1, -100, 2

      if (isLeftOk) {
         return isValidBST(root.right, root.value, max); // 8, 2, 8
      }

      return false;
   }

   private class TreeNode {

      public int value;
      TreeNode left;
      TreeNode right;

      public TreeNode(int value) {
         this.value = value;
      }
   }
}
