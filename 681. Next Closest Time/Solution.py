class Solution(object):
	def nextClosestTime(self, time):
		"""
		:type time: str
        :rtype: str
        """
		a,b,c,d = int(time[0]),int(time[1]),int(time[3]),int(time[4])
		t = [a,b,c,d]
		minval = min(min(a,b),min(c,d))
		for i in range(3,-1,-1):
			cur = t[i]
			candidate = self.findSlightLargerVal(t,i)
			if candidate == -1:
				continue
			else:
				newtime = [minval]*4
				newtime[i]=candidate
				newtime[:i]=t[:i]
				if (self.checkValidTime(newtime)):
					return str(newtime[0])+str(newtime[1])+":"+str(newtime[2])+str(newtime[3])
		return str(minval)+str(minval)+":"+str(minval)+str(minval)
		
	def checkValidTime(self,time):
		hr,min = time[0]*10+time[1],time[2]*10+time[3]
		return hr < 24 and min < 60
		
	def findSlightLargerVal(self,t,i):
		if i<0:
			return -1
		cur = t[i]
		arr = list(map(lambda x:x-cur,t))
		larger = list(filter(lambda x:x>0, arr))
		if len(larger) == 0:
			return -1
		return min(larger)+cur
		