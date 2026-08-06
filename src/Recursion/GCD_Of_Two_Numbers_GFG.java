package Recursion;

//Time Complexity :- O(log(min(a,b))
//Space Complexity :-O(log(min(a,b))


public class GCD_Of_Two_Numbers_GFG {
    static void main(String[] args) {
        int a=12, b=16;
        System.out.println("GCD of Two Numbers : "+gcd(a,b));
    }
    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
