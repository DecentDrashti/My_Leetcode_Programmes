import java.util.*;
public class Streak1 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
        Arrays.sort(nums);
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                return nums[i];
            }
            else{
                prev=nums[i];
            }
        }
        return -1;
    }
}
//    int k=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=(i+1);j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             k=nums[i];
    //             System.out.println(1);
    //         }
    //      }
    //   }
    //    System.out.println(k);
   //it would exceed time limit if array is [21212,16431,40942,74790,97759,27803,81513,70172,50495,33308,65846,33282,53857,80666,74276,47203,73584,14672,74304,50789,34525,28884,37352,79601,19576,38094,69614,39639,77579,95428,52945,13745,92483,29320,22010,11813,96921,35301,20148,70348,76185,....] else this solution is also correct.