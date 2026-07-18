package Arrays;

//Time Complexity:-O(n)
//Space Complexity:-O(1)

public class Find_MeanOf_Array {
    public static int findMean(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum=sum+arr[i];
        }
        return sum/n;
    }
}
