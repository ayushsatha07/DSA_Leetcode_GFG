
//First And Last Occurance in Sorted Array
// Time Complexity :- O(logn)
// Space Complexity :- O(1)

package BinarySearch;
import java.util.ArrayList;
public class First_And_Last_Occurance {
    ArrayList<Integer> find(int arr[], int tar) {
        ArrayList<Integer> ans = new ArrayList<>();

        int low=0 , high=arr.length-1,  idx=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>tar) high=mid-1;
            else if(arr[mid]<tar) low=mid+1;
            else{
                idx=mid;
                high=mid-1;
            }
        }
        ans.add(idx);
        idx=-1;
        low=0 ;
        high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>tar) high=mid-1;
            else if(arr[mid]<tar) low=mid+1;
            else{
                idx=mid;
                low=mid+1;
            }
        }
        ans.add(idx);
        return ans;
    }
}