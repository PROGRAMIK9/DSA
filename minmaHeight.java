class Solution {
    public static long maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        long low = 1;
        long high = 2000000000L; // Max height can be arr[i] + k
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(arr, k, w, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int k, int w, long target) {
        int n = arr.length;
        long[] diff = new long[n + 1]; 
        long currentWater = 0;
        long totalDaysUsed = 0;

        for (int i = 0; i < n; i++) {
            currentWater += diff[i];
            long currentHeight = arr[i] + currentWater;

            if (currentHeight < target) {
                long needed = target - currentHeight;
                totalDaysUsed += needed;
                
                if (totalDaysUsed > k) return false;

                // Update the current height and the difference array
                currentWater += needed;
                // Subtract 'needed' at the end of the window to stop its effect
                if (i + w < n) {
                    diff[i + w] -= needed;
                }
            }
        }
        return totalDaysUsed <= k;
    }
}