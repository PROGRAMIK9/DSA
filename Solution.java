import java.util.*;
class Solution {
	public int brute_force(int arr[], int k) {
		Arrays.sort(arr);
        return arr[k-1];
	}
	
    public int kthSmallest(int[] arr, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i =k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}