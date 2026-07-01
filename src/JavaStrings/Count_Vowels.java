package JavaStrings;

 //Time Complexity :-O(n);
// Space Complexity:-O(1);

public class Count_Vowels {
    static void main(String[] args) {
        String s="ayush";
        int count=0;
        countVowels(s,count);
        System.out.println("Vowels : "+countVowels(s,count));
    }
    public static int countVowels(String s, int count){
        int n=s.length();
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count++;
            }

        }
        return count;
    }

}
