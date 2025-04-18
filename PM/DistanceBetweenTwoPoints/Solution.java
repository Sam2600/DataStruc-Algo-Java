package PM.DistanceBetweenTwoPoints;

public class Solution {
   public static void main(String[] args) {

      System.out.println(getDistance(1, 1, 4, 5));

   }

   public static double getDistance(double x1, double y1, double x2, double y2) {

      double verticl = y2 - y1;
      double horizontal = x2 - x1;

      double squared = (verticl * verticl) + (horizontal * horizontal);

      double distance = Math.sqrt(squared);

      return distance;
   }
}
