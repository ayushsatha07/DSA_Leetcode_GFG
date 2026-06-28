package Recursion;

//Time Complexity :-O(n)
//Space Complexity:-O(n)

public class Print_N_to_1 {
    static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
