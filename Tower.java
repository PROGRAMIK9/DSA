import java.util.*;
public class Tower {
	class Solution {
	    public int getMinDiff(int[] arr, int k) {
	        // code here
	        Arrays.sort(arr);
	        if(arr.length==1) return 0;
	        int min=arr[arr.length-1]-arr[0];
	        int small = arr[0]+k;
	        int large = arr[arr.length-1]-k;
	        for(int i=0;i<arr.length-1;i++){
	            int minh = arr[i+1]-k < small? arr[i+1]-k:small;
	            int maxh = arr[i]+k > large? arr[i]+k:large;
	            if(minh<0) continue;
	            min = min<(maxh-minh)? min:(maxh-minh);
	        }
	        return min;
	    }
	}

}
