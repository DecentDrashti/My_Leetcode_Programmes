class TypesOfTriangle{
    public String triangleType(int[] nums) {
        // String ans=("a");
        if(nums[0]+nums[1]>nums[2]&&nums[0]+nums[2]>nums[1]&& nums[1]+nums[2]>nums[0]){
           if(nums[0]==nums[1]&& nums[1]==nums[2]){
                System.out.println("equilateral");
           }else if(nums[0]==nums[1]|| nums[0]==nums[2]||nums[1]==nums[2]){
             System.out.println("isosceles");
           }else {
            System.out.println("scalene");
           }
    
      }else{
        System.out.println("none");
      }
    //   return ans;
    }
}