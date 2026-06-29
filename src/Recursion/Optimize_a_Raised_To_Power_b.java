package Recursion;

//Optimize if Power is Non-Negative
// Time Complexity :-O(logn)
// Space Complexity:-O(logn)

public class Optimize_a_Raised_To_Power_b {
    static void main(String[] args) {
        int a=2,b=10;
        System.out.println(a+" Raised To Power "+b+" is :"+pow(a,b));
    }

    public static int pow(int a, int b){
        if(b==1) return a;
        int cal=pow(a,b/2);
        if(b%2==0) return cal*cal;
        return cal*cal*a;
    }
}
