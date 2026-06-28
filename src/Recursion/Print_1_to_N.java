package Recursion;

//Time Complexity :- O(n)
//Space Complexity:- O(n)

public class Print_1_to_N {
    static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }
}
