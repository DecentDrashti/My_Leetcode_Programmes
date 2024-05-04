import java.util.*;
public class Day3_Streak {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int goal=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
       int sum=0;
       int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
             sum+=nums[j];
          if(sum==goal){
            count++;
            }
            else if(sum>goal){
             break;
            }
          } sum=0;
        }
        //return count;
    

            
        System.out.println(count);
    }
}
//my intuition approach
// for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // //     if(nums[i+1]<nums[nums.length-1]){
        // //   sum=nums[i]+nums[i+1];
        // //     }else
        //   System.out.println(sum);
        //   if(sum==goal){
        //     count++;
        //     sum=0;
        //     i--;
        // continue;
        // sum=0;
        // for(int j=nums.length-1;j>=0;j--){
        //     sum+=nums[j];
        //     System.out.println(sum);
        //   if(sum==goal){
        //     count++;
        //     sum=0;
        //     j++;
        //     // continue;
        //   }

        // }