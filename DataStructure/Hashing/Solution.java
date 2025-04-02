package DataStructure.Hashing;

public class Solution {

   public static void main(String[] args) {

      HashTable hashTable = new HashTable();
   
      hashTable.put(11, "Hsu");
      hashTable.put(12, "Nane");
      hashTable.put(13, "Sam");
      hashTable.put(23, "Jimmy");

      System.out.println(hashTable.get(23));

      System.out.println(hashTable.remove(23));

      System.out.println(hashTable.get(23));
   }
}

class HashTable {

   int size;
   HashNode[] bucket;
   int numberOfBucket;

   public HashTable() {
      this(10);
   }

   public HashTable(int capacity) {
      this.numberOfBucket = capacity;
      this.bucket = new HashNode[capacity];
   }

   public int getIndex(int key) {
      return key % this.numberOfBucket;
   }

   public void put(int key, String value) {

      int index = this.getIndex(key);

      HashNode head = this.bucket[index];

      while (head != null) {

         if (head.key == key) {
            head.value = value;
            return;
         }

         head = head.next;
      }

      head = this.bucket[index];

      HashNode new_node = new HashNode(key, value);
      
      new_node.next = head;

      this.bucket[index] = new_node;
      this.size++;
   }

   public String get(int key) {

      int index = this.getIndex(key);

      HashNode head = this.bucket[index];

      while (head != null) {
         
         if (head.key == key) {
            return head.value;
         }

         head = head.next;
      }
      
      return "";
   }

   public int getSize() {
      return this.size;
   }

   public String remove(int key) {

      int index = this.getIndex(key);

      HashNode head = this.bucket[index];
      HashNode prev = null;

      while (head != null) {

         if (head.key == key) {
            break;
         }

         prev = head;
         head = head.next;
      }

      if (head == null) {
         return null;
      }

      this.size--;

      if (prev == null) {
         this.bucket[index] = head.next;
      } else {
         prev.next = head.next;
      }

      return head.value;
   }

   private class HashNode {
      int key;
      String value;
      HashNode next;

      public HashNode(int key, String value) {
         this.key = key;
         this.value = value;
      }
   }
}