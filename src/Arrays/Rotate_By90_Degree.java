package Arrays;

//Time Complexity:-O(n^2)
//Space Complexity:-O(1)

public class Rotate_By90_Degree {
        public void rotateMatrix(int[][] arr) {

            for(int i=0 ; i<arr.length ; i++){
                for(int j=0 ; j<i ; j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }

            for(int i=0 ; i<arr[0].length ; i++){
                int lo=0 , hi=arr.length-1;
                while(lo<=hi){
                    int temp=arr[lo][i];
                    arr[lo][i]=arr[hi][i];
                    arr[hi][i]=temp;
                    lo++;
                    hi--;
                }
            }
        }
    }

