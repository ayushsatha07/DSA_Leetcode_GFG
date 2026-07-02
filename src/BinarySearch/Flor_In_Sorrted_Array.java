package BinarySearch;

//Time Complexity :-O(logn)
//Space Complexity:-O(1)

public class Flor_In_Sorrted_Array {
    static void main(String[] args) {
        int arr[]={1,22,54,76,89,90,93};
        int tar=56;
        int idx=flor(arr ,tar);
        System.out.println("Index of flor : "+flor(arr,tar));
    }
    public static int flor(int arr[] , int tar){
        int low=0 , high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>tar) high=mid-1;
            else if (arr[mid]<=tar) {
                idx=mid;
                low=mid+1;
            }
        }
        return idx;
    }
}
