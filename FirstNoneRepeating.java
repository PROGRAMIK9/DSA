class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int n=s.length();
        if(n==0)
            return "";
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            q.add(ch);
            while(!q.isEmpty() && map.get(q.peek())>1){
                q.poll();
            }
            if(q.isEmpty()){
                res.append('#');
            }else{
                res.append(q.peek());
            }
        }
        return res.toString();
    }
}