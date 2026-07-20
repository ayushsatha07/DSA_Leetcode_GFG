package Arrays;

//Time Complexity:-O(n)
//Space Complexity:-O(1)

public class Missing_In_Array {
        int missingNum(int arr[]) {

            long n =arr.length+1;
            long sum= n*(n+1)/2;
            long arraySum=0;

            for(int ele : arr){
                arraySum=arraySum+ele;
            }
            return (int)(sum-arraySum);
        }
    }

