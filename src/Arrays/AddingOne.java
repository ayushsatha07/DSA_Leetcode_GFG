package Arrays;


import java.util.Collections;
import java.util.Vector;

//Time Complexity:-O(n)
//Space Complexity:-O(n) --> (Including Output)
//Space Complexity:-O(1) --> (Excluding Output)

public class AddingOne {
        // Function for adding one to the number represented by the array
        Vector<Integer> addOne(int[] arr) {
            Vector<Integer> ans =new Vector<>();
            int n=arr.length-1;
            int carry=1;

            for(int i=n ; i>=0 ; i--){
                if(arr[i]+carry<=9){
                    ans.add(arr[i]+carry);
                    carry=0;
                }else{
                    ans.add(0);
                    carry=1;
                }
            }
            if(carry==1){
                ans.add(1);
            }

            Collections.reverse(ans);
            return ans;

    }
}
