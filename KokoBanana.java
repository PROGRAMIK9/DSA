class Solution {
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = 0;
        for (int pile : arr) {
            high = Math.max(high, pile);
        }
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(arr, k, mid)) {
                result = mid; 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
    private boolean canFinish(int[] arr, int k, int speed) {
        int totalHours = 0; 
        for (int pile : arr) {
            totalHours += Math.ceil(pile/speed);
        }
        return totalHours <= k;
    }
}