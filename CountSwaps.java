class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[]) {
        // Code here
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        int i=0;
        int count =0;
        while(i<n){
            if(i!=map.get(arr[i])){
                count++;
                swap(arr,i,map.get(arr[i]));
            }else{
                i++;
            }
        }
        return count;
    }
    void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}