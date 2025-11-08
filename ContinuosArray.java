
public class ContinuosArray {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0, max_sum =-10000000;
        for(int val: arr){
            sum += val;
            max_sum = sum>max_sum?sum:max_sum;
            if(sum < 0) sum =0;
        }
        return max_sum;
    }
}
