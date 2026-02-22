class Solution {
    public long isSubArray(int arr[], int start, int end,long count,int k){
        if(end == arr.length) return count;
        else if(start>end){
            return isSubArray(arr,0,end+1,count,k);
        }
        else{
            int sum = 0;
            for(int i=start;i<=end;i++){
                sum^=arr[i];
            }
            if(sum==k) count++;
            return isSubArray(arr,start+1,end,count,k);
        }
    }
    public long subarrayXor(int arr[], int k) {
        // code here
        // return isSubArray(arr,0,0,0,k);
        int n = arr.length;
        int res =0;
        int xor=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            int num = arr[i];
            xor^=num;
            // if(xor==k){
                // res++;
            // }
            if(map.get(xor^k)!=null){
                res+=map.get(xor^k);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return res;
    }
}