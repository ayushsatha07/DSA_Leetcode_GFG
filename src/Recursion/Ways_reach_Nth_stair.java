package Recursion;

//Time Complexity:-O(logn)
//Space Complexity:-O(1)

public class Ways_reach_Nth_stair {
    static void main(String[] args) {
        int ways=countWays(5);
        System.out.println("Number of Ways : "+ways);
    }
        public static int countWays(int n) {
            // code here
            if(n<=2) return n;
            return countWays(n-1)+countWays(n-2);
        }
}
