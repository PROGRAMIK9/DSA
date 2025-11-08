
public class duplicate {
	class Solution {
	    public int findDuplicateVisited(int[] nums) {
	        int n = nums.length;
	        for(int num:nums){
	            int idx = Math.abs(num);
	            if(nums[idx]<0){
	                return idx;
	            }
	            nums[idx] = -nums[idx];
	        }
	        return n;
	    }
	    
	    public int findDuplicateFloydCycle(int[] nums) {
	    	int slow =0, fast =0;
	    	do {
	    		slow = nums[slow];
	    		fast = nums[nums[fast]];
	    	}while(slow!=fast);
	    	slow =0;
	    	while(slow!=fast) {
	    		slow = nums[slow];
	    		fast = nums[fast];
	    	}
	    	return slow;
	    }
	}
}
