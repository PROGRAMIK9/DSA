class Solution {
    public boolean valid(int[] arr, int n, int k, int max){
        int stu = 1;
        int pages = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){return false;}
            if(pages+arr[i]<=max){pages+=arr[i];}
            else{stu++;pages=arr[i];}
        }
        return stu>k?false:true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n<k) return -1;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int i=0,j=sum,ans=-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(valid(arr,n,k,mid)){
                ans = mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}