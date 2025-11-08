
public class MaxJumps {
	class Solution {
	    public int minJumps(int[] arr) {
	        // code here
	        int n = arr.length;
	        if(arr[0]==0) return -1;
	        if(n<=1) return 0;
	        int maxstep = arr[0];//maximum u can reach from block 1
	        int steps = arr[0];// number of steps u have
	        int jumps = 1;//1st jump is taken
	        for(int i=1;i<n;i++){
	            if (i == n-1 ) return jumps;
	            maxstep = Math.max(maxstep, i+arr[i]);// find which will give the best reach from i
	            steps--;//1 step taken
	            if(steps ==0){
	                jumps++;//u have to take another jump if step is 0
	                if(i>=maxstep) return -1; //if the maximum step is not enough to be in i its not possible
	                steps = maxstep-i;// how many steps u can take from here on
	            }
	        }
	        return -1;
	    }
	}
}
