package DataStructure.PriorityQueue;

public class Solution {

   public static void main(String[] args) {

      PriorityQueue pq = new PriorityQueue(5);
      
      pq.maxInsert(4);
      pq.maxInsert(1);
      pq.maxInsert(5);
      pq.maxInsert(6);
      pq.maxInsert(2);
      pq.maxInsert(8);
      pq.maxInsert(9);
      pq.maxInsert(7);
      pq.maxInsert(10);
      pq.maxInsert(3);
      pq.maxInsert(11);
      pq.printAll();
      pq.maxRemove();
      System.out.println();
      System.out.println("==================================================");
      System.out.println();
      pq.printAll();
   }
}

class PriorityQueue {

   int[] heap;
   int n = 0;

   public PriorityQueue(int capacity) {
      heap = new int[capacity];
   }

   public int getSize() {
      return n;
   }
   
   public boolean isFull() {
      return n == heap.length;
   }

   public void resize() {
      int[] new_size_arr = new int[heap.length * 2];

      for (int i = 0; i < heap.length; i++) {
         new_size_arr[i] = heap[i];
      }

      heap = new_size_arr;
   }

   public void maxInsert(int value) {

      if (this.isFull()) {
         this.resize();
      }

      heap[n] = value;

      swim(n);

      n++;
   }

   public int getParentIndex(int i) {
      return (i - 1) / 2;
   }

   public void swim(int n) {

      while (heap[n] > heap[getParentIndex(n)]) {

         int tmp = heap[n];
         heap[n] = heap[getParentIndex(n)];
         heap[getParentIndex(n)] = tmp;

         n = getParentIndex(n);
      }

   }

   public int maxRemove() {

      int tmp = heap[0];
      heap[0] = heap[n - 1];
      heap[n - 1] = 0;
      n--;

      sink(0);

      return tmp;
   }
   
   public void sink(int k) {

      while ((2 * k) + 1 <= n) {
         
         int j = (2 * k) + 1;

         if (heap[j] < heap[j + 1]) {
            j++;
         }
         
         if (heap[k] > heap[j]) {
            break;
         }

         int tmp = heap[k];
         heap[k] = heap[j];
         heap[j] = tmp;

         k = j;
      }
   }

   public void printAll() {
      for (int i : heap) {
         System.out.print(i + ", ");
      }
   }
}
