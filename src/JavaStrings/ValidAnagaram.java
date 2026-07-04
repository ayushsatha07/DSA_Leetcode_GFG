package JavaStrings;
import java.util.Arrays;

//Time Complexity :-O(nlogn)
//Space Complexity:-O(n)

public class ValidAnagaram {
    static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        System.out.println(s1+" is "+s2+" Anagram "+isAnagaram(s1,s2));
    }
    public static boolean isAnagaram(String s1 , String s2){
        if(s1.length()!=s2.length()) return false;
        char arr[]=s1.toCharArray();
        char brr[]=s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=brr[i]) return false;
        }
        return true;
    }
}
