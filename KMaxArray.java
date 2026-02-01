class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(n==0){
            return res;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<k;i++){
            queue.add(arr[i]);
        }
        res.add(queue.peek());
        int i=k,start=0;
        while(i<n){
            queue.remove(arr[start++]);
            queue.add(arr[i++]);
            res.add(queue.peek());
        }
        return res;
    }
}