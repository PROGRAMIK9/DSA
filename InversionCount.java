class Solution {
    static long inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0, arr.length-1);
    }
    static long mergeSort(int arr[], int l, int r){
        long count =0;
        if(l<r){
            int mid = (l+r)/2;
            count += mergeSort(arr, l,mid);
            count += mergeSort(arr, mid+1, r);
            count += merge(arr,l,mid,r);
        }
        return count;
    }
    static long merge(int[] arr, int l, int m, int r){
        int i = l;
        int j = m+1;
        int k=0;
        long count = 0;
        int temp[] = new int[r-l+1];
        while(i<=m && j<=r && k<=r-l){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++] = arr[j++];
                count+=(m-i+1);
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(i=l,k=0;i<=r;i++,k++){
            arr[i]=temp[k];
        }
        return count;
    }
}