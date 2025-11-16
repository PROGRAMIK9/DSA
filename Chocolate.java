// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.size();i++){
            min_diff = Math.min(min_diff, arr.get(i+m-1)-arr.get(i));
        }
        return min_diff;
    }
}