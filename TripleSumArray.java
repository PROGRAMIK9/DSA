class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n;i++){
            int l = i+1, h=n-1;
            while(l<h){
                int sum = arr[l]+arr[i]+arr[h];
                if(sum == target){
                    return true;
                }
                else if(sum>target){
                    h--;
                }else{
                    l++;
                }
            }
            
        }
        return false;
    }
}
