class Solution(object):
	def permuteUnique(self, nums):
		"""
		:type nums: List[int]
		:rtype: List[List[int]]
		"""
		if len(nums)<=1:
			return [nums]
		used = [False]*len(nums)
		nums.sort()
		return self.helper([],[],nums,used)
	
	def helper(self, res, cur, nums,used):
		
		if len(cur) == len(nums):
			res.append(cur[:])
			return res
		
		for i in range(len(nums)):
			if used[i]:
				continue	
			if i>0 and nums[i] == nums[i-1] and not used[i-1]:
				continue
			cur.append(nums[i])
			used[i] = True
			res = self.helper(res,cur,nums,used)
			cur.pop()
			used[i] = False
		return res
			
		