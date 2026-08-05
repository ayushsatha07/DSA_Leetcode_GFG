package Recursion;

//Time Complexity :-O(2^(m+n))
//Space Complexity:-O(m+n)

public class Unique_paths_Leetcode62 {
    
    static void main(String[] args) {
        int m=5 , n=6;
        System.out.println("Uniuqe Paths : "+uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        return uniquePaths(m,n-1)+uniquePaths(m-1,n);
        
    }
}
