package Multidimensional_Array;

//Time Complexity :-O(n^2)
//Space Complexity:-O(1)

public class Row_with_Max_Sum {
    static void main(String[] args) {
        int arr[][]={{22,33,44,52},{33,56,43,21},{32,78,549,32},{32,67,43,89}};
        System.out.println("Row with Maxsum : "+rowMaxSum(arr));
    }
   public static int rowMaxSum(int arr[][]){
        int idx=-1;
        int maxsum=-1;
        for(int i=0 ; i<arr.length ; i++){
            int sum=0;
            for(int j=0 ; j<arr[0].length ; j++){
                sum=sum+arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
                idx=i;
            }
        }
        return idx;
   }

}
