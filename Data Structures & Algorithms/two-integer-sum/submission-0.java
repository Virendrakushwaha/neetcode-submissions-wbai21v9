class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            k = target-nums[i];
            if(map.containsKey(k)){
             res[1]=i;
             res[0]=map.get(k);
             return res;
            }
             else
             map.put(nums[i],i);
        }
        return res;
    }
}
