package leetcode;

import java.util.*;

public class OJ056_MergeIntervals {
    public class Interval{
        int start;
        int end;
        Interval(){start = 0; end = 0;}
        Interval(int start, int end){this.start = start; this.end = end;}
    }
    public List<Interval> merge(List<Interval> intervals){
        List<Interval> list = new ArrayList<>();
        int n = intervals.size();
        if(n == 0) return list;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int i = 1;
        Interval cur = intervals.get(0);
        while (i < n){
            Interval next = intervals.get(i);
            if(cur.end >= next.start){
                Interval interval = new Interval(cur.start, Math.max(next.end, cur.end));
                cur = interval;
            }else {
                list.add(cur);
                cur = next;
            }
            i++;
        }
        list.add(cur);
        return list;
    }
}
