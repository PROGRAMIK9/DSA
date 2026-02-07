class Solution {
    int maxSum(int[] arr) {
        // code here
        int n = arr.length;
        
        int arrSum = 0;
        int curr = 0;

        for(int i=0;i<n;i++){
            arrSum += arr[i];
            curr += i*arr[i];
        }
        int res = curr;
         for(int k = 1; k < n; k++) {
            curr += arrSum - n * arr[n - k];
            res = Math.max(res, curr);
        }
        
        return res;
    }
}