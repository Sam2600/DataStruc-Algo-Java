package problems.MergeInterval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
   
   public static void main(String[] args) {
   
      List<Interval> list = new ArrayList<Interval>();

      Interval iv1 = new Interval(1, 3);
      Interval iv2 = new Interval(2, 4);
      Interval iv3 = new Interval(5, 7);
      Interval iv4 = new Interval(7, 10);

      list.add(iv1);
      list.add(iv2);
      list.add(iv3);
      list.add(iv4);

      mergeInterval(list);
   }

   public static List<Interval> mergeInterval(List<Interval> list)
   {
      if (list.size() < 2)
         return list;

      list.sort(Comparator.comparingInt(interval -> interval.start));

      List<Interval> result = new ArrayList<Interval>();

      int start = list.get(0).start;
      int end = list.get(0).end;

      for (int i = 1; i < list.size(); i++) {

         Interval current = list.get(i);

         if (current.start <= end) {

            end = Math.max(end, current.end);

         } else {

            result.add(new Interval(start, end));

            start = current.start;
            end = current.end;
         }
      }
      result.add(new Interval(start, end));

      return result;
   }

   
}

class Interval {
   
   public int start;
   public int end;

   public Interval(int start, int end) {
      this.start = start;
      this.end = end;
   }
}