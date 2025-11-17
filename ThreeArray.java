class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // smallest solution
        //Arrays.sort(arr);
        int n = arr.length;
        int i=0, j =n-1, k =0;
        while(k<n){
            if(j<k) break;
            if(arr[k]<a){
                swap(arr, i, k);    
                i++; k++;
            }else if(arr[k]>b){
                swap(arr, j,k);
                j--;
            }else{
                k++;
            }
        }
    }
    
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}