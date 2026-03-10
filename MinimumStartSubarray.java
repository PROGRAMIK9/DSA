class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                ans+=(i-stk.pop());
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            ans+=arr.length-stk.peek();
            stk.pop();
        }
        return ans;
    }
}
