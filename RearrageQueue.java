class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int size = q.size();
        int i =size;
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        while(i>0){
            if(i>size/2){
                al1.add(q.poll());
            }else{
                al2.add(q.poll());
            }
            i--;
        }
        while(al1.size()!=0 && al2.size()!=0){
            q.add(al1.getFirst());
            al1.removeFirst();
            q.add(al2.getFirst());
            al2.removeFirst();
        }
    }
}
    