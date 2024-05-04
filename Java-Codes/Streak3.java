//my first hard problem
import java.util.*;
public class Streak3 {
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
    //     for (int d = 0; d <n; d++) {
    //     System.out.println(nums[d]);
    //    }
       int k=1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>0 && k==nums[i]){
               k++;
           }
    }
            System.out.println(k);
    }
}
        
        
 //my 1st approach and intuition :-(a little bit error)

// for(int i=0;i<nums.length;i++){
//     if(nums.length>2){
//         if(nums[i]<=0){
//             if(nums[i+1]==1){
//                 if(nums[i+2]==2){
//                     k=3;
//                 }else{
//                     k=2;
//                 }
//             }else{
//                 k=1;
//             }
//         }
//         }else if(nums[0]==0){
//         if(1<nums.length){
//             if(nums[1]==1){
//                     k=2;
//             }
//             else{
//              k=1;
//             }
//         }else
//           k=1;
//     }else if(nums[0]==1){
//             if(1<nums.length){
//               if(nums[1]==2){
//                     k=3;
//               }
//               else{
//               k=2;
//               }
//             }else
//               k=2;
//     }else
//      k=1;
        
// }
//         System.out.println(k);
//     }
// }