class Solution {
    public void sortIt(int[] arr) {
        // code here
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int o=0,e=0;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[j]%2!=0){
                odd[o++]=arr[j];
            }
            if(arr[i]%2==0){
                even[e++]=arr[i];
            }
            
            i++;
            j--;
        }
        o=0;i=0;
        while(o<odd.length && odd[o]!=0){
            arr[i++] = odd[o++];
        }
        e=0;
        while(e<even.length && i<arr.length){
            arr[i++] = even[e++];
        }
    }
}
