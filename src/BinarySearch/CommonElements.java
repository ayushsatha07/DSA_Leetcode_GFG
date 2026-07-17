package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

//Time Complexity:-O(nlogn+mlogm)
//Space Complexity:-O(logn+logm)

public class CommonElements {
    // User function Template for Java
        public static ArrayList<Integer> commonElements(int a[], int b[]) {
            Arrays.sort(a);
            Arrays.sort(b);
            ArrayList<Integer> ans = new ArrayList<>();
            int i=0 , j=0;

            while(i<a.length && j<b.length){
                if(a[i]==b[j]){
                    ans.add(a[i]);
                    i++;
                    j++;
                }else if(a[i]>b[j]) j++;
                else i++;
            }
            return ans;
        }
    }

