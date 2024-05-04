//2nd may streak
import java.util.*;
public class Largest2441{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
        nums[d] = sc.nextInt(); 
       }
       Arrays.sort(nums);
    //    for (int d = 0; d <n; d++) {
    //     System.out.println(nums[d]);
    //    }
     for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
            if(Math.abs(nums[i])==Math.abs(nums[j])){
            if((nums[i]>0||nums[j]>0)&&(nums[i]<0 || nums[j]<0))
            return Math.abs(nums[i]);
            else
            continue;
            }
            }
        }
        return -1;
    }
}
//another try 
//Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=nums.length-1;j>=0;j--)
        //     {
        //         if(nums[j]==-nums[i])
        //         {
        //             return nums[j];
        //         }
        //     }
        // }
        // return -1;