class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            int left = lowerbound(arr,start);
            int right = upperbound(arr,end);
            
            int count = (right>=left)? right-left+1:0;
            al.add(count);
        }
        return al;
    }
    private int lowerbound(int[] arr, int start){
        int left = 0, right = arr.length-1;
        int res = arr.length;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=start){
                res = mid;
                right = mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
    private int upperbound(int[] arr, int end){
        int left = 0, right = arr.length-1;
        int res = -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<=end){
                res = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
}
