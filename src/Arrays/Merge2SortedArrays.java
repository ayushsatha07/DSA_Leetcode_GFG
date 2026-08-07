package Arrays;
import java.util.*;

//Time Complexity :- O(n+m)
//Space Complexity:-O(n+m)

    public class Merge2SortedArrays {

        public static int[] mergeArrays(int[] arr1, int[] arr2) {

            int n = arr1.length;
            int m = arr2.length;

            int[] ans = new int[n + m];

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < n && j < m) {

                if (arr1[i] < arr2[j]) {
                    ans[k] = arr1[i];
                    i++;
                } else {
                    ans[k] = arr2[j];
                    j++;
                }

                k++;
            }

            // Remaining elements of arr1
            while (i < n) {
                ans[k] = arr1[i];
                i++;
                k++;
            }

            // Remaining elements of arr2
            while (j < m) {
                ans[k] = arr2[j];
                j++;
                k++;
            }

            return ans;
        }

        public static void main(String[] args) {

            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6, 8};

            int[] ans = mergeArrays(arr1, arr2);

            System.out.println(Arrays.toString(ans));
        }
    }

