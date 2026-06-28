package Recursion;

// In General Time Complexity Or Space Complexity
// Time Complexity :-O(n)
// Space Complexity:-O(n)

public class Factorail_Of_Number {
    static void main(String[] args) {
        int n=5;
        System.out.println("Factorial Of "+n+" is : "+fact(5));
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
