package JavaStrings;

//Time Complexity :-O(n)
//Space Coplexity :-O(n)

public class StringCompression {
    static void main(String[] args) {
        char arr[]={'a','a','a','b','c','c','d','d','d','d'};
         char brr[]= compress(arr);
         for(char ele : brr) System.out.print(ele+" ");
    }
    public static char[] compress(char arr[]){
        String ans="";
        int i=0, j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                ans=ans+arr[i];
                int count=j-i;
                if(count>1) ans=ans+count;
                i=j;
            }
        }
        ans=ans+arr[i];
        int count=j-i;
        if(count>1) ans=ans+count;
        i=j;

        for(int k=0 ; k<ans.length() ; k++){
            arr[k]= ans.charAt(k);
        }
        return arr;
    }

}
