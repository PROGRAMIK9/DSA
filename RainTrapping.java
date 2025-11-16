class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int left = 0, right =n-1, left_max=0, right_max=0,water =0;
        while(left<right){
            if(arr[left]<arr[right]){
                left_max = Math.max(left_max, arr[left]);
                water+=left_max-arr[left];
                left+=1;
            }else{
                right_max = Math.max(arr[right], right_max);
                water+=right_max-arr[right];
                right-=1;
            }
        }
        return water;
    }
}
