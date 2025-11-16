// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int sum =0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>x){
                int len = i- left +1;
                minLen = Math.min(minLen, len);
                sum -= arr[left];
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
}
