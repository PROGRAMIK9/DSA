import java.util.*;
public class SetUnion {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> s = new HashSet<>();
        Set<Integer> r = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            r.add(b[i]);
        }
        s.addAll(r);
        return new ArrayList<>(s);
    }
}
