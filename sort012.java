import java.util.*;
class sort012 {
    public void sort(int[] arr) {
        // brute force would be to count the number of 0s 1s and 2s and then create the array wuth that many 0s 1s and 2s.
        int low=0, mid=0,high =arr.length-1,temp;
        while(mid<=high){
            
            //mif element is 0 we can push it to the low position and then move low and mid to next location
            if(arr[mid]==0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            //if its one it can remain as we assume it will fall in middle
            else if(arr[mid]==1) mid++;
            //if its two we move to high and decrement high, but mid remains so that if 2 was brought in we can modify it
            else{
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
    }
}