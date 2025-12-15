class Solution {
    public int findNum(int n) {
        // code here
        int low = 5;
        int high = 5 * n;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = 0;
            for(int i = 5; mid/i>=1; i *= 5){
                count += mid/i;
            }
            if(count >= n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}