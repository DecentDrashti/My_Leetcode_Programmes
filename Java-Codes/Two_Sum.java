//1st
import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.print("enter the target");
        int target=sc.nextInt();
        int[] result=new int[2];
        int[] nums=new int[n];
        System.out.println("enter the numbers ");
        for(int i=0; i<n ; i++){
         nums[i]=sc.nextInt();
        }

        for(int i=0;i<(n-1);i++){
         for(int j=(i+1);j<(n);j++){
            if(nums[i]+nums[j]==target){
                result[0]=nums[i];
                result[1]=nums[j];
                break;
                //return new int []{i,j};
        }
        }
         
    }
    System.out.print(result[0]);
    System.out.print(",");
    System.out.print(result[1]);
    //return new int[]{};
  }
}
