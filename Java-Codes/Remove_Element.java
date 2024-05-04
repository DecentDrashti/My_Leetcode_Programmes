class Remove_Element {
    public int removeElement(int[] nums, int val) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the val");
        int val=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] nums = new int[n]; 
       for (int d = 0; d <n; d++) {
        System.out.println("Enter an integer:");
         nums[d] = sc.nextInt(); 
       }
        // Arrays.sort(nums);
        int k=0;
        // int[] ans = new int[];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(k);
    }
}