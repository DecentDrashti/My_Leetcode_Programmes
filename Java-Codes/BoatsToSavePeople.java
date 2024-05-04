import java.util.*;
public class BoatsToSavePeople{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] people = new int[n]; 
       for (int i= 0; i <n; i++) {
        System.out.println("Enter an integer:");
         people[i] = sc.nextInt(); 
       }
        Arrays.sort(people); // Sorting the Array people

        int left = 0;
        int right = people.length - 1;
        int boat_count = 0;

        // Using the two Pointer Approach...
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                boat_count++;
                left++;
                right--;
            } else {
                boat_count++;
                right--;
            }
        }
        System.out.println(boat_count);
    }
}


//my failed attempt
// if(people[i]==limit){
            //      count++;
            // } else if (people[i] + people[n-1] <= limit) {
            //  count++;
            //  i++;
            // }

            
        //}return count;
        //     n--;
        //     count++;
        // }
        // return count;
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //     if(n>1){
        //         if(people[i]==limit){
        //         count++;
        //         }else if(i+1<n){
        //             if(people[i]+people[j]<=limit){
        //              count++;
        //              i++;
        //             }else
        //              count++;
        //          }else
        //             count++;
        //     }else
        //         count=1;
            
        // }
        // }
        // return count;
  //  }
//}