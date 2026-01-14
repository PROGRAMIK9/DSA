class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int p = 0;
        int t= 0;
        int ans = 0;
        while(p<arr.length && arr[p]!='P') p++;
        while(t<arr.length && arr[t]!='T')t++;
        while(p<arr.length && t < arr.length){
            if(Math.abs(p-t)<=k){
                ans++;p++;t++;
            }else{
               if(p<t)p++;
               else t++;
            }
            while(p<arr.length && arr[p]!='P') p++;
            while(t<arr.length && arr[t]!='T')t++;
        }
        return ans;                              
    }
}