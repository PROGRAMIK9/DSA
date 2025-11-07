import java.util.*;
public class min_max {
	static int[] max_min(int arr[]) {
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
		}
		return new int[] {min,max};
	}
	static int[] sort_method(int arr[]) {
		Arrays.sort(arr);
		return new int[] {arr[0], arr[arr.length]};
	}
}
