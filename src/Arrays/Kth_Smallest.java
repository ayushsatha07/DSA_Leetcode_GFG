package Arrays;
import java.util.Arrays;

//Time Complexity:-O(nlogn)
//Space Complexity:-O(logn)

public class Kth_Smallest {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

}
