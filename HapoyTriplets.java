class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int n = a.length;
        int i = 0, j =0, k=0;
        int[] ans = new int[3];
        int mindiff = Integer.MAX_VALUE, minSum = Integer.MAX_VALUE;
        while(i<n&&j<n&&k<n){
            int minab = Math.min(a[i],b[j]);
            int min = Math.min(minab,c[k]);
            int maxab = Math.max(a[i],b[j]);
            int max = Math.max(maxab, c[k]);
            int diff = max-min;
            int sum = a[i]+b[j]+c[k];
            if(diff<mindiff || (diff==mindiff && sum<minSum)){
                mindiff = diff;
                minSum = sum;
                ans[0] = a[i];
                ans[1] = b[j];
                ans[2] = c[k];
            }
            if(min == a[i])i++;
            else if(min == b[j])j++;
            else k++;
        }
        reverse(ans);
        return ans;
    }
    void reverse(int arr[]){
        Arrays.sort(arr);
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
    }
}
