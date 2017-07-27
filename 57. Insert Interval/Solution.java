/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
                ArrayList<Interval> result = new ArrayList<>();
        int mergedStart = Integer.MAX_VALUE;
        int mergedEnd = Integer.MIN_VALUE;
        int i;
        for (i = 0; i< intervals.size(); i++){
            Interval cur = intervals.get(i);
            if (newInterval.start <= cur.end && mergedStart == Integer.MAX_VALUE){
                if (newInterval.start < cur.start){
                    mergedStart = newInterval.start;
                }else{
                    mergedStart = cur.start;
                }
            }
            
            if (newInterval.end <= cur.end && mergedEnd == Integer.MIN_VALUE){
                if (newInterval.end < cur.start){
                    mergedEnd = newInterval.end;
                    result.add(new Interval(mergedStart, mergedEnd));
                    result.add(cur);
                }else{
                    mergedEnd = cur.end;
                    result.add(new Interval(mergedStart, mergedEnd));
                }
                break;
            }
            
            if (mergedStart == Integer.MAX_VALUE && mergedEnd == Integer.MIN_VALUE){
                result.add(cur);
            }
        }
        i++;
        while(i<intervals.size()){
            result.add(intervals.get(i));
            i++;
        }
        
        if (mergedEnd == Integer.MIN_VALUE){
            if (mergedStart != Integer.MAX_VALUE){
                result.add(new Interval(mergedStart, newInterval.end));
            }else{
                result.add(newInterval);
            }
        }
        
        return result;
    }
}