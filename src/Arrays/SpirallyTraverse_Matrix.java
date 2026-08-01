package Arrays;

import java.util.ArrayList;

public class SpirallyTraverse_Matrix {
        public ArrayList<Integer> spirallyTraverse(int[][] arr) {
            ArrayList<Integer> ans=new ArrayList<>();
            int firstrow=0 ,firstcol=0 ,lastrow=arr.length-1, lastcol=arr[0].length-1;

            while(firstrow<=lastrow && firstcol<=lastcol){

                for(int i=firstcol ; i<=lastcol ; i++){
                    ans.add(arr[firstrow][i]);
                }
                firstrow++;

                if(firstrow>lastrow || firstcol>lastcol) break;

                for(int i=firstrow ; i<=lastrow ; i++){
                    ans.add(arr[i][lastcol]);
                }
                lastcol--;

                if(firstrow>lastrow || firstcol>lastcol) break;

                for(int i=lastcol ; i>=firstcol ; i--){
                    ans.add(arr[lastrow][i]);
                }
                lastrow--;

                if(firstrow>lastrow || firstcol>lastcol) break;

                for(int i=lastrow ; i>=firstrow ; i--){
                    ans.add(arr[i][firstcol]);
                }
                firstcol++;


            }
            return ans;
        }
    }

