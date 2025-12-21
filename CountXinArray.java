class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int q[]:queries){
            al.add(getCount(arr,q[0],q[1],q[2]));
        }
        return al;
    }
    public int getCount(int[] arr, int start, int end, int val){
        int first = firstOcc(arr, start,end,val);
        if(first == -1 || first > end) return 0;
        int last = lastOcc(arr,start,end,val);
        return last-first+1;
    }
    public int firstOcc(int[] arr, int start, int end, int val){
        int res = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==val){
                res=mid;
                end = mid-1;
            }else if(arr[mid]<val){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;
    }
    public int  lastOcc(int[] arr, int start, int end, int val){
        int res = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==val){
                res=mid;
                start = mid+1;
            }else if(arr[mid]<val){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;
    }
}