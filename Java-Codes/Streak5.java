import java.util.*;
public class Streak5 {
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
       // Find the minimum and maximum elements in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Create an array to store the frequencies of elements
        int[] frequencies = new int[max - min + 1];

        int left = 0; // Left pointer for the sliding window
        
        int maxWindow = 0; // Variable to store the maximum length of the good subarray

        // Iterate through the array using the right pointer
        for (int right = 0; right < nums.length; right++) {
            frequencies[nums[right] - min]++; // Increment the frequency of the current element

            // Shrink the window until all frequencies are less than or equal to k
            while (frequencies[nums[right] - min] > k) {
                frequencies[nums[left] - min]--; // Decrement the frequency of the element at the left pointer

                left++; // Move the left pointer to the right
            }

            // Update the maximum window size
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow; // Return the maximum length of the good subarray
    }
}
    //    Arrays.sort(nums);
    //     int d=nums[0];
    //     int count=1;
    //     for(int i=0;i<nums.length;i++){
    //         if(i+1<nums.length){
    //         if(d==nums[i+1]){
    //             continue;
    //         }else{
    //           count++;
    //           d=nums[i+1];
    //           System.out.println(d);
    //           continue;
    //         }
    //      }
    //     }
    //     int ans=count*k;
    //     System.out.println(ans);
    