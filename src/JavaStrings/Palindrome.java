package JavaStrings;

//Time Complexity :-O(n)
//Space Complexty :-O(1)

public class Palindrome {
    static void main(String[] args) {
        String s ="racecar";
        String s1="rahul";
        System.out.println(s+" is Palindrome : "+isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i=0 , j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
