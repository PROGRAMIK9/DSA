class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i = 0,j=0,x=0;
        int[] c = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[x++] = a[i++];
            }else{
                c[x++]=b[j++];
            }
        }
        while(i<a.length){
            c[x++] = a[i++];
        }while(j<b.length){
            c[x++]=b[j++];
        }
        return c[k-1];
    }
}