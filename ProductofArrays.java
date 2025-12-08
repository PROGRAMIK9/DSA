// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] product = new int[n];
        int p =1;
        boolean flag = false;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)p *= arr[i];
            if(arr[i]==0){flag = true; cnt++;}
        }
        if(flag){
            for(int i=0;i<n;i++){
                if(arr[i]==0 && cnt<2){
                    product[i]=p;
                }else{
                    product[i]=0;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                product[i]=p/arr[i];
            }
        }
        return product;
    }
}
