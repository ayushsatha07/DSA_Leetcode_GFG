package BinarySearch;

//Time Complexity :-O(n)
//Space Complexity:-O(1)

public class Ceil_in_Array {
    static void main(String[] args) {
        int arr[]={11,43,56,75,90,96};
        System.out.println("Ceil In Array :"+ceil(arr,70));
    }
    public static int ceil(int arr[] , int tar){
        int low=0 , high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<tar) low=mid+1;
            else if(arr[mid]>=tar){
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
}
