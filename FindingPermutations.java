class Solution {
    Map<Character,Integer> seen = new HashMap<>();
    public void recurse(StringBuilder str, ArrayList<String> res, int i){
        if(i==str.length()){
            res.add(str.toString());
            return;
        }   
        HashSet<Character> seen = new HashSet<>();
        char a = str.charAt(i);
        for(int j = i;j<str.length();j++){
            char b = str.charAt(j);
            if(seen.contains(b)) continue;
            seen.add(b);
            char c = a;
            str.setCharAt(i,b);
            str.setCharAt(j,c);
            recurse(str,res,i+1);
            str.setCharAt(i,a);
            str.setCharAt(j,b);
            
        }
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        recurse(str,res,0);
        return res;
    }
}