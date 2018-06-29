class Solution(object):
	def kEmptySlots(self, flowers, k):
		"""
		:type flowers: List[int]
		:type k: int
		:rtype: int
		"""
		table = flowers[:]
		for i in range(len(flowers)):
			table[flowers[i]-1] = i+1
		left,right,cur,res= 0,k+1,1,float('inf')
		while (cur<len(flowers) and right <len(flowers)):            
			if cur == right:
				res = min(res, max(table[left],table[right]))
			if table[cur]>table[left] and table[cur]>table[right]:
				cur+=1
				continue            
			left = cur
			right = left+k+1
			cur += 1
		return -1 if res == float('inf') else res