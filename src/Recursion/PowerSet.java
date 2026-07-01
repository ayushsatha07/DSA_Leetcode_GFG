package Recursion;
import java.util.List;
import java.util.ArrayList;
public class PowerSet {
    static void main(String[] args) {
         List<String> list =new ArrayList<>();
         String s="abc";
         int idx=0;
         subSequences(s,idx,"",list);
        System.out.print(list+" ");
    }
    public static void subSequences( String s , int idx , String ans, List<String> list){
        if(idx==s.length()){
            list.add(ans);
            return;
        }
        char ch=s.charAt(idx);
        subSequences(s,idx+1,ans+ch, list);
        subSequences(s,idx+1,ans, list);
    }
}
