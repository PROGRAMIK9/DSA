class Solution {
    public boolean isPossible(int[] arr, int k, long max){
        int curr = 0;
        int p =1;
        for(int b : arr){
            if(curr+b<=max){
                curr+=b;
            }else{
                p++;
                curr=b;
                if(p>k) return false;
            }
        }
        return true;
    }
    public long minTime(int[] arr, int k) {
        // code here
        long low = 0, high =0;
        for(int b : arr){
            low = Math.max(low,b);
            high+=b;
        }
        long ans = high;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            // Check if it's possible to paint all boards within 'mid' time
            if (isPossible(arr, k, mid)) {
                ans = mid;         // This time works, but let's try smaller
                high = mid - 1;
            } else {
                low = mid + 1;     // Need more time
            }
        }
        return ans;
    }
}
