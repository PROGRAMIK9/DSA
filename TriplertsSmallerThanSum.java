// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n-2;i++){
            int j=i+1, k=n-1;
            while(j<k){
                long trip = arr[i]+arr[k]+arr[j];
                if(trip < sum){ count+=j-k;
                    j++;} 
                else{ 
                    k--;
                };
            }
        }
        return count;
    }
}
