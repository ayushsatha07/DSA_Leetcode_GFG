package SelectionSort;

//Time Complexity:-O[n^2]
//Space Complexity:-O(1)

public class SelectionSort {

        void selectionSort(int[] arr) {
            // code here
            int n=arr.length;

            for(int i=0 ; i<arr.length-1 ; i++){
                int min=Integer.MAX_VALUE;
                int minidx=-1;

                for(int j=i ; j<arr.length ; j++ ){
                    if(arr[j]<min){
                        min=arr[j];
                        minidx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;
            }
        }
    }

