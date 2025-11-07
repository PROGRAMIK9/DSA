
public class Reverse {
	//naive method using an extra array
	static void reverse(int arr[]) {
		int n = arr.length;
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			temp[i] = arr[n-1-i];
		}
		for(int i =0; i<n;i++) {
			arr[i]=temp[i];
		}
	}
	//using two pointers and a temp variable to exchange
	static void loopreverse(int arr[]) {
		int i=0, j = arr.length-1,temp;
		while(i<j) {
			temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;// can use swap(arr[i],arr[j])
			i++;
			j--;
		}
	}
}
