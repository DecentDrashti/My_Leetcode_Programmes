import java.util.*;
public class Streak4 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the k");
        int k=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
        int count=0;
        // int n=nums.length;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                if(prod<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
// 0ms approach
// int res = 0;
//         if (nums == null || nums.length == 0) return res;

//         int left = 0;
//         int prod = 1;
//         for (int i = 0; i < nums.length; i++) {
//             prod *= nums[i];
//             while (left <= i && prod >= k) {
//                 prod = prod/nums[left++];
//             }
//             res += i - left + 1;
//         }

//         return res;
//     }
// }

// my 1st approach with little error:-
//        int ans=0;
//        int p=1;
       
// if(k>0){
//     for(int i=0;i<nums.length;i++){
//          p*=nums[i];
//          if(nums[i]<k || p<k){
//             if( p<k || p!=nums[i]){
//             ans=ans+2;
//             }else if(p==nums[i]){
//                ans++;
//             }
//             // }else if(p>k){
//             //    p=1;
//             //    i=i-1;
//             //    continue;
//             // }
//          }else if(nums[i]==k){
//             continue;
//          }else{
//             p=1;
//             i=i-2;
//             continue;
//          }
//     }
//  }
//          return ans;
//     }
// }
//         //  ans++;
//         //  if(i+1<nums.length){
//         //     if((nums[i]*nums[i+1])<k){
//         //       p++;
              
//         //       }
//         //     }
        