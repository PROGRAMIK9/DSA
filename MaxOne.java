class Solution {
    int maxOnes(int[] arr) {
        // code here
        int n = arr.length;
        int c = 0,s = 0;
        int n1 = 0;
        for(int i = 0;i < n; i++){
            if(arr[i] == 0 ) c++;
            else{
                c--;
                n1++;
                if(c<0) c = 0;
            }
            s=Math.max(s,c);
        }
        return n1+s;
    }
};