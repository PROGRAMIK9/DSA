class Solution {
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
    public void reverse(int nums[], int i){
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int breaks=-1;
        for(int i=nums.length-2;i>=0;i--){
           if(nums[i]<nums[i+1]){
                breaks = i;
                break;
           } 
        }
        if(breaks==-1){
            reverse(nums,0);
        }else{
            int index=-1;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[breaks]){
                    index  =i;
                    break;
                }
            }
            swap(nums,breaks,index);
            reverse(nums,breaks+1);
        }   
    }
}