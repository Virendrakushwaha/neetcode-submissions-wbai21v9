class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
           set.add(num);
        }

        return set.size()-1!=nums.length-1;
    }
}