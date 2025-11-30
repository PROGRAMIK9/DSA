// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int left = 0, right = arr.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        res.add(-1);
        while(left<=right){
            if(arr[left]==x && arr[right]==x){ res.add(0,left);
            res.add(1,right);
                break;
            }
            if(arr[left]!= x) left++;
            if(arr[right]!=x) right--;
        }
        return res;
    }
}
