//pivot int 
import java.util.*;
public class Day2_streak {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
    int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);
         //ap formula equating sum from 1to x with 1ton - 1tox-1
        if( a- Math.ceil(a)==0){
        // this implies that sq is an int so it won't be ceil so the pivot exist 
        return (int)a;
        }
        else {
        return -1;
        } 
        //if to be done with array
        // int[] prefs = new int[n + 1];
        // for (int i = 1; i < n + 1; i++) {
        //     prefs[i] = prefs[i - 1] + i;
        // }

        // for (int i = 1; i < n + 1; i++) {
        //     if (prefs[i] == prefs[n] - prefs[i - 1])
        //         return i;
        // }

        // return -1;
    }
}
//my trial approach
 // int sum=0;
        // int i=1;
        // while(i<=n){
        //  sum+=i;
        //  i++;
        //  System.out.println(sum);
        // }
        // System.out.println(sum); 
        //this want be work as one number should be taken twice for add of left nd right
    //     int n1=sum/2;
    //      sum=0;
    //   for(i=1;i<=n;i++){
    //     sum+=i;
    //     if(sum>n1){
    //         System.out.println(-1);
    //     }else if(sum==n1){
    //         break;
    //     }else{
    //         continue;
    //     }
        
    //   }
    //   System.out.println(i);
    