class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        int leftBound[] = new int[n];
        int rightBound[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                leftBound[i] = -1;
            }else{
                leftBound[i] = stack.peek();
            }
            stack.push(i);   
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                rightBound[i] = n;
            }else{
                rightBound[i] = stack.peek();
            }
            stack.push(i);
        }
        int maxVisible = 0;
        for (int i = 0; i < n; i++) {
            int visibleCount = rightBound[i] - leftBound[i] - 1;
            maxVisible = Math.max(maxVisible, visibleCount);
        }
        return maxVisible;
    }
}
