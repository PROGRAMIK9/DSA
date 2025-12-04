class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                
                int k = j+1, l = n-1;
                while(k<l){
                    long sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum == target){
                        ArrayList<Integer> li = new ArrayList<>();
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[k]);
                        li.add(arr[l]);
                        res.add(li);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1])l--;
                    }else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}