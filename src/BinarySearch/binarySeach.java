package BinarySearch;

// Time Complexity :- O(logn)
// Space Complexity :-O(1)


class Solution {
    public int search(int[] arr, int target) {
        int low=0 ,high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(target>arr[mid]){
                low=mid+1;
            }else{
                return mid;

            }
        }
        return -1;
    }
}
