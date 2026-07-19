package Arrays;

//Time Complexity:-O(n)
//Space Complexity:-O(1)

public class Largest_IN_Array {
    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
        // code here
    }
}
