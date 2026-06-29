package Recursion;

//Time Complexity :- O(n)
//Space Complexity:- O(n)

public class Sum_Of_N_Natural_Numbers {
    static void main(String[] args) {
        int n=100;
        System.out.println("Sum of "+n+" Natural Number : "+sum(n));
    }
    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
}
