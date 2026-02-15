// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i<=arr.size()-m){
            int minDiff = arr.get(m-1+i) - arr.get(i);
            min = Math.min(min,minDiff);
            i++;
        }
        return min;
    }
}