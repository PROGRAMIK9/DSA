class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> seen = new HashSet<>();
        int prefix = 0;
        for(int n:arr){
            prefix+=n;
            if(prefix==0 || seen.contains(prefix)) return true;
            else seen.add(prefix);
        }
        return false;
    }
}