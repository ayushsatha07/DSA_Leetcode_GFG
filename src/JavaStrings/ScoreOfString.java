package JavaStrings;

//Time Complexity:-O(n);
//Space Complexity:-O(1);

public class ScoreOfString {
    static void main(String[] args) {
        String s="hello";
        System.out.println("Score :"+score(s));
    }
    public static int score(String s){
        int sum=0;
        int j=0;
        for(int i=1 ;i<s.length() ; i++){
            int diff=s.charAt(i)-s.charAt(j);
            if(diff<0) diff=diff*-1;
            sum=sum+diff;
        }
        return sum;
    }
}

