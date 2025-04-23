package DataStructure.Trie;

public class Solution {
   
   public static void main(String[] args) {
      Trie trie = new Trie();
      
      trie.insert("hat");
   }
}

class Trie {

   public TrieNode root;

   public Trie() {
      root = new TrieNode();
   }

   public void insert(String str) {

      char[] char_arr = str.toCharArray();

      for (char c : char_arr) {
         int i = getIndex(c);
         
      }
   }
   
   public void search(String srch) {

   }

   public int getIndex(char c) {
      return c - 'a';
   }

   private class TrieNode {

      public boolean isWorded;
      public TrieNode[] children;
   
      public TrieNode() {
         this.children = new TrieNode[26];
         this.isWorded = false;
      }

   }
}