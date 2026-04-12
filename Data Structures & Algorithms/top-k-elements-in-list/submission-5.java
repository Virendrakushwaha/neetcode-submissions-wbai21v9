class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        PriorityQueue<int[]> minQ = new PriorityQueue<>((a, b)->a[0]-b[0]);
        map.forEach((m,n)->{
            minQ.offer(new int[]{n,m});
            if(minQ.size()>k){
                minQ.poll();
            }

        });
        for(int i=0;i<k;i++){
            res[i]=minQ.poll()[1];
        }

        return res;
         }
         
}
