class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

      List<List<Integer>> results  = new ArrayList<>();
      
      int total=0;
       Arrays.sort(nums);       //[-4,-1,-1,0,1,2] 
       for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) 
        continue;
        int left = i+1 ,right=nums.length-1;
        while(left<right){
             total = nums[i]+nums[left]+nums[right];

             if(total==0){
                results.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]) 
                left++;
                while(left<right && nums[right]==nums[right-1]) 
                right--;
                left++;
                right--;
             }
             if(total<0)
             left++;
             if(total>0)
             right--;
        }

       }
       return results; 
    }
}
