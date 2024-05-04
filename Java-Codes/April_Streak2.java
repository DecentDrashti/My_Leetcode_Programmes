public class April_Streak2{
    public static void main(String[]args) {
        String s,t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string s: ");
        String s = sc.nextLine();
         System.out.print("Enter a string t: ");
        String t = sc.nextLine();
        // boolean b1=true;
        // boolean b2=false;
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200];
        int s1=s.length();
        int t1=t.length();
        // if(s1==t1 && t1==1){
        //    String resultStr = (s==t) ? "True" : "False";
        // }
         if(s1!=t1){
            System.out.println(false);
         }
            
         for(int i=0;i<s1;i++){
            // for(int j=i+1;j<s1;j++){
                 // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
              if(indexS[s.charAt(i)]!=indexT[t.charAt(i)]){
            //    if(t.charAt(i)==t.charAt(j)){
                  System.out.println(false);
                }
              // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i + 1; // updating index of current character
            indexT[t.charAt(i)] = i + 1; // updating index of current character
        }
        
      // If the loop completes without returning false, strings are isomorphic
        System.out.println(true);
    }
}