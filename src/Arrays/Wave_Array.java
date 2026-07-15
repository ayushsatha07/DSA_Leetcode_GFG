package Arrays;

//Time Complexity:-O(n)
//Space Complexity:-O(1)

public class Wave_Array {

    class Solution {
        public void sortInWave(int arr[]) {
        int i=0,j=1;
        while(i<arr.length && j<arr.length){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+2;
            j=j+2;
            }

        }
    }
}
