class Solution {
    int maxProduct(int[] arr) {
        // code here
        int pl = 1, pr = 1, num =  arr.length, max = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            pl *= arr[i];
            pr *= arr[num-i-1];
            max = Math.max(max, Math.max(pl,pr));
            if(pl==0) pl=1;
            if(pr==0) pr=1;
        }
        return max;
    }
}