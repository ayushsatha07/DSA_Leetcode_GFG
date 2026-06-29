package Recursion;

// A raised To power B
// Time Complexity :- O(n)
// Space Complexity :-O(n)

public class a_Raised_To_Power_b {
    static void main(String[] args) {
        int a=2;
        int b=9;
        System.out.println(a+" Raised To Power "+b+" is :"+pow(a,b));
    }
    public static int pow(int a , int b){
        if(b==0)  return 1;
        return a*pow(a,b-1);
    }
}
