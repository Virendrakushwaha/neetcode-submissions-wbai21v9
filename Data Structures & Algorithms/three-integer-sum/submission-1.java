class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1])
        continue;
            int j=i+1;
            int k = nums.length -1;
            
            while(j<k){
                int target = nums[i]+nums[j]+nums[k];
                if(target>0)
                    k--;
                else if(target<0)
                    j++;
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                }
            }
        }
        return res;
    }
}
