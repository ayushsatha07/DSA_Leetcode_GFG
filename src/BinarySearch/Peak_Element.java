package BinarySearch;

//Time Complexity:-O(logn)
//Space Complexity:-O(1)

public class Peak_Element {

    public int peakElement(int[] arr) {
        int low=0 , high=arr.length-1;
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        if(arr[1]>arr[0] && arr[1]>arr[2]) return 1;
              while(low<=high){
                int mid=low+(high-low)/2;
                if (mid>0 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
                else if( mid>0 && arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
                else high=mid-1;
            }
            return -1;
        }
    }

