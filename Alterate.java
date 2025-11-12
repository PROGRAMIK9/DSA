class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0) negative.add(arr.get(i));
            else positive.add(arr.get(i));
        }
        arr.clear();
        int i = 0, j=0;
        while(i<positive.size() && j<negative.size()){
            arr.add(positive.get(i));
            arr.add(negative.get(j));
            i++;j++;
        }
        while(i<positive.size()) arr.add(positive.get(i++));
        while(j<negative.size()) arr.add(negative.get(j++));
    }
}