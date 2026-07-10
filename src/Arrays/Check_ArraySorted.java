package Arrays;

// Time Complexity :-O(n)
// Space Complexity:-O(1)

public class Check_ArraySorted {
    static void main(String[] args) {
        int arr[]={44,23,56,78,54,22};
        int brr[]={11,22,33,44,55,66};
        int crr[]={12,32,43,89,95,91};
        System.out.println(isSorted(crr));
    }
    public static boolean isSorted(int arr[]){
        int n=arr.length;
        for(int i=1 ; i<n ; i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
}
