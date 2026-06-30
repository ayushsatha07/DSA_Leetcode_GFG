package Recursion;

// Time Complexity :-O(logn)
// Space Complexity:-O(logn)

public class Binary_Search_Recursively {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
       int ans= search(arr,0,arr.length-1,2);
        System.out.println("Index of Element : "+ans);
    }
    public static int search(int arr[] ,int low , int high,int tar){
        if(low>high) return -1;    //Not Found
        int mid=low+(high-low)/2;
        if(arr[mid]>tar) return search(arr, low, mid-1, tar);
        else if(arr[mid]<tar) return search(arr,mid+1,high,tar);
        else{
            return mid;
        }
    }
}
