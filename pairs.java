// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[j]+arr[i]==0){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[j]);
                li.add(l);
                i++;
                j--;
                while(i<j && arr[i]==arr[i+1]) i++;
                while(i<j && arr[j]==arr[j+1]) j--;
            }else if(arr[i]+arr[j]>0){
                j--;
            }else if(arr[i]+arr[j]<0){
                i++;
            }
        }
        return li;
    }
}
