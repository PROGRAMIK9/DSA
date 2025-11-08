import java.util.*;
public class Arrange {
	static void naive(int[] arr) {
		//sort the array
		Arrays.sort(arr);
	}
	static void twoPointer(int[] arr) {
		int i=0, j=arr.length-1,temp;
		while(i<j) {
			while(i<j && arr[i]<0) {
				i++;
			}
			while(j>i && arr[i]>0) {
				j--;
			}
			if(j>i){//assuming 0 is not in the array 
				temp = arr[i];
				arr[i++]=arr[j];
				arr[j--] =  temp;
			}
		}
		
	}
}
