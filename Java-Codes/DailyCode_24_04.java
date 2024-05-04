//1137 find the tribonacci series given n has 37
import java.util.*;
class DailyCode_24_04 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int[]F=new int[38];
        F[0]=0;
        F[1]=F[2]=1;
        for(int i=0;(i+3)<=n;i++){
            F[i+3]=F[i]+F[i+1]+F[i+2];
        }
        System.out.print(F[n]);

        }
}