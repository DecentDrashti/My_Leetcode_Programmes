import java.util.*;
public class Plus_one{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] digits = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         digits[d] = sc.nextInt(); 
       }
      //  int n=digits.length;
       for(int i=(n-1);i>=0;i--){
        if (digits[i]<9){
            digits[i]++;
            System.out.println(digits[i]);
        }
        digits[i]=0;
       }
        // if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
	// and we again revolve around loop to check for number if less than 9 or not
	// i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
	//      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
	// and will directly return array
       digits = new int[digits.length + 1];
       digits[0] = 1;
       for (int d = 0; d <n+1; d++) {
        System.out.println(digits[d]);
       }
    }
}
    //        if(digits[n-1]<9){
//         digits[n-1]+=1;
//        }
//        else if(n>1){
//         digits[(n-1)]=0;
//         digits[(n-2)]+=1;
//         if(digits[(n-2)]>9){
//            digits=new int[n+1];
//            digits[0]=1;
//         }
//         }
//        else if(n==1){
//              digits=new int[n+1];
//              digits[0]=1;
//          }
//         //  else if(n==2){
//         //     digits=new int[n+1];
//         //     digits[0]=1
//         //  }
        
//        return digits;
//     }
// }