
public class Clockwise {
	public void rotate(int[] arr) {
        // code here
        int i=arr.length-1,temp;
        while(i>0){
            temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1] = temp;
            i--;
        }
    }
}
