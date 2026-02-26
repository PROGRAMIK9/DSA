class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2) return false;
            }else{
                if(!set.add(c2)) return false;
                map.put(c1,c2);
            }
            // map.put(c1,map.getOrDefault(c1,0)+1);
            // map.put(c2, map.getOrDefault(c2,0)+1);
        }
        // for(int i=0;i<s1.length();i++){
            // if(map.get(s1.charAt(i)) == map.get(s2.charAt(i)))continue;
            // else return false;
        // }
        return true;
    }
}