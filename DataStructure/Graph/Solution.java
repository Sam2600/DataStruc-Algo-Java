package DataStructure.Graph;

import java.util.LinkedList;

public class Solution {

   public static void main(String[] args) {

      Graph graph = new Graph();

      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 3);
      graph.addEdge(2, 3);

      graph.depthFirstSearch();
   }
}

class Graph {

   private int V;
   private int E;

   public LinkedList<Integer>[] adjMatrix;

   public Graph() {
      this(4);
   }

   @SuppressWarnings("unchecked")

   public Graph(int capacity) {
      this.V = capacity;
      this.E = 0;
      this.adjMatrix = new LinkedList[capacity];

      for (int v = 0; v < this.V; v++) {
         this.adjMatrix[v] = new LinkedList<>();
      }
   }

   public void addEdge(int x, int y) {

      this.adjMatrix[x].add(y);
      this.adjMatrix[y].add(x);
      this.E++;
   }

   public void depthFirstSearch() {

      Boolean[] visited = new Boolean[adjMatrix.length];

      for (int i = 0; i < adjMatrix.length; i++) {

         // 0 -> [1, 2] -> [2]
         // 1 -> [0, 3] -> [3]
         // 2 -> 0, 3
         // 3 -> 1, 2

         LinkedList<Integer> list = adjMatrix[i];

         dfs(list, visited);
      }
   }

   private void dfs(LinkedList<Integer> list, Boolean[] visited) {

      for (int i = 0; i < list.size(); i++) {

         if (!visited[list.get(i)]) {

            System.out.println(list.get(i));
            visited[list.get(i)] = true;

            dfs(adjMatrix[list.get(i)], visited);
         }
      }
   }
}

//  0   1

//  2   3