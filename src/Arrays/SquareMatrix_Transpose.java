package Arrays;
import java.util.ArrayList;

//Time Complexity:-O(n^2)
//Space Complexity:-O(1)
//Space Complexity;-O(n^2) ------> {for Returning Ans}

public class SquareMatrix_Transpose {
        public ArrayList<ArrayList<Integer>> transpose(int[][] arr) {
            ArrayList<ArrayList<Integer>> ans =new ArrayList<>();

            //Transpose

            for(int i=0 ; i<arr.length ; i++){
                for(int j=0 ; j<i ; j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }

            for(int i=0 ; i<arr.length ; i++){
                ans.add(new ArrayList<>());
                for(int j=0 ;j<arr[0].length ; j++){
                    ans.get(i).add(arr[i][j]);
                }
            }
            return ans;

        }
    }

