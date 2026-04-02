class Solution {
    int countStrings(int n) {
        // code here
        int f1 =0;
        int f2 =1;
        int f=0;
        for(int i=1;i<=n+1;i++){
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
}