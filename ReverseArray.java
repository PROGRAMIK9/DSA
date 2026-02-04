class Solution {
    public void swap(int arr[],int j, int i){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverseArray(int arr[]) {
        // code here
        int i =0, j= arr.length-1;
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}