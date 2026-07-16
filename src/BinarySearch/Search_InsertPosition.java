package BinarySearch;

//Time Complexity:-O(logn)
//Space Complexity:-O(1)

public class Search_InsertPosition {

    public int searchInsertK(int arr[], int k) {
        int lo = 0, hi = arr.length - 1;
        int idx = 0;

        if (arr[0] > k) return 0;
        if (arr[arr.length - 1] < k) return arr.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > k) hi = mid - 1;
            else if (arr[mid] <= k) {
                idx = mid;
                lo = mid + 1;
            }
        }
        if (arr[idx] == k) return idx;
        return idx + 1;

    }
}
