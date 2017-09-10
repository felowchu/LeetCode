package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OJ057_InsertInterval {
    public class Interval{
        int start;
        int end;
        Interval() {start = 0; end = 0;}
        Interval(int start, int end){this.start = start; this.end = end;}
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval){
        List<Interval> list = new ArrayList<>();
        int n = intervals.size();
        if(n == 0) {
          list.add(newInterval);
          return list;
        }
        Interval cur = newInterval;
        for(int i = 0; i < intervals.size(); i++){
            if(intervals.get(i).start > cur.end){
                list.add(cur);
                for(int j = i; j < n; j++)
                    list.add(intervals.get(j));
                return list;
            }
            if(intervals.get(i).end < cur.start){
                list.add(intervals.get(i));
            }else {
                cur.start = Math.min(intervals.get(i).start, newInterval.start);
                cur.end = Math.max(intervals.get(i).end, newInterval.end);
            }
        }
        list.add(cur);
        return list;
    }
}
