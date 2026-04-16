class Solution {
    public int[] productExceptSelf(int[] nums) {
       int prod=1;
        int k=0;int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            if(prod==0){
                k=i;
                break;
            }
        }
        if(prod==0){
            prod=1;
            for(int i=0;i<nums.length;i++){
                if(i!=k){
                    res[i] = 0;
                    prod*=nums[i];
                }

            }
            res[k] = prod;
            return res;
        }
        else{


            for(int i=0;i<nums.length;i++){
                res[i] = prod/nums[i];
            }

            return res;
        }
    }
}  
