/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        // int maxDepth = findDepth(nestedList,1);
        // return helper(nestedList,maxDepth);

        int unweighted = 0, weighted = 0;
        while (!nestedList.isEmpty()){
        	List<NestedInteger> nextLevel = new ArrayList<>();
        	for (NestedInteger n : nestedList){
        		if(n.isInteger()){
        			unweighted += n.getInteger();
        		}else{
        			nextLevel.addAll(n.getList());
        		}
        	}
        	weighted += unweighted;
        	nestedList = nextLevel;
        }
        return weighted;
    }

    // public int findDepth(List<NestedInteger> nestedList, int depth){
    // 	int max = depth;
    // 	for (int i = 0; i<nestedList.size(); i++){
    // 		NestedInteger cur = nestedList.get(i);
    // 		if (!cur.isInteger()){
    // 			max = Math.max(max, findDepth(cur.getList(), depth+1));
    // 		}
    // 	}
    // 	return max;
    // }

    // public int helper(List<NestedInteger> nestedList, int depth){
    // 	int sum = 0;
    // 	NestedInteger cur;
    // 	for (int i = 0; i<nestedList.size();i++){
    // 		cur = nestedList.get(i);
    // 		if (cur.isInteger()){
    // 			sum += cur.getInteger()*depth;
    // 		}else{
    // 			sum += helper(cur.getList(), depth-1);
    // 		}
    // 	}
    // 	return sum;
    // }
}