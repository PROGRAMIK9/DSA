import java.util.*;


class unique_occur {
    public boolean uniqueOccurrences(int[] arr) {
       Map <Integer, Integer> map = new HashMap<>();
       for(int x:arr){
        map.put(x,map.getOrDefault(x,0)+1);
       } 
       Set<Integer> s = new HashSet<>();
       for(int x:map.values()){
        s.add(x);
       }
       return map.size()==s.size();
    }
}