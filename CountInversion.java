class Solution {
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0,arr.length-1);
    }
    static int mergeSort(int[] arr, int s, int l){
        if(s>=l){
            return 0;
        }
        int count = 0;
        int mid =(s+l)/2;
        count += mergeSort(arr,s,mid);
        count += mergeSort(arr,mid+1,l);
        count += merge(arr,s,mid,l);
        return count;
    }
    static int merge(int[]arr, int s, int mid, int l){
        int[] temp = new int[l-s+1];
        int i = s;
        int j = mid+1;
        int k =0;
        int count1=0;
        while(i<=mid && j<=l){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                count1+=mid-i+1;
            }
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=l) temp[k++] = arr[j++];
        
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return count1;
    }
}