package Multidimensional_Array;

//Time Complexity :-O(n^2)
//Space Complexity :-O(1)

public class ColumWise_Print {
    static void main(String[] args) {
        int arr[][]={{22,33,44,52},{33,56,43,21},{32,78,549,32},{32,67,43,89}};
        printColumnWise(arr);
    }
    public static void printColumnWise(int arr[][]){
        for(int i=0 ; i<arr[0].length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
