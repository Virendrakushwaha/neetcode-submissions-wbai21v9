class Solution {
    public int findMin(int[] nums) {
        int e = nums.length-1;
        int s=0;
        int mid=0;
        while(s<e){
             mid=(s+e-1)/2;
            if(nums[mid]>nums[e])
            s=mid+1;
            else 
            e=mid;
            
        }
        return nums[e];
    }
}
