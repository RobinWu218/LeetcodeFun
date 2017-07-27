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
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) return intervals;
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        Interval cur = intervals.get(0);
        List<Interval> result = new ArrayList<>();
        for (int i = 1; i<intervals.size();i++){
            Interval iTerval = intervals.get(i);
            if (iTerval.start <= cur.end){
                if (iTerval.end >= cur.end){
                    cur.end = iTerval.end;
                }
            }else{
                result.add(cur);
                cur = iTerval;
            }
        }
        result.add(cur);
        return result;
    }
}