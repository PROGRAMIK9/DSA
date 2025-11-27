// Java program to generate power set in
// lexicographic order.
class GFG {

    static void print(String str, int length, int index, String curr){
        if(index==n)return;
        if(curr!=null && !curr.trim().isEmpty()){
            System.out.println(curr);
        }
        for(int i = index+1;i<length;i++){
            curr+=str.charAt(i);
            print(str,length,i,curr);
            curr= curr.substring(curr.charAt(0),curr.length()-1);
        }
    }
    static void printSubSeq(String str)
    {
        int index = -1
        String curr ="";
        print(str,str.length(),index,curr);
    }
}

// This code is contributed by PrinciRaj1992