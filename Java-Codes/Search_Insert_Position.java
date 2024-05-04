class Search_Insert_position{
     public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int target=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                j=i;
                break;
            }
            else if(nums[i]>target){
                j=(i);
                break;
            }
            else{
                j=(nums.length);
            }
        }
        System.out.println(j);
        
    }
}