class Solution {
    static int maxArea(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[] heights = new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    heights[j]++;
                }else{
                    heights[j]=0;
                }
            }
            int currentArea = largestHist(heights);
            maxArea =Math.max(maxArea,currentArea);
        }
        return maxArea;
    }
    public static int largestHist(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int max =0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            int currentHeight = i==n?0:heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                max = Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
    }
}