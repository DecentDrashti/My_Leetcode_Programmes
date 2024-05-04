public class Remove_dupli_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
        //k=expectednums count
         int k=0;
        // int[] expectedNums= new int[k+1];
        for(int i=0;i<nums.length;i++){
            if(nums[k]!=nums[i]){
            //   expectedNums[i]=nums[i];
              k++;
              nums[k]=nums[i];
            }
        }return k+1;
        
        // for(int i=0;i<k;i++){
        // // System.out.print("nums=");
        // return expectedNums[i];
        // }
        //  return k;
    }
}