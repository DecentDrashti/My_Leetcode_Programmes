import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] strs) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int[] strs = new int[n]; 
       for (int d = 0; d < strs.length; d++) {
        System.out.println("Enter an integer:");
         strs[d] = sc.nextInt(); 
       }
         if (strs == null || strs.length == 0){
                return "";
         }
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int c = 0;
            while(c < first.length())
            {
                if (first.charAt(c) == last.charAt(c))
                    c++;
                else
                    break;
            }
            return c == 0 ? "" : first.substring(0, c);
    }
}
//my trial approach
       
       //here i got array length and array input
        // int s=strs.length;
        // if(n==0){
        //     return "";
        // }
        // if(n==1){
        //     return strs[0];
        // }
        // String s="flow";
        
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
            // for(int j=1;j<n;j++){
            //   if(i==strs[j].length() || strs[j].charAt(i)!=c){
            //     return strs[0].substring(0,i);
              // }
            //}
        
        // System.out.println(char c);


        //another solution
    /*class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(result)!=0){
                result = result.substring(0,result.length()-1);
            }
            if(result.isEmpty()) return "";
        }
        return result;
    }
}*/