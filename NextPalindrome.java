class Solution {
    static int[] nextPalindrome(int[] num) {
        // code here
        int n = num.length;
        boolean nine = true;
        for(int d : num){
            if(d!=9){nine = false;break;}
        }
        if(nine){
            int arr[] = new int[n+1];
            arr[0] =1;arr[n]=1;
            return arr;
        }
        int arr[] = Arrays.copyOf(num,n);
        int mid = n/2;
        for(int i=0;i<mid;i++)
            arr[n-i-1] = arr[i];
        if(isSmaller(arr,num)){
            int i = n%2==0?mid-1:mid;
            int carry = 1;
            while(i>=0 && carry >0){
                arr[i]+=carry;
                carry = arr[i]/10;
                arr[i]%=10;
                arr[n-i-1]=arr[i];
                i--;
            }
        }
        return arr;
    }
    private static boolean isSmaller(int[]a,int[]b){
        for(int i=0;i<a.length;i++){
            if(a[i]<b[i]) return true;
            if(a[i]>b[i]) return false;
        }
        return true;

    }
}